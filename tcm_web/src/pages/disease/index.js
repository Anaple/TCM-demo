import React, { useState ,useEffect} from 'react';
import {
    getDisease,
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
      title: 'disease_name',
      dataIndex: 'disease_name',
      key: 'disease_name',
      render: (text,record) => <Link to={{
        pathname: '/disease',
        search: '?id='+record.drug_id,
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
    const getDatafun = async () => await getDisease(getQueryString("id")).then((res)=>setPageData(res))
    
    useEffect(() => {
      getDatafun()
    }, []);
    if (pageData.drug_data !== undefined){return(
        <>
        <h1>{pageData.drug_data.gene}</h1>
        
        <Table rowKey = "gene_id" columns={columns} dataSource={pageData.gene_data_row} />
        </>
        
        
    )}else{
        return(<>loading .....</>)
    }

}