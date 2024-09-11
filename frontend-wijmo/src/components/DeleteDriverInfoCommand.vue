<template>

    <v-card outlined>
        <v-card-title>
            DeleteDriverInfo
        </v-card-title>

        <v-card-text>
            <String label="DriverName" v-model="value.driverName" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="deleteDriverInfo"
            >
                DeleteDriverInfo
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
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
        name: 'DeleteDriverInfoCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.driverName = '';
        },
        watch: {
        },
        methods: {
            deleteDriverInfo() {
                this.$emit('deleteDriverInfo', this.value);
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

