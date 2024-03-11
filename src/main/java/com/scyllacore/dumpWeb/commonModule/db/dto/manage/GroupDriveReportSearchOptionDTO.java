package com.scyllacore.dumpWeb.commonModule.db.dto.manage;

import lombok.Data;

import java.util.List;

public class GroupDriveReportSearchOptionDTO {

    @Data
    static class Request {
        private String title;
        private String company;
        private String sortingCriteria;
        private Boolean paymentBtnFlag;

        private Long groupDriverIdFk;
        private Long groupWriterIdFk;
    }

    @Data
    static class Response {
        private List<String> titles;
        private List<String> companies;
    }

}
