package study01.test04;

import java.util.Random;

public class ArrayTest {
//중복제거 복습 필수
	public static void main(String[] args) {
		int[] nums = new int[6];
		Random r = new Random(); // control + shift + o
		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(45) + 1;
			for (int j = i - 1; j >= 0; j--) {
				if (nums[i] == nums[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);  //함수, function, Method
		}
	}
}
