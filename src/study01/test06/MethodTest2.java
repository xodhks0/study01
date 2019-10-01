package study01.test06;

public class MethodTest2 {
	int num; // 변수는 class 안에서 다 됨
	
	int getNum() {  // method는 class 바로 밑에만 선언 가능. 
		System.out.println(num);
		int num = 3;
		System.out.println(num);
		System.out.println(this.num);
		return 0;
	}
	
	public static void main(String[] args) {
		MethodTest2 methodTest2 = new MethodTest2();
		methodTest2.getNum();
		// System.out.println(num); <- 안됨
		System.out.println(methodTest2.num); // <- 됨
	}
}
