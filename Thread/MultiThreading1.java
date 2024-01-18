package FundamentalJava.Thread;
class car2 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hello there");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
class bike2 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}


public class MultiThreading1 {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        car2 c = new car2();

        bike2 b= new bike2();
        //c.add();
        //b.add1();
        c.start();   // it use run method
        b.start();
        if(c.isAlive())
        {
            System.out.println("Executed the thread running ");
        }
        c.join();
        b.join();
        if(b.isAlive())
        {
            System.out.println("Exe ");
        }
        System.out.println("Exit the thread");// to last the print the data

    }

}
