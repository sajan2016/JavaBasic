class Car{
	String carName;
	int  modelYear;
    double price;
    String type; //Diesel or Petrol
   	 Car(){
      		carName="NO_INFO";
       		modelYear=0;
       		price=0.0;
       		type="NA";
      		} 
    
    Car(String name,int mYear){
            this();
            carName=name;
            modelYear=mYear;
            }  		

    Car(String name,int myear,double price,String type){
             this(name,myear);
      	     this.price=price;
   			 this.type=type;
     		}
    void display(){
       System.out.println("NAME:: " + carName);
       System.out.println("Model Year:: " + modelYear);
       System.out.println("Price :: " + price);
       System.out.println("Type :: " + type);
       System.out.println("\n------------------------------------------\n");
    }  
}
public class CarTest{
	public static void main(String[] felight){
	   Car audi=new Car("Audi",2017,6075000,"Diesel");
	   Car toyota=new Car("Toyota",2016,1675000,"Petrol");
	   Car bmw=new Car("BMW",2015,16075000,"Petrol"); 
	   audi.display();
	   toyota.display();
	   bmw.display();
	}
}

/*OUTPUT


D:\java\COREJAVA>javac CarTest.java

D:\java\COREJAVA>java CarTest
NAME:: Audi
Model Year:: 2017
Price :: 6075000.0
Type :: Diesel

------------------------------------------

NAME:: Toyota
Model Year:: 2016
Price :: 1675000.0
Type :: Petrol

------------------------------------------

NAME:: BMW
Model Year:: 2015
Price :: 1.6075E7
Type :: Petrol

------------------------------------------


D:\java\COREJAVA>
 */