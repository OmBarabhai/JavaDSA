package Basics_Java.OOPS.Inheritance;

public class Motor extends Vehicle{
   public String handleBarStyle;
   public String suspensionType;

   Motor(String name, int model, int noOfTyre,String handleBarStyle,String suspensionType){
       super(noOfTyre,name,model);
       this.handleBarStyle = handleBarStyle;
       this.suspensionType = suspensionType;
   }

   void suspensionOn(){
       System.out.println("Suspension Started: "+name);
   }
}
