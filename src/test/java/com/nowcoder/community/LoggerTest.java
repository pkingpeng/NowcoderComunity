package com.nowcoder.community;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

/**
 * @file: LoggerTest.java
 * @time: 2022/5/30 10:12
 * @Author by Pking
 */

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class LoggerTest {

    private static final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void testLogger() {
        System.out.println(logger.getName());

        logger.debug("debugLog");
        logger.info("infoLog");
        logger.warn("warnlog");
        logger.error("errorlog");
        //日志级别 debug最低， error最高


    }
}
