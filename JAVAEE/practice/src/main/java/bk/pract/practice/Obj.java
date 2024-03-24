package bk.pract.practice;

public class Obj {
	private Store store;
	
	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	private Constru constru;
	
 
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Obj(Constru constru) {
		super();
		this.constru = constru;
	}

	public Constru getConstru() {
		return constru;
	}

	String id=constru.getId();
	public void setConstru(Constru constru) {
		this.constru = constru;
	}
	public void say() {
		System.out.println("hii");
	}
	public void call() {
		store.insert(constru);
	}
	
	
	public void get() {
		System.out.println(store.getEmployeeByid(id));
	}

 
 }

	

