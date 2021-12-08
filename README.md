# Cities-API
API Rest para consulta de cidades do Brasil publicada através do Heroku, com dados disponibilizados em Json.


Conhecimentos aplicados:

* Spring Boot
* Maven
* Paginação de registros com Spring Data;
* Manipulação de Http Response com wrapper ResponseEntity do Spring, para tratamento de exceções em requisições Http
* Docker
* PostgreSql

> Link de acesso: https://cities-api-new.herokuapp.com/

### Endpoints

- "/countries" - retorna uma lista de países;
- "/states" - retorna os estados do Brasil;
- "/cities" - retorna uma lista de cidades do Brasil;
- "/distances/by-points?from=XXX&to=XXX" - retorna a distância entre duas cidades em Milhas, considerando a linha mais curta entre elas. Recebe dois identificadores (no lugar XXX) que representam as cidades das quais se deseja saber a distância entre elas.
- "distances/by-cube?from=XXX&to=XXX" - retorna a distância entre duas cidades em Metros, considerando a linha mais curta entre elas. Recebe dois identificadores (no lugar XXX) que representam as cidades das quais se deseja saber a distância entre elas.

Para mais informações sobre paginação vale a pena dar uma olhada nos seguintes link:
* https://www.baeldung.com/rest-api-pagination-in-spring
* https://github.com/eugenp/tutorials/tree/master/spring-data-rest
