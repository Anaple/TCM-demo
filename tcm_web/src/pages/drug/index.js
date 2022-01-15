import React, { useState ,useEffect } from 'react';
import {
    getDrug,
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
      title: 'Name',
      dataIndex: 'name',
      key: 'name',
      render: (text,record) => <Link to={{
        pathname: '/gene',
        search: '?id='+record.drug_id,
      }
      }>{text}</Link>,
    },
    {
      title: 'PubChemId',
      dataIndex: 'PubChemId',
      key: 'PubChemId',
    },
    {
        title: 'cas',
        dataIndex: 'cas',
        key: 'cas',
      },
    {
      title: 'molecularWeight',
      dataIndex: 'molecularWeight',
      key: 'molecularWeight',
    },
    {
        title: 'inChl',
        dataIndex: 'inChl',
        key: 'inChl',
      },
      {
        title: 'canonicalSmiles',
        dataIndex: 'canonicalSmiles',
        key: 'canonicalSmiles',
      },
      {
        title: 'ob',
        dataIndex: 'ob',
        key: 'ob',
      },
      {
        title: 'dl',
        dataIndex: 'dl',
        key: 'dl',
      },
      {
        title: 'database',
        dataIndex: 'database',
        key: 'database',
      },
  ];
export default function () {
    const [pageData,setPageData] = useState({});
    const getDatafun = async () => await getDrug(getQueryString("id")).then((res)=>setPageData(res))
    
    useEffect(() => {
        getDatafun()
      }, []);
    if (pageData.herb_data !== undefined){return(
        <>
        <h1>{pageData.herb_data.name}</h1>
        <h4>{pageData.herb_data.pin_name}</h4>
        <Table rowKey = "drug_id" columns={columns} dataSource={pageData.drug_data_row} />
        </>
        
        
    )}else{
        return(<>loading .....</>)
    }

}