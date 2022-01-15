package com.tcm.tcm_demo1.controller

import com.tcm.tcm_demo1.DrugPageJson
import com.tcm.tcm_demo1.service.DrugService
import com.tcm.tcm_demo1.service.HerbService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class DrugPageApi {
    @Autowired
    val drugService: DrugService?=null;
    @GetMapping("/api/drug")
    fun getDrugPageResult(
        @RequestParam(value = "id") id: Long
    ):DrugPageJson{
        return drugService!!.getDrugPageResult(id)
    }

}