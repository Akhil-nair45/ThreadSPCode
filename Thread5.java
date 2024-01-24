public class Thread5 extends Thread {

    static Thread mainthread;
    public void run()
    {

        try {
            mainthread.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try{
            for(int i =1; i<=5; i++)
            {
                System.out.println("Child Thread"+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }



        public static void main(String[] args) {

            mainthread = Thread.currentThread();
            Thread5 t = new Thread5();
            t.start();


            try{
                for(int i =1; i<=5; i++)
                {
                    System.out.println("Main Thread"+i);
                    Thread.sleep(1000);
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }

