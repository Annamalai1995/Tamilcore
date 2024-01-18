package FundamentalJava.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class writefile {
    public static void main(String[] args) throws IOException {
        File f = new File("F:\\Gowthami.txt");
       // f.createNewFile();
        //System.out.println(f.getName()+"successfully ");


        FileOutputStream fo= new FileOutputStream(f);
        Scanner ss =new Scanner(System.in);
        System.out.println(" Which content to be write the file");
        String data=ss.nextLine();
        fo.write(data.getBytes());
        System.out.println(f.getName()+"written successfully");

    }
}
