package bk.pract.practice;

public class Constru {
	private String id;
	private String name;
	private int exp;
	
	public Constru() {
		System.out.println("hiii");
	}
	public Constru(String id, String name, int exp) {
		super();
		this.id = id;
		this.name = name;
		this.exp = exp;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Constru [id=" + id + ", name=" + name + ", exp=" + exp + "]";
	}
	

}
