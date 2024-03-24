package streams2;

public class Patient {
    private String pid;
    private int age;
    private String disease;
    private int amount;
    public Patient(String pid, int age, String disease, int amount) {
        this.pid = pid;
        this.age = age;
        this.disease = disease;
        this.amount = amount;
    }
    public String getPid() {
        return pid;
    }
    public void setPid(String pid) {
        this.pid = pid;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDisease() {
        return disease;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "Patient [pid=" + pid + ", age=" + age + ", disease=" + disease + ", amount=" + amount + "]";
    }
    

    

    
}
