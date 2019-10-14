package study01.test13;

public class Test {
	private String[] strs;

	public Test() {
		this.strs = new String[0];

	}

	public void add() {
		strs = new String[strs.length + 1];
	}

	public static void main(String[] args) {
		String[] strs = new String[0];
		strs = new String[strs.length + 1];
		Test t = new Test();

	}
}
