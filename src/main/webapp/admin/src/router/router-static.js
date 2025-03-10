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

     import users from '@/views/modules/users/list'
    import address from '@/views/modules/address/list'
    import cart from '@/views/modules/cart/list'
    import dictionary from '@/views/modules/dictionary/list'
    import kafei from '@/views/modules/kafei/list'
    import kafeiCollection from '@/views/modules/kafeiCollection/list'
    import kafeiCommentback from '@/views/modules/kafeiCommentback/list'
    import kafeiLiuyan from '@/views/modules/kafeiLiuyan/list'
    import kafeiOrder from '@/views/modules/kafeiOrder/list'
    import liuyan from '@/views/modules/liuyan/list'
    import news from '@/views/modules/news/list'
    import shangjia from '@/views/modules/shangjia/list'
    import yonghu from '@/views/modules/yonghu/list'
    import yonghutoushu from '@/views/modules/yonghutoushu/list'
    import config from '@/views/modules/config/list'
    import dictionaryIsdefault from '@/views/modules/dictionaryIsdefault/list'
    import dictionaryKafei from '@/views/modules/dictionaryKafei/list'
    import dictionaryKafeiCollection from '@/views/modules/dictionaryKafeiCollection/list'
    import dictionaryKafeiOrder from '@/views/modules/dictionaryKafeiOrder/list'
    import dictionaryKafeiOrderPayment from '@/views/modules/dictionaryKafeiOrderPayment/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShangjiaXingji from '@/views/modules/dictionaryShangjiaXingji/list'
    import dictionaryShangxia from '@/views/modules/dictionaryShangxia/list'
    import dictionaryYonghutoushu from '@/views/modules/dictionaryYonghutoushu/list'
    import dictionaryYonghutoushuStatus from '@/views/modules/dictionaryYonghutoushuStatus/list'





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
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryIsdefault',
        name: '是否默认地址',
        component: dictionaryIsdefault
    }
    ,{
        path: '/dictionaryKafei',
        name: '商品类型',
        component: dictionaryKafei
    }
    ,{
        path: '/dictionaryKafeiCollection',
        name: '收藏表类型',
        component: dictionaryKafeiCollection
    }
    ,{
        path: '/dictionaryKafeiOrder',
        name: '订单类型',
        component: dictionaryKafeiOrder
    }
    ,{
        path: '/dictionaryKafeiOrderPayment',
        name: '订单支付类型',
        component: dictionaryKafeiOrderPayment
    }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShangjiaXingji',
        name: '商家星级类型',
        component: dictionaryShangjiaXingji
    }
    ,{
        path: '/dictionaryShangxia',
        name: '上下架',
        component: dictionaryShangxia
    }
    ,{
        path: '/dictionaryYonghutoushu',
        name: '投诉类型',
        component: dictionaryYonghutoushu
    }
    ,{
        path: '/dictionaryYonghutoushuStatus',
        name: '投诉状态',
        component: dictionaryYonghutoushuStatus
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/address',
        name: '收货地址',
        component: address
      }
    ,{
        path: '/cart',
        name: '购物车',
        component: cart
      }
    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/kafei',
        name: '商品',
        component: kafei
      }
    ,{
        path: '/kafeiCollection',
        name: '商品收藏',
        component: kafeiCollection
      }
    ,{
        path: '/kafeiCommentback',
        name: '商品评价',
        component: kafeiCommentback
      }
    ,{
        path: '/kafeiLiuyan',
        name: '商品留言',
        component: kafeiLiuyan
      }
    ,{
        path: '/kafeiOrder',
        name: '商品订单',
        component: kafeiOrder
      }
    ,{
        path: '/liuyan',
        name: '留言版',
        component: liuyan
      }
    ,{
        path: '/news',
        name: '公告信息',
        component: news
      }
    ,{
        path: '/shangjia',
        name: '商家',
        component: shangjia
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }
    ,{
        path: '/yonghutoushu',
        name: '用户投诉',
        component: yonghutoushu
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
