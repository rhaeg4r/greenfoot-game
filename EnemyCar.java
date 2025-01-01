import greenfoot.*;

public class EnemyCar extends Actor {
    private int speed = 2;

    public EnemyCar() {
        // Optional: Increase speed over time or based on score
    }

    public void act() {
        setLocation(getX(), getY() + speed);
        if (getY() >= getWorld().getHeight() - 10) {
            getWorld().removeObject(this); // Remove car when it reaches the end
        }
    }
}
