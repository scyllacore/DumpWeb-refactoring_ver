package com.scyllacore.dumpWeb.dailyReportModule.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/manage/step4")
@RequiredArgsConstructor
public class Step4ControllerForDailyReportViewer {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String step4() {
        return "/manage/step4/step4_index";
    }

}
