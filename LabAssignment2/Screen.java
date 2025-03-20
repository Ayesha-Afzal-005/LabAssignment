public class Screen{
       int screenNumber;
       String movieTitle;
       Seat[][] seats;
       
       Screen(int screenNumber,String movieTitle,int rows,int cols){
          this.screenNumber=screenNumber;
           this.movieTitle=movieTitle;
           this.seats=new Seat[rows][cols];
           for(int i=0;i<rows;i++){
               for(int j=0;j<cols;j++){
                     seats[i][j]= new Seat(i,j,500);       
                  }
               }
            }
           boolean bookSeat(int rows,int cols,Customer customer){
                  return seats [rows][cols].bookSeat();
           }
       }