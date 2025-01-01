import greenfoot.*;

public class TrackWorld extends World {
    public int score = 0;
    public int timer = 0;
    public boolean isGameOver = false;

    public TrackWorld() {
        super(400, 600, 1); 
        drawLanes();
        addObject(new Car(), 200, 500); // Place player car at the bottom center
    }

    public void act() {
        if (!isGameOver) {
            timer++;
            if (timer % 100 == 0) {
                addEnemyCar(); // Add an enemy car periodically
                score++;
            }
        }
        showScore();
    }

    private void drawLanes() {
        GreenfootImage bg = getBackground();
        bg.setColor(Color.GRAY); // Set the road color
        bg.fill(); // Fill background with road color
        
        // Draw lane dividers
        bg.setColor(Color.WHITE);
        int laneWidth = getWidth() / 4; // Divide world into 4 lanes
        for (int i = 1; i < 4; i++) { // Draw 3 dividing lines
            int x = i * laneWidth;
            for (int y = 0; y < getHeight(); y += 30) {
                bg.fillRect(x - 2, y, 4, 20); // Dashed line style
            }
        }
    }

    private void addEnemyCar() {
        int[] laneCenters = {50, 150, 250, 350}; // X-positions for 4 lanes
        int randomLane = laneCenters[Greenfoot.getRandomNumber(laneCenters.length)];
        addObject(new EnemyCar(), randomLane, 0); // Add enemy car in a random lane
    }

    private void showScore() {
        showText("Score: " + score, 60, 20);
        if (isGameOver) {
            Greenfoot.stop();
            showText("Game Over!", getWidth() / 2, getHeight() / 2);
        }
    }

    public void endGame() {
        isGameOver = true;
        
    }
}
