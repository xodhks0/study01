package study01.test08;
//생성자 특징 1. class명과 정확히 일치해야함 2. return X 
//Overriding 1. 상속 2. 생성자가 달라 Overriding이 안됨 3. Overloading은 됨 
//Overloading과 Overriding의 차이점 인지할것!(시험문제)
class Father {
	int a = 3;
	Father() {
		System.out.println("1. Father 클래스의 생성자");
	}
}

public class Constructor extends Father {
	int b = 10;
	Constructor() {
		System.out.println(b);
		System.out.println(a);
		System.out.println("2. 생성자 클래스의 생성자");
	}
	
	public static void main(String[] args) {
		Constructor c = new Constructor();
	}

}
