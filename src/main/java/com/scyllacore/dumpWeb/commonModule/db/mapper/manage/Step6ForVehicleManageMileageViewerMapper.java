package com.scyllacore.dumpWeb.commonModule.db.mapper.manage;

import com.scyllacore.dumpWeb.commonModule.db.dto.manage.MileageSearchOptionDTO;
import com.scyllacore.dumpWeb.commonModule.db.dto.manage.MileageDTO;
import com.scyllacore.dumpWeb.commonModule.db.dto.manage.PageDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface Step6ForVehicleManageMileageViewerMapper {
    List<MileageDTO.Response> selectMileageListByOption(PageDTO option);

    long countMileageListByOption(PageDTO option);

    long updateMileagePaymentChk(MileageSearchOptionDTO.Request option);

}
