package com.eomcs.pms.domain;

import java.sql.Date;

public class Task {
  private int no;
  private String content;
  private Date deadline;
  private int status;
  private String owner;

  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public Date getDeadline() {
    return deadline;
  }
  public void setDeadline(Date deadline) {
    this.deadline = deadline;
  }
  public int getStatus() {
    return status;
  }
  public void setStatus(int status) {
    this.status = status;
  }
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }

  // task객체의 데이터를 문자열로 바꾸는 일을 하는 메서드
  public String toCsvString() {
    return String.format("%d,%s,%s,%s,%s\n",
        this.getNo(),
        this.getContent(),
        this.getDeadline().toString(),
        this.getStatus(),
        this.getOwner());
  }


  // 문자열을 project 객체로 생성하는 메서드
  public static Task valueOfCsv(String csv) {
    String[] values = csv.split(",");
    Task task = new Task();

    task.setNo(Integer.parseInt(values[0]));
    task.setContent(values[1]);
    task.setDeadline(Date.valueOf(values[2])); // "yyyy-MM-dd" ==> java.sql.Date
    task.setStatus(Integer.parseInt(values[3]));
    task.setOwner(values[4]);

    return task;
  }

}
