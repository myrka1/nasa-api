<template>
  <div class="main-container">
      <div class="container">
        <h1>NASA Picture of the Day</h1>
        <button v-on:click="atClick" type="submit">Generate</button>
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
  </div>
</template>

<script>
import { BackendService } from '../services/BackendService.js';

export default {
  data() {
    return {
      stuff: [],
    };
  },
  methods: {
    atClick() {
      try{
        BackendService.dailyPicture().then((response) => {
          this.stuff = response.data;
          console.log("stuff:", this.stuff);
        });
      }
      catch (error) {
        //console.error(error);
      }
    }
  },
}
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

button {
  width: 225px;
  height: 35px;
  background-color: rgba(128, 0, 128, 0.5); 
  border-radius: 5px;
  margin: 5px;
  font-size: 20px;
  color: #B5FFD9;
}

.main-container {
  border: 1px solid #3E00FF;
  height: 100vh;
}
</style>