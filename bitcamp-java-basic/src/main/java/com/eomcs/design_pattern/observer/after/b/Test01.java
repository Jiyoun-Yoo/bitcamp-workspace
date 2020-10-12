package com.eomcs.design_pattern.observer.after.b;

public class Test01 {

  public static void main(String[] args) {

    Car car = new Car();

    // 새 기능이 들어있는 객체를 Car(publisher)에 등록한다.
    //  - Car 클래스를 손대지 않고 새 기능을 추가하는 방법이다.
    //  - 이것이 Observer 패턴으로 구조와시킨 이유이다.
    car.addCarObserver(new SafeBeltCarObserver());
    // Car 객체의 상태가 바뀔 때 실행될 코드를 별도의 클래스로 정의한 다음,
    // Car 객체에 등록한다.


    car.start();
    // Car 객체는 start()가 호출되면
    // 등록된 모든 subscriber(observer/listener)에게 통지(메서드 호출)한다.

    car.run();

    car.stop();

    // 프로젝트 완료한 다음 시간이 지난 후
    // 1) 자동차의 시동을 걸 때 안전벨트 착용 여부를 검사하는 기능을 추가한다.
    //  - 자동차의 시동을 걸릴 때 보고를 받을 객체(SafeBeltCarObserver)를 준비한다.
    //  - 시동 걸 때 수행할 기능을 정의한다. 즉 carStarted() 메서드 정의한다.
    //  - Car 객체에 관찰자를 등록한다.
  }

}


