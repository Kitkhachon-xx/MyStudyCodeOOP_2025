package EmployeeTest;
// Employee class (Composition: has-a Date)
public class EmployeeTest {
    public static void main(String[] args) {
        Date bda = new Date(24, 04, 2006);//กำหนดวันเดือนปีเกิด
        Employee a = new Employee("Jack", bda);
        a.displayInfo();

        //Date bdo = new Date(15,05,2000);
        Teacher Juck = new Teacher("Jurk", new Date(15,05,2000), "Math");
        Juck.displayInfo();
    }

}
