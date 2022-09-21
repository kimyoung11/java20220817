package ch14.lecture;

import java.util.function.IntBinaryOperator;

public class LambdaExample {
	private static int[] scores = {10,50,3};
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score: scores)
			result= operator.applyAsInt(result, score);
		return result;
	}
	public static void main(String[] args) {
		
		int max = maxOrMin((left,right) -> Math.max(left, right));
		System.out.println(max);
		int min = maxOrMin((left,right)-> Math.min(left, right));
		System.out.println(min);
	}
}
