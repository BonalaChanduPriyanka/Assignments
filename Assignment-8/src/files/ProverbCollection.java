package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProverbCollection {
	static void storeProverb(String str) throws IOException{
		BufferedWriter BW = new BufferedWriter(new FileWriter("TopProverbs.txt",true));
		{
			BW.write(str);
			BW.newLine();
		}
		
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter proverb or STOP");
		String s = "";
		while (true) {
		s=sc.next();
		if(s.equals("STOP")) {
			break;
		}
		else
		{
			storeProverb(s);
			
		}
		}
	}

}
