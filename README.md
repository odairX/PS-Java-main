# API RESTful com Java e Spring Framework 

## Descrição

Este projeto tem como objetivo desenvolver uma API Restful funcional para aplicação java. Nesse exemplo,  a API deve criar, deletar e listar os produtos. O principal protocolo de comunicação na Web é o HTTP. Ele funciona como um protocolo de requisição-resposta em um modelo que chamamos de cliente-servidor. Todo o código produzido no artigo, em uma versão simplificada da API, pode ser acessada no repositório abaixo.

## As dependências da aplicação são:

- Apache Maven ( para gestão de dependências )
- Spring Boot ( servidor de aplicação )
- MySQL ( Banco de dados )
- Hibernate ( automatizar o mapeamento de nossas classes de domínio )
- Visual Studio Code ( Ambiente de desenvolvimento)

O Spring boot dispensa a necessidade de um servidor de aplicação para executar nossa aplicação, facilitando a execução durante o desenvolvimento e até em produção. Todas as dependências serão tratadas pelo Maven, segundo o arquivo pom.xml, logo em seguida pelo print de tela do projeto.

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

