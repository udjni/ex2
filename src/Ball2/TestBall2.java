package Ball2;
import java.lang.*;
public class TestBall2 {
    public static void main(String[] args) {
        Ball2 b1 = new Ball2(100, 100);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
    }
}

