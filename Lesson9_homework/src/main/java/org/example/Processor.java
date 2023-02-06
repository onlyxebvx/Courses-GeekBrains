package org.example;

import org.example.Annotations.Cat;
import org.example.Annotations.Column;
import org.example.Annotations.Table;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class Processor {
    private static Connection connection;
    private static Statement statement;
    public static void main(String[] args) {

        try {
            connect();
            buildTable(Cat.class);


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }

    public static void buildTable(Class cl) throws SQLException {
        if(!cl.isAnnotationPresent(Table.class)){
            throw new RuntimeException("@Table missed");
        }
        Map<Class,String> map=new HashMap<>();
        map.put(int.class,"INTEGER");
        map.put(String.class,"Text");

        StringBuilder stringBuilder=new StringBuilder("CREATE TABLE ");
       stringBuilder.append(((Table)cl.getAnnotation(Table.class)).title());
       stringBuilder.append(" (");
        Field[] fields=cl.getDeclaredFields();
        for (Field o:fields){
            if(o.isAnnotationPresent(Column.class)){
                stringBuilder.append(o.getName())
                        .append(" ")
                        .append(map.get(o.getType()))
                        .append(", ");
            }
        }
        stringBuilder.setLength(stringBuilder.length()-2);
        stringBuilder.append(");");
        statement.executeUpdate(stringBuilder.toString());




    }
    private static void connect() throws SQLException{
        try {
            Class.forName("org.sqlite.JDBC");
            connection= DriverManager.getConnection("jdbc:sqlite:processor.db");
            statement=connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
           throw new SQLException("Unable to connect");
        }

    }
    private static void disconnect() {
           try {
               statement.close();
           }catch (SQLException e){
               e.printStackTrace();
           }
           try {
               connection.close();
           }catch (SQLException e){
               e.printStackTrace();
           }
    }
}