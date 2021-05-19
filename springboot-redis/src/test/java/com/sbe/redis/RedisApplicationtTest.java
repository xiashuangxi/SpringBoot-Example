package com.sbe.redis;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

//@RunWith(SpringRunner.class)
//@ExtendWith(SpringExtension.class)
@SpringBootTest
public class RedisApplicationtTest {
    @Test
    public void contextLoads() {
        System.out.println("Hello Redis");
    }

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test_SetVal() throws Exception {
        stringRedisTemplate.opsForValue().set("Redis Test", "HELLO!");
        Assert.assertEquals("HELLO!", stringRedisTemplate.opsForValue().get("Redis Test"));
    }

}
