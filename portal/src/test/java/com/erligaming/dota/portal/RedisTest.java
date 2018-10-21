package com.erligaming.dota.portal;

import com.erligaming.dota.Util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired
    RedisUtil redisUtil;

    @Test
    public void insertKey(){
        if (redisUtil.set("123",new String("test"))) {
            System.out.println("插入 key 123");
        }
    }

    @Test
    public void getKey(){
        System.out.println(redisUtil.get("123").toString());
    }


}
