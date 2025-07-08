package Person;
class Staff extends Person {
    private String school;
    private double pay;

/**
 * 
 * @param name ชื่อของพนักงาน
 * @param address ที่อยู่ของพนักงาน
 * @param school ชื่อของโรงเรียน
 * @param pay ค่าใช้จ่าย 
 */
    public Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school = school;
        this.pay = pay;
        System.out.println("Invoke Staff(String name, String address, String school, double pay)");
    }

  /**
   * 
   * @return ขื่อโรงเรียน
   */  
    public String getSchool(){
        return school;
    }

/**
 * 
 * @param school ตั้งค่าชื่อโรงเรียน
 */
    public void setSchool(String school){
        this.school = school;
    }

/**
 * 
 * @return ค่าใช้จ่าย
 */
    public double getPay(){
        return pay;
    }

/**
 * 
 * @param pay ตั้งค่าค่าใช้จ่าย
 */
    public void setPay(double pay){
        this.pay = pay;
    }

    @Override
    public String toString() {
        return String.format("%s [%s , School = %s, Pay = %.2f /n]", 
                                    getClass().getSimpleName(),super.toString(), school, pay);
    }
}