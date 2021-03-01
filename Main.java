package com.company;

import java.io.File;
import java.util.*;


public class Main {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        rec("./", "");
    }

    public static void rec(String path, String indent){
        File[] fileList = new File(path).listFiles();
        if (fileList == null) return;
        for (File file : fileList) {
            System.out.println(indent + (file.isFile()?file.getName():file.getName().toUpperCase()));
            if (file.isDirectory()){
                rec(path + file.getName() + "/",indent + "\t");
            }
        }
    }
}









