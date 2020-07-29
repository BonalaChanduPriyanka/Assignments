package files;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("C:\\Users\\bpriyanka4\\OneDrive - DXC Production\\Java Programs\\Badminton") ;
					file.mkdir();
					System.out.println("directory1 created");
					File f1 = new File(file, "singles.txt");
					try {
						f1.createNewFile();
						System.out.println("file singles created");
					} catch (IOException e) {
						e.printStackTrace();
					}
					File f2 = new File(file, "dubbles.txt");
					try {
						f2.createNewFile();
						System.out.println("file dubbles created");
					} catch (IOException e) {
						e.printStackTrace();
					}
					File file1 = new File("C:\\Users\\bpriyanka4\\OneDrive - DXC Production\\Java Programs\\Badminton\\courts") ;
					file1.mkdir();
					System.out.println("directory2 created");
					File f3 = new File(file1, "Smash.dat");
					try {
						f3.createNewFile();
						System.out.println("file smash created");
					} catch (IOException e) {
						e.printStackTrace();
					}
					File f4 = new File(file,"Doubles.txt");
					f2.renameTo(f4);
					System.out.println("Duddles=Doubles");
					f1.delete();	
					System.out.println("singles delted");
		}
		catch(Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}

	}

}
