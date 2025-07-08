package Person;
class Student extends Person {
    private String program;
    private int year;
    private double fee;
/**
 * 
 * @param name ชื่อของนักเรียน
 * @param address  ที่อยู่ของนักเรียน
 * @param program หลักสูตรที่นักเรียนเรียน
 * @param year ปีการศึกษาที่นักเรียนกำลังศึกษาอยู่
 * @param fee ค่าเทอมที่นักเรียนต้องจ่าย
 */
    public Student(String name, String address, String program, int year, double fee ){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
        System.out.println("Invoke Student(String name, String address, String program, int year, double fee)");
    }
/**
 * 
 * @return ชื่อหลักสูตรที่นักเรียนเรียน
 */
    public String getProgram(){
        return program;
    }
/**
 * 
 * @param program ตั่งค่าชื่อหลักสูตรที่นักเรียนเรียน
 */
    public void setProgram(String program){
        this.program = program;
    }

/**
 * 
 * @return ปีการศึกษาที่นักเรียนกำลังศึกษาอยู่
 */
    public int getYear(){
        return year;
    }

/**
 * 
 * @param year ตั้งค่าปีการศึกษาที่นักเรียนกำลังศึกษาอยู่
 */ 
    public void setYear(int year){
        this.year = year;
    }

/**
 * 
 * @return ค่าเทอมที่นักเรียนต้องจ่าย
 */
    public double getFee(){
        return fee;
    }

/**
 * 
 * @param fee ตั้งค่าค่าเทอมที่นักเรียนต้องจ่าย
 */
    public void setFee(double fee){
        this.fee = fee;
    }

/**
 * * แสดงข้อมูลของนักเรียนในรูปแบบสตริง
 */
    @Override
    public String toString() {
            return String.format("%s [%s, Program = %s, Year = %d, Fee = %.2f]" ,
                                getClass().getSimpleName(), super.toString(), program, year, fee);
    }
}