package com.scyllacore.dumpWeb.commonModule.db.dto.manage;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DriveReportSearchOptionDTO {
    //공통
    private int writerIdFk;
    private String startDate;
    private String endDate;
    private String sortingCriteria;
    private boolean paymentBtnFlag;

    //step 4,6,8
    private String fromSite;
    private String toSite;
    private String item;
    private String tel;
    private String state;
    private String searchCarNo;
}
