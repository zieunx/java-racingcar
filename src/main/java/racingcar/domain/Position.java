package racingcar.domain;

import racingcar.strategy.DoRace;
import racingcar.strategy.RaceCondition;

import java.util.Objects;

public class Position {
    private int position;

    public Position(int position) {
        this.position = position;
    }

    public int getPosition() {
        return this.position;
    }

    public void increase(RaceCondition raceCondition, DoRace doRace) {
        if (raceCondition.pass()) {
            position += doRace.race();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass( ) != o.getClass( )) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

}
