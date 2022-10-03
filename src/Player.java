public class Player {
    private final int lives;

    public Player() {
        this.lives = 5;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        -- lives;
    }
}
