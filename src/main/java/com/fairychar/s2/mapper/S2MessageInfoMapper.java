package com.fairychar.s2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fairychar.s2.entity.MessageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (MessageInfo)表数据库访问层
 *
 * @author chiyo
 * @since 2023-03-19 20:34:12
 */
public interface S2MessageInfoMapper extends BaseMapper<MessageInfo> {
    
    /**
    * 条件匹配查询MessageInfo所有数据
    * @param messageInfo {@link MessageInfo}查询条件
    * @return 查询结果 {@link MessageInfo}
    */
    List<MessageInfo> queryAll(MessageInfo messageInfo);
    
    /**
    * 条件匹配分页查询MessageInfo所有数据
    * @param page 分页参数
    * @param messageInfo {@link MessageInfo}查询条件
    * @return 查询结果 {@link MessageInfo}
    */
    IPage<MessageInfo> pageAll(@Param("page") Page page, @Param("messageInfo") MessageInfo messageInfo);
    
    /**
    * 条件匹配查询MessageInfo匹配数据总数
    * @param messageInfo {@link MessageInfo}查询条件
    * @return 总数
    */
    int count(MessageInfo messageInfo);
}
