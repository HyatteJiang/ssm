package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.RecordDao;
import com.soecode.lyf.entity.Record;
import com.soecode.lyf.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("RecordService")
public class RecordServiceImpl implements RecordService {

    @Autowired
    @Qualifier("recordDao")
    private RecordDao mapper;

    @Override
    public List<Record> queryRecord() {
        return mapper.queryAll();
    }
}
