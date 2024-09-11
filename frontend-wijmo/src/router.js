
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import UserInfoManager from "./components/ui/UserInfoGrid"

import DriverInfoManager from "./components/ui/DriverInfoGrid"

import VehicleInfoManager from "./components/ui/VehicleInfoGrid"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/userInfos',
                name: 'UserInfoManager',
                component: UserInfoManager
            },

            {
                path: '/driverInfos',
                name: 'DriverInfoManager',
                component: DriverInfoManager
            },

            {
                path: '/vehicleInfos',
                name: 'VehicleInfoManager',
                component: VehicleInfoManager
            },



    ]
})
