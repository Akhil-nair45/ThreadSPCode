public class Thread4 extends Thread {
    public void run()
    {
        for(int i =1; i<=5; i++)
        {
            System.out.println("Child Thread"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Thread4 t = new Thread4();
        t.start();
        t.join();



        for(int i =1; i<=5; i++)
        {
            System.out.println("Main Thread"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }
}
