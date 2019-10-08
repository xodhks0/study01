package study01.test10;

import java.util.Random;

public class Sort {
	// 각 값을 순차적으로 비교하여 제일 작은 수를 기억하고 기억된 수를 앞 순번으로 배치함, 이후 방 하나를 Fix하고 다음 방부터 다시
	// 비교하여 순차적으로 정렬
	/*
	 * 각 난수 값을 지정 0번째 방에 위치한 값과 1번째 값을 비교하여 작은 수를 기억 그 중 작은 수를 다음 값과 비교를 반복하여 제일 작은
	 * 수를 찾음 제일 작은 수는 0번째 방에 입력한 뒤 1번째 방부터 다시 비교
	 */
	public static void main(String[] args) {
		int[] nums = new int[10];
		Random r = new Random();
		// 입력부
		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(100);
		}
		// 정렬
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
		}

		// 출력부
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
