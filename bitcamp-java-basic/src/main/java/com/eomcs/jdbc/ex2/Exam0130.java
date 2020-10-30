// 게시물 관리 - 조회

package com.eomcs.jdbc.ex2;

import java.sql.DriverManager;
import java.util.Scanner;

// 다음과 같이 게시물을 조회하는 프로그램을 작성하라!
//  ----------------------------
//  번호? 1
//  제목: aaa
//  내용: aaaaa
//  등록일: 2019-1-1
//  조회수: 2
//
//  번호? 100
//  해당 번호의 게시물이 존재하지 않습니다.
//  ----------------------------

public class Exam0130 {
  public static void main(String[] args) {
    int no = 0;
    try (Scanner keyScan = new Scanner(System.in);) {
      System.out.print("번호? ");
      no = Integer.parseInt(keyScan.nextLine());
    }

    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        java.sql.Statement stmt = con.createStatement();
        java.sql.ResultSet rs = stmt.executeQuery(
            "select * from x_board where board_id=" + no);
        ) {

      if (rs.next()) {
        System.out.printf("제목 : %s\n", rs.getString("title"));
        System.out.printf("내용 : %s\n", rs.getString("contents"));
        System.out.printf("등록일 : %s\n", rs.getString("created_date"));
        System.out.printf("조회수 : %s\n", rs.getString("view_count"));
      } else {
        System.out.println("해당 번호의 게시글이 존재하지 않습니다.");
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
