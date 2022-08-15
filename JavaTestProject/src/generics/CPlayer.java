package generics;

public class CPlayer extends Player {
    public CPlayer(String name, int score) {
        super(name, score);
    }

    @Override
    void printLevel() {
        System.out.println("1");
    }

}
