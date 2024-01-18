package FundamentalJava.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Readfile {
    public static void main(String[] args) throws IOException {
        File f = new File("F:\\Gowthami.txt");
        FileInputStream fi= new FileInputStream(f);
        int size=fi.available();
        byte [] gettingAndvalues= new byte[fi.available()];
        fi.read(gettingAndvalues);

        String obj= new String(gettingAndvalues);
        System.out.println(obj);

    }
}
