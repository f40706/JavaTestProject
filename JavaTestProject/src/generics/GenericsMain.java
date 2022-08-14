package generics;

public class GenericsMain {

    /**
     * genericsTest: 實現Generics的使用，以及泛型繼承
     * */
    public static void main(String[] args) {
        genericsTest();
    }

    private static void genericsTest() {
        //如果不加<>的話，雖然可正常編過，但編譯器不會主動除錯，正確用法必須加上
        //泛型用途就是變化，不局限於一種用法，使用<>代入不同，結果就不同
        //像此處代入APlayer，就不允許BPlayer加入此Team，編譯器會主動除錯
        //不同Player可以有不同的比較項目等等
        //此處Team的泛型，必須繼承Player，否則也會錯誤
        Team<APlayer> team = new Team<>();
        team.addPlayer(new APlayer("A", 20));
        team.addPlayer(new APlayer("B", 30));
        team.addPlayer(new APlayer("C", 40));

        Team<APlayer> team2 = new Team<>();
        team2.addPlayer(new APlayer("A1", 105));
        team2.addPlayer(new APlayer("B1", 4));
        team2.addPlayer(new APlayer("C1", 3));

        System.out.println(team.compareTo(team2));
    }
}
