package com.eomcs.pms.domain;

import java.sql.Date;
import com.eomcs.util.CsvObject;

public class Board implements CsvObject {
  private int no;
  private String title;
  private String content;
  private String writer;
  private Date registeredDate;
  private int viewCount;

  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public String getWriter() {
    return writer;
  }
  public void setWriter(String writer) {
    this.writer = writer;
  }
  public Date getRegisteredDate() {
    return registeredDate;
  }
  public void setRegisteredDate(Date registeredDate) {
    this.registeredDate = registeredDate;
  }
  public int getViewCount() {
    return viewCount;
  }
  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }

  // 객체의 필드 값을 CSV 형식의 문자열로 만들어 리턴한다.
  @Override
  public String toCsvString() {
    return String.format("%d,%s,%s,%s,%s,%d\n",
        this.getNo(),
        this.getTitle(),
        this.getContent(),
        this.getWriter(),
        this.getRegisteredDate(),
        this.getViewCount());
  }

  // 기본 생성자
  public Board() {}

  // CSV 문자열을 받아 인스턴스 필드를 초기화시키는 생성자
  public Board (String csv) {
    String[] fields = csv.split(",");

    this.setNo(Integer.parseInt(fields[0]));
    this.setContent(fields[1]);
    this.setTitle(fields[2]);
    this.setWriter(fields[3]);
    this.setRegisteredDate(Date.valueOf(fields[4]));
    this.setViewCount(Integer.parseInt(fields[5]));
  }


}