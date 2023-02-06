package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReportMaker
{
    public static void MakePDFReport(String path,String data) throws Exception
    {

            FileOutputStream out= new FileOutputStream(path);
            out.write(data.getBytes());
            out.close();


    }


}
