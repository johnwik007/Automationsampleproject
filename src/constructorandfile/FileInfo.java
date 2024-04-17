package constructorandfile;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
	File f= new File("G:\\AUTOMATION\\LC.txt");
	if(f.exists())
	{
		System.out.println("File Nmae:" +f.getName());
		System.out.println("File Location:" +f.getAbsolutePath());
		System.out.println("File writable:" +f.canWrite());
		System.out.println("File readable:" +f.canRead());
		System.out.println("File size:" +f.length());
	}
	else
	{
		System.out.println("File does not exist");
	}

	}

}
