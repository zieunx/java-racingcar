package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("자동차 경주 테스트")
class RacingTest {

    private Racing racing;
    private ArrayList<ArrayList<RacingRecord>> racingHistory;

    @BeforeEach
    void setUp() {
        racing = new Racing(3);
        racing.start(5);
        racingHistory = racing.getRacingHistory();
    }

    @Test
    @DisplayName("자동차 경주에 참여하는 자동차 대수 확인")
    void racingCarCountCheckTest() {
        assertThat(racing.getRacingCars().length).isEqualTo(3);
    }

    @Test
    @DisplayName("자동차 경주에서 주어진 횟수 만큼 경주내역이 기록되는지 확인")
    void racingHistoryCheckTest() {
        assertThat(racingHistory.size()).isEqualTo(5);
    }

    @Test
    @DisplayName("자동차 경주내역에 올바른 자동차 대수가 기록되는지 확인")
    void racingHistoryCheckForCarCountTest() {
        assertThat(racingHistory.get(0).size()).isEqualTo(3);
    }

    @Test
    @DisplayName("자동차 경주내역에 자동차 순서가 알맞게 기록되는지 확인")
    void racingHistoryOrderCheckTest() {
        Car car1 = racingHistory.get(0).get(1).getCar();
        Car car2 = racingHistory.get(1).get(1).getCar();
        Car car3 = racingHistory.get(2).get(1).getCar();

        assertThat(car1).isEqualTo(car2).isEqualTo(car3);
    }
}