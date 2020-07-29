package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.IOException;

public class ProverbReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader BR = new BufferedReader(new FileReader("TopProverbs.txt"));
		String s= BR.readLine();
		if(s!=null)
		{
			System.out.println(s);
		}

	}

}
