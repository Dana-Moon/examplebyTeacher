package example_0706.exam05_instanceof.example_driver.location;

public class Seoul implements Navi{
    private String location = "서울";
    public void location() {
        System.out.println("차는 현재 "+this.location+"을 지나고 있습니다.");
//        System.out.println(speed+"km 미만의 속도를 유지합니다.");
    }
}
