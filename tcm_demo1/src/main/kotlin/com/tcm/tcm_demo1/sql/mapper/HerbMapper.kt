package com.tcm.tcm_demo1.sql.mapper

import com.tcm.tcm_demo1.sql.entity.Herb
import com.tcm.tcm_demo1.sql.provider.HerbProvider
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.SelectProvider

@Mapper
interface HerbMapper {



    @SelectProvider(type = HerbProvider::class, method = "searchHerbSql")
    fun searchHerb(name:String):List<Herb>;
    @SelectProvider(type = HerbProvider::class, method = "getHerbByIdSql")
    fun getHerbById(id:Long):Herb;
}