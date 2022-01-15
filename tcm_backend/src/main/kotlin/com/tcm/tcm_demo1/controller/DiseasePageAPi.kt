package com.tcm.tcm_demo1.controller

import com.tcm.tcm_demo1.JsonGenePage
import com.tcm.tcm_demo1.service.DiseaseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class DiseasePageAPi {
    @Autowired
    val diseaseService: DiseaseService?=null;
    @GetMapping("/api/disease")
    fun getDrugPageResult(
        @RequestParam(value = "id") id: Long
    ): JsonGenePage {
        return diseaseService!!.getDrugPageResult(id)
    }
}