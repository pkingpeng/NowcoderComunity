package com.nowcoder.community.DAO;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.*;

@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);
    //offset 每页的行号
    //limit 每页的数据

    //给参数取别名
    int selectDiscussPostRows(@Param("userId") int userId);





}
