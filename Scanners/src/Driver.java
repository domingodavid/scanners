import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		File file = new File("covid417.csv");
			
	     //Creating Scanner instnace to read File in Java
	    try {
			Scanner scanner = new Scanner(file);
			
			//call nextLine to skip any lines
			scanner.nextLine();
			
			int totalDeaths = 0;
			
			while(scanner.hasNextLine()) {
				String row = scanner.next();
				
				//use indexOf to see if the row contains "Michigan"
				if(row.indexOf("Michigan")>=0) {
					
					String[] result = row.split(",");
					//System.out.println(Arrays.toString(result));
					if(result.length>=3) { //to catch any corner cases at the end of file
						//System.out.println(result[3]);
						//since the values are Strings we need to convert
						totalDeaths += Integer.valueOf(result[3]);
					}
					
				}
				
			}
			
			System.out.println(totalDeaths);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
