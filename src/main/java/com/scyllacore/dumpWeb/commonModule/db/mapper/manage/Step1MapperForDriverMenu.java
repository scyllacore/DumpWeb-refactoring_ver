package com.scyllacore.dumpWeb.commonModule.db.mapper.manage;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Step1MapperForDriverMenu {

    int insertCarSubmitInfo(DailyReportStep3Main dailyReportStep3Main);
}