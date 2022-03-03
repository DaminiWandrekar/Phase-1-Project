package p1;

import java.io.IOException;
import java.io.FileReader;

public class ReadFile {
public static void main(String args[]) {
	char[] data= new char[100];
	try {
		FileReader input = new FileReader("data.txt");
		input.read(data);
		System.out.println("Data received from File.");
		System.out.println(data);
		input.close();
	} catch (IOException e) {
		System.out.println("File read Error...");
	} 
}
}
