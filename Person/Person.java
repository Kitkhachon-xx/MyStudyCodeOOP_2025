package Person;
class Person {
    private String name;
    private String address;
/**
 * 
 * @param name ชื่อของบุคคล
 * @param address ที่อยู่ของบุคคล
 */
    public Person(String name, String address){
        System.out.println("Invoke Person(String name, String address)");
        this.name = name;
        this.address = address;
    }
/**
 * 
 * @return ขื่อชื่อของบุคคล
 */
    public String getName() {
        return name;
    }

/**
 * 
 * @return ที่อยู่ของบุคคล
 */
    public String getAddress() {
        return address;
    }

/**
 * 
 * @param address ทตั่งค่าที่อยู่
 */
    public void setAddress(String address){
        this.address = address;
    }

 
    @Override// toString() method
    public String toString() {
            return String.format(" %s [ Name = %s, Address = %s]", 
                            this.getClass().getSimpleName(),name, address);
    }

}
