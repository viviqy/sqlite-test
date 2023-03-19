package com.fairychar.s1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fairychar.s1.entity.UserInfo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

/**
 * (UserInfo)表数据库访问层
 *
 * @author chiyo
 * @since 2023-03-19 21:22:15
 */
public interface UserInfoMapper extends BaseMapper<UserInfo> {
    
    /**
    * 条件匹配查询UserInfo所有数据
    * @param userInfo {@link UserInfo}查询条件
    * @return 查询结果 {@link UserInfo}
    */
    List<UserInfo> queryAll(UserInfo userInfo);
    
    /**
    * 条件匹配分页查询UserInfo所有数据
    * @param page 分页参数
    * @param userInfo {@link UserInfo}查询条件
    * @return 查询结果 {@link UserInfo}
    */
    IPage<UserInfo> pageAll(@Param("page") Page page,@Param("userInfo") UserInfo userInfo);
    
    /**
    * 条件匹配查询UserInfo匹配数据总数
    * @param userInfo {@link UserInfo}查询条件
    * @return 总数
    */
    int count(UserInfo userInfo);
}
