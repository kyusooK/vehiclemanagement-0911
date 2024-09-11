<template>
    <v-card outlined>
        <v-card-title>
            CreateVehicleInfo
        </v-card-title>

        <v-card-text>
            <String label="BrandModel" v-model="value.brandModel" :editMode="editMode"/>
            <String label="VehicleName" v-model="value.vehicleName" :editMode="editMode"/>
            <String label="Usage" v-model="value.usage" :editMode="editMode"/>
            <String label="OwnershipCompany" v-model="value.ownershipCompany" :editMode="editMode"/>
            <String label="Division" v-model="value.division" :editMode="editMode"/>
            <String label="OperationDepartment" v-model="value.operationDepartment" :editMode="editMode"/>
            <String label="RegistrationDate" v-model="value.registrationDate" :editMode="editMode"/>
            <String label="OwnershipType" v-model="value.ownershipType" :editMode="editMode"/>
            <String label="InUse" v-model="value.inUse" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="createVehicleInfo"
            >
                CreateVehicleInfo
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateVehicleInfoCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.brandModel = '';
            this.value.vehicleName = '';
            this.value.usage = '';
            this.value.ownershipCompany = '';
            this.value.division = '';
            this.value.operationDepartment = '';
            this.value.registrationDate = '';
            this.value.ownershipType = '';
            this.value.inUse = '';
        },
        watch: {
        },
        methods: {
            createVehicleInfo() {
                this.$emit('createVehicleInfo', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

