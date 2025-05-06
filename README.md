# FitSync - Aplicativo para gerenciamento de treinos!

Projeto desenvolvido como parte do Desafio 3 do Projeto Integrador do curso de Fullstack da Generation Brasil, com foco em criar uma aplicação funcional para auxiliar no gerenciamento de treinos de forma individual.


## 👨‍👦‍👦 Descrição do Projeto

O FitSync é um sistema completo para acompanhamento de rotina fitness. Ele permite o registro, visualização e atualização de treinos, além do monitoramento do progresso físico dos usuários. A aplicação oferece uma experiência simples, intuitiva e eficiente para quem busca manter o foco em seus objetivos de saúde e bem-estar.


### 🎯 Objetivo

A aplicação foi idealizada para pessoas que desejam organizar seus treinos, acompanhar sua evolução e manter uma vida saudável de forma prática. O objetivo é centralizar todas as informações sobre rotina de exercícios, medidas corporais e objetivos, promovendo disciplina, motivação e constância.


## 👥 Público-alvo

O público-alvo deste sistema são pessoas que praticam atividades físicas regularmente, iniciantes na academia, personal trainers e qualquer indivíduo que deseja melhorar sua qualidade de vida por meio do controle da sua rotina fitness.


## ❗ Problemas que o projeto visa resolver:

O sistema FitSync foi desenvolvido para solucionar diversos desafios enfrentados por quem treina, como:

- Falta de organização nos treinos
- Dificuldade de manter constância
- Treinos não personalizados
- Falta de motivação por não acompanhar resultados
- Dificuldade de personal trainers em acompanhar alunos remotamente
- 
Com isso, o FitSync se propõe a ser uma ferramenta central para treinos, progresso físico e motivação pessoal.


## 🗃️ Entidades e Atributos

## 🔧 Funcionalidades (CRUD)

## 💻 Tecnologias Utilizadas

| Tecnologia      | Descrição                                           |
|-----------------|-----------------------------------------------------|
| Java            | Linguagem principal do backend                      |
| Spring Boot     | Framework para desenvolvimento web                  |
| MySQL           | Banco de dados relacional                           |
| JPA/Hibernate   | ORM para mapeamento objeto-relacional               |
| Maven           | Gerenciador de dependências                         |
| Insomnia        | Testes de endpoints RESTful                         |
| Trello          | Organização e gerenciamento das tarefas do projeto  |
| Discord         | Para comunicação da equipe                          |


## 🧪 Testes com Insomnia/Postman

Um arquivo .yaml com as requisições já prontas está disponível na pasta insomnia.
Basta importar no Insomnia/Postman e começar a testar!

## ▶️ Como Rodar o Projeto
1. Clone o repositório
2. Configure o banco de dados MySQL no arquivo application.properties:
    Abra o arquivo src/main/resources/application.properties e configure os parâmetros de conexão com o banco de dados MySQL de acordo com o que está configurado no seu ambiente local:

    spring.datasource.url=jdbc:mysql://localhost:3306/app_fitness_backend
    spring.datasource.username=seu_usuario       # Substitua 'seu_usuario' pelo nome de usuário do MySQL da sua máquina
    spring.datasource.password=sua_senha         # Substitua 'sua_senha' pela senha do usuário do MySQL na sua máquina
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true

Importante: Lembre-se de substituir seu_usuario e sua_senha pelos dados corretos do MySQL configurados na sua máquina.

3. Execute a aplicação:
    Pela IDE:
    - Abra o arquivo AppFitnessBackendApplication.java (classe principal do Spring Boot).

    - Clique com o botão esquerdo do mouse em cima do arquivo.

    - Procure e clique na opção Run Java para rodar a aplicação.



## 👨‍💻 Integrantes do Grupo

| Nome              | Função         | GitHub                                   |
|-------------------|----------------|-------------------------------------------|
| Camila Lima       | Desenvolvedor  | [camilalimas](https://github.com/camilalimas)|
| João Andrade      | Product Owner  | [JoaoAndrade-dev](https://github.com/JoaoAndrade-dev)|
| Karina Camargo    | Desenvolvedora | [araujokahh](https://github.com/araujokahh)|
| Luan Lazarine     | Tester         | [Lazarine1996](https://github.com/Lazarine1996)|
| Pamela Oliveira   | Desenvolvedora | [heypamela](https://github.com/heypamela)|
| Vitor Teles       | Desenvolvedor  | [VitorGabrielTeles](https://github.com/VitorGabrielTeles)|



📅 Projeto iniciado em: **06/05/2025**


---

## 📌 Observações

Este projeto é voltado para fins educacionais e representa uma solução inicial que pode ser expandida com outras features no futuro.

---
