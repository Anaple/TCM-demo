
// ref: https://umijs.org/config/
export default {
  treeShaking: true,
  proxy:{
    '/api':{
      'target':'http://localhost:8080',
      'changeOrigin':true,
    }
  },
  routes: [
    {
      path: '/',
      component: '../layouts/index',
      routes: [
        { path: '/', component: '../pages/index' },
        { path: '/drug', component: '../pages/drug/index' },
        { path: '/gene', component: '../pages/gene/index' },
        { path: '/disease', component: '../pages/disease/index' },
      ]
    },
  ],
  plugins: [
    // ref: https://umijs.org/plugin/umi-plugin-react.html
    ['umi-plugin-react', {
      antd: true,
      dva: true,
      dynamicImport: false,
      title: 'tcm_web',
      dll: false,
      locale: {
        enable: true,
        default: 'en-US',
      },
      routes: {
        exclude: [
          /models\//,
          /services\//,
          /model\.(t|j)sx?$/,
          /service\.(t|j)sx?$/,
          /components\//,
        ],
      },
    }],
  ],
}
