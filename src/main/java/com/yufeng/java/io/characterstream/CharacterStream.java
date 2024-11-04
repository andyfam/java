package com.yufeng.java.io.characterstream;

import com.yufeng.java.io.Constants;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {

    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader(Constants.PATH_FOR_TEST_RESOURCE + "xanadu.txt");
            outputStream = new FileWriter(Constants.PATH_FOR_TEST_RESOURCE + "characteroutput.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
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
