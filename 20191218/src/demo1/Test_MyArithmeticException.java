package demo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test_MyArithmeticException {

	public static void main(String[] args) {
		// ����2��int���������Ϊ0��ӡ�쳣��Ϣ���������Ϊ2��ӡ�쳣��Ϣ�����������ӡ���
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("�������һ����");
			int num1 = input.nextInt();
			System.out.println("������ڶ�����");
			int num2 = input.nextInt();
			
			//�жϳ���
			if(num2 == 2) {
				MyArithmeticException myEx = new MyArithmeticException("��������Ϊ2");
				throw myEx;
				//throw new MyArithmeticException("��������Ϊ2");
			}
			
			if(num2 == 0) {
				throw new ArithmeticException("��������Ϊ0");
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
