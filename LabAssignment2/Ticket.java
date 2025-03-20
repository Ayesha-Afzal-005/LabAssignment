public class Ticket{
       int ticketID;
       Customer customer;
       int screenumber;
       int seatNumber;
       String movieTitle;
       double price;
     
       Ticket(int ticketID,int screenumber,int seatNumber,String movieTitle,double price){
           this.ticketID=ticketID;
           this.customer=customer;
           this.screenNumber=screenNumber;
           this.seatNumber=seatNumber;
           this.movieTitle=movieTitle;
           this.price=price;
 }
}