
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import UserUserInfoManager from "./components/listers/UserUserInfoCards"
import UserUserInfoDetail from "./components/listers/UserUserInfoDetail"

import DriverDriverInfoManager from "./components/listers/DriverDriverInfoCards"
import DriverDriverInfoDetail from "./components/listers/DriverDriverInfoDetail"

import VehicleVehicleInfoManager from "./components/listers/VehicleVehicleInfoCards"
import VehicleVehicleInfoDetail from "./components/listers/VehicleVehicleInfoDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/users/userInfos',
                name: 'UserUserInfoManager',
                component: UserUserInfoManager
            },
            {
                path: '/users/userInfos/:id',
                name: 'UserUserInfoDetail',
                component: UserUserInfoDetail
            },

            {
                path: '/drivers/driverInfos',
                name: 'DriverDriverInfoManager',
                component: DriverDriverInfoManager
            },
            {
                path: '/drivers/driverInfos/:id',
                name: 'DriverDriverInfoDetail',
                component: DriverDriverInfoDetail
            },

            {
                path: '/vehicles/vehicleInfos',
                name: 'VehicleVehicleInfoManager',
                component: VehicleVehicleInfoManager
            },
            {
                path: '/vehicles/vehicleInfos/:id',
                name: 'VehicleVehicleInfoDetail',
                component: VehicleVehicleInfoDetail
            },



    ]
})
