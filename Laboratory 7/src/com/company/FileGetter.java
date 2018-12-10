package com.company;

import java.io.File;
import java.util.Scanner;

public class FileGetter {

    public static String fileToString(String filePath) throws Exception{
        File file = new File(filePath);
        String st = "";
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            st = st + sc.nextLine();
        }
        st = st.toLowerCase();
        return st;
    }
}
