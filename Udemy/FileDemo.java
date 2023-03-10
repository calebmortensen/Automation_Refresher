import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		String a = "Caleb M";
		
		System.out.println("Running");

		File file1 = new File("C:\\users\\caleb\\Desktop\\MaggieMae.PNG");
		File file2 = new File("C:\\users\\caleb\\Desktop\\JustAFile.txt");
		//int x = 10/0;
		String str;
		
		try {
		FileReader fr = new FileReader(file2);
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		System.out.println(file2.getAbsoluteFile());
		
		while ((str=br.readLine())!=null) {
			System.out.println(str);
			
		}
		System.out.println(fr);
		}catch(FileNotFoundException e) {
			//e.printStackTrace();
			//e.getMessage();
			System.out.println("File Not Found Exception handled");
		}
	}

}
