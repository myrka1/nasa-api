<template>
  <div class="home">
    <div class="container">
      <img class="round-img" alt="moon photo" src="../assets/round-moon.jpg"> 
      <aside>
        <button @click="toDailyPage" id="daily-button" type="submit">Generate Picture of the Day</button>
        <br>
        <button @click="toSpecificPage" id="specific-button" type="submit">Search for Specific Date</button>
      </aside>
    </div>
  </div>
</template>

<script>
// @ is an alias to /src
//import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'HomeView',
  methods: {
    toDailyPage() {
      this.$router.push('/daily')
    },
    toSpecificPage() {
      this.$router.push('/specific')
    }
  }
}
</script>

<style scoped>
.container {
  display: grid;
  grid-template-columns: 3fr 2fr;
  align-items: center;
  border: 1px solid #3E00FF;
  height: 100vh;
}
aside {
  padding-right: 100px;
  padding-top: 70px;
}

button {
  width: 500px;
  height: 200px;
  /*background-color: #AE00FB ; */
  background-color: rgba(128, 0, 128, 0.5); 
  border-radius: 20px;
  margin: 10px;
  font-size: 28px;
  color: #B5FFD9;
}

.round-img {
  height: 600px;
  border-radius: 55%;
  padding-left: 50px;
  margin-bottom: -700px;
}
</style>
