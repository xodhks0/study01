package study01.test13;

import java.util.ArrayList;

public class ListTest {
	private String[] strs;

	public ListTest() {
		this.strs = new String[0];
	}

	public int size() {
		return this.strs.length;
	}

	public void add(String str) {
		String[] tmpStr = this.strs;
		this.strs = new String[this.strs.length + 1];
		this.strs[this.strs.length - 1] = str;
		for(int i=0;i<tmpStr.length;i++) {
			this.strs[i] = tmpStr[i];
		}
	}

	public static void main(String[] args) {
//		ArrayList<String> arr = new ArrayList<String>();
//		System.out.println(arr.size());
		ListTest lt = new ListTest();
		lt.add("a");
		lt.add("b");
		lt.add("c");
//		System.out.println(lt.size());
//		System.out.println(lt.strs[0]);
//		System.out.println(lt.strs[1]);
//		System.out.println(lt.strs[2]);
		System.out.println(lt.strs[0]+", "+lt.strs[1]+", "+lt.strs[2]);
		}
				
	}
