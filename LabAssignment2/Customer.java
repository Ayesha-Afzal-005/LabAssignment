public class Customer{
       int customerID;
       String name;
       String phoneNumber;
       String email;

       Customer(int customerID,String name,String phoneNumber,String email){
           this.customerID=customerID;
           this.name=name;
           this.phoneNumber=phoneNumber;
           this.email=email;
 }
       void dispalyCustomer(){
           System.out.println("Customer ID"+customerID+"Name"+name);  
 }
}