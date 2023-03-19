package com.fairychar.s1.service;

import com.fairychar.s1.entity.MessageInfo;
import com.fairychar.s1.mapper.S1MessageInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

/**
 * @author chiyo <br>
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MessageInfoService {
    @Autowired
    private S1MessageInfoMapper s1MessageInfoMapper;

    public void insert(MessageInfo messageInfo){
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        s1MessageInfoMapper.insert(messageInfo);
    }


}
