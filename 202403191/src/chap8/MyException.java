package chap8;

public class MyException extends Exception {
	private final int ERR_CODE;
	
	MyException(String msg, int errCode){
		super(msg);
		ERR_CODE =errCode;
	}
	MyException(String msg){
		this(msg, 100);
	}
	
	public int getErrCode() {
		return ERR_CODE;
	}
}
