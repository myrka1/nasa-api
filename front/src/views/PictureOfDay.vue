<template>
  <div>
      <div class="container">
        <h1>This picture of day</h1>
        <button v-on:click="atClick" type="submit">Submit</button>
      </div>

      <div>
        <div v-for="pic in stuff"
          v-bind:key="pic.Title"
          class="info"
        >
          <img :src="pic.image" class="photo"/>
          <h2>{{ pic.title }}</h2> 
          <p>Date: <strong>{{ pic.date }}</strong></p>
          <p>Explanation:<strong>{{ pic.explanation }}</strong></p>
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
      console.log("button clicked");
      try{
        BackendService.dailyPicture().then((response) => {
          this.stuff = response.data;
          console.log("stuff");
          console.log(response);
          console.log("stuff:", this.stuff);
          console.log("");

        });
      }
      catch (error) {
        //console.error(error);
      }
    }
  },
}
</script>