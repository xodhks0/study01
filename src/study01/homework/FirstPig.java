package study01.homework;

public class FirstPig extends PigParent {
	public void build() {
		System.out.println("집을 지을 수 있는 능력, 짚으로 지은 집");
	}
	
	public static void main(String[] args) {
		FirstPig firstPig = new FirstPig();
		firstPig.build();
	}
}
