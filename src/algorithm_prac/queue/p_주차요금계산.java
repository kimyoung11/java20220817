package algorithm_prac.queue;

import java.util.HashMap;


class Park{
	String carNumber; // 차량 번호
	int parkingMinute; // 주차시간
	int entranceTime; // 입차시간
	boolean status; // false : 입차 / true : 출차
	
	public Park(String carNumber, int parkingMinute, int entranceTime, boolean status) {
		this.carNumber = carNumber;
		this.parkingMinute = parkingMinute;
		this.entranceTime = entranceTime;
		this.status = status;
	}
	
	
}

public class p_주차요금계산 {
	public static void main(String[] args) {
		int[] fees = {180, 5000, 10, 600};
		String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
		
		String[] temp = records[0].split(" ");
		int hour = Integer.parseInt(temp[0].split(":")[0]) * 60;
		int min = Integer.parseInt(temp[0].split(":")[1]);
		int total = hour + min;
		System.out.println(total);
		
		HashMap<Integer, Park> hm = new HashMap<>();
		
//		for(int i=0;i<records.length;i++) {
//			String[] temp = records[i].split(" ");	
//		}
		
		
	}
}
