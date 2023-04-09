<template>
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
        <p>
          <strong>{{ pic.title }}</strong> <br>
          <strong>{{ pic.date }}</strong> <br>
          <strong>{{ pic.explanation }}</strong> <br>
        </p>
      </div>
    </div>
</template>

<script>

import service from '../services/BackendService.js';

export default {
  data() {
    return {
      search: "",
      stuff: [],
    };
  },
  methods: {
    atClick() {
      console.log("button clicked");
      try{
        service.dailyPicture().then((response) => {
          this.stuff = response.data;
          this.search = "";
        });
      }
      catch (error) {
        //console.error(error);
      }
    }
  },
}

</script>