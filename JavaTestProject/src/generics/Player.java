package generics;

public abstract class Player {
    private final String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    protected void scopeTest() {
        System.out.println("scopeTest");
    }

    public void setScore(int score) {
        this.score = score;
    }

    abstract void printLevel();
}
