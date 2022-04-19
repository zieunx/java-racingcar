package racingcar.domain;

public class MoveCount implements Comparable<MoveCount> {
	private final int DEFAULT_MOVE_ZERO = 0;
	private final String MOVE_DEFAULT_STRING = "-";
	private int move;

	public MoveCount() {
		this.move = DEFAULT_MOVE_ZERO;
	}

	public MoveCount(int count) {
		this.move = count;
	}

	public static MoveCount of(int count) {
		return new MoveCount(count);
	}

	public void add() {
		move++;
	}

	@Override
	public String toString() {
		return MOVE_DEFAULT_STRING.repeat(move);
	}

	public boolean isSame(MoveCount moveCount) {
		return move == moveCount.move;
	}

	@Override
	public int compareTo(MoveCount targetMoveCount) {
		if (this.move > targetMoveCount.move) {
			return 1;
		} else if (this.move == targetMoveCount.move) {
			return 0;
		}
		return -1;
	}
}
