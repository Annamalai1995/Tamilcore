package FundamentalJava.Thread;
class car3 implements Runnable
{

    public void run() {
        // TODO Auto-generated method stub
        System.out.println("helooooo");
    }


}
class bike3 extends Thread
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


public class MultiThreading2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Runnable c = new Runnable() {
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



        };
        bike3 b= new bike3();
        //Thread class object
        Thread t1= new Thread(c);
        t1.setName("SAm");
        System.out.println(t1.getName());
        t1.setPriority(1);
        System.out.println(t1.getPriority());
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());

        t1.start();
        b.start();
        //car2 cc= new car2();
        //cc.start();

        //c.add();
        //b.add1();
        //c.start();   // it use run method
        //b.start();
	/*if(c.isAlive())
	{
		System.out.println("Executed the thread running ");
	}*/
        //c.join();
        //b.join();
	/*if(c.isAlive())
	{
		System.out.println("Executed the thread running ");
	}*/
        System.out.println("Exit the thread");// to last the print the data

    }

}
