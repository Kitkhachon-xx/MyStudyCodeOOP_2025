import java.util.Scanner;
class Employee{
    public int id;
    public String name;
    private double salary;
    //Constructor
    public Employee(int id) {//Build obj must have id
        this.id = id;
    }
    
    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public void setSalary(double salary){
        if(salary >= 15_000 && salary <= 1_000_000)
        this.salary = salary;
    }
        public double getSalary(String password){
        if(password.equals("password"))
            return salary;
            else return 0; 
        }
}
public class EmployeeTestDrive{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your ID: ");
            int EMid = input.nextInt();
            input.nextLine();
            Employee jk = new Employee(EMid);
            System.out.print("Enter Salary Password: ");
            String keyWord = input.nextLine();
            jk.id = 7847276;
            jk.name = "Jack";
            jk.setSalary(100_000);
            System.out.printf("Salary : %.2f \n" , jk.getSalary(keyWord));
            
            System.out.print("ID: ");
            int emid = input.nextInt();
            input.nextLine();
            System.out.println("Name: ");
            String name = input.nextLine();
            
            Employee st = new Employee(emid, name);
            System.out.println("name" + st.name);
            System.out.println("ID " + st.id );
    }
}
