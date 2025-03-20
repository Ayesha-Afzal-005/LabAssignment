public class Seat{
       int seatNumber;
       int rowNumber;
       double price;
       boolean isBooked; 

       Seat(int seatNumber,int rowNumber,double price){
           this.seatNumber=seatNumber;
           this.rowNumber=rowNumber;
           this.price=price;
           this.isBooked=false;
}
        boolean bookSeat(){
           if(!isBooked){
             isBooked=true;
             return true;
}else{
             return false;
  }
 }      
}