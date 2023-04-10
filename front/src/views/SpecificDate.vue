<template>
  <div class="container">
    <h1>Search for a specific date here.</h1>
    <DateForm @date-selection="dateSelected"/>
  </div>

  <div class="display">
    <div v-for="pic in stuff"
          v-bind:key="pic.Title"
          class="info"
        >
          <img :src="pic.image" class="photo"/>
          <h2>{{ pic.title }}</h2> 
          <strong>Date:</strong> {{ pic.date }} <br>
          <strong>Explanation:</strong> {{ pic.explanation }}
        </div>
  </div>
</template>

<script>
import DateForm from '../components/DateForm.vue';
import { BackendService } from '@/services/BackendService';

export default {
  data() {
    return {
      stuff: [],
    };
  },
  components: {
    DateForm
  },
  methods: {
    dateSelected(date) {
      console.log("Selected date HERE!:", date);
      try {
        BackendService.specificPicture(date).then((response) => {
          this.stuff = response.data;
        });
      }
      catch (error) {
        //console.error(error);
      }
    }
  }
};

</script>

<style scoped>
img {
  height: 250px;
  width: 550px;
}

.display {
  margin-right: 10px;
  margin-left: 20px;
  padding: 20px;
}

strong {
  text-decoration: underline;
}
</style>