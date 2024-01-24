public class Thread3 extends Thread {
    
    public void run()
    {

        Thread.yield();
        for(int i =1; i<=5; i++)
        {
            System.out.println(Thread.currentThread().getName() + " - " +i);
        }
    }

    public static void main(String[] args) {
        Thread3 t = new Thread3();
        t.start();

        // Thread.yield();

        for(int i =1; i<=5; i++)
        {
            System.out.println(Thread.currentThread().getName()+ " - "+i);
        }
    }
}
