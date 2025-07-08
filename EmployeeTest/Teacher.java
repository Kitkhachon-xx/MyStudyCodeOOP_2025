package EmployeeTest;
 class Teacher  extends Employee{

    private String subject;

    public Teacher(String name, Date date){
        super(name, date);
    }
    
    public Teacher(String name, Date date, String subject) {
        super(name, date);
        this.subject = subject;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }

}
