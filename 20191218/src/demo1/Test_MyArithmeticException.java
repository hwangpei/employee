package demo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test_MyArithmeticException {

	public static void main(String[] args) {
		// 输入2个int，如果除数为0打印异常信息，如果除数为2打印异常信息，其余情况打印结果
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("请输入第一个数");
			int num1 = input.nextInt();
			System.out.println("请输入第二个数");
			int num2 = input.nextInt();
			
			//判断除数
			if(num2 == 2) {
				MyArithmeticException myEx = new MyArithmeticException("除数不能为2");
				throw myEx;
				//throw new MyArithmeticException("除数不能为2");
			}
			
			if(num2 == 0) {
				throw new ArithmeticException("除数不能为0");
			}
			
			double rs = (double)num1 / num2;
			String str = String.format("%d / %d = %.2f", num1, num2, rs);
			System.out.println(str);
		}catch(MyArithmeticException ex3) {
			ex3.printStackTrace();
		}catch(ArithmeticException ex2) {
			ex2.printStackTrace();
		}catch(InputMismatchException ex) {
			ex.printStackTrace();
		}

	}

}
