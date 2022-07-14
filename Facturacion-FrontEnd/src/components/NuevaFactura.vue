
<template>
<div class="row">
  <div class="col-md-6">
    <div class="form-row">
     <div class="form-group col-md-6">
        <label for="inputEmail4">Cliente</label>
        <input type="text" class="form-control" id="inputEmail4" placeholder="Nombre">
      </div>

    <div class="form-group col-md-6">
      <label for="inputPassword4">fecha</label>
      <input type="date" class="form-control" id="inputPassword4" placeholder="fecha">
    </div>
    </div>
   <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputPassword4">Articulo</label>
      <input v-model="articulo" type="text" class="form-control" placeholder="Nombre del articulo" aria-label="Nombre del articulo" aria-describedby="basic-addon2">
      <br>
    </div>
      <div class="form-group col-md-4">
        <label for="inputEmail4">Precio</label>
        <input v-model="precio" type="text" class="form-control" id="inputEmail4" placeholder="Nombre">
      </div>
      <div class="form-group col-md-2">
        <label for="inputEmail4">Cantidad</label>
        <input v-model="cantidad" type="text" class="form-control" id="inputEmail4" placeholder="Nombre">
      </div>
   </div>
    <button @click="agregar" class="btn btn-outline-secondary" type="button">Agregar</button>
    </div>
  <div class="col-md-6">
    <table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Articulo</th>
      <th scope="col">Cantidad</th>
      <th scope="col">Precio</th>
      <th scope="col">Subtotal</th>
      <th scope="col">Iva</th>
      <th scope="col">Total</th>
    </tr>
  </thead>
  <tbody>
    <tr v-for="detalle in listaDet" :key="detalle.id">
      <td>{{detalle.articulo}}</td>
      <td>{{detalle.cantidad}}</td>
      <td>{{detalle.precio}}</td>
      <td>{{detalle.precio*detalle.cantidad}}</td>
      <td>{{detalle.cantidad*detalle.precio*0.19}}</td>
      <td>{{detalle.cantidad*detalle.precio*0.19+detalle.cantidad*detalle.precio}}</td>
    </tr>
    
  </tbody>
</table>






  </div>
</div>
  
  <button @click="this.crearFactura" style="margin: 10px" class="btn btn-primary">Registrar</button>
  <button v-if="!edicion" type="submit" class="btn btn-primary">Cancelar</button>

</template>

<script>
export default {
  name: 'NuevaFactura',


  data(){
    return{
      articulo:"",
      precio:0,
      cantidad:0,
      listaDet:[]
      
    }
  },
  
  methods: {
    async crearFactura() {
    let factura = {
      cliente: "Jaieme",
      fecha: "2022-07-13",
      detalles:[]
    };

    let response = await fetch('http://localhost:8080/factura/nueva', {
    method: 'POST',
    mode: 'no-cors',
    headers: {
    'Content-Type': 'application/json'
    
    },
    body: JSON.stringify(factura)
    })
    let result = await response.json();
    alert(result.message);
  
    },

    agregar(){
      const detalle={
        cantidad:this.cantidad,
        articulo:this.articulo,
        precio:this.precio
      }
      this.listaDet.push(detalle);
        this.cantidad=0
        this.articulo=""
        this.precio= 0
      
    }


  



}
}
  





</script>