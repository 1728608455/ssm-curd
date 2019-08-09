package cn.school.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import cn.school.model.User;
import cn.school.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMybatis {
	private static Logger logger = Logger.getLogger(TestMybatis.class);
	@Resource
	private UserService userService = null;


	@Test
	public void test1() {
		User user = userService.selectById(1);
		System.out.println(user.getUsername());
		logger.info(JSON.toJSONString(user));
	}

}
