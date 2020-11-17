package com.eomcs.pms.service;

import java.util.HashMap;
import java.util.List;
import com.eomcs.pms.dao.TaskDao;
import com.eomcs.pms.domain.Task;
import com.eomcs.util.SqlSessionFactoryProxy;

public class DefaultTaskService implements TaskService {

  TaskDao taskDao;
  SqlSessionFactoryProxy factoryProxy;

  public DefaultTaskService(
      TaskDao taskDao,
      SqlSessionFactoryProxy factoryProxy) {

    this.taskDao = taskDao;
    this.factoryProxy = factoryProxy;
  }

  @Override
  public List<Task> list() throws Exception {
    return taskDao.findAll(null);
  }

  @Override
  public List<Task> listByProject(int projectNo) throws Exception {
    HashMap<String,Object>  map = new HashMap<>();
    map.put("projectNo", projectNo);
    return taskDao.findAll(map);
  }

  @Override
  public int add(Task task) throws Exception {
    try {
      factoryProxy.startTransaction();
      taskDao.insert(task);
      factoryProxy.commit();
      return 1;

    } catch (Exception e) {
      factoryProxy.rollback();
      throw e;
    } finally {
      factoryProxy.endTransaction();
    }
  }

  @Override
  public int update(Task task) throws Exception {
    return taskDao.update(task);
  }

  @Override
  public int delete(int no) throws Exception {
    return taskDao.delete(no);
  }

  @Override
  public Task get(int no) throws Exception {
    return taskDao.findByNo(no);
  }

}
