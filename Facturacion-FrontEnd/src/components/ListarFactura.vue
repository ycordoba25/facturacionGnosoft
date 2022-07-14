
<template>
<table v-if="!edicion" class="table table-striped">
  <thead>
    <tr>
      <th scope="col"># de Factura</th>
      <th scope="col">Cliente</th>
      <th scope="col">Fecha</th>
      <th scope="col">SubTotal</th>
      <th scope="col">Iva</th>
      <th scope="col">Total</th>
      <th scope="col">Opciones</th>
    </tr>
  </thead>
  <tbody>
    <tr v-for="factura in listaFactura" :key="factura.id">
      <th scope="row">{{factura.id}}</th>
      <td>{{factura.cliente}}</td>
      <td>{{factura.fecha}}</td>
      <td>12000</td>
      <td>1200</td>
      <td>12200</td>
      <td>
        <button style="margin: 10px" type="button" class="btn btn-info">Editar</button>
        
        <button style="margin: 10px" type="button" class="btn btn-danger">Eliminar</button>
        
        <button @click="listarDetalle(factura.id)" type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
          Detalles
        </button>
      </td>
    </tr>
  </tbody>
</table>
<!-- Button trigger modal -->


<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">DETALLES</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Articulo</th>
      <th scope="col">Cantidad</th>
      <th scope="col">Precio</th>
     
     
    </tr>
  </thead>
  <tbody>
    <tr v-for="detalle in listaDetalle" :key="detalle.id">
      <td>{{detalle.producto}}</td>
      <td>{{detalle.cantidad}}</td>
      <td>{{detalle.precio}}</td>
      <td>
      </td>
    </tr>
  </tbody>
</table>
      




      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
      </div>
    </div>
  </div>
</div>
<Editar v-if="edicion"/>
</template>

<script>

import Editar              from './EditarComponent.vue' 
export default {
  name: 'ListarFactura',
  components: {
    Editar,
    
  },
  data(){
    return{
     edicion: false,
     listaFactura:[],
     listaDetalle:[]
     
    }
  },
  async created() {
  
  const response = await fetch("http://localhost:8080/factura/listar");
  const data = await response.json();
  console.log(data)
  this.listaFactura= data
  },
  
  

  /**async eliminarFactura() {
    fetch('http://localhost:8080/factura/eliminar/1', {
    method: 'DELETE',
    mode: 'no-cors',
    })
    .then(res => {
    return res.json()
    }) 
    .then(data => console.log(data))
    },
**/

  methods: {
    habilitarEdicion(){
      this.edicion = true
    },

    async listarDetalle(id) {
  
  const response = await fetch("http://localhost:8080/detalle/listar/"+id);
  const data = await response.json();
  console.log(data)
  this.listaDetalle= data
  },
    
  
  }
}
</script>

