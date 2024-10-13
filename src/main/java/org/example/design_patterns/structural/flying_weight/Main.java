package org.example.design_patterns.structural.flying_weight;

public class Main {
    public static void main(String[] args) {
        Bullet bullet = new Bullet("This in a regular bullet");
        MovingBullet movingBullet1 = new MovingBullet(bullet);
        MovingBullet movingBullet2 = new MovingBullet(bullet);
        MovingBullet movingBullet3 = new MovingBullet(bullet);

        System.out.println(movingBullet1.getBullet().getImage());
        System.out.println(movingBullet2.getBullet().getImage());
        System.out.println(movingBullet3.getBullet().getImage());

        System.out.println(movingBullet1.getBullet() == movingBullet2.getBullet());
    }
}
