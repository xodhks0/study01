package study01.test03;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		System.out.println("1��° �ζ� ��ȣ�� �Է����ּ���.");
		Scanner scan = new Scanner(System.in);
		int num1 = Integer.parseInt(scan.nextLine());
		System.out.println("�ϰ� �Է��� ù��° ��ȣ:"+num1);
		int num2 = Integer.parseInt(scan.nextLine());
		System.out.println("�ϰ� �Է��� �ι�° ��ȣ:"+num2);
		int num3 = Integer.parseInt(scan.nextLine());
		System.out.println("�ϰ� �Է��� ����° ��ȣ:"+num3);
		int num4 = Integer.parseInt(scan.nextLine());
		System.out.println("�ϰ� �Է��� �׹�° ��ȣ:"+num4);
		int num5 = Integer.parseInt(scan.nextLine());
		System.out.println("�ϰ� �Է��� �ټ���° ��ȣ:"+num5);
		int num6 = Integer.parseInt(scan.nextLine());
		System.out.println("�ϰ� �Է��� ������° ��ȣ:"+num6);
		
		Random r = new Random();
		System.out.println("�̹��� �ζ� ��ȣ�� �εε�~~");
		int correctCnt=0;
		for(int i=1;i<=6;i++) {
			int rNum = r.nextInt(45)+1;
			System.out.println(i+".��°:"+rNum);
			if(rNum==num1 || rNum==num2 || rNum==num3|| rNum==num4|| rNum==num5|| rNum==num5) {
				correctCnt++;//���������� �߰�
			}
		}
		System.out.println("�� ���� ����:"+correctCnt);
	}

}
