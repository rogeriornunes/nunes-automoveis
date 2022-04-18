# Desafio Nunes Automoveis
Gerenciamento de Veículos 
Neste código foi feito um webservice REST com operações para o salvar, atualizar, listar Veículos.

### Especificações principais
* Spring - v5.3.13 - Framework Web Java
* Spring Boot - v2.5.7 - Framework Initializer
* Java - v1.8.202 - Linguagem
* Hibernate - v6.2.0.Final - ORM
* Tomcat - v9.0.55 - Servidor
* Swagger - v2.7.0 - Gerenciador de Documentação e Testes Funcionais
* H2 - v1.4.200 - BD
* Eclipse Oxygen.3a Release - v4.7.3a - IDE


### Instalação
Clone o projeto e importe com a IDE suportada que lhe convir como um projeto Maven.

Caso venha a usar o H2 como persistencia o projeto já está com o driver do mesmo instalado, então vá para:
```
src > main > resources > application.properties
```
E ajuste os dados de Endereço, Timezone, Usuário e Senha de acordo com as configurações do seu banco.

Caso venha a utilizar outro banco será necessário adicionar o Driver do mesmo no pom.xml. Após isso, vá ao application.properties e ajuste os dados de acordo com o seu SGBD.

Agora aguarde sua IDE baixar as dependencias ou execute o mvn spring-boot:run caso tenha configurado o Maven separadamente.

### Swagger Documentação 
Suba a aplicação e acessa o swagger no endereço
http://localhost:8080/swagger-ui.html

## Nunes Automoveis
API REST para Gerenciamento de veículos.

Created by Rogério Nunes
See more at https://www.github.com/rogeriornunes
Contact the developer
veiculo-api : Veiculo ApiShow/HideList OperationsExpand Operations


#### Veículos:

* GET /veiculos
Retorna todos os veículos

* POST /veiculos
Adiciona um novo veículo

* GET /veiculos/marca/{marca}/ano/{ano}/cor/{cor}
Retorna todos os veículos de acordo com os parâmetros passados

* DELETE /veiculos/{id}
Apaga o veículo

* GET /veiculos/{id}
Retorna os detalhes do veículo

* PATCH /veiculos/{id}
Atualiza apenas alguns dados do veículo

* PUT /veiculos/{id}
Atualiza os dados de um veículo

[ base url: / , api version: 1.0 ]
