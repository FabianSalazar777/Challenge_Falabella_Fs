Feature: Buscar un producto utilizando las categorias del sitio.
  Como usuario quiero buscar un producto utilizando las categorias del sitio

  Scenario: Seleccionar un producto utilizando las categorias del menu de falabella
    Given El usuario se encuentra en la página home de Falabella
    When Hace clic sobre el botón del menú en el home
    Then Se debe poder seleccionar un producto de la categoría seleccionada

