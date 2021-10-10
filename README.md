# API RESTful com Java e Spring Framework 

## Descrição

Este projeto tem como objetivo desenvolver uma API Restful funcional para aplicação java. Nesse exemplo,  a API deve criar, deletar e listar os produtos. O principal protocolo de comunicação na Web é o HTTP. Ele funciona como um protocolo de requisição-resposta em um modelo que chamamos de cliente-servidor. Todo o código produzido no artigo, em uma versão simplificada da API, pode ser acessada no repositório abaixo.

## As dependências da aplicação são:

- Apache Maven ( para gestão de dependências )
- Spring Boot ( servidor de aplicação )
- MySQL ( Banco de dados )
- Hibernate ( automatizar o mapeamento de nossas classes de domínio )
- Visual Studio Code ( Ambiente de desenvolvimento)
- Postman ( API Client interface de testes endopoint )

O Spring boot dispensa a necessidade de um servidor de aplicação para executar nossa aplicação, facilitando a execução durante o desenvolvimento e até em produção. Todas as dependências serão tratadas pelo Maven, segundo o arquivo pom.xml, logo em seguida pelo print de tela do projeto.

## Funções basicas

Todos os componentes estritamente necessários para o projeto já estão criados, mas você pode adicionar outros se julgar necessário. Os requisitos listados neste projeto são:

- Buscar todos os produtos cadastrados, com informações sobre cada idProduto;
- Exibir informações detalhadas de um produto selecionado; 
- Adicionar um novo produto ao carrinho de compra;
- Excluir um produto do carrinho pelo codigo do produto.

## Estrutura do Projeto

![alt text](https://github.com/odairX/PS-Java-main/blob/main/src/main/img/img1.png)

## Instruções de funcionamento do sistema

O projeto usa o maven wrapper (mvnw).

Instalando as dependências:

```sh
  ./mvnw clean install
  ```

Para Rodar o programa:

```sh
  ./mvnw spring-boot:run
  ```

Para executar os testes de exemplo basta o comando abaixo:
  ```sh
  ./mvnw clean test
  ```

O Banco de dados é criando automaticamente, ao iniciar o programa. No arquivo mostra o codigo de conexão com o Banco de Dados MySQL.

![alt text](https://github.com/odairX/PS-Java-main/blob/main/src/main/img/img2.png)

##  Exemplo do Spring boot run ao executar o comado

![alt text](https://github.com/odairX/PS-Java-main/blob/main/src/main/img/img3.png)

## Primeiros passos com a API RESTful

O REST utiliza-se métodos HTTP. É um estilo de arquitetura de software que define uma série de restrições para a criação de web services (serviços Web), ou seja, restringe como seus componentes devem interagir entre si. Além desse conceito, vale lembrar também que um serviço REST deve que toda requisição deve ser autossuficiente. A API terá os seguintes endpoints:


* POST / http://localhost:8080/product : adiciona um produto ao carrinho


![alt text](https://github.com/odairX/PS-Java-main/blob/main/src/main/img/img4.png)

Em que:

- name: nome do produto;
- price: preço do produto;
- score: pontuação do produto;
- image: image do produto.

Obs.: Não é necessário informar o codigo do produto o sistema gera automaticamente.


* GET / http://localhost:8080/product : retorna todos os produtos do carrinho.

![alt text](https://github.com/odairX/PS-Java-main/blob/main/src/main/img/img5.png)


* DELETE / http://localhost:8080/product/8 : deleta um produto do carrinho.

![alt text](https://github.com/odairX/PS-Java-main/blob/main/src/main/img/img6.png)

Obs.: Deve informar no cabeçalho do metódo o codigo do produto que deseja deletar.

## Tela do Banco de dados MySQL

![alt text](https://github.com/odairX/PS-Java-main/blob/main/src/main/img/img7.png)

## Conhecendo a estrutura do projeto

















