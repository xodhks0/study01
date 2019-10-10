package study01.test11;

public class Excute {
	public static void main(String[] args) {
		Remote r = new TvRemocon();
		r.on();
		Remote r2 = new AirconRemocon();
		r2.on();
	}
}
