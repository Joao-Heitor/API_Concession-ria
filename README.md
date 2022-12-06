# API_Concessionaria

* Professor: 
  * [Daniel Faustino](https://github.com/danieltidus)
* Alunos: 
	* [João Heitor](https://github.com/Joao-Heitor)
	* [Vinicius Lins](https://github.com/VLV01)
## Introdução
Desenvolvimento de uma API como projeto final para a disciplina de **Desenvolvimento de Software Corporativo**, seguindo os padrões RestFul, sendo desenvolvida com spring Boot e com tema concessionária de veículos, com possibilidade de realizar operações com os usuários (CRUD) e vendas de veículos.

### Requisitos Levantados

* Cadastrar usuário
* Atualizar usuário
* Apagar usuário
* Definir privilégios de usuários (Vendedor e Cliente)
* Listar usuários
* Consultar usuário
* Venda de veículo
* Cadastrar veículo
* Deletar veículo
* Atualizar veículo
* Listar veículos
* Consultar veículo

### Modelo entidade relacionamento
![Modelo entidade-relacionamento](Artefatos/Concessionária.png)

### Rotas da API por Controllers

### Métodos
Requisições para a API devem seguir os padrões:

| Método | Descrição |
|---|---|
| `GET` | Retorna informações de um ou mais registros. |
| `POST` | Utilizado para criar um novo registro. |
| `PUT` | Atualiza dados de um registro ou altera sua situação. |
| `DELETE` | Remove um registro do sistema. |

### Respostas

| Código | Descrição |
|---|---|
| `200` | Requisição executada com sucesso (success).|
| `400` | Erros de validação ou os campos informados não existem no sistema.|
| `401` | Dados de acesso inválidos.|
| `404` | Registro pesquisado não encontrado (Not found).|

#### Controller Cliente

* POST: /api/cliente
  * Envio:
    ```
      {
      
        
        "nome": "",
        "cpf": "",
        "email": "",
        "cnh": ""
      }
    ```
  * Resposta:

      ```
      {
        "id": "",
        "nome": "",
        "cpf": "",
        "email": "",
        "cnh": ""
      }
      ```


* GET: /api/clientes
  * Resposta:
    ```
      [{
        "id": "",
        "nome": "",
        "cpf": "",
        "email": "",
        "cnh": ""
      },
      { 
        "id": "",
        "nome": "",
        "cpf": "",
        "email": "",
        "cnh": ""
      }]
    ```
* GET: /api/cliente/{clienteId}"
  * Resposta:
    ```
    {
      "id": "",
      "nome": "",
      "cpf": "",
      "email":"",
      "cnh": ""
    }
    ```
* PUT: /api/cliente/{clienteId}
  * Envio:
    ```
    {
      "nome": "",
      "cpf": "",
      "email": "",
      "cnh": ""    
    }
    ```
  * Resposta:
    ```
    {
      "id": "",
      "nome": "",
      "cpf": "",
      "email": "",
      "cnh": ""
    }
    ```
  * DELETE: /api/cliente/{clienteId}
      ```
    {
      "id": "",
      "nome": "",
      "cpf": "",
      "email": "",
      "cnh": ""
    }
    ```

#### Controller Vendedor
* POST: /api/vendedor
  * Envio:
    ```
    {
      "nome": "",
      "cpf": "",
      "email": "",
      "salario": ""
    }
    ```
  * Resposta:
    ```
    {
      "id": "",
      "nome": "",
      "cpf": "",
      "email": "",
      "salario": ""
    }
    ```
  * GET: /api/vendedores
    * Resposta:
    ```
    [{
      "id": "",
      "nome": "",
      "cpf": "",
      "email": "",
      "salario": ""
    },
    {
      "id": "",
      "nome": "",
      "cpf": "",
      "email": "",
      "salario": ""
    }]
    ```
  * GET: /api/vendedor/{vendedorId}
    * Resposta:
    ```
      {
        "id": "",
        "nome": "",
        "cpf": "",
        "email": "",
        "salario": ""
      }
    ```
  * PUT: /api/vendedor/{vendedorId}
    * Envio:
    ```
    {
      "nome": "",
      "cpf": "",
      "email": "",
      "salario": ""
    }
    ```
    * Resposta:
    ```
    {
      "id": "",
      "nome": "",
      "cpf": "",
      "email": "",
      "salario": ""
    }
    ```
  * DELETE: /api/vendedor/{vendedorId}
    ```
    {
      "id": "",
      "nome": "",
      "cpf": "",
      "email": "",
      "salario": ""
    }
    ```


#### Controller Veículo
* POST: /api/veiculo
  * Envio:
    ```
    {
    "chassi": "",
    "modelo": "",
    "nome": "",
    "ano": "",
    "cor": ""
    }
    ```
  * Resposta:
    ```
    {
    "id": "",
    "chassi": "",
    "modelo": "",
    "nome": "",
    "ano": "",
    "cor": ""
    }
    ```
  * GET: /api/veiculos
    * Resposta:
    ```
    [{
      "id": "",
      "chassi": "",
      "modelo": "",
      "nome": "",
      "ano": "",
      "cor": ""
    },
    {
      "id": "",
      "chassi": "",
      "modelo": "",
      "nome": "",
      "ano": "",
      "cor": ""
    }]
  
    ```
  * GET: /api/veiculos/{veiculoId}
    * Resposta:
    ```
    {
      "id": "",
      "chassi": "",
      "modelo": "",
      "nome": "",
      "ano": "",
      "cor": ""
    }
    ```
  * PUT: /api/veiculos/{veiculoId}
    * Envio:
    ```
    {
      "chassi": "",
      "modelo": "",
      "nome": "",
      "ano": "",
      "cor": ""
    }
    ```
    * Resposta:
    ```
    {
      "id": "",
      "chassi": "",
      "modelo": "",
      "nome": "",
      "ano": "",
      "cor": ""
    }
    ```
  * DELETE: /api/veiculo/{veiculoId}
    ```
    {
      "id": "",
      "chassi": "",
      "modelo": "",
      "nome": "",
      "ano": "",
      "cor": ""
    }
    ```


#### Controller Venda
  * POST: api/venda/vendedor/{vendedorId}/cliente/{clienteId}/veiculo/{veiculoId}
    * Envio:
    ```
    {
      "veiculoId": "",
      "clienteId": "",
      "vendedorId": ""
    }
    ```
    * Resposta:
    ```
    {
    "vendaId": "",
    "veiculoId": "",
    "clienteId": "",
    "vendedorId": ""
    }
    ```

* GET: api/venda/vendedor/{vendedorId}/cliente/{clienteId}/veiculo/{veiculoId}
  * Resposta: 
  ```
  [{
    "vendaId": "",
    "veiculoId": "",
    "clienteId": "",
    "vendedorId": ""
  },
  {
    "vendaId": "",
    "veiculoId": "",
    "clienteId": "",
    "vendedorId": ""
  }]
  ```

* GET: api/venda/vendedor/{vendedorId}/cliente/{clienteId}/veiculo/{veiculoId}
  * Resposta:
  ```
  {
    "vendaId": "",
    "veiculoId": "",
    "clienteId": "",
    "vendedorId": ""
  }
  ```
* PUT: api/venda/vendedor/{vendedorId}/cliente/{clienteId}/veiculo/{veiculoId}
  * Envio:
  ```
  {
    "veiculoId": "",
    "clienteId": "",
    "vendedorId": ""
  }
  ```
  * Resposta:
  ```
  {
    "vendaId": "",
    "veiculoId": "",
    "clienteId": "",
    "vendedorId": ""
  }
  ```
* DELETE: api/venda/{vendaId}
  ```
  {
    "vendaId": "",
    "veiculoId": "",
    "clienteId": "",
    "vendedorId": ""
  }
  ```





