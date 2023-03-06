Feature: Validar que el precio de un producto coincida con el total en el carro de compras
  Como usuario quiero validar que el precio de un producto coincida con el total en el carro de compras

  Scenario: Validar que el precio de un producto coincida con el total en el carro de compras
    Given El usuario selecciona un producto
    When Hace clic en añadir al carro el producto
    Then Se debe validar que el precio del producto es igual al total del carro de compras
