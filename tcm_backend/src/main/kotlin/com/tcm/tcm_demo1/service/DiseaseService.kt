package com.tcm.tcm_demo1.service

import com.tcm.tcm_demo1.DrugPageJson
import com.tcm.tcm_demo1.JsonGenePage
import com.tcm.tcm_demo1.sql.mapper.DiseaseMapper
import com.tcm.tcm_demo1.sql.mapper.DrugMapper
import com.tcm.tcm_demo1.sql.mapper.GeneMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DiseaseService {
    @Autowired
    val diseaseMapper: DiseaseMapper?= null;
    @Autowired
    val geneMapper: GeneMapper?= null;
    fun getDrugPageResult(id:Long): JsonGenePage {
        return JsonGenePage(  geneMapper!!.getGeneById(id = id) , diseaseMapper!!.getDiseaseByGeneId(id = id))

    }
}