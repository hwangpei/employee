package demo2;

import java.io.File;

public class Test2_File {

	public static void main(String[] args) {
		File file = new File("d:/Hello.java");
		System.out.println("file�Ƿ�ɶ�ȡ?"+file.canRead());
		System.out.println("file�Ƿ��д��?"+file.canWrite());
		System.out.println("file�Ƿ��������ļ���"+file.isHidden());

	}

}
