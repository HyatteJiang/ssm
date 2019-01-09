package com.soecode.lyf.dao;

import com.soecode.lyf.BaseTest;
import com.soecode.lyf.entity.Record;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RecordDaoTest extends BaseTest {

    @Autowired
    private RecordDao recordDao;

    @Test
    public void recordTest(){
        System.out.println(Integer.MAX_VALUE);
        List<Record> recordList = recordDao.queryAll();
        for (Record record: recordList) {
            System.out.println(record);
        }
    }
}
