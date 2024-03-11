package com.scyllacore.dumpWeb.commonModule.db.dto.manage;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

public class MileageDTO {

    @Data
    static class Request{
        private Long mileageId;
        @NotBlank
        private String carNo;
        @NotNull
        private LocalDate driveDate;
        private String item;
        private Integer lastKm;
        private Integer usedAmount;
        private Integer usedOil;
        private String memo;
        private Integer replKm;
        private Boolean paymentChk;
        private Boolean replActiveChk;
        private String replDate;
        private Boolean replChk;

        private Long writerIdFk;
    }

    @Data
    static class Response{

    }

}
