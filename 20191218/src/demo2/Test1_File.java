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
		System.out.println("file�Ƿ���ڣ�"+file.exists());
		System.out.println("file4�Ƿ���ڣ�"+file4.exists());
		
		System.out.println("file���ļ���"+file.isFile());
		System.out.println("file��Ŀ¼��"+file.isDirectory());
		System.out.println("dir���ļ���"+dir.isFile());
		System.out.println("dir��Ŀ¼��"+dir.isDirectory());
		
		

	}

}
