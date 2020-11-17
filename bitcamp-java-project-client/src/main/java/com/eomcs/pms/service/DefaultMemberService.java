package com.eomcs.pms.service;

import java.util.List;
import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.domain.Member;
import com.eomcs.util.SqlSessionFactoryProxy;

public class DefaultMemberService implements MemberService {

  MemberDao memberDao;
  SqlSessionFactoryProxy factoryProxy;

  public DefaultMemberService(
      MemberDao memberDao,
      SqlSessionFactoryProxy factoryProxy) {

    this.memberDao = memberDao;
    this.factoryProxy = factoryProxy;
  }

  @Override
  public List<Member> list() throws Exception {
    return memberDao.findAll();
  }

  @Override
  public List<Member> list(String name) throws Exception {
    return memberDao.findByName(name);
  }

  @Override
  public int add(Member member) throws Exception {
    try {
      factoryProxy.startTransaction();
      memberDao.insert(member);
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
  public Member get(int no) throws Exception {
    return memberDao.findByNo(no);
  }

  @Override
  public int update(Member member) throws Exception {
    return memberDao.update(member);
  }

  @Override
  public int delete(int no) throws Exception {
    return memberDao.delete(no);
  }

}
