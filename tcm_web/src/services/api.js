import request from 'umi-request';
/** 搜索药材 GET /api/serachHerb */

export async function serachHerb(options) {
  return request('/api/serachHerb?name='+options, {
    method: 'GET',
    
  });
}

export async function getDrug(id) {
  return request('/api/drug?id='+id, {
    method: 'GET',
    
  });
}

export async function getGene(id) {
  return request('/api/gene?id='+id, {
    method: 'GET',
    
  });
}
export async function getDisease(id) {
  return request('/api/disease?id='+id, {
    method: 'GET',
    
  });
}