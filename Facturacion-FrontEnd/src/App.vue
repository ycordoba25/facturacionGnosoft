<template>
  <HeaderComponent/>
  <br>
  <button type="button" class="btn btn-primary" @click="habilitarFormulario" v-if="!nuevo">Nueva Factura</button>
  <br>
  <br>
  <Listar v-if="!nuevo"/>
  <br>
  <Nueva v-if="nuevo"/>
  <br>
  
  
  
  <FooterComponent/> 
</template>

<script>
//import HelloWorld from './components/HelloWorld.vue'
import HeaderComponent     from './components/HeaderComponent.vue'
import FooterComponent     from './components/FooterComponent.vue'
import Nueva               from './components/NuevaFactura.vue'
import Listar              from './components/ListarFactura.vue'

export default {
  name: 'App',
  components: {
    HeaderComponent,
    FooterComponent,
    Nueva,
    Listar,
  
    
    
},
  data(){
    return{
      nuevo: false,
      
    }
  },
  methods: {
    //Metodo para Habilitar un formulario
    habilitarFormulario() {
      this.nuevo = true
    },
    


  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
