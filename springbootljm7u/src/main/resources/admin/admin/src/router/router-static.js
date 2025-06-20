import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import tiyuchengji from '@/views/modules/tiyuchengji/list'
    import banzhuren from '@/views/modules/banzhuren/list'
    import zongheceping from '@/views/modules/zongheceping/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import zhiyuchengji from '@/views/modules/zhiyuchengji/list'
    import banji from '@/views/modules/banji/list'
    import menu from '@/views/modules/menu/list'
    import deyuchengji from '@/views/modules/deyuchengji/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/tiyuchengji',
        name: '体育成绩',
        component: tiyuchengji
      }
      ,{
	path: '/banzhuren',
        name: '班主任',
        component: banzhuren
      }
      ,{
	path: '/zongheceping',
        name: '综合测评',
        component: zongheceping
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/zhiyuchengji',
        name: '智育成绩',
        component: zhiyuchengji
      }
      ,{
	path: '/banji',
        name: '班级',
        component: banji
      }
      ,{
	path: '/menu',
        name: '菜单列表',
        component: menu
      }
      ,{
	path: '/deyuchengji',
        name: '德育成绩',
        component: deyuchengji
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
