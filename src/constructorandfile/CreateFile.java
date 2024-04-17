package constructorandfile;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
	File f= new File("G:\\AUTOMATION\\LC.txt");	
    if(f.createNewFile())
    {
    	System.out.println("file created successfully");
    }
    else
    {
    	System.out.println("file not created");
    }
	}

}
