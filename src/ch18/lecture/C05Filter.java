package ch18.lecture;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class C05Filter {
	public static void main(String[] args) throws IOException {
		String src = "C:\\Users\\user\\Desktop\\output\\output1.txt";
		String des = "C:\\Users\\user\\Desktop\\output\\output2.txt";

		try (
				FileInputStream fis = new FileInputStream(src);
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);

				FileOutputStream fos = new FileOutputStream(des);
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				BufferedWriter bw = new BufferedWriter(osw);) {

			char[] cbuf = new char[1000];
			int len = 0;

			while ((len = br.read(cbuf)) != -1) {
				bw.write(cbuf, 0, len);
			}
			for(int i=0;i<cbuf.length;i++)
				System.out.print(cbuf[i]);
			
			System.out.println("복사 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
