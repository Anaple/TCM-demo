package com.tcm.tcm_demo1.sql.provider

open class HerbProvider {
    fun searchHerbSql(name:String):String {
        return "SELECT * FROM herb_name WHERE name LIKE  '%$name%';";
    }
    fun getHerbByIdSql(id:Long):String {
        return "SELECT * FROM herb_name WHERE id = $id;";
    }
}