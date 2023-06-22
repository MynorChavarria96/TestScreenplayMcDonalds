Feature: Navegacion en barra principal

  Background: Usuario visita la pagina de Inicio
    Given que un usuario visita la pagina de Inicio
    When la ventana emergente aparece


  Scenario: Navegar a traves de las paginas principales

    Then el usuario puede ver el texto "Conoce nuestro menú y elige tu favorito"
    When el usuario hace clic en "Menú"
    Then el usuario es redirigido y ve la palabra "Menú"
    When el usuario hace clic en "Ubicaciones"
    Then el usuario es redirigido y ve la palabra "Filtros"
    When el usuario hace clic en "Promociones & Apps"
    Then el usuario es redirigido y ve la palabra "Promociones"
    When el usuario hace clic en "Cajita Feliz"
    Then el usuario es redirigido y ve la palabra "Diversión en Familia"
    When el usuario hace clic en "Servicio al cliente"
    Then el usuario es redirigido y ve la palabra "Quejas"
    And da clic en Logo McDonald's
    Then el usuario puede ver el texto "Conoce nuestro menú y elige tu favorito"


