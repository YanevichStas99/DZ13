package com.company;

import java.io.FileWriter;
import java.io.File;
import java.util.List;

public class Writer  {

    public static void writeToFile(List<Student> students)throws Exception {

        FileWriter file=new FileWriter("list.txt",false);
        for (int i = 0; i <students.size() ; i++) {
            file.write(String.valueOf(students.get(i)));
        }
        file.close();


    }

}
