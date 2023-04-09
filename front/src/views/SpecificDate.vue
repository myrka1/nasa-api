<template>
  <div class="container">
    <h1>Search for a specific date here.</h1>
    <DateForm @date-selection="dateSelected"/>
  </div>
</template>

<script>
import DateForm from '../components/DateForm.vue';
//import { BackendService } from '@/services/BackendService';

export default {
  components: {
    DateForm
  },
  methods: {
    dateSelected(date) {
      console.log("Selected date HERE!:", date);
    }
  }
};

</script>

<style scoped>

</style>