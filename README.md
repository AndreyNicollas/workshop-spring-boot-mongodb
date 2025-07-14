# 🚀 Projeto Prático com Spring Boot - API RESTful em Java

Este projeto prático foi uma etapa essencial na minha jornada de aprendizado em desenvolvimento de **APIs REST com Java e Spring Boot**,desenvolvido com base no curso do Prof. Nelio Alves.

O principal objetivo deste projeto é consolidar conhecimentos fundamentais no desenvolvimento de **APIs RESTful com Java e Spring Boot**, aplicando as boas práticas de arquitetura, persistência de dados e organização em camadas.

---

## 📚 Sobre o Projeto

Durante o desenvolvimento deste sistema, implementei diversas funcionalidades essenciais para o backend de uma aplicação web moderna, incluindo:

- Criação de entidades e relacionamento
- Exposição de endpoints REST com **Spring MVC**
- Operações de **CRUD** para os principais recursos da aplicação
- Manipulação de dados via **camadas de serviço e repositório**
- Integração com banco de dados relacional **MongoDB**
- Tratamento centralizado de exceções com retorno de mensagens padronizadas em JSON com Postman

### 🗃️ Banco Relacional (com JPA + Hibernate):

- Mapeamento de entidades Java com **JPA**
- Operações CRUD com **Spring Data JPA**
- Relacionamentos complexos: `@OneToMany`, `@ManyToOne`, etc.

### 🍃 Banco NoSQL (com MongoDB):

- Modelagem orientada a documentos com **MongoDB**
- Criação de agregados como unidades de dados reutilizáveis
- Persistência de dados complexos em documentos JSON
- Uso do **Spring Data MongoDB** para acesso ao banco
- Ganhos de performance em leitura e escalabilidade horizontal

---

## 🧠 Aprendizados e Consolidação de Conhecimentos

Este projeto me proporcionou uma compreensão prática da **interação entre aplicações Java com diferentes tipos de bancos de dados**, reforçando conceitos essenciais como:

### ✔️ Fundamentos com Spring Boot

- Criação de endpoints REST com Spring MVC
- Organização em camadas (`controller`, `service`, `repository`, `model`)
- Uso eficiente de anotações (`@RestController`, `@Service`, `@Repository`, etc.)

### ✔️ Persistência Relacional (JPA + Hibernate)

- Modelagem de entidades relacionais
- Execução de transações
- Estratégias de carregamento (`LAZY`, `EAGER`)
- Tratamento de exceções e validações

### ✔️ Persistência NoSQL com MongoDB

- Modelagem baseada em agregados
- Organização de dados em documentos aninhados
- Simplicidade de leitura sem necessidade de joins
- Entendimento de quando usar NoSQL vs. SQL, com base nos requisitos

### ✔️ Visão Ampliada

- Diferença entre normalização e desnormalização
- Trade-offs de performance, escalabilidade e complexidade entre os dois modelos
- Benefícios de usar MongoDB em cenários com alto volume de leitura e escrita distribuída

💡 **Conclusão:** Este projeto foi crucial para não apenas consolidar minha base em Spring Boot e bancos relacionais, mas também para **entender a evolução natural para bancos NoSQL**, ampliando minha capacidade de escolha tecnológica de forma consciente.

---

## 🛠️ Tecnologias Utilizadas

- Java 11+
- Spring Boot
- Spring Web (Spring MVC)
- Spring Data JPA
- Hibernate ORM
- H2 Database | MySQL | PostgreSQL
- Maven
- Postman

---

## ▶️ Como Executar o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
