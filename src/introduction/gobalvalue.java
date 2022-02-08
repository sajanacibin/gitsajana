package introduction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class gobalvalue {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Properties pro=new Properties();
FileInputStream file=new FileInputStream("/Users/JP/Sajana/introduction/src/introduction/value.properties");
	pro.load(file);
	String name=pro.getProperty("browser");
	String url=pro.getProperty("url");
	System.out.println(name);
	System.out.println(url);
	pro.setProperty("browser","firefox");
	System.out.println(pro.getProperty("browser"));
	FileOutputStream output=new FileOutputStream("/Users/JP/Sajana/introduction/src/introduction/value.properties");
	pro.store(output, null);
	
	}

}
