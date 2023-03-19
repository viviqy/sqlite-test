package com.fairychar;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fairychar.s1.entity.MessageInfo;
import com.fairychar.s1.entity.UserInfo;
import com.fairychar.s1.mapper.S1MessageInfoMapper;
import com.fairychar.s1.mapper.UserInfoMapper;
import com.fairychar.s1.service.MessageInfoService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author chiyo <br>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TestApplicationTest {
    @Autowired
    private S1MessageInfoMapper s1MessageInfoMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private MessageInfoService messageInfoService;
    @Test
    @SneakyThrows
    public void testWrite(){
        writeAsyncWithTransaction(1);
        writeAsyncWithTransaction(1);
//        writeAsync(1_0000);
//        writeAsync(1_0000);
//        writeAsync(1_0000);
        Thread.currentThread().join();
    }
    @Test
    public void run1() {
        List<MessageInfo> messageInfos = s1MessageInfoMapper.selectList(new QueryWrapper<>());
        System.out.println(messageInfos);
    }

    private void writeAsync(int round){
        new Thread(()->{
            for (int i = 0; i < round; i++) {
                try {
                    s1MessageInfoMapper.insert(new MessageInfo("aaa","bbb","ccc"));
                    log.info("insert + round={}",i);
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
    private void writeAsyncWithTransaction(int round){
        new Thread(()->{
            for (int i = 0; i < round; i++) {
                try {
                    messageInfoService.insert(new MessageInfo("aaa","bbb","ccc"));
                    log.info("insert + round={}",i);
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
    private void writeAsyncUserInfo(int round){
        new Thread(()->{
            for (int i = 0; i < round; i++) {
                try {
                    userInfoMapper.insert(new UserInfo("aaa","bbb","ccc"));
                    log.info("insert + round={}",i);
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }

//    private void batchWriteAsync(int total){
//        new Thread(()->{
//            List<MessageInfo> collect = IntStream.range(0, total).boxed().map(i -> {
//                MessageInfo messageInfo = new MessageInfo("aaa", "bbb", "ccc");
//                return messageInfo;
//            }).collect(Collectors.toList());
//            this.s1MessageInfoMapper.in
//        }).start();
//    }
}
