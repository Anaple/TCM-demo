package com.tcm.tcm_demo1.controller

import com.tcm.tcm_demo1.DrugPageJson
import com.tcm.tcm_demo1.JsonGenePage
import com.tcm.tcm_demo1.service.DrugService
import com.tcm.tcm_demo1.service.GeneSerive
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GenePageApi {
    @Autowired
    val geneService: GeneSerive?=null;
    @GetMapping("/api/gene")
    fun getDrugPageResult(
        @RequestParam(value = "id") id: Long
    ): JsonGenePage {
        return geneService!!.getPageGeneResult(id)
    }
}