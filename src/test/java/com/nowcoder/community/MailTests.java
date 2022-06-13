package com.nowcoder.community;

import com.nowcoder.community.util.MailClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * @file: MailTests.java
 * @time: 2022/6/5 00:00
 * @Author by Pking
 */

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MailTests {
    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testTextMail() {
        mailClient.sendMail("pkingqaq@163.com", "test", "this is a test email");
    }

    @Test
    public void testHtmlMail() {
        Context context = new Context();
        context.setVariable("username", "傻逼李丹丹");

        String content = templateEngine.process("mail/demo", context);
        System.out.println(content);

        mailClient.sendMail("pkingqaq@163.com", "HTML", content);
    }
}
