package FundamentalJava.Thread;

public class HelloThread extends Thread {

        public void run()
        {

            System.out.println("THREAD created ");
        }
        public static void main(String[] args) {
             HelloThread h = new HelloThread();
            h.start();
        //h.run();
        }

}

