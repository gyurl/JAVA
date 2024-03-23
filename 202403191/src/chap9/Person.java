package chap9;

public class Person {
	long id;
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person)
		return id == ((Person)obj).id;
		else
			return false;
	}



	Person(long id){
		this.id = id;
	}
}
