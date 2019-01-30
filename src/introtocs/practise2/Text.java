package introtocs.practise2;

import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

public class Text {
	
	public static void main(String[] args) {
		
		File myFile = new File("C:\\Users\\3C HUB\\eclipse-workspace\\introtocs\\src\\introtocs\\practise2\\file.txt");
		
		try {
			Scanner input = new Scanner(myFile);
			PrintWriter output = new PrintWriter(myFile);
			
			try {
				output.println("This is a new line1");
				output.println("This is a new line2");
				output.println("This is a new line3");
				output.println("This is a new line4");
				
			}
			finally {
				output.close();
			}
			try {
				String contents = input.nextLine();
				while (input.hasNextLine()) {
					contents = contents + "\n" + input.nextLine();
				}
				System.out.println(contents);
			}
			finally {
				input.close();
			}
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}

}
