package com.code.util;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <p>
 * 操作redis工具类
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-19
 */
@Component
public class RedisUtil {
    @Resource
    private JedisPool jedisPool;

    private Jedis jedis;

    /**
     * 取值 - hash
     *
     * @param key
     * @return
     */
    public Map<String, String> getHash(String key) {
        Map<String, String> map = null;
        try {
            jedis = jedisPool.getResource();
            map = jedis.hgetAll(key);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //返还到连接池
            if (jedis != null)
                returnResource(jedisPool, jedis);
        }
        return map;
    }

    /**
     * 设值 - hash
     *
     * @param key
     * @param value
     * @return
     */
    public void setHash(String key, Map<String, String> value) {
        try {
            jedis = jedisPool.getResource();
            String hmset = jedis.hmset(key, value);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //返还到连接池
            if (jedis != null)
                returnResource(jedisPool, jedis);
        }
    }



    /**
     * 返还到连接池
     *
     * @param pool
     * @param redis
     */
    public static void returnResource(JedisPool pool, Jedis redis) {
        if (redis != null) {
            pool.returnResource(redis);
        }
    }
}
