package demo1;

import java.io.IOException;
import java.text.ParseException;

public class Test_throws {

	public static void test1() throws IOException, ParseException, NullPointerException{
		
	}
	
	public static void main(String[] args) {
		try {
			test1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			test1();
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}

	}

}
