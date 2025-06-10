# API Java com Spring Boot

Este é um projeto de API REST desenvolvido com Spring Boot, seguindo as melhores práticas de engenharia de software.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.2.3
- Spring Security
- Spring Data JPA
- PostgreSQL
- JWT para autenticação
- Lombok
- Maven

## Pré-requisitos

- JDK 17 ou superior
- Maven
- PostgreSQL
- IDE (recomendado: IntelliJ IDEA ou Eclipse)

## Configuração do Ambiente

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/java-api.git
cd java-api
```

2. Configure o banco de dados PostgreSQL:

- Crie um banco de dados chamado `java_api`
- Atualize as credenciais no arquivo `application.properties` se necessário

3. Execute o projeto:

```bash
mvn spring-boot:run
```

## Estrutura do Projeto

```
src/main/java/com/eduardowanderley/javaapi/
├── config/          # Configurações do Spring
├── controller/      # Controladores REST
├── model/          # Entidades JPA
├── repository/     # Repositórios JPA
├── service/        # Lógica de negócios
├── dto/            # Objetos de transferência de dados
├── exception/      # Tratamento de exceções
└── security/       # Configurações de segurança
```

## Endpoints da API

A documentação completa da API estará disponível em:

- Swagger UI: <http://localhost:8080/swagger-ui.html>
- OpenAPI: <http://localhost:8080/v3/api-docs>

## Testes

Para executar os testes:

```bash
mvn test
```

## Contribuição

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

## Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
