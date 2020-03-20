package demo2;

import java.io.File;

public class Test2_File {

	public static void main(String[] args) {
		File file = new File("d:/Hello.java");
		System.out.println("file是否可读取?"+file.canRead());
		System.out.println("file是否可写入?"+file.canWrite());
		System.out.println("file是否是隐藏文件？"+file.isHidden());

	}

}
