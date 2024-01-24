class bookticket {
    int total_seats=10;
     synchronized void booktickets(int seats)   // here at first do the code without synchronized keyword and then try with the synchronized keyword at first it will allow all the threads ti access resource at once but as soon as u apply keywprd it will give proper output
    {
        if(total_seats>=10)
        {
            System.out.println(seats+"seats booked successfully....!!");
            total_seats=total_seats-seats;
            System.out.println("total seats left: "+total_seats);
        }
        else{
            System.out.println("Seats cannot be booked....!!");
            System.out.println("seats left :"+total_seats);
        }
    }
}



public class ThreadBmy extends Thread{


   static bookticket b;
    int seats;
    public void run()
    {
        b.booktickets(seats);
    }


    public static void main(String[] args) {
        
        b= new bookticket();
        ThreadBmy Akhil= new ThreadBmy();
        Akhil.seats=7;
        Akhil.start();
        

        ThreadBmy Harshil = new ThreadBmy();
        Harshil.seats=6;
        Harshil.start();
        

    }
}
