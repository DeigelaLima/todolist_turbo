Desenvolvi esta API para gerenciamento de tarefas (To-Do List) durante o minicurso de Java com Spring Boot da Rocketseat, ministrado pela educadora Daniele Leão. Durante o projeto, passei por todo o processo de configuração do ambiente e estruturação do backend com Spring Boot.

Implementei rotas HTTP para operações CRUD, utilizando o banco de dados H2 para armazenamento temporário. Para testar e documentar as rotas da API, utilizei a ferramenta APIdog, garantindo que todas as requisições estivessem funcionando corretamente.

Também utilizei o Spring Data JPA para interagir com o banco, implementei autenticação com JWT via Spring Security e empreguei o Lombok para reduzir a verbosidade do código. Além disso, refinei a aplicação com validações, como restrições de datas para tarefas, garantindo uma experiência mais segura e funcional. Para proteger as credenciais dos usuários, usei bcrypt na criptografia de senhas e configurei filtros de autenticação e autorização.

Por fim, disponibilizei a [API](https://todolist-turbo.onrender.com) na plataforma Render, tornando o projeto acessível e pronto para uso.