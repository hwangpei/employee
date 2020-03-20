package demo1;

public class MyArithmeticException extends ArithmeticException {

	public MyArithmeticException() {}
	
	public MyArithmeticException(String msg) {
		super(msg);
	}
}
