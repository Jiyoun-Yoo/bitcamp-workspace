package com.eomcs.pms.web;

import java.sql.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;
import com.eomcs.pms.service.ProjectService;
import com.eomcs.pms.service.TaskService;

@RequestMapping("/task/add")
public class TaskAddController implements Controller {

  TaskService taskService;
  ProjectService projectService;

  public TaskAddController(TaskService taskService, ProjectService projectService) {
    this.taskService = taskService;
    this.projectService = projectService;
  }

  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

    response.setContentType("text/html;charset=UTF-8");

    if (request.getMethod().equals("GET")) {

      Project project = projectService.get(Integer.parseInt(request.getParameter("projectNo")));
      request.setAttribute("project", project);
      return "/task/form.jsp";
    }

    Task task = new Task();
    task.setProjectNo(Integer.parseInt(request.getParameter("projectNo")));
    task.setContent(request.getParameter("content"));
    task.setDeadline(Date.valueOf(request.getParameter("deadline")));
    task.setStatus(Integer.parseInt(request.getParameter("status")));
    task.setOwner(new Member().setNo(Integer.parseInt(request.getParameter("owner"))));

    taskService.add(task);
    return ("redirect:../project/detail?no=" + request.getParameter("projectNo"));
  }
}
