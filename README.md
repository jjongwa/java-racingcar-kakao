# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 기능 요구사항
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.

### 실행 결과
- 위 요구사항에 따라 3대의 자동차가 5번 움직였을 경우 프로그램을 실행한 결과는 다음과 같다.
```
경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).
pobi,crong,honux
시도할 회수는 몇회인가요?
5

실행 결과
pobi : -
crong : -
honux : -

pobi : --
crong : -
honux : --

pobi : ---
crong : --
honux : ---

pobi : ----
crong : ---
honux : ----

pobi : -----
crong : ----
honux : -----

pobi : -----
crong : ----
honux : -----

pobi, honux가 최종 우승했습니다.

```

## 구현할 기능 목록

### 자동차(Car)
- [ ] 이름(Name)을 가지고 있다.
- [ ] 현재 위치(Position)를 가지고 있다.
- [ ] 이동할 수 있다.
  - 전진 여부를 결정짓는 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.

### 이름(Name)
- [ ] 5자 이하만 가능하다.

### 위치(Position)
- [ ] 0 이상의 정수여야 한다.

### 자동차들(Cars)
- [ ] 여러 대의 자동차를 가질 수 있다.
- [ ] 각 자동차에 이름을 부여할 수 있다.
  - 하나의 문자열에 대해 쉼표(,)를 기준으로 구분하여 이름을 부여한다.
- [ ] 현재 가장 멀리 간 자동차들의 이름을 반환할 수 있다.

### 경주게임(RacingGame)
- [ ] 자동차들(Cars)을 가지고 있다.
- [ ] 사용자의 입력에 따라 여러 번의 이동을 진행할 수 있다.

