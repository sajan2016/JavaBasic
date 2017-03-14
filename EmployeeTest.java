class Employee{
	int eid; //employee id
	String name;
	String doj; //Date of Joining
	int age;
	String department;
    
    Employee(){
      eid=0;
      name="NA";
      doj="NA";
      age=-1;
      department="NA";
    }
 
	Employee(int eid,String name){
      this();
      this.eid=eid;
      this.name=name;
	}

	Employee(int eid,String name,String doj,int age,String department){
     this(eid,name);
     this.doj=doj;
     this.age=age;
     this.department=department;
	}

     void display(){
       System.out.println("Employee ID:: " + eid);
       System.out.println("NAME:: " + name);
       System.out.println("Date Of Joining:: " + doj);
       if(age == -1)
        System.out.println("Age :: Not Available");
       else
       	System.out.println("Age :: " + age);
       System.out.println("Department :: " + department);
       System.out.println("\n------------------------------------------\n");
    } 
 
}

public class EmployeeTest{

	public static void main(String[] felight){
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(007,"Sajan");
		Employee emp3 = new Employee(101,"Sagar","12-August-2016",26,"Development");
         
         emp1.display();
         emp2.display();
         emp3.display();

    }
}

/*OUTPUT
D:\java\COREJAVA>java EmployeeTest
Employee ID:: 0
NAME:: NA
Date Of Joining:: NA
Age :: Not Available
Department :: NA

------------------------------------------

Employee ID:: 7
NAME:: Sajan
Date Of Joining:: NA
Age :: Not Available
Department :: NA

------------------------------------------

Employee ID:: 101
NAME:: Sagar
Date Of Joining:: 12-August-2016
Age :: 26
Department :: Development

------------------------------------------


D:\java\COREJAVA>
 */





