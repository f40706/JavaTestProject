package generics;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private final List<T> mList = new ArrayList<>();

    public void addPlayer(T item) {
        mList.add(item);
    }

    public int getScore() {
        int total = 0;
        for(Player player: mList) {
            total += player.getScore();
        }
        return total;
    }

    @Override
    public int compareTo(@NotNull Team<T> team) {
        return Integer.compare(team.getScore(), this.getScore());
    }
}
