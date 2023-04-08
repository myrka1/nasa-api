<template>
  <div class="home">
    <h1>This is the home page.</h1>
    <div class="container">
      <!--- <img alt="Vue logo" src="../assets/logo.png"> -->
      <aside>
        <button @click="toDailyPage" id="daily-button" type="submit">Picture of the Day</button>
        <br>
        <button @click="toSpecificPage" id="specific-button" type="submit">Specific Day</button>
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
}
aside {
  grid-column: 2 / 3;
  /*border: 1px solid white; */
}

button {
  width: 300px;
  height: 200px;
  /*background-color: #AE00FB ; */
  background-color: rgba(128, 0, 128, 0.5); 
  border-radius: 20px;
  border: none;
  margin: 10px;
  font-size: 28px;
  color: #B5FFD9;
}
</style>
