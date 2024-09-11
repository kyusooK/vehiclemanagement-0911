<template>
    <v-card outlined>
        <v-card-title>
            UpdateDriverInfo
        </v-card-title>

        <v-card-text>
            <String label="DriverName" v-model="value.driverName" :editMode="editMode"/>
            <String label="CompanyName" v-model="value.companyName" :editMode="editMode"/>
            <String label="Affiliation" v-model="value.affiliation" :editMode="editMode"/>
            <String label="Contact" v-model="value.contact" :editMode="editMode"/>
            <String label="Permission" v-model="value.permission" :editMode="editMode"/>
            <Boolean label="IsActive" v-model="value.isActive" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="updateDriverInfo"
            >
                UpdateDriverInfo
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
        name: 'UpdateDriverInfoCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.driverName = '';
            this.value.companyName = '';
            this.value.affiliation = '';
            this.value.contact = '';
            this.value.permission = '';
            this.value.isActive = false;
        },
        watch: {
        },
        methods: {
            updateDriverInfo() {
                this.$emit('updateDriverInfo', this.value);
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

