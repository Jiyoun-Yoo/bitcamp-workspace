<%@ page language="java" 
    contentType="text/javascript; charset=UTF-8"
    pageEncoding="UTF-8"%>
console.log("시간이 적게 걸리는 작업을 실행한다!");
<%
//Thread.sleep(5000);
// jsp 파일이 종료되어야 버퍼에 쌓인 내용들이 클라이언트로 보내진다.
// Thread.sleep(5000);의 실행이 종료되어야 jsp파일이 종료된다.
// console.log("시간이 적게 걸리는 작업을 실행한다!"); 코드도 5초 후에 보내어진다.
%>