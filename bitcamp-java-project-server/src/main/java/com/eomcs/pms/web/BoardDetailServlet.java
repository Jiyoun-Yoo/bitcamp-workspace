package com.eomcs.pms.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.service.BoardService;

@WebServlet("/board/detail")
public class BoardDetailServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    // Servlet container에 들어 있는 BoardService를 꺼낸다.
    ServletContext ctx = request.getServletContext();
    BoardService boardService = (BoardService) ctx.getAttribute("boardService");

    // 웹주소에 동봉된 데이터(Query String: qs)를 읽는다.
    // 클라이언트가 URL에 데이터를 포함해서 보낸다.
    // 숫자 데이터가 넘어오기 때문에 깨질 염려가 없다.
    int no = Integer.parseInt(request.getParameter("no"));

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head><title>게시글 조회</title></head>");
    out.println("<body>");

    try {
      out.println("<h1>[게시물 조회]</h1>");

      Board board = boardService.get(no);

      if (board == null) {
        out.println("해당 번호의 게시글이 없습니다.");
        return;
      }

      out.println("<form action='update' method='post'>");
      out.printf("번호: <input type='text' name='no' value='%d' readonly><br>\n", board.getNo());
      out.printf("제목: <input type='text' name='title' value='%s'><br>\n", board.getTitle());
      out.printf("내용: <textarea name='content'>%s</textarea><br>\n", board.getContent());
      out.printf("작성자: %s<br>\n", board.getWriter().getName());
      out.printf("등록일: %s<br>\n", board.getRegisteredDate());
      out.printf("조회수: %d<br>\n", board.getViewCount());
      out.println("<p>");
      out.println("<button>변경</button>");
      out.printf("<a href='delete?no=%d'>삭제</a>\n", board.getNo());
      out.println("</p>");
      out.println("</form>");

    } catch (Exception e) {
      out.printf("<p>작업 처리 중 오류 발생! - %s</p>\n", e.getMessage());
      StringWriter errOut = new StringWriter();
      e.printStackTrace(new PrintWriter(errOut));
      out.println("<h3>상세 오류 내용</h3>");
      out.printf("<pre>%s</pre>\n", errOut.toString());
    }
    out.println("</body>");
    out.println("</html>");
  }
}

// 테스트
// http://localhost:9999/bitcamp-java-project-server/board/detail?no=10
