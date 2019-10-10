package study01.test11;

public class AirconRemocon implements Remote {

	@Override
	public void on() {
		System.out.println("Aircon을 킵니다.");
	}

	@Override
	public void off() {
		System.out.println("Aircon을 끕니다.");
	}

}
