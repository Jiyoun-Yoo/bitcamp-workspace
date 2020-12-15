package com.eomcs.reflect.ex03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import com.eomcs.design_pattern.builder.Car;

public class Exam11 {
  public static void main(String[] args)  throws Exception {
    Class<?> clazz = Car.class;

    Field[] fields = clazz.getDeclaredFields();
    for(Field f : fields) {
      System.out.printf("%s:%s\n", f.getName(), f.getType().getName());
    }

    Field makerField = clazz.getDeclaredField("maker");

    Constructor<Car> defaultConst = (Constructor<Car>) clazz.getConstructor();
    Car car = defaultConst.newInstance();

    // private modifier로 선언된 필드라 하더라도
    // 다음 메서드를 통해 접근 가능하도록 만들 수 있다.
    makerField.setAccessible(true);

    // Reflection API를 사용하면 private 필드에 값을 넣을 수 있다.
    makerField.set(car, "비트자동차");

    System.out.println(car);

  }
}
