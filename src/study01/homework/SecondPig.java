package study01.homework;

public class SecondPig extends PigParent {
	public void build() {
		System.out.println("집을 지을 수 있는 능력, 나무로 지은 집");
	}
	
	public static void main(String[] args) {
		SecondPig secondPig = new SecondPig();
		secondPig.build();
	}
}
