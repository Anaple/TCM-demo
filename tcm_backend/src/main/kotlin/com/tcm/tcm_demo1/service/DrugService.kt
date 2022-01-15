package com.tcm.tcm_demo1.service

import com.tcm.tcm_demo1.DrugPageJson
import com.tcm.tcm_demo1.sql.mapper.DrugMapper
import com.tcm.tcm_demo1.sql.mapper.HerbMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DrugService {
    @Autowired
    val herbMapper: HerbMapper?= null;
    @Autowired
    val drugMapper: DrugMapper?= null;

    fun getDrugPageResult(id:Long):DrugPageJson{
        return DrugPageJson( herb_data =  herbMapper!!.getHerbById(id = id) ,drug_data_row = drugMapper!!.getDrugByHerbId(id = id))

    }
}