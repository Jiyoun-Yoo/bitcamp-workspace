package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Exam {
  public static void main(String[] args) throws Exception {
    int no = 0;

    try (Scanner keyScan = new Scanner(System.in)) {
      System.out.print("번호? ");
      no = Integer.parseInt(keyScan.nextLine());
    }

    try (Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        Statement stmt = con.createStatement()) {

      stmt.executeUpdate("delete * from x_board_file where board_id=" + no);
      int count = stmt.executeUpdate("delete * from x_board where board_id=" + no);

      if (count != 0) {
        System.out.println("게시글을 삭제하였습니다.");
      } else {
        System.out.println("해당 번호의 게시물이 존재하지 않습니다.");
      }



    }
  }
}
