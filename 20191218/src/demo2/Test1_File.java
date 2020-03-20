package demo2;
import java.io.File;
public class Test1_File {

	public static void main(String[] args) {
		//File file = new File("d:\\Hello.java");
		File file = new File("d:/Hello.java");
		System.out.println(file.length());
		
		File dir = new File("d:\\20191113");
		System.out.println(dir.length());
		
		File file2 = new File("d:\\20191113","index.html");
		System.out.println(file2.length());
		
		File file3 = new File(dir, "index.html");
		System.out.println(file3.length());
		
		File file4 = new File("d:/Hello2.java");
		System.out.println("file是否存在："+file.exists());
		System.out.println("file4是否存在："+file4.exists());
		
		System.out.println("file是文件吗？"+file.isFile());
		System.out.println("file是目录吗？"+file.isDirectory());
		System.out.println("dir是文件吗？"+dir.isFile());
		System.out.println("dir是目录吗？"+dir.isDirectory());
		
		

	}

}
