package com.eomcs.pms.service;

import java.util.List;
import com.eomcs.pms.domain.Member;

public interface MemberService {
  List<Member> list() throws Exception;
  List<Member> list(String name) throws Exception;
  int add(Member member) throws Exception;
  Member get(int no) throws Exception;
  int update(Member member) throws Exception;
  int delete(int no) throws Exception;

}
