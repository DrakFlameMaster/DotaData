package com.erligaming.dota.portal;

import com.erligaming.dota.Util.JacksonUtil;
import com.erligaming.dota.dao.UserDaoMapper;
import com.erligaming.dota.model.entity.UserEntity;
import org.apache.catalina.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PortalApplicationTests {

	@Autowired
	SqlSessionFactory sqlSessionFactory;

	@Autowired
	UserDaoMapper userDaoMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void selectUser(){
		SqlSession session = sqlSessionFactory.openSession();
		try {
			UserEntity user = userDaoMapper.selectByPrimaryKey(1L);
//			UserDaoMapper mapper = session.getMapper(UserDaoMapper.class);
//			UserEntity user = mapper.selectByPrimaryKey(1L);
			System.out.println(JacksonUtil.toJson(user));

		} finally {
			session.close();
		}
	}
}
