<template>
  <nav>
    <router-link to="/">Home</router-link> 
    <router-link to="/daily">Picture of the Day</router-link> 
    <router-link to="/specific">Specific Date Search</router-link> 
    <router-link to="/about">About</router-link>
  </nav>
  <router-view/>
</template>

<!--
  color scheme
  #170055    //navy
  #3E00FF   //blue
  #AE00FB   //purple
  #B5FFD9   //light mint
-->

<style>
#app {
  background-color: #170055;
  min-height: 100vh;
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: white;
}

body {
  margin: 0;
  padding: 0;
}

nav {
  padding: 30px;
  display: flex;
  font-size: 20px;
  justify-content: flex-start;
}

nav a {
  font-weight: bold;
  color: #B5FFD9;
  padding: 5px;
  text-decoration: none;
}

nav a.router-link-exact-active {
  color: #AE00FB;
}
</style>
