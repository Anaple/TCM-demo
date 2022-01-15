package com.tcm.tcm_demo1.sql.mapper

import com.tcm.tcm_demo1.sql.provider.DiseaseProvider
import com.tcm.tcm_demo1.sql.provider.GeneProvider
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.SelectProvider

@Mapper
interface DiseaseMapper {

    @SelectProvider(type = DiseaseProvider::class, method = "getDiseaseByGeneIdSql")
    fun getDiseaseByGeneId(id:Long):List<Map<String,String>>
}