package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Map;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.MemberService;

public class LogoutCommand implements Command {

  MemberService memberService;

  public LogoutCommand(MemberService memberService) {
    this.memberService = memberService;
  }

  @Override
  public void execute(PrintWriter out, BufferedReader in, Map<String, Object> context) {
    Member loginUser = (Member) context.get("loginUser");

    if (loginUser == null) {
      out.println("로그인된 상태가 아닙니다.");
      return;
    }

    out.printf("%s님 안녕히 가세요!\n", loginUser.getName());
    context.remove("loginUser");
  }

}
