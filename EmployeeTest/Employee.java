package EmployeeTest;
 class Employee {
    private Date date;
    private String name;
        public Employee(String name, Date birthDate) {
        this.name = name;
        date = birthDate;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Birthdate: " + date);
    }

}
