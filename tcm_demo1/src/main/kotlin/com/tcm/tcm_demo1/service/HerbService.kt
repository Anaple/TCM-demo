package com.tcm.tcm_demo1.service

import com.tcm.tcm_demo1.sql.entity.Herb
import com.tcm.tcm_demo1.sql.mapper.HerbMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class HerbService {
    @Autowired
    val herbMapper:HerbMapper?= null;
    fun searchHerbByName(name:String):List<Herb>{
        return herbMapper!!.searchHerb(name = name)
    }

}