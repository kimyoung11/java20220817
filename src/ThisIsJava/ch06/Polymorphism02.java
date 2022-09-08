package ThisIsJava.ch06;

//abstract class Animal{
//	void cry();
//}
public class Polymorphism02 {
	public static void main(String[] args) {
		long answer = 1;
		long w = 100000000;
		long h = 8000000;
		long max = Math.max(w, h);
		long min = Math.min(w, h);
		long gcd = 0;
		for(long i=min; i>=0;i--) {
			if(max % i==0 && min % i ==0) {
				gcd= i;
				break;
			}
		}// w / gcd = 2  w / (w/gcd)
		System.out.println(gcd);
		answer = (w * h) - (gcd*((w/gcd)+(h/gcd)-1)); // 96 - ( 4 * ((가로)+(세로))
		//가로 = 가로길이 / gcd 8/4 =2
		//세로 = 세로길이 / gcd 12/4=3
		
//		answer = w * h - ((w / gcd) + ((h / gcd) -1)*gcd);
		System.out.println(answer);
	}
}
