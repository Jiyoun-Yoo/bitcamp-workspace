package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

// 1) 회원의 번호, 이름, 이메일, 암호, 사진, 전화번호, 등록일을 담을 수 있는
//    메모리를 설계한다. => Member 클래스 정의
// 2) Member 클래스의 레퍼런스 배열을 만들어 인스턴스를 Member의 인스턴스를 보관한다.
// 3) 레퍼런스 배열을 사용하여 인스턴스를 다루기 보다는
//    한 개의 레퍼런스를 담는 새로운 레퍼런스를 만들어 인스턴스를 다루는 것이 더 간결하다.
public class App {

  public static void main(String[] args) {

    // 값을 담기 위해 메모리를 준비할 때
    // 어떤 종류의 메모리를 준비해야 하는지 설계도를 작성한다.
    //  => 이것을 "클래스 정의"라 부른다.
    // 각각의 변수를 낱개로 다루지 않고 묶음으로 다룬다.
    class Member {
      int no;
      String name;
      String email;
      String password;
      String photo;
      String tel;
      Date createdDate;
    }

    // Member 인스턴스의 주소를 담을 레퍼런스 배열을 준비한다.
    final int LENGTH = 100;
    Member[] members = new Member[LENGTH];
    // [null, null, null, null, null] 주소를 담는 배열 members

    Scanner keyInput = new Scanner(System.in);

    System.out.println("[회원]");

    long currentMillis = 0;
    int count = 0;

    for (int i = 0; i < LENGTH; i++) {
      count++;

      Member m = new Member();
      // 이 반복문 안에서 입력받는 데이터를 저장할 인스턴스를 만들고,
      // 그 인스턴스를 가리키는 레퍼런스를 m이라 한다.
      // 한 사이클을 완료하면 그 인스턴스의 주소를 members 배열에 저장한다.

      // 새로운 사이클이 시작되면 기존의 인스턴스가 초기화 되는 것이 아니라,
      // 새로운 인스턴스가 만들어지고, m은 그 인스턴스의 주소를 가지게 된다.

      System.out.print("번호? ");
      m.no = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("이름? ");
      m.name = keyInput.nextLine();

      System.out.print("이메일? ");
      m.email = keyInput.nextLine();

      System.out.print("암호? ");
      m.password = keyInput.nextLine();

      System.out.print("사진? ");
      m.photo = keyInput.nextLine();

      System.out.print("전화? ");
      m.tel = keyInput.nextLine();

      currentMillis = System.currentTimeMillis();
      m.createdDate = new Date(currentMillis);
      System.out.println();

      // 위에서 입력받은 정보를 담은 인스턴스의 주소를
      // members 배열에 차례로 넣는다.
      members[i] = m;

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();

      if (response.equalsIgnoreCase("y") == false) {
        break; // 반복문을 멈춰라.
      }
    }

    keyInput.close();

    System.out.println("---------------------------------");

    for (int i =0; i < count; i++) {
      Member m = members[i];
      // members 배열에 저장된 레퍼런스의 주소를 m이라는 레퍼런스로 불러오면,
      // m이 가리키는 인스턴스의 데이터에 접근할 수 있다.
      System.out.printf("%d, %s, %s, %s, %s\n",
          m.no,
          m.name,
          m.email,
          m.tel,
          m.createdDate.toString());
    }
  }
}
