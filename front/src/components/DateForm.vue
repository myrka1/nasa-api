<template>
    <div>
      <form @submit.prevent="submitForm">
        <label for="date">Enter a date: </label>
        <br>
        <input id="date" name="date" type="date" v-model="dateInput" class="date-input">
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
        this.selectDate(date);
      },
      selectDate(date) {
        this.$emit('date-selection', date);
      }
    }
  }
  </script>

<style>
  button {
    width: 225px;
    height: 35px;
    background-color: rgba(128, 0, 128, 0.5); 
    border-radius: 5px;
    margin: 5px;
    font-size: 20px;
    color: #B5FFD9;
  }

  label {
    font-size: 25px;
    color: #B5FFD9;
  }

  .date-input {
    border-radius: 5px;
    padding: 5px 10px;
    font-size: 16px;
    width: 200px;
  }
</style>