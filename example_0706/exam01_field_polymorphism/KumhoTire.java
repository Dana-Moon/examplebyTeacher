package example_0706.exam01_field_polymorphism;

public class KumhoTire implements Tire {
	@Override
	public void roll() {
		System.out.println("금호 타이어입니다.");
	}
}
