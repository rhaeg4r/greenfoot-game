import greenfoot.*;

public class Car extends Actor {
    private boolean isFlying = false;
    private int flyTime = 0;

    public void act() {
        if (!((TrackWorld) getWorld()).isGameOver) {
            handleMovement();
            if (!isFlying) {
                checkCollision();
            }
        }
    }

    private void handleMovement() {
        if (Greenfoot.isKeyDown("left")) setLocation(getX() - 3, getY());
        if (Greenfoot.isKeyDown("right")) setLocation(getX() + 3, getY());
        if (Greenfoot.isKeyDown("up")) setLocation(getX(), getY() - 3);
        if (Greenfoot.isKeyDown("down")) setLocation(getX(), getY() + 3);

        // Flying functionality (press space to fly)
        if (Greenfoot.isKeyDown("space") && !isFlying) {
            isFlying = true;
            flyTime = 100; // Fly for 50 frames
        }

        if (isFlying) {
            flyTime--;
            if (flyTime <= 0) {
                isFlying = false; // End flying mode
            }
        }
    }

    private void checkCollision() {
        if (isTouching(EnemyCar.class)) {
            ((TrackWorld) getWorld()).endGame();
        }
    }
}
