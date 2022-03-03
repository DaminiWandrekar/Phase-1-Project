package p1;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String argd[])
	{
		String data ="101, Damini, Akola, Maharashtra, India.";
		try {
			FileWriter output = new FileWriter("data.txt");
			output.write(data);
			System.out.println("Data is written successfully");
			output.close();
		} catch (IOException e) {
			System.out.println("File Write error");
		}
	}
}
