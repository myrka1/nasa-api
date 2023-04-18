<template>
  <div class="footer">
    <p>An emwaiarkayeii production.</p>
  </div>
  <nav>
    <router-link to="/">Home</router-link> 
    <router-link to="/daily">Daily Picture</router-link> 
    <router-link to="/specific">Date Search</router-link> 
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
  padding: 10px 10px 15px 10px;
  display: flex;
  font-size: 20px;
  justify-content: flex-start;
  border: 1px solid #3E00FF ;
  margin-bottom: 5px;
}

nav a {
  font-weight: bold;
  color: #B5FFD9;
  text-decoration: none;
  margin: 10px;
  flex-basis: 10%;
}

nav a.router-link-exact-active {
  color: #AE00FB;
}

.footer {
  position: fixed;
  bottom: 0;
  width: 100%;
  height: 50px;
  text-align: center;
  font-size: 20px;
  margin-bottom: 10px;
  color: #3E00FF;
}
</style>
