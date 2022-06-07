package calendar.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class CalendarDAOMybatis implements CalendarDAO {
	@Autowired
	private SqlSession sqlSession;
	
}
