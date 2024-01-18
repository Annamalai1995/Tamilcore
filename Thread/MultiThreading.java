package FundamentalJava.Thread;

class car1
{
    void add()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hello there");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
class bike1
{
    void add1()
    {
        for(int i=1;i<=5;i++)
        {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
public class MultiThreading {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        car1 c = new car1();
        bike1 b= new bike1();
        c.add();
        b.add1();


    }

}
