<template>

    <v-card outlined>
        <v-card-title>
            UpdateUserInfo
        </v-card-title>

        <v-card-text>
            <String label="JuminNum" v-model="value.juminNum" :editMode="editMode"/>
            <Address offline label="Address" v-model="value.address" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="updateUserInfo"
            >
                UpdateUserInfo
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
        name: 'UpdateUserInfoCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.juminNum = '';
            this.value.address = {};
        },
        watch: {
        },
        methods: {
            updateUserInfo() {
                this.$emit('updateUserInfo', this.value);
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

