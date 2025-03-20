public class Demo{
      public static void main(String[] args){
          Cinema cinema=new Cinema("Cineplex","Lahore",3);
          Screen screen1=new Screen(1,"Evil Return",5,5);
          cinema.addScreen(0,screen1);

          Customer customer1=new Customer(23,"Ayesha","36502-74525576","ayesha@gmail.com");
          boolean booked=screen1.bookSeat(2,3,customer1);

          if(booked){
           Ticket ticket = new Ticket(101, customer1, 1, 2, "Evil Return", 500.0);
           System.out.print("Ticket Booked Successfully!");
        }else{
           System.out.println("Seat Already Booked");
}
}
}