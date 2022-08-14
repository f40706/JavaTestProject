package generics;

public class BPlayer extends Player {
    public BPlayer(String name, int score) {
        super(name, score);
    }

    @Override
    void printLevel() {
        System.out.println("9");
    }
}
