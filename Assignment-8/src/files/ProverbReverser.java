package files;

import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ProverbReverser {
	static void reverseWord(StringBuffer str) throws IOException {

		StringBuffer s = str.reverse();
		//System.out.println(s);
		BufferedWriter bwr = new BufferedWriter(new FileWriter(new File("ReverseProverbs.txt")));
		bwr.write(s.toString());
		bwr.flush();
		bwr.close();	
		
	}


	public static void main(String args[]) throws IOException {

		FileReader fr = new FileReader("TopProverbs.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = new String();
		while ((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line, "");
			int count = st.countTokens();
			for (int i = 1; i <= count; i++) {
				String word = st.nextToken();
				StringBuffer sb = new StringBuffer(word);
				reverseWord(sb);
			}
		}

	}

}
