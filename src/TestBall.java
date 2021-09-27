/**
 * This is a class for testing the OOPBalls
 * Created 2021-09-24
 *
 * @author Magnus Silverdal
 */

import java.awt.Color;

public class TestBall {
    public static void main(String[] args) {
        BasicBall ball1 = new BasicBall(new Color(0xFF0000,new Coordinate(100,100)));
        System.out.println(ball1.getPosition().getXPos() + ", " + ball1.getPosition().getYPos());
        MovingBall ball2 = new MovingBall(new Color(0xFF0000,new Coordinate(100,100),2,2);
        for (int i = 0 ; i < 100 ; i++) {
            ball2.move(0.5);
            System.out.println(ball2.getPosition().getXPos() + ", " + ball2.getPosition().getYPos());
        }
    }
}
