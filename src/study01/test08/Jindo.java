package study01.test08;
// JAVA는 단일상속만 가능
class Animal {
	
}

class Dog extends Animal {
	public void test() {
		System.out.println("Dog test method");
	}
}

class Poodle {

}

public class Jindo extends Dog { // 상속의 limit는 없음, 모든 클래스는 상속을 받고 있다. (Object)
	public static void main(String[] args) {
		Dog d = new Jindo();
//		Jindo j = new Dog(); 오류
		Animal a = new Jindo();
		Object o = new Jindo();
		Jindo jindo = new Jindo();
//		Animal jindo2 = new Jindo(); jindo2 test(); 오류 
		jindo.test();
		
	}

}
