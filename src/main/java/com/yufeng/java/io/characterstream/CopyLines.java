package com.yufeng.java.io.characterstream;

import com.yufeng.java.io.Constants;

import java.io.*;

public class CopyLines {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader(Constants.PATH_FOR_TEST_RESOURCE + "xanadu.txt"));
            outputStream = new PrintWriter(new FileWriter(Constants.PATH_FOR_TEST_RESOURCE + "lineoutput.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
