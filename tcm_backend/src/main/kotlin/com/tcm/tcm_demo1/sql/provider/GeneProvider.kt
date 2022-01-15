package com.tcm.tcm_demo1.sql.provider

open class GeneProvider {
    fun getGeneByDrugId(id:Long):String = "SELECT * FROM gene WHERE drug_id_f = $id"
    fun getGeneById(id:Long):String = "SELECT * FROM gene WHERE gene_id = $id"
}