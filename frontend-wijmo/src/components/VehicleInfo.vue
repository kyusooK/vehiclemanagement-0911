<template>
    <div>
        <String label="차종" v-model="value.brandModel" :editMode="editMode"/>
        <String label="차명" v-model="value.vehicleName" :editMode="editMode"/>
        <String label="용도" v-model="value.usage" :editMode="editMode"/>
        <String label="소유회사" v-model="value.ownershipCompany" :editMode="editMode"/>
        <String label="사소구분" v-model="value.division" :editMode="editMode"/>
        <String label="운영부서" v-model="value.operationDepartment" :editMode="editMode"/>
        <String label="등록일자" v-model="value.registrationDate" :editMode="editMode"/>
        <String label="소유구분" v-model="value.ownershipType" :editMode="editMode"/>
        <String label="사용여부" v-model="value.inUse" :editMode="editMode"/>

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
    name: 'VehicleInfo',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "vehicleInfos"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>

