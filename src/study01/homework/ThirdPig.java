package study01.homework;

public class ThirdPig extends PigParent {
	public void build() {
		System.out.println("집을 지을 수 있는 능력, 벽돌로 지은 집");
	}
	
	public static void main(String[] args) {
		ThirdPig thirdPig = new ThirdPig();
		thirdPig.build();
	}
}