package com.eomcs.pms.handler;

import java.util.Iterator;
import java.util.List;
import com.eomcs.pms.domain.Task;

public class TaskListCommand implements Command {

  List<Task> taskList;
  MemberListCommand memberListCommand;

  public TaskListCommand(List<Task> list, MemberListCommand memberListCommand) {
    this.taskList = list;
    this.memberListCommand = memberListCommand;
  }

  @Override
  public void execute() {
    System.out.println("[작업 목록]");

    Iterator<Task> iterator = taskList.iterator();

    while(iterator.hasNext()) {
      Task task = iterator.next();

      String stateLabel = null;
      switch (task.getStatus()) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }
      System.out.printf("%d, %s, %s, %s, %s\n",
          task.getNo(),
          task.getContent(),
          task.getDeadline(),
          stateLabel,
          task.getOwner());
    }
  }

}
