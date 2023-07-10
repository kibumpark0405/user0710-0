<template>
    <div style="margin: 0 -15px 0 -15px;">
        <v-card-title>
            Country
        </v-card-title>
        <v-card-text>
            <div v-if="editMode" style="margin-top:-20px;">
                <v-select
                        v-model="newValue"
                        :label="'name'"
                        :items="CountryList"
                ></v-select>
            </div>
            <div v-else style="margin-top:-20px;">
                Country : {{ value }}
            </div>
        </v-card-text>
    </div>
</template>

<script>
    export default {
        name: 'Country',
        components:{},
        props: {
            value: [Object, String, Number, Boolean, Array],
            editMode: Boolean,
            isNew: Boolean,
            offline: Boolean,
            inList: Boolean,
            label: String,
        },
        data: () => ({
            countryList : [ "한국",  "중국",  "일본", ],
            newValue: '',
        }),
        async created() {
            if(!this.value) {
                this.newValue = this.countryList[0];
            } else {
                this.newValue = this.value;
            }
        },
        watch: {
            value(val) {
                this.$emit('input', val);
            },
            newValue(val) {
                this.$emit('input', val);
            },
        },
        methods: {
        }
    }
</script>

