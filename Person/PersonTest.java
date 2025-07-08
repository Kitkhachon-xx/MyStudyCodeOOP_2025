package Person;
public class PersonTest {
    public static void main(String[] args) {
        Student student = new Student("John Doe", "123 Main St", "Computer Science", 2, 15000.00);
           System.out.println(student);


    System.out.println ("========Staff ============================");    
    
        Staff ck = new Staff("Chanakarn Kingkaew","85/1 PIM Nonthaburi","PIM",1_000_000);
            System.out.println(ck);
    
    System.out.println ("========Student # 1 ============================");
    
        Student cv = new Student("Katarina Blu","85/1 PIM Nonthaburi","CAI",2558,50000);
            System.out.println(cv);

    System.out.println("========Student # 2 ============================");
        Student cv2 = new Student("Kitkhachon Chirawongrungrueang", "227/16 SUphanburi", "CAI", 2006, 90_000);
            System.out.println(cv2);

    System.out.println("=========Student # 3 ============================");
        Student cv3 = new Student("Kevin Khaslana", "Los Angelis", "AIE", 2555, 500_000_000);
            System.out.println(cv3);
        
    System.out.println("S========Staff # 2 ============================");
        Staff ck2 = new Staff("Itadori Yuuji", "Shibuya Tokyo", "Jujutsu High School", 1_000_000);
            System.out.println(ck2);

    System.out.println("========Person # 1 ============================");
        Person person1 = new Person("Jornathan Remson", "Lasvagas Nevada");
            System.out.println(person1);
    
}
}
