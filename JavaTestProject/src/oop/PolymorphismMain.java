package oop;

public class PolymorphismMain {
    /*
    * 以下實現Polymorphism
    * 並且返回皆為Movie
    * */
    public static void main(String[] args) {
        Movie movie = loadMovie(1);
        Print.content("movie: " + movie.getName() + "\n" +
                "note: " + movie.getNote());
        Print.content("--------------");

        Movie movie2 = loadMovie(0);
        Print.content("movie2: " + movie2.getName() + "\n" +
                "note2: " + movie2.getNote());

        Print.content("--------------");
        Movie movie3 = loadMovie(2);
        Print.content("movie3: " + movie3.getName() + "\n" +
                "note3: " + movie3.getNote());
    }

    private static Movie loadMovie(int index) {
        return switch (index) {
            case 0 -> new TheHurtLocker();
            case 1 -> new Taken();
            default -> new Movie("null");
        };
    }
}
