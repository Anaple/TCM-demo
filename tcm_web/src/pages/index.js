import styles from './index.css';
import React, { useState } from 'react';
import { formatMessage } from 'umi-plugin-locale';
import { Input } from 'antd';
import {
  serachHerb,
} from '@/services/api'
import { List} from 'antd';
import { history,Link} from 'umi';


const { Search } = Input;


export default function () {

const [data, setData] = useState([]);



  return (

    <div className={styles.normal}>
      <Search
        className={styles.input}
        placeholder="input search herb"
        allowClear
        enterButton="Search"
        size="large"
        onSearch={async (value) => await serachHerb(value).then((res)=>setData(res))}
      />
      search result
      <List
        itemLayout="horizontal"
        dataSource={data}
        bordered={true}
        renderItem={item => (
          <List.Item>
            <List.Item.Meta
            
              title={<Link to={{
                pathname: '/drug',
                search: '?id='+item.id,
              }
              }>{item.name}</Link>}
              description={item.pin_name}
            />
          </List.Item>
        )}
      />
      <ul className={styles.list}>
        <li>To get started, edit <code>src/pages/index.js</code> and save to reload.</li>
        <li>
          <a href="https://umijs.org/guide/getting-started.html">
            {formatMessage({ id: 'index.start' })}
          </a>
        </li>
      </ul>
    </div>
  );
}
