package com.nowcoder.community.DAO;

import org.springframework.stereotype.Repository;

/**
 * @file: AlphaDaoHibernateImpl.java
 * @time: 2022/4/14 17:30
 * @Author by Pking
 */

@Repository("alphaHibernate") //指定bean的名字
public class AlphaDaoHibernateImpl implements AlphaDAO{

    @Override
    public String select() {
        return "Hibernate";
    }
}
