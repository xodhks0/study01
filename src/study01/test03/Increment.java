package study01.test03;

public class Increment {
	public static void main(String[]args) {
		int num=1;
		num=num+1;
		num+=1;//���� ����
		num++;
		System.out.println(++num);
		System.out.println(num);
		
		num=num-1;
		num-=1;
		num--;
		
		System.out.println(num--);
		System.out.println(num);
		
		for(int i=1;i<=10;i++) {//�����;���Ժ�;������
			System.out.println(i);
		}
	}

}
