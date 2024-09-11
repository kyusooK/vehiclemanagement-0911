<template>
    <v-card outlined>
        <v-card-title>
            CreateUserInfo
        </v-card-title>

        <v-card-text>
            <String label="Name" v-model="value.name" :editMode="editMode"/>
            <String label="JuminNum" v-model="value.juminNum" :editMode="editMode"/>
            <String label="BirthDate" v-model="value.birthDate" :editMode="editMode"/>
            <Address offline label="Address" v-model="value.address" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="createUserInfo"
            >
                CreateUserInfo
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
        name: 'CreateUserInfoCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.name = '';
            this.value.juminNum = '';
            this.value.birthDate = '';
            this.value.address = {};
        },
        watch: {
        },
        methods: {
            createUserInfo() {
                this.$emit('createUserInfo', this.value);
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

