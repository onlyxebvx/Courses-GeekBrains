//1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
//  вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//  Посчитать, сколько раз встречается каждое слово.
//2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
//  телефонных номеров. В этот телефонный справочник с помощью метода add() можно
//  добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
//  учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//  тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять
//  лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
//  через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного
//  справочника.

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        task1();
        task2();
    }

    private static void task1() {
        String[] words = {
                "Egor", "Kirill", "Egor",
                "Andre", "Maria", "Masha",
                "Vlad", "Arseniy", "Artem",
                "Kolya", "Masha", "Misha",
                "Masha", "Vita", "Margo","Kolya","Masha"
        };
        Set<String> arraySet= new LinkedHashSet<>();
        for (String o:words){
            arraySet.add(o);
        }
        System.out.println(arraySet);
        Map<String,Integer> treemap=new TreeMap<>();
        for(int i=0;i< words.length;i++)
        {
            if(treemap.containsKey(words[i]))
            {
                treemap.put(words[i],treemap.get(words[i])+1);
            }
            else {treemap.put(words[i],1);}
        }
        System.out.println(treemap);
    }
    private  static void task2()
    {
        Directory directory=new Directory();
        directory.add("Bodnar","+375298951988");
        directory.add("Mukha","+375299559867");
        directory.add("Sayko","+375447689813");
        directory.add("Bodnar","+375291227014");
        directory.add("Evseenko","+375294745686");
        directory.add("Usik","+375296782309");
        directory.add("Bodnar","+375294745632");
        System.out.println(directory.listDirectory);

        System.out.println("Mukha: "+directory.get("Mukha"));
        System.out.println("Bodnar: "+directory.get("Bodnar"));
        System.out.println("Usik: "+directory.get("Usik"));


    }
    static class Directory
    {
      private Map<String,List<String>> listDirectory=new HashMap<>();
      private List<String> phoneNumberList;


        public void add(String surname, String phoneNumber)
        {
            if(listDirectory.containsKey(surname))
            {
                phoneNumberList=listDirectory.get(surname);
                phoneNumberList.add(phoneNumber);
                listDirectory.put(surname,phoneNumberList);

            }
            else
            {
                phoneNumberList=new ArrayList<>();
                phoneNumberList.add(phoneNumber);
                listDirectory.put(surname,phoneNumberList);

            }
        }
        public List<String> get(String surname)
        {
         return listDirectory.get(surname);
        }
    }

}