package streams;
public class Test3 {
    private int age;
    private String name;
    private String address;
    private int exp;
    public Test3(int age, String name, String address, int exp) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.exp = exp;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getExp() {
        return exp;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }
    @Override
    public String toString() {
        return "Test3 [age=" + age + ", name=" + name + ", address=" + address + ", exp=" + exp + "]";
    }
    
    
}
