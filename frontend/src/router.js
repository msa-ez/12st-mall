
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import 주문관리Manager from "./components/listers/주문관리Cards"
import 주문관리Detail from "./components/listers/주문관리Detail"

import 배송관리Manager from "./components/listers/배송관리Cards"
import 배송관리Detail from "./components/listers/배송관리Detail"

import 재고관리Manager from "./components/listers/재고관리Cards"
import 재고관리Detail from "./components/listers/재고관리Detail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/주문관리',
                name: '주문관리Manager',
                component: 주문관리Manager
            },
            {
                path: '/주문관리/:id',
                name: '주문관리Detail',
                component: 주문관리Detail
            },

            {
                path: '/배송관리',
                name: '배송관리Manager',
                component: 배송관리Manager
            },
            {
                path: '/배송관리/:id',
                name: '배송관리Detail',
                component: 배송관리Detail
            },

            {
                path: '/재고관리',
                name: '재고관리Manager',
                component: 재고관리Manager
            },
            {
                path: '/재고관리/:id',
                name: '재고관리Detail',
                component: 재고관리Detail
            },



    ]
})
