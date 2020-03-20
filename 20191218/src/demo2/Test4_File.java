package demo2;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Test4_File {

	public static void main(String[] args) {
		File file = new File("d:/Hello.java");
		Date d = new Date(file.lastModified());
		System.out.println(d);
		boolean b = false;
		try {
			File file2 = new File("d:/oca/Hello2.java");
			 b = file2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(b) {
			System.out.println("文件创建成功");
		}else {
			System.out.println("文件创建失败");
		}

	}

}
