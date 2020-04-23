import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Driver3 {

	public static void main(String[] args) {

		File file = new File("input2");
			
	     //Creating Scanner instnace to read File in Java
	    try {
	    	//setup scanner based on File
			Scanner scanner = new Scanner(file);
			
			//read through file
			while(scanner.hasNextLine()) {
				
				//grab a line from the file
				int x = scanner.nextInt();
				double y = scanner.nextDouble();
				
				
			}
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
