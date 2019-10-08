package study01.test10;

import java.util.ArrayList;
import java.util.Random;

public class DoubleList {

	public static void main(String[] args) {
//		ArrayList<String> strList = new ArrayList<String>();
//		ArrayList<Double> doubleList = new ArrayList<Double>();
//		Random ran = new Random();
//		for (int i = 0; i < 10; i++) {
//			strList.add(ran.nextInt(100) + "." + ran.nextInt(10));
//			doubleList.add(Double.parseDouble(strList.get(i)));
//		}
//		System.out.println(strList);
//		System.out.println(strList.get(0)+strList.get(1));
//		System.out.println(doubleList);
//		System.out.println(doubleList.get(0)+doubleList.get(1));
		ArrayList<Double> nums = new ArrayList<Double>();
		Random r = new Random();

		for (int i = 0; i < 10; i++) {
			nums.add((double) r.nextInt(100));
		}
		for (int i = 0; i < nums.size(); i++) {
			for (int j = i + 1; j < nums.size(); j++) {
				if (nums.get(i) > nums.get(j)) {
					double tmp = nums.get(i);
					nums.set(i, nums.get(j));
					nums.set(j, tmp);
				}
			}
		}

		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}

	}
}
