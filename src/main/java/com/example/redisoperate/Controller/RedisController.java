package com.example.redisoperate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    //添加
    @GetMapping(value="/set")
    public void saveRedis(){
        stringRedisTemplate.opsForValue().set("a","test");
    }

    //获取
    @GetMapping(value="/get")
    public String getRedis(){
        return stringRedisTemplate.opsForValue().get("a");
    }
}
