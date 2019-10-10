package study01.homework;
public class GoldenAxe_SilverAxe {
	public void mountainGod() {
		System.out.println("왜 울고 있느냐");
	}
	public void mountainGod(String type) {
		System.out.println("너가 빠뜨린 그 도끼가 이 금도끼냐");
	}
	public void mountainGod(String type, String color) {
		System.out.println("너가 빠뜨린 그 도끼가 이 은도끼냐");
	}
	public void mountainGod(String type, String color, String used) {
		System.out.println("너가 빠뜨린 그 도끼가 이 낡은 쇠도끼냐");
		System.out.println("상으로 이 도끼를 전부 주겠다");
	}
	public static void main(String[] args) {
		GoldenAxe_SilverAxe woodcutter = new GoldenAxe_SilverAxe();
//		woodcutter.mountainGod();
//		woodcutter.mountainGod("도끼");
//		woodcutter.mountainGod("도끼", "회색");
		woodcutter.mountainGod("도끼", "회색", "낡은");
	}
}
