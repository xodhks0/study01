package study01.test03;

import java.util.Scanner;

public class HowOldRU {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ����̾�?");
		String age = scan.nextLine();
		int num = Integer.parseInt(age);//parseInt �м�
		if(num<=10) {
			System.out.println("����Դϴ�~");
		}
			else if(num<=20) {
				System.out.println("û�ҳ��Դϴ�~");
			}
			else if(num<=40) {
				System.out.println("û���Դϴ�~");
			}
			else {
				System.out.println("���뼼��~?");
			}
			
		}
	
}
