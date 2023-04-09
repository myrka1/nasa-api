<template>
    <div>
      <form @submit.prevent="submitForm">
        <label for="date">Enter a date: </label>
        <br>
        <input id="date" name="date" type="date" v-model="dateInput">
        <br>
        <button type="submit">Submit</button>
      </form>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        dateInput: ''
      }
    },
    methods: {
      submitForm() {
        const dateObj = new Date(this.dateInput)
        const year = dateObj.getFullYear()
        const month = dateObj.getMonth() + 1
        const day = dateObj.getDate() 
        const date = `${year}-${month.toString().padStart(2, '0')}-${day.toString().padStart(2, '0')}`
        console.log(date)
      }
    }
  }
  </script>

<style>
  button {
    width: 500px;
    height: 50px;
    /*background-color: #AE00FB ; */
    background-color: rgba(128, 0, 128, 0.5); 
    border-radius: 10px;
    border: none;
    margin: 10px;
    font-size: 28px;
    color: #B5FFD9;
  }
</style>