<template>
    <div>
        <String label="회사명" v-model="value.companyName" :editMode="editMode"/>
        <String label="소속" v-model="value.affiliation" :editMode="editMode"/>
        <String label="연락처" v-model="value.contact" :editMode="editMode"/>
        <String label="권한" v-model="value.permission" :editMode="editMode"/>
        <Boolean label="사용여부" v-model="value.isActive" :editMode="editMode"/>
        <UserInfoId offline label="UserInfoId" v-model="value.userInfoId" :editMode="editMode" @change="change"/>
        <VehicleInfoId offline label="VehicleInfoId" v-model="value.vehicleInfoId" :editMode="editMode" @change="change"/>

        <v-divider class="border-opacity-100 my-divider"></v-divider>
        <v-layout row justify-end>
            <v-btn
                width="64px"
                color="primary"
                @click="save"
            >
                저장
            </v-btn>
        </v-layout>
    </div>
</template>


<script>

import BaseEntity from './base-ui/BaseEntity'

export default {
    name: 'DriverInfo',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "driverInfos"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>

