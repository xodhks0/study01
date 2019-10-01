package study01.test02;

public class ArrayTest {
	public static void main(String[] args) {
		int money1 = 0;
		int money2 = 1000;
		int money3 = 5000;
		int money4 = 10000;
		
		int[] moneys= new int[4];
		moneys[0] = 0;
		moneys[1] = 1000;
		moneys[2] = 5000;
		moneys[3] = 10000;

		System.out.println(moneys.length);
		
		for(int i=0; i<moneys.length; i=i+1) {
			System.out.println(moneys[i]);
		}
		
		double[] dbs = new double[5];
		
	}
}
