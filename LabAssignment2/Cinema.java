public class Cinema{
       String name;
       String location;
       Screen[] screens;

       Cinema(String name,String location,int totalScreens){
            this.name = name;
            this.location = location;
            this.screens = new Screen[totalScreens]; // Correct variable name

}  
       void addScreen(int index,Screen screen){
            screens[index]=screen;
}
}