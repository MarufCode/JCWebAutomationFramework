package org.example.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    private PropertyReader() {
    }


    public static String readKey(String key) {


        FileInputStream fileInputStream = null;
        Properties p = null;

        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/data.properties");
            p = new Properties();
            p.load(fileInputStream);




        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return p.getProperty(key);
    }



}
