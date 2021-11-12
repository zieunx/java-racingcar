# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 자동차 경주 3단계 기능 목록
- Utils.class
```
상수 값을 담을 클래스
랜덤 값의 사이즈
min = 0
max = 9
run = 4
timer = 1000 
.
.
.
```
- 실행 클래스
```
main 메소드가 있는 클래스
서비스클래스 호출하기
```
- inputView 클래스
```
입력 값을 받을 클래스
1. 자동차 수
2. 이동 시도 횟수
```
- 입력 값을 담을 객체
```
입력 받은 값을 DTO로 저장
1. 자동차 수
2. 이동 시도 횟수

값이 맞게 들어왔는지 validation

자동차 갯수에 따른 Map

자동차 경주 메인 로직
```
- resultView 클래스
```
결과 값을 보여주는 클래스
```

### 자동차 경주 4단계 기능 요구사항
- 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
- 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분한다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.

### 자동자 경주 기능정리
- [x] 자동차 이름을 입력 받는다.
    - 자동차 이름은 null 이나 공백일 수 없다.
- [x] 시도할 회수를 입력 받는다.
    - 시도 횟수는 1 이상을 받아야 한다.
- [x] input 객체를 만들어서 반환한다.
    - 자동차 이름 (String) / 시도 횟수 (Integer) 를 저장
- [x] input 객체를 통해 로직을 수행한다.
    - 자동차 객체 생성
        - 이름 / 이력
            - 자동차 이름은 5자를 초과할 수 없다.
    - 자동차 객체 List 생성
    - 시도 횟수만큼 로직 수행
        - 랜덤 값이 4 이상이면 true 아니면 false history 에 저장
- [x] output 객체에 history 와 우승자를 기록한다.
- [x] output 객체를 반환한다.
- [x] output 객체를 출력한다.