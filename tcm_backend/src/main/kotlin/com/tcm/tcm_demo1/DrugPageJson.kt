package com.tcm.tcm_demo1

import com.tcm.tcm_demo1.sql.entity.Herb

data class DrugPageJson(
    val herb_data:Herb?,
    val drug_data_row:Any?
)
