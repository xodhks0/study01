package study01.test07;

class Cat {
	private int age;
	private String name;
	private String type;
	public void setAge(int age) { // private 변수를 직접적으로 건드리지 않고, Method를 통해서만 변수 변경 가능 (POJO) set : 주입, get : 가져오다
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
}


public class Access {
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setAge(5);
		cat.setName("개냥이");
		cat.setType("벵골");
		System.out.println("고양이의 나이 : " + cat.getAge());
		System.out.println("고양이의 이름 : " + cat.getName());
		System.out.println("고양이의 종류 : " + cat.getType());
	}
}
