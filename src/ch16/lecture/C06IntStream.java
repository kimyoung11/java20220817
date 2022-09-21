package ch16.lecture;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class C06IntStream {
	public static void main(String[] args) {
		
		//1~10 출력
		IntStream.rangeClosed(1, 10).forEach(e->System.out.print(e+" "));
		System.out.println();
		//1~100 합출력
		int b = IntStream.range(1, 101).sum();
		System.out.println(b);
		//1~100수 홀수합 출력
		int c = IntStream.range(1, 101).filter((e) -> e%2 !=0).sum();
		System.out.println(c);
		//5,10,20,1,6 평균 구하기
		double d = Arrays.stream(new double[] {5,10,20,1,6}).average().getAsDouble();
		System.out.println(d);
		//주사위 5번던진 결과 출력
		IntStream.generate(()->(int)(Math.random()*6) +1).limit(5).forEach(e->System.out.print(e+ " "));
		System.out.println();
		//로또번호 6개 작은수 부터 출력(노중복)
		IntStream.generate(() ->(int)(Math.random()*1) +1).limit(6).distinct().sorted().forEach(e->System.out.print(e + " "));
		System.out.println();
		//IntStream.generate(() ->(int)(Math.random()*45) +1).distinct().sorted().limit(6).forEach(e->System.out.print(e + " "));
		//실행 흐름 궁금
		
		int[] ints = {1,3,5,7,9};
		OptionalDouble k = IntStream.of(ints).average();
		System.out.println(k.getAsDouble());
	}
}
