package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.IOException;

public class ProverbReader {

	public static void main(String[] args) throws IOException {

		BufferedReader BR = new BufferedReader(new FileReader("TopProverbs.txt"));
		try {
		    String s;
		    while ((s = BR.readLine()) != null) {
				if(s!=null)
				{
					System.out.println(s);
				}
		    }
		} finally {
		    BR.close();
		}

	}

}
