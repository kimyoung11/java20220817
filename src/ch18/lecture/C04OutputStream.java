package ch18.lecture;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C04OutputStream {
	public static void main(String[] args) throws IOException {
		
		String originalFileName = 
				"C:\\Users\\user\\Desktop\\output\\사진.jfif";
		String targetFileName = "C:\\Users\\user\\Desktop\\output\\사진2.jfif";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes))!=-1){
			fos.write(readBytes,0,readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("복사완");
	}
}
