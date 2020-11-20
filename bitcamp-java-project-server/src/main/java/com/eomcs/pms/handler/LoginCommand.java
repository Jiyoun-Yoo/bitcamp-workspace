package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Map;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.MemberService;
import com.eomcs.util.Prompt;

public class LoginCommand implements Command {

  MemberService memberService;

  public LoginCommand(MemberService memberService) {
    this.memberService = memberService;
  }

  @Override
  public void execute(PrintWriter out, BufferedReader in, Map<String, Object> context) {
    out.println("[로그인]");

    String email = Prompt.inputString("이메일? ");
    String password = Prompt.inputString("비밀번호? ");

    if (context.get("loginUser") != null) {
      out.println("이미 로그인 하셨습니다.");
      return;
    }

    try {
      Member member = memberService.get(email, password);
      if (member == null) {
        out.println("사용자 정보가 맞지 않습니다.");
      } else {
        context.put("loginUser", member);
        out.printf("%s님 반갑습니다!", member.getName());
      }
    } catch (Exception e) {
      out.printf("로그인 중 오류 발생!", e.getMessage());
    }

  }
}
