package com.tcm.tcm_demo1.controller

import com.tcm.tcm_demo1.service.HerbService
import com.tcm.tcm_demo1.sql.entity.Herb
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HerbSerachApi {
    @Autowired
    val herbService:HerbService?=null;
    @GetMapping("/api/serachHerb")
    fun searchHerbByName(@RequestParam(value = "name") name: String):List<Herb>
    {
        return herbService!!.searchHerbByName(name)
    }
}