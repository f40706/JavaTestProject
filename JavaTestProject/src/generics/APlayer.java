package generics;

public class APlayer extends Player {
    public APlayer(String name, int score) {
        super(name, score);
    }

    @Override
    void printLevel() {
        System.out.println("2");
    }

}
