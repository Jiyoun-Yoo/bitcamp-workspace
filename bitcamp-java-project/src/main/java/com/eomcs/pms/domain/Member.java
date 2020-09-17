package com.eomcs.pms.domain;

import java.sql.Date;

public class Member {
  private int no;
  private String name;
  private String email;
  private String password;
  private String photo;
  private String tel;
  private Date registeredDate;

  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getPhoto() {
    return photo;
  }
  public void setPhoto(String photo) {
    this.photo = photo;
  }
  public String getTel() {
    return tel;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }
  public Date getRegisteredDate() {
    return registeredDate;
  }
  public void setRegisteredDate(Date registeredDate) {
    this.registeredDate = registeredDate;
  }

  // member 객체의 데이터를 문자열로 바꾸는 일을 하는 메서드
  public String toCsvString() {
    return String.format("%d,%s,%s,%s,%s,%s,%s\n",
        this.getNo(),
        this.getName(),
        this.getEmail(),
        this.getPassword(),
        this.getPhoto(),
        this.getTel(),
        this.getRegisteredDate().toString());
  }

  // 문자열을 member 객체로 생성하는 메서드
  public static Member valueOfCsv(String csv) {
    String[] values = csv.split(",");
    Member member = new Member();

    member.setNo(Integer.parseInt(values[0]));
    member.setName(values[1]);
    member.setEmail(values[2]);
    member.setPassword(values[3]);
    member.setPhoto(values[4]);
    member.setTel(values[5]);
    member.setRegisteredDate(Date.valueOf(values[6])); // "yyyy-MM-dd" ==> java.sql.Date

    return member;
  }


}
