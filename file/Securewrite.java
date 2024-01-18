package FundamentalJava.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class Securewrite {
    public static void main(String[] args) throws IOException {
        File file= new File("F:\\Priya.txt");
        FileOutputStream fo=new FileOutputStream(file);
        DeflaterOutputStream dos= new DeflaterOutputStream(fo);

        Scanner scan = new Scanner(System.in);
        System.out.println("Tell  me the content");
        String bio=scan.nextLine();

        dos.write(bio.getBytes());
        System.out.println(file.getName()+"has write success");
        dos.close();
        fo.close();


    }
}
