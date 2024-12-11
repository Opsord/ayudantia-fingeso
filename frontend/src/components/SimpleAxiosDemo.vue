<template>
  <div>
    <h2>Datos Obtenidos</h2>
    <button @click="fetchData">Cargar Datos</button>
    <ul v-if="items.length">
      <li v-for="(item, index) in items" :key="index">
        {{ item.nombre }}
      </li>
    </ul>
    <p v-else>No hay datos cargados.</p>
  </div>
</template>

<script>
import axios from "../plugins/axios"; // Usa tu instancia configurada de Axios

export default {
  name: "SimpleAxiosDemo",
  data() {
    return {
      items: [], // Arreglo para almacenar los datos
    };
  },
  methods: {
    async fetchData() {
      try {
        const response = await axios.get("/superclases"); // Endpoint de tu API
        this.items = response.data; // Asigna los datos obtenidos
      } catch (error) {
        console.error("Error al obtener los datos:", error);
      }
    },
  },
};
</script>

<style scoped>
h2 {
  color: #4caf50;
}
button {
  margin-bottom: 10px;
  padding: 5px 10px;
  cursor: pointer;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  padding: 5px;
  border: 1px solid #ddd;
  margin: 5px 0;
}
</style>
