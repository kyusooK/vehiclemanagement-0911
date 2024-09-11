<template>

    <v-card outlined>
        <v-card-title>
            DeleteUserInfo
        </v-card-title>

        <v-card-text>
            <String label="JuminNum" v-model="value.juminNum" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="deleteUserInfo"
            >
                DeleteUserInfo
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
        name: 'DeleteUserInfoCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.juminNum = '';
        },
        watch: {
        },
        methods: {
            deleteUserInfo() {
                this.$emit('deleteUserInfo', this.value);
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

