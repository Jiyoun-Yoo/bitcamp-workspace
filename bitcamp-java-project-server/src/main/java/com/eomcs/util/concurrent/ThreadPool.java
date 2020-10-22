package com.eomcs.util.concurrent;

import java.util.ArrayList;
import java.util.List;

public class ThreadPool {

  boolean stopping = false;

  List<Worker> workers = new ArrayList<>();

  class Worker extends Thread {
    Runnable task;

    public void setTask(Runnable task) {
      this.task = task;

      synchronized(this) {
        this.notify();
      }
    }

    @Override
    public void run() {
      while (true) {
        try {
          System.out.printf("[%s] - 스레드 대기중..\n", this.getName());

          this.wait();

          if (ThreadPool.this.stopping) {
            break;
          }

          System.out.printf("[%s] - 스레드 작업 시작!\n", this.getName());

        } catch (Exception e) {
          System.out.printf("[%s] - 스레드 실행 중 오류 발생!\n", this.getName());
          break;
        }

        try {
          task.run();
          System.out.printf("[%s] - 스레드 작업 시작!\n", this.getName());

        } catch (Exception e) {
          System.out.printf("[%s] - &s\n", this.getName(), e.getMessage());

        } finally {
          workers.add(this);
          System.out.printf("[%s] - 스레드풀로 되돌아감!\n", this.getName());
        }
      }
    }
  }

  public void execute(Runnable task) {
    Worker t;

    if (workers.size() == 0) {
      t = new Worker();
      System.out.printf("[%s] - 스레드 생성!\n", t.getName());

      t.start();

      try {
        Thread.sleep(20);
      } catch (Exception e) {
        // sleep() 중 발생한 예외는 무시한다.
      }

    } else {
      t = workers.remove(0);
      System.out.printf("[%s] - 스레드 꺼내서 재사용!\n", t.getName());
    }

    t.setTask(task);
  }

  public void shutdown() {
    try {
      this.stopping = true;

      while (!workers.isEmpty()) {
        Worker worker = workers.remove(0);
        synchronized (worker) {
          worker.notify();
        }
      }

      Thread.sleep(2000);

      while (!workers.isEmpty()) {
        Worker worker = workers.remove(0);
        synchronized (worker) {
          worker.notify();
        }
      }

    } catch (Exception e) {
      System.out.println("스레드풀을 종료하는 중에 예외 발생!");
      e.printStackTrace();
    }
  }
}



