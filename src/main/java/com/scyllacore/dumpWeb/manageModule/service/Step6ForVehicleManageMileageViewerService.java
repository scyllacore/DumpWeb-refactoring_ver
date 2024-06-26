package com.scyllacore.dumpWeb.manageModule.service;

import com.scyllacore.dumpWeb.commonModule.db.dto.manage.MileageDTO;
import com.scyllacore.dumpWeb.commonModule.db.dto.manage.MileageSearchOptionDTO;
import com.scyllacore.dumpWeb.commonModule.db.dto.manage.PageCriteriaDTO;
import com.scyllacore.dumpWeb.commonModule.db.dto.manage.PageDTO;
import com.scyllacore.dumpWeb.commonModule.db.mapper.manage.Step6ForVehicleManageMileageViewerMapper;
import com.scyllacore.dumpWeb.commonModule.http.ResponseDTO;
import com.scyllacore.dumpWeb.commonModule.util.SessionUtil;
import com.scyllacore.dumpWeb.commonModule.vo.pagination.PageVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class Step6ForVehicleManageMileageViewerService {
    private final Step6ForVehicleManageMileageViewerMapper step6Mapper;
    private final SessionUtil sessionUtil;

    public ResponseEntity<PageDTO> findMileageListByOption(MileageSearchOptionDTO.Request option) {
        option.setWriterIdFk(sessionUtil.getLoginInfo().getUserIdIdx());

        PageDTO pageDTO = new PageDTO();
        pageDTO.setOption(option);
        long totalAmount = step6Mapper.countMileageListByOption(pageDTO);

        PageCriteriaDTO criteria = new PageCriteriaDTO(option.getPageNum(), option.getPageAmount());
        PageVO pageInfo = new PageVO(criteria, totalAmount);
        pageDTO.setPageInfo(pageInfo);
        List<MileageDTO.Response> mileageList = step6Mapper.selectMileageListByOption(pageDTO);

        pageDTO.setMileageList(mileageList);

        return ResponseEntity.ok(pageDTO);
    }

    @Transactional
    public ResponseEntity<ResponseDTO<String>> modifyPaymentInBulk(MileageSearchOptionDTO.Request option) {
        option.setWriterIdFk(sessionUtil.getLoginInfo().getUserIdIdx());
        step6Mapper.updateMileagePaymentChk(option);

        if (option.getPaymentBtnFlag()) {
            return ResponseEntity.ok(new ResponseDTO<>("일괄 결재 되었습니다"));

        }
        return ResponseEntity.ok(new ResponseDTO<>("일괄 취소 되었습니다"));
    }
}
