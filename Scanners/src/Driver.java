import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		File file = new File("input1");
			
	     //Creating Scanner instnace to read File in Java
	    try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
