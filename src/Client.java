
public class Client {

	private String name;
	private int age;
	
	public Client(String name, int age) {
		super();
		this.name = name;
		setAge(age);
	}

	public void setAge(int age){
        if(age <= 0){
            this.age = 18;
        }
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public boolean getElderly() {
		if (this.getAge() >= 60) {
			return true;
		}else {
			return false;			
		}
	}
	
	public String toString() {
        return this.name + ":" + this.age;
    }

	
}
