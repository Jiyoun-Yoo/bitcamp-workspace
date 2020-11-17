package com.eomcs.pms.service;

import java.util.List;
import com.eomcs.pms.dao.BoardDao;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.SqlSessionFactoryProxy;

public class DefaultBoardService implements BoardService {

  BoardDao boardDao;
  SqlSessionFactoryProxy factoryProxy;

  public DefaultBoardService(
      BoardDao boardDao,
      SqlSessionFactoryProxy factoryProxy) {

    this.boardDao = boardDao;
    this.factoryProxy = factoryProxy;
  }

  @Override
  public int add(Board board) throws Exception {
    try {
      factoryProxy.startTransaction();
      boardDao.insert(board);
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
  public List<Board> list(String keyword) throws Exception {
    return boardDao.findAll(keyword);
  }

  @Override
  public int delete(int no) throws Exception {
    try {
      factoryProxy.startTransaction();
      int count = boardDao.delete(no);
      factoryProxy.commit();
      return count;

    } catch (Exception e) {
      factoryProxy.rollback();
      throw e;
    } finally {
      factoryProxy.endTransaction();
    }
  }

  @Override
  public Board get(int no) throws Exception {
    return boardDao.findByNo(no);
  }

  @Override
  public int update(Board board) throws Exception {
    return boardDao.update(board);
  }


}
