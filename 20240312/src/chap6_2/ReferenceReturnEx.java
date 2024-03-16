package chap6_2;

public class ReferenceReturnEx {

	public static void main(String[] args) {
		Data dd= new Data();
		dd.x = 10;
		
		Data dd2 = copy(dd);
		System.out.println("dd.x = " + dd.x);
		System.out.println("dd2.x = " + dd2.x);
		
	}
	
	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;
		return tmp;
	
	}
}
