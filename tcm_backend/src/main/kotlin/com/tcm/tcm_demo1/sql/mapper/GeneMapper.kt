package com.tcm.tcm_demo1.sql.mapper

import com.tcm.tcm_demo1.sql.provider.GeneProvider
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.SelectProvider

@Mapper
interface GeneMapper {
    @SelectProvider(type = GeneProvider::class, method = "getGeneByDrugId")
    fun getGeneByDrugId(id:Long):List<Map<String,String>>
    @SelectProvider(type = GeneProvider::class, method = "getGeneById")
    fun getGeneById(id:Long):Map<String,String>
}