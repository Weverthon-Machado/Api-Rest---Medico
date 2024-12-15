## API de Cadastro de Médicos
Esta API permite o cadastro, consulta e exclusão de médicos. A aplicação foi construída utilizando o Spring Boot e conecta-se a um banco de dados PostgreSQL. A API oferece endpoints para criar, listar, buscar e excluir médicos por ID.

## Tecnologias Utilizadas
- Java 17
- Spring Boot
- PostgreSQL
- Hibernate
- JPA (Java Persistence API)
- Endpoints da API
## 1. **Cadastrar Médico**
- Método: POST
- URL: /medicos
- Descrição: Cadastra um novo médico no sistema.

Exemplo de Requisição:
json
Copiar código
{
  "nome": "Dr. João",
  "especialidade": "Cardiologia",
  "crm": "12345",
  "email": "joao@exemplo.com"
}

## 2. Listar Todos os Médicos
- Método: GET
- URL: /medicos
- Descrição: Retorna uma lista de todos os médicos cadastrados no sistema.

## 3. Buscar Médico por ID
Método: GET
URL: /medicos/{id}
Descrição: Retorna as informações de um médico específico com base no ID fornecido.

## 4. Excluir Médico
Método: DELETE
URL: /medicos/{id}
Descrição: Exclui um médico do sistema com base no ID fornecido.
Como Executar o Projeto

## Pré-requisitos:
- Java 17 ou superior
- PostgreSQL instalado e configurado

## Passos para Execução
- Clone o repositório: git clone https://github.com/seu-usuario/nome-do-repositorio.git
- cd nome-do-repositorio
- Configure o banco de dados no PostgreSQL e ajuste as configurações no arquivo application.properties:

## Properties
- Copiar código
spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_banco
spring.datasource.username=usuario
spring.datasource.password=senha

- Execute o projeto:
- ./mvnw spring-boot:run
- A API estará disponível em: http://localhost:8080
  
## Testando a API
Recomenda-se o uso do Postman, Insomnia ou cURL para testar os endpoints.

     -d '{
           "nome": "Dr. João",
           "especialidade": "Cardiologia",
           "crm": "12345",
           "email": "joao@exemplo.com"
         }'
