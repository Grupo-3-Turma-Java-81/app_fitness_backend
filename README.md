# Projeto-Verão - Aplicativo para gerenciamento de treinos!

Projeto desenvolvido como parte do Desafio 3 do Projeto Integrador do curso de Fullstack da Generation Brasil, com foco em criar uma aplicação funcional para auxiliar no gerenciamento de treinos de forma individual.


## 👨‍👦‍👦 Descrição do Projeto

O Projeto-Verão é um sistema completo para acompanhamento de rotina fitness. Ele permite o registro, visualização e atualização de treinos, além do monitoramento do progresso físico dos usuários. A aplicação oferece uma experiência simples, intuitiva e eficiente para quem busca manter o foco em seus objetivos de saúde e bem-estar.


### 🎯 Objetivo

A aplicação foi idealizada para pessoas que desejam organizar seus treinos, acompanhar sua evolução e manter uma vida saudável de forma prática. O objetivo é centralizar todas as informações sobre rotina de exercícios, medidas corporais e objetivos, promovendo disciplina, motivação e constância.


## 👥 Público-alvo

O público-alvo deste sistema são pessoas que praticam atividades físicas regularmente, iniciantes na academia, personal trainers e qualquer indivíduo que deseja melhorar sua qualidade de vida por meio do controle da sua rotina fitness.


## ❗ Problemas que o projeto visa resolver:

O sistema Projeto-Verão foi desenvolvido para solucionar diversos desafios enfrentados por quem treina, como:

- Falta de organização nos treinos
- Dificuldade de manter constância
- Treinos não personalizados
- Falta de motivação por não acompanhar resultados
- Dificuldade de personal trainers em acompanhar alunos remotamente
- 
Com isso, o Projeto-Verão se propõe a ser uma ferramenta central para treinos, progresso físico e motivação pessoal.


## 🗃️ Entidades e Atributos
O sistema utiliza o banco de dados `db_sistema_academia`, composto por três entidades principais: `tb_alunos`, `tb_treinos` e `tb_usuarios`.

![Image](https://github.com/user-attachments/assets/e3d31507-f3d4-42ab-9eda-9e798696c17b)

### 🧍‍♂️ Aluno (`tb_alunos`)
A tabela de alunos armazena os dados pessoais e de vínculo de cada aluno. Possui os seguintes atributos:

- `id`: Identificador único  
- `nome`: Nome completo  
- `endereco`: Endereço residencial  
- `telefone`: Telefone para contato  
- `data_matricula`: Data de matrícula no sistema  
- `altura`: Altura do aluno  
- `peso`: Peso do aluno  
- `treino_id`: Referência ao treino associado  
- `usuario_id`: Referência ao usuário do sistema  

### 🏋️‍♀️ Treino (`tb_treinos`)
Essa tabela armazena as informações relacionadas aos planos de treino cadastrados na academia. Possui os seguintes campos:

- `id`: Identificador único  
- `descricao`: Descrição do plano de treino  
- `dia_semana_treino`: Dias da semana em que o treino ocorre  
- `status`: Status do treino (ativo, inativo)  
- `tipo_treino`: Tipo do treino (ex: hipertrofia, emagrecimento)  

### 👤 Usuário (`tb_usuarios`)
A tabela de usuários armazena as informações de acesso ao sistema. Os campos disponíveis são:

- `id`: Identificador único  
- `nome`: Nome do usuário  
- `usuario`: Nome de login  
- `senha`: Senha de acesso  
- `foto`: Foto do perfil  
- `tipo_usuario`: Tipo de usuário (ex: administrador, aluno, instrutor)
  

## 🔧 Funcionalidades (CRUD)

O sistema oferece funcionalidades completas de CRUD (Create, Read, Update, Delete) para as três entidades principais.

### 🧍‍♂️ Aluno
- **Criar**: Cadastrar novo aluno  
- **Listar**: Visualizar todos os alunos (filtro por nome ou ID)  
- **Atualizar**: Editar informações de um aluno  
- **Excluir**: Remover cadastro  

### 🏋️‍♀️ Treino
- **Criar**: Cadastrar novo treino  
- **Listar**: Visualizar todos os treinos (busca por tipo ou status)  
- **Atualizar**: Alterar informações de um treino  
- **Excluir**: Deletar registro  

### 👤 Usuário
- **Criar**: Cadastrar novo usuário  
- **Listar**: Visualizar todos os usuários (filtro por nome ou ID)  
- **Atualizar**: Alterar informações de um usuário  
- **Excluir**: Deletar registro  

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


## 🧪 Testes com Swagger

A API pode ser testada diretamente utilizando o Swagger, que é gerado automaticamente pela aplicação Spring Boot.

Após iniciar a aplicação, acesse a seguinte URL no navegador para visualizar e interagir com os endpoints disponíveis:

https://app-fitness-backend.onrender.com/

## ▶️ Como Rodar o Projeto Localmente
1. Clone o repositório
2. Configure o banco de dados MySQL no arquivo application.properties:
    Abra o arquivo src/main/resources/application.properties e configure os parâmetros de conexão com o banco de dados MySQL de acordo com o que está configurado no seu ambiente local:


 spring.profiles.active=dev
springdoc.api-docs.path=/v3/api-docs
springdoc.swagger-ui.path=/swagger-ui.html
springdoc.swagger-ui.operationsSorter=method
springdoc.swagger-ui.disable-swagger-default-url=true
springdoc.swagger-ui.use-root-path=true

Importante: Lembre-se de substituir seu_usuario e sua_senha pelos dados corretos do MySQL configurados na sua máquina e alterar o spring.profiles.active para ---> dev.

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
