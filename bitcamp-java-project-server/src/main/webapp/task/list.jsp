<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<%! 
private String getStatusLabel(int status) {
  switch (status) {
    case 1:
      return "진행중";
    case 2:
      return "완료";
    default:
      return "준비";
  }
}
%>
<a href='../task/add?projectNo=${param.no}'>새 작업</a><br>
<table border='1'>
<thead>
<tr>
  <th>번호</th>
  <th>작업</th>
  <th>마감일</th>
  <th>작업자</th>
  <th>상태</th>
  <th></th>
</tr>
</thead>

<tbody>
<c:choose>
  <c:when test="${not empty exception}">
    <tr>
      <td colspan="6">작업 목록을 가져오는 중 오류 발생!</td>
    </tr>
  </c:when>
  <c:otherwise>
    <c:forEach items="${tasks}" var="task">
  		<tr>
	   	  <td>${task.no}</td>
			  <td><a href='../task/detail?no=${task.no}'>${task.content}</a></td>
			  <td><${task.deadline}</td>
			  <td>${task.owner.name}</td>
			  <td>
			   <c:choose>
			     <c:when test="${task.status == 1}">
			       진행중
			     </c:when>
			     <c:when test="${task.status == 2}">
			       완료
			     </c:when>
			     <c:when test="${task.status == 3}">
			       준비
			     </c:when>
			   </c:choose>
			  </td>
			  <td><a href='../task/delete?no=${task.no}&projectNo=${param.no}'>[삭제]</a></td>
	   	</tr>
    </c:forEach>
  </c:otherwise>
</c:choose>
</tbody>
</table>