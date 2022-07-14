<template>
<form>
  <div class="form-row">
    <div class="form-group col-md-3">
      <label for="inputEmail4">Numero</label>
      <input type="email" class="form-control" id="inputEmail4" placeholder="Email">
    </div>
    <div class="form-group col-md-9">
      <label for="inputPassword4">Cliente</label>
      <input type="text" class="form-control" id="inputPassword4" placeholder="Password">
    </div>
  </div>
   <div class="form-row">
  <div class="form-group col-md-3">
    <label for="inputAddress">fecha</label>
    <input type="date" class="form-control" id="inputAddress" placeholder="1234 Main St">
  </div>
  <div class="form-group col-md-3">
    <label for="inputAddress2">Subtotal</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
  </div>
  <div class="form-group col-md-3">
    <label for="inputAddress2">Iva</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
  </div>
  <div class="form-group col-md-3">
    <label for="inputAddress2">Total</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
  </div>
</div>
  <button type="submit" class="btn btn-primary">Sign in</button>
</form>
</template>

<script>
export default {
  name: 'EditarComponent',
}


</script>