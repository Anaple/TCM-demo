package com.tcm.tcm_demo1.sql.mapper

import com.tcm.tcm_demo1.sql.entity.Herb
import com.tcm.tcm_demo1.sql.provider.DrugProvider
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.SelectProvider

@Mapper
interface DrugMapper {
    @SelectProvider(type =DrugProvider::class,method = "getDrugByHerbIdSql")
    fun getDrugByHerbId(id:Long):List<Map<String,String>>;
    @SelectProvider(type =DrugProvider::class,method = "getDrugByIdSql")
    fun getDrugById(id:Long):Map<String,String>;
}