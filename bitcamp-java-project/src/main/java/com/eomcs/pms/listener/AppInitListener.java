package com.eomcs.pms.listener;

import java.util.Map;
import com.eomcs.context.ApplicationContextListener;

// 애플리케이션을 시작하고 종료할 때 간단한 안내 메세지를 출력하는 옵저버
public class AppInitListener implements ApplicationContextListener {
  @Override
  public void contextInitialized(Map<String, Object> context) {
    System.out.println("프로젝트 관리 시스템(PMS)에 오신 걸 환영합니다!");
  }

  @Override
  public void contextDestroyed(Map<String, Object> context) {
    System.out.println("프로젝트 관리 시스템(PMS)에 오신 걸 환영합니다!");
  }
}
