package programmers;

public class p7 {
	public static void main(String[] args) {
		
		int n = 437674;//211020101011
		int k =3;
		int ans = 0;
        String temp[] = Integer.toString(n, k).split("0");
        for(String item : temp) {
        	System.out.println(item);
        }

       for(String t : temp) {
            if(t.length() == 0) continue;
            long a = Long.parseLong(t);
            if(a == 1) continue;
            for(int i=2; i<=Math.sqrt(a); i++)
                if(a%i == 0) continue;

            ans++;
        }
        System.out.println(ans);
	}
}
