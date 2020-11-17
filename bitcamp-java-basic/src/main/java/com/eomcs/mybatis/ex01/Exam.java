package com.eomcs.mybatis.ex01;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam {
  public static void main(String[] args) throws Exception {

    SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(
        "./bin/main/com/eomcs/mybatis/ex01/mybatis-config.xml"));

    // 4. SQL을 실행시키는 객체 준비
    //  => SqlSessionFactory 객체로부터 SqlSession 객체를 얻는다.
    //  => openSession()은 수동 커밋으로 SQL을 다루는 객체를 리턴한다.
    SqlSession sqlSession = factory.openSession();

    sqlSession.close();


  }

}
