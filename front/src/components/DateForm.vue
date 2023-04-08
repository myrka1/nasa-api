<template>
    <form @submit.prevent="submitForm">
      <label for="date">Enter a date: </label>
      <br>
      <input id="date" name="date" type="date" v-model="dateInput">
      <br>
      <button type="submit">Submit</button>
    </form>
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