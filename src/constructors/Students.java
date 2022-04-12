package constructors;

public class Students {
	Students(String name,int age,int stid){
		this.name=name;
		this.age=age;
		this.stid=stid;
		
	}

	String name;
	int age;
	int stid;
	
	void Major() {
		System.out.println(this.name+" major in Java");
	}
	
	
	
}
