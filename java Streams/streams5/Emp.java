package streams5;

public class Emp {
    private int id;
    private String name;

   public Emp(){}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

@Override
public String toString() {
    return "Emp [id=" + id + ", name=" + name + "]";
}

    
}
