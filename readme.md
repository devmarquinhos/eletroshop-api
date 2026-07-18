# 📦 API de Gerenciamento de Produtos - Equipe 4

Esta é a API RESTful desenvolvida para o MVP de gerenciamento de produtos da loja. Ela atua como a principal fonte de dados para o aplicativo mobile, processando operações de gerenciamento e garantindo as regras de negócio.

## 🛠 Tecnologias Utilizadas

- Java & Spring Boot
- Spring Data JPA
- Banco de Dados H2
- Lombok


## 🚀 Endpoints da API

A URL base da aplicação rodando localmente é: http://localhost:8080

| Método  | Endpoint        | Descrição                                          |
|:--------|:----------------|:---------------------------------------------------|
| GET     | /products       | Retorna a lista de todos os produtos cadastrados.  |
| GET     | /products/{id}  | Busca e retorna um produto específico pelo seu ID. |
| POST    | /products       | Cadastra um novo produto no sistema.               |
| PUT     | /products/{id}  | Atualiza os dados de um produto existente pelo ID. |
| DELETE  | /products/{id}  | Remove um produto do sistema pelo ID.              |

## 📝 Formato do Produto (JSON)

Para os métodos POST e PUT, a API espera receber e devolverá um objeto JSON no seguinte formato:

```json
    {
        "name": "RTX 5090 Ti",
        "description": "Placa de vídeo da linha Platinum da marca NVIDIA",
        "category": "Placa de Vídeo",
        "price": 49.90,
        "quantity": 50
    }
```

## ⚙️ Como executar o projeto

1. Clone o repositório.
2. Certifique-se de ter o Java/JDK instalado.
3. Na raiz do projeto, execute o comando:
   - Windows: `mvnw spring-boot:run`
   - Mac/Linux: `./mvnw spring-boot:run`


A API estará pronta para receber requisições do aplicativo na porta 8080.