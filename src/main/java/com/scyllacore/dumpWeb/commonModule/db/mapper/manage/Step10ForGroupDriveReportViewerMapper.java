package com.scyllacore.dumpWeb.commonModule.db.mapper.manage;

import com.scyllacore.dumpWeb.commonModule.db.dto.manage.GroupDriveReportDTO;
import com.scyllacore.dumpWeb.commonModule.db.dto.manage.GroupDriveReportSearchOptionDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface Step10ForGroupDriveReportViewerMapper {
    List<String> selectCompanySearchOption(Long groupDriverIdFk);

    List<String> selectTitleSearchOption(Long groupDriverIdFk);

    List<GroupDriveReportDTO.Response> selectGroupDriveReportListByOption(
            GroupDriveReportSearchOptionDTO.Request option);

    long updateGroupDriveReportPaymentChk(GroupDriveReportSearchOptionDTO.Request option);
}
