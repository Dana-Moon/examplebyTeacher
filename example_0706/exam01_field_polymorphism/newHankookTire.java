package example_0706.exam01_field_polymorphism;

public class newHankookTire implements Tire {
    @Override
    public void roll() {
        System.out.println("새로운 한국 타이어입니다.");
    }
}
