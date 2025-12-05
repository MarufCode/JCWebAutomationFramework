package org.example.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public PropertyReader() {
    }


    public static String readKey(String key) throws IOException {


        FileInputStream fileInputStream = null;
        Properties p = null;

        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/data.properties");
            p = new Properties();
            p.load(fileInputStream);




        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            fileInputStream.close();
        }

        return p.getProperty(key);
    }



}
