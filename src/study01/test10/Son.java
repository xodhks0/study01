package study01.test10;

class Father {
	public void test() {
		System.out.println("아빠 클래스");
	}
}
	public class Son extends Father {
		public void test() {
			System.out.println("아들 클래스");
		}

		public void sonsTest() {
			System.out.println("아빠 클래스에 없는 기능");
		}

		public static void main(String[] args) {
			Father s = new Son();

			Son s2 = (Son) s;
			s2.sonsTest();
			
			Father f = new Father();
			if (f instanceof Son) {
				s2 = (Son) f;
				s2.sonsTest();
			}
		}
	}