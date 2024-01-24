public class Thread1 extends Thread {

    public void run()
    {
          System.out.println(Thread.currentThread().getPriority());
        for(int i =1; i<=5; i++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(i);
          
        }
        
    }


    public static void main(String[] args) {
        System.out.println("Main Method");
        Thread.currentThread().setName("Akhil");
        System.out.println(Thread.currentThread().getName());
        Thread1 t =new Thread1();
        t.start();
    }
}
