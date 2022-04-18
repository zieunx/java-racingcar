package racingcar.domain;

import exception.OutOfRangeException;
import util.Range;

public class CarName {
	private final int CAR_NAME_MAX_LENGTH = 5;
	private final int CAR_NAME_MIN_LENGTH = 1;
	private String name;

	public CarName(String name) {
		validateCarName(name);
		this.name = name;
	}

	private void validateCarName(String name) {
		if (Range.of(CAR_NAME_MIN_LENGTH, CAR_NAME_MAX_LENGTH).notContain(name.length())) {
			throw new OutOfRangeException("자동차 이름은 1자 이상 5자 이하로 설정해주세요.");
		}
	}

	@Override
	public String toString() {
		return name;
	}
}