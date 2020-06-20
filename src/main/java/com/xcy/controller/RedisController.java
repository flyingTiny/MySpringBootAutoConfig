package com.xcy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xuchenyi
 * @Date: 2020-06-19 20:25
 * @Version 1.0
 */
@RestController
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @PutMapping("/{key}/{val}")
    public void set(@PathVariable String key,@PathVariable String val){
         redisTemplate.opsForValue().set(key,val);
    }


    @GetMapping("/{key}")
    public Object get(@PathVariable String key){
        return redisTemplate.opsForValue().get(key);
    }
}
