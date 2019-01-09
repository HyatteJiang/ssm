package com.soecode.lyf.dao;

import com.soecode.lyf.entity.Record;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecordDao {
    List<Record> queryAll();
}
