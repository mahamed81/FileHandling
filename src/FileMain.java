import java.io.IOException;

public class FileMain {

	public static void main(String[] args) throws IOException {
		

		FileHandler f1 = new FileHandler();

		f1.readFromFile("FileToRead.txt");   /// the file path where the content is read from and added to an ArrayList type Employee

		f1.display(); // displaying the content 
	
		
		// Taking  the ArrayList of type Employee and append it to a file called FileAppend
		
		f1.appendData("FileAppend.txt");
		
		
	}

}
