package study01.test15;

public class ReplaceTest {

	public static void main(String[] args) {
		String a = "무궁화, 삼천리, 화려강산, 대한사람, 대한으로, 길이, 보전하세 ";
		//replaceAll([정규식],[바꿀문자])
		a = a.replaceAll(",", "/"); //날짜는 데이터포멧 형식으로 치환한다.
		System.out.println(a);
		String str = "2019-10-16";
		System.out.println(str.replaceAll("-","."));
		
		System.out.println(str);
	}
}
