package com.tcm.tcm_demo1.sql.provider

open class DrugProvider {
    fun getDrugByHerbIdSql(id:Long):String{
        return "SELECT * FROM drug WHERE herb_id_f = $id";
    }
    fun getDrugByIdSql(id:Long):String{
        return "SELECT * FROM drug WHERE drug_id = $id";
    }

}