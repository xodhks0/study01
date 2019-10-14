package study01.test13;

public class TestTest {
	private String[] strs1;

	public TestTest() {// 생성자! 클래스와 이름이 같아야함!
		this.strs1 = new String[0];
	}

	public int size1() {
		return this.strs1.length;
	}

	public void add1(String str) {
		String[] tmpStr1 = this.strs1;
		this.strs1 = new String[this.strs1.length + 1];
		this.strs1[this.strs1.length - 1] = str;
		for (int i = 0; i < tmpStr1.length; i++) {
			strs1[i] = tmpStr1[i];
		}

	}

	public static void main(String[] args) {
		TestTest tt = new TestTest();
		tt.add1("1");
		tt.add1("2");
		tt.add1("3");

		System.out.println(tt.strs1[0] + ", " + tt.strs1[1] + ", " + tt.strs1[2]);
	}
}
