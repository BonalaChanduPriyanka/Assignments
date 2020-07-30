package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DocumentFormatter {
	public static void main(String ar[]) throws IOException {
		File file1 = new File("writer.txt");
		file1.createNewFile();
		BufferedWriter out = new BufferedWriter(new FileWriter("writer.txt", true));
		BufferedReader in = new BufferedReader(new FileReader("TopProverbs.txt"));
		String s;
		while ((s = in.readLine()) != null) {
			s = s.trim().replaceAll("\\s+", " ");
			out.write(s);
			out.newLine();
			out.flush();

		}

	}


}
