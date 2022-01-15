import React, { useState,useEffect} from 'react';
import {
    getGene,
  } from '@/services/api'
import { Table, Tag, Space } from 'antd';  
import { history,Link} from 'umi';  
function getQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return decodeURI(r[2]);
    return null;
}
const columns = [
    {
      title: 'gene',
      dataIndex: 'gene',
      key: 'gene',
      render: (text,record) => <Link to={{
        pathname: '/disease',
        search: '?id='+record.gene_id,
      }
      }>{text}</Link>,
    },
      {
        title: 'score',
        dataIndex: 'score',
        key: 'score',
      },

      {
        title: 'source',
        dataIndex: 'source',
        key: 'source',
      },
  ];
export default function () {
    const [pageData,setPageData] = useState({});
    const getDatafun = async () => await getGene(getQueryString("id")).then((res)=>setPageData(res))
    useEffect(() => {
      getDatafun()
    }, []);
    if (pageData.drug_data !== undefined){return(
        <>
        <h1>{pageData.drug_data.name}</h1>
        <h4>{pageData.drug_data.molecularFormula}</h4>
        <Table rowKey = "gene_id" columns={columns} dataSource={pageData.gene_data_row} />
        </>
        
        
    )}else{
        return(<>loading .....</>)
    }

}