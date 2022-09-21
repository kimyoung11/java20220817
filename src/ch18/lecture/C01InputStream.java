package ch18.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class C01InputStream {
	public static void main(String[] args) throws IOException {
		
		String path = "src/ch18/lecture/C01InputStream.java";
		InputStream is = new FileInputStream(path);
		
//		byte[] b = new byte[100];
//		is.read(b);
//		
//		int len1 = is.read(b);
//		int len2 = is.read(b);
//		int len3 = is.read(b);
//		int len4 = is.read(b);
//		int len5 = is.read(b);
//		int len6 = is.read(b);
//		
//		System.out.println(len1);
//		System.out.println(len5);
//		System.out.println(len6);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = is.read(readBytes)) !=-1) {
			System.out.write(readByteNo);
		}
		
		is.close();
	}
}
