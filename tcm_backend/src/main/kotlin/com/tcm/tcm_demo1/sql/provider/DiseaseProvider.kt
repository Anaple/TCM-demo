package com.tcm.tcm_demo1.sql.provider

open class DiseaseProvider {
    fun getDiseaseByGeneIdSql(id:Long):String{
        return "SELECT * FROM disease WHERE gene_id_f = $id";
    }

}