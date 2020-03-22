package com.code.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * <p>
 * Jedis配置类
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-19
 */
@Configuration
@Slf4j
public class JedisConfig {
    @Value("${jedis.host}")
    private String host;

    @Value("${jedis.port}")
    private Integer port;

    @Value("${jedis.timeout}")
    private Integer timeout;

    @Value("${jedis.pool.max-active}")
    private int maxActive;

    @Value("${jedis.pool.max-idle}")
    private int maxIdle;

    @Value("${jedis.pool.min-idle}")
    private int minIdle;

    @Value("${jedis.pool.max-wait}")
    private long maxWaitMillis;

    @Bean
    public JedisPool redisPoolFactory() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
        jedisPoolConfig.setMaxTotal(maxActive);
        jedisPoolConfig.setMinIdle(minIdle);
        JedisPool jedisPool = new JedisPool(jedisPoolConfig, host, port, timeout, "123456");
        log.info("redis配置信息，地址：[{}],端口：[{}]", host, port);
        return jedisPool;
    }

}
