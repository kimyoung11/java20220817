package ch18.lecture;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AddLineNumberExample {
	public static void main(String[] args) throws IOException {
		String filePath = "src/ch18/lecture/AddLineNumberExample.java";
		
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String line = null;
		
		int i=1;
		while((line = br.readLine()) != null) {
			System.out.println(i+":"+line);
			i++;
		}
		
	}
}
