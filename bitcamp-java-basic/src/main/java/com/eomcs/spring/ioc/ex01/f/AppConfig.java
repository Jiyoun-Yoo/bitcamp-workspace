package com.eomcs.spring.ioc.ex01.f;

import org.springframework.context.annotation.ComponentScan;

// 객체를 생성할 패키지 지정
// @Component가 붙은 클래스를 찾아 객체를 생성한다.
@ComponentScan("com.eomcs.spring.ioc.ex01")
public class AppConfig {

}
