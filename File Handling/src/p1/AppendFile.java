package p1;
import java.io.FileWriter;
import java.io.IOException;
public class AppendFile {

	public static void main(String[] args) {
		String data = "This data is Appended..";
		try {
			FileWriter output = new FileWriter("data.txt", true);
			output.write(data);
			System.out.println("Data Appended Successfully.");
			output.close();
		} catch (IOException e) {
		
			System.out.println("File Append Error...");
		}
		

	}

}
