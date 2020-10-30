// 게시물 관리 - 조회 + PreparedStatement 사용

package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Exam0330 {
  public static void main(String[] args) {
    String no = null;
    try (Scanner keyScan = new Scanner(System.in);) {
      System.out.print("번호? ");
      no = keyScan.nextLine();
    }

    try (Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "select * from x_board where board_id = ?")) {

      stmt.setString(1, no);

      try (ResultSet rs = stmt.executeQuery()) {
        if (rs.next()) {
          System.out.printf("제목 : %s\n", rs.getString("title"));
          System.out.printf("내용 : %s\n", rs.getString("contents"));
          System.out.printf("등록일 : %s\n", rs.getString("created_date"));
          System.out.printf("조회수 : %s\n", rs.getString("view_count"));
        } else {
          System.out.println("해당 번호의 게시글이 존재하지 않습니다.");
        }
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
