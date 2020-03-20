package demo2;

import java.io.File;

public class Test3_File {

	public static void main(String[] args) {
		File dir = new File("d:\\20191113");
		String[] fileNames = dir.list();
		for(String s : fileNames) {
			System.out.println(s);
		}
		System.out.println("--------------------------");
		File[] files = dir.listFiles();
		for(File f : files) {
			if(f.isFile()) {
				System.out.println(f.getName()+"是文件");
			}else {
				System.out.println(f.getName()+"是目录");
			}
		}
	}

}
