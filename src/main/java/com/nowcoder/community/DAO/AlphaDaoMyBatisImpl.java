package com.nowcoder.community.DAO;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @file: AlphaDaoMyBatisImpl.java
 * @time: 2022/4/14 17:33
 * @Author by Pking
 */

@Repository
@Primary //优先级更高
public class AlphaDaoMyBatisImpl implements AlphaDAO {

    @Override
    public String select() {
        return "MyBatis";
    }
}
