package com.tcm.tcm_demo1.service

import com.tcm.tcm_demo1.JsonGenePage
import com.tcm.tcm_demo1.sql.mapper.DrugMapper
import com.tcm.tcm_demo1.sql.mapper.GeneMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GeneSerive {
    @Autowired
    val drugMapper: DrugMapper?= null;
    @Autowired
    val geneMapper: GeneMapper?= null;

    fun getPageGeneResult(id:Long):JsonGenePage = JsonGenePage(drugMapper!!.getDrugById(id),geneMapper!!.getGeneByDrugId(id))

}