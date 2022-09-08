package ch10.lecture;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class C02Exception {
	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("실행 흐름 이어감");
			e.printStackTrace();
		}
	}
}
