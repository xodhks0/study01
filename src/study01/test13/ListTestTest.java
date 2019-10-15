package study01.test13;

public class ListTestTest {

	private String[] strs;

	public ListTestTest() {
		this.strs = new String[0];
	}

	public int size() {
		return this.strs.length;
	}

	public void add(String str) {
		String[] tmpStr = this.strs;
		this.strs = new String[strs.length + 1];
		this.strs[this.strs.length - 1] = str;
		for (int i = 0; i < tmpStr.length; i++) {
			this.strs[i] = tmpStr[i];
		}
	}

	public String toString() {
		String str = "[";
		for (int i = 0; i < strs.length; i++) {
			str += strs[i] + ", ";
		}
		str = str.substring(0, str.length() - 1);
		str += "]";
		return str;
	}

	public int indexOf(String str) {
		for (int i = 0; i < strs.length; i++) {
			if (str.contentEquals(strs[i])) {
				return i;
			}
		}
		return -1;
	}

	public void remove(String str) {
		int idx = indexOf(str);
		if (idx != -1) {
			remove(idx);
		}
	}

	public void remove(int idx) {
		String[] tmp = strs;
		strs = new String[strs.length - 1];
		for (int i = 0; i < idx; i++) {
			strs[i] = tmp[i];
		}
		for (int i = idx+1; i < tmp.length; i++) {
			strs[i - 1] = tmp[i];
		}
	}

	public static void main(String[] args) {
		ListTestTest lt = new ListTestTest();
		lt.add("a");
		lt.add("b");
		lt.add("c");
		lt.remove(1);
		System.out.println(lt);
	}
}
