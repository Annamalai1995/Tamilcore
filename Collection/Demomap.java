package FundamentalJava.Collection;

import java.util.Hashtable;
import java.util.TreeMap;

public class Demomap {
    public static void main(String[] args)
    {
//		TreeMap<String, Integer> obj=new TreeMap<String, Integer>();
//		obj.put("Annamalai", 1);
//		obj.put("raja", 2);
//		obj.put("kumar", 3);
//		obj.put("sathish", 4);
//		System.out.println(obj);
//		System.out.println(obj.get("sathish"));
//		System.out.println(obj.containsValue(3));
//		System.out.println(obj.containsKey("raja"));

        TreeMap<String, MobilePhones> obj=new TreeMap<String, MobilePhones>();

        MobilePhones mob=new MobilePhones("Realme8", 4, 14000.67);
        MobilePhones mob1=new MobilePhones("Realme7", 4, 17800.89);
        MobilePhones mob2=new MobilePhones("Redmi7 pro", 2, 8000.56);
        MobilePhones mob3=new MobilePhones("Nokia h4",6,46000.45);

        obj.put("Deepika", mob3);
        obj.put("Vidhya", mob2);
        obj.put("santhosh", mob);
        obj.put("Praveen", mob3);
        obj.put("Ram", mob1);

        System.out.println(obj);
		Hashtable< MobilePhones, String> obj1=new Hashtable<MobilePhones, String>();
		obj1.put(mob3, "raja");

    }

}
