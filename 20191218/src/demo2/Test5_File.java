package demo2;

import java.io.File;

public class Test5_File {

	public static void main(String[] args) {
		//File dir = new File("d:/oca");
		File dir = new File("d:/oca/20191218");
		//boolean b = dir.mkdir();
//		if(b) {
//			System.out.println("Ŀ¼�����ɹ�");
//		}else {
//			System.out.println("Ŀ¼����ʧ��");
//		}
		boolean b =dir.mkdirs();
		System.out.println(b);

	}

}
