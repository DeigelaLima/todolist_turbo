# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.1/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.1/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.4.1/reference/web/servlet.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.


# todolist

## Detalhes dos passo a passo do projeto
Esse projeto foi feito através do minicurso de Java com Spring Boot da Rocketseat, ministrado pela educadora Daniele Leão.

### - Configurando Ambiente

Neste mini-curso, você criará uma API para controle de Tasks, um To-Do List. Irá aprender a criar rotas HTTP, receber e validar parâmetros, integrar com banco de dados e autenticação com JWT, utilizando o Spring Security. Por fim, irá realizar o deploy na plataforma Render.

Nesta aula, vamos aprender a configurar o ambiente de desenvolvimento para a nossa aplicação. Você terá acesso a uma documentação com um passo a passo detalhado de como configurar o Java, o Maven e a sua IDE (no caso, o VS Code). Além disso, você pode optar por instalar uma extensão de cliente REST no VS Code, como o API Dog, Insomnia ou Postman. Certifique-se de ter esses quatro pontos configurados antes de prosseguir para a próxima aula. A documentação também explica como verificar se o Java está configurado corretamente e como instalar o Maven. Por fim, é importante instalar as extensões necessárias no VS Code para utilizar o Spring Boot.

[Documentação Curso de Java](https://efficient-sloth-d85.notion.site/Curso-de-Java-2408d11bfc3447e980fe9460b6293976)

### - Criando Estrutura Projeto

Nesta aula, vamos aprender a criar a estrutura de uma aplicação em Spring Boot. Existem várias formas de fazer isso, mas vamos utilizar o Spring Initializer, um site disponibilizado pela Spring que nos permite configurar nosso projeto e adicionar as dependências necessárias. No Spring Initializer, selecionamos o tipo de gerenciador de pacotes (Maven ou Gradle), a linguagem (Java, Kotlin, Groovy), a versão do Spring Boot e as informações do projeto, como o grupo, o nome e a descrição. Também podemos escolher o tipo de empacotamento (JAR ou WAR) e adicionar as dependências necessárias, como a Spring Web para criar uma aplicação RESTful. Depois de gerar o projeto, podemos compartilhar o link com outras pessoas. Na aula, também menciono outras formas de criar uma aplicação em Spring Boot, como utilizar o Maven pelo terminal.

### - Entendendo Estrutura

Nesta aula, vamos entender a estrutura de um projeto Spring Boot. Vamos analisar as pastas principais que são criadas ao construir um projeto, como a pasta .mvn, que contém o gerenciador de pacotes. Também vamos explorar a pasta src, que contém as pastas Main e Test, onde colocamos o código da aplicação e os testes, respectivamente. Vamos entender como as dependências são gerenciadas pelo Spring Boot e como as annotations são utilizadas para configurar a aplicação. Por fim, vamos analisar a estrutura de pacotes e importações de classes no Java.

### - Entendendo o que é Controller

Nesta aula, vamos criar a primeira rota em nossa aplicação usando o Spring Boot. Para isso, precisamos entender a estrutura de uma rota no Spring Boot. Vamos criar uma classe chamada "MinhaPrimeiraController" dentro de uma pasta chamada "controller". A controller é responsável por receber as requisições do usuário e encaminhá-las para as demais camadas da aplicação. Existem duas formas de criar uma controller: utilizando o "@Controller" ou o "@RestController". A diferença entre eles é que o "@Controller" permite retornar páginas, enquanto o "@RestController" é utilizado para construir uma API. Vamos definir a rota utilizando a anotação "@RequestMapping" e o método HTTP que queremos utilizar (GET, POST, PUT, DELETE, PATCH). Em seguida, definimos o método que será chamado quando essa rota for acessada. É importante lembrar que os pacotes devem estar corretamente estruturados para que o Spring possa gerenciá-los adequadamente.

### - Funcionalidade de usuário

Nesta aula, começamos a criar as funcionalidades da nossa aplicação. Removemos a pasta Controller e criamos um novo pacote chamado User para centralizar tudo relacionado ao usuário. Começamos criando o User Controller e explicamos como definir o nome da classe e do arquivo. Em seguida, falamos sobre os tipos de dados em Java, como string, integer, double, float, char e date. Também mencionamos o tipo void quando não há retorno. Criamos o método create, que recebe os dados do usuário a ser cadastrado. Explicamos como criar um objeto UserModel para representar o usuário e como receber os dados em formato JSON no corpo da requisição. Por fim, utilizamos o System.out.println para exibir o nome do usuário no terminal e definimos o método como POST usando a anotação @PostMapping.

### - Getters e Setters

Nesta aula, vamos aprender sobre os métodos getters e setters em Java. Quando definimos atributos como privados em uma classe, precisamos informar como esses atributos podem ser acessados por outras classes. Os getters são usados para buscar informações dos atributos, enquanto os setters são usados para atualizar ou inserir valores nos atributos. No Spring Boot, ele já faz todo o gerenciamento desses métodos, então só precisamos definir os atributos e o Spring Boot cuidará do resto. Vamos criar os getters e setters para os atributos username, name e password na classe UserModel. Depois, podemos utilizar esses métodos para recuperar e atribuir valores aos atributos.

### - Lombok

Nesta aula, vamos aprender sobre o Lombok, uma biblioteca do Java que nos permite otimizar a criação de getters, setters e outros métodos, como construtores e toString. O Lombok utiliza annotations para definir quais métodos queremos incluir em nosso projeto. Para utilizá-lo, precisamos adicionar a dependência do Lombok em nosso arquivo .xml. Podemos utilizar a annotation @Data para gerar automaticamente os getters e setters para todos os atributos de uma classe. Também é possível utilizar as annotations @Getter e @Setter para gerar apenas os getters ou setters, respectivamente. O Lombok nos ajuda a deixar nosso código mais limpo e legível.

### - Banco de ddados

Nesta aula, vamos aprender como armazenar informações de usuários em um banco de dados usando o Spring Data JPA. O Spring Data JPA é um projeto do Spring que nos permite fazer a comunicação com o banco de dados e manipular os dados de forma fácil. Ele utiliza o conceito de ORM (Mapeamento Objeto-Relacional) para transformar objetos em uma forma que o banco de dados entenda. Vamos utilizar o H2 como banco de dados em memória para fins de aprendizado, mas em produção, você pode usar outros bancos de dados como PostgreSQL ou MySQL. Vamos configurar as dependências no arquivo pom.xml e também configurar o H2 no arquivo application.properties. Depois de configurado, podemos acessar o console do H2 para verificar se está tudo funcionando corretamente. Nas próximas aulas, vamos construir as tabelas e entender como o Spring Data JPA se comunica com o banco de dados.

### - Criando Tabela Usuário

Nesta aula, começamos a criar a tabela de usuários em nossa aplicação usando o conceito de ORM (Object-Relational Mapping). Definimos a entidade "User" como nossa tabela de usuários no banco de dados. Também adicionamos a chave primária, que é um ID único gerado automaticamente usando o tipo UUID. Além disso, definimos outros atributos como colunas na tabela, como "Username", "Password", "Name" e "CreatedAt". Observamos que o banco de dados utiliza o padrão de separação de palavras com underline.

### - Repository

Nesta aula, aprendemos como o Spring pode gerenciar o ciclo de vida de um repositório. Utilizando a anotação @Autowired, podemos pedir ao Spring para instanciar e gerenciar nosso repositório, garantindo que ele seja inicializado corretamente. Com isso, podemos acessar os métodos disponíveis no JPA Repository, como o método save, para salvar entidades no banco de dados. Também vimos como criar uma interface de repositório, estendendo a classe JpaRepository do Spring Data JPA, e definindo o tipo da entidade e do ID. Na próxima aula, iremos validar a criação de usuários duplicados.

### - Validando username

Nesta aula, vamos aprender sobre validação de dados em uma aplicação. Vamos começar verificando se um usuário já existe antes de salvá-lo no banco de dados. Para isso, utilizaremos o método findByUsername do Spring Data, que nos permite buscar um usuário pelo seu nome de usuário. Caso o usuário já exista, retornaremos uma mensagem de erro. Caso contrário, continuaremos com o processo de salvamento. Além disso, discutiremos a importância de retornar diferentes tipos de resposta, dependendo do resultado da operação, como sucesso ou erro. Na próxima aula, veremos como implementar essa lógica de retorno de sucesso e erro.

### - Utilizando ResponseEntity

Nesta aula, vamos aprender como ter retornos diferentes na nossa aplicação dentro da mesma requisição. Utilizaremos o tipo Response Entity do Spring Framework HTTP para retornar mensagens de erro e status code adequados. Podemos utilizar o status code 400 para indicar erros, como quando o usuário já existe. Também podemos utilizar o status code 201 para indicar sucesso, como quando um usuário é criado. O Response Entity nos permite retornar tanto casos de sucesso como casos de erro de forma eficiente.

### - Hash da senha

Nesta aula, aprendemos sobre a importância de criptografar senhas em nossas aplicações para garantir a segurança das informações dos usuários. Utilizamos a biblioteca bcrypt para realizar a criptografia das senhas. Aprendemos a importar a biblioteca, definir o custo da criptografia e aplicar a função de hash na senha antes de armazená-la no banco de dados. Com isso, garantimos que as senhas não ficarão expostas e protegemos a privacidade dos usuários.

### - Tabela de Task

Nesta aula, vamos verificar se a tabela foi criada com sucesso. Faremos uma alteração no título, limitando a quantidade de caracteres permitidos. Em seguida, rodaremos a aplicação e verificaremos se a tabela de tarefas foi criada corretamente. Além disso, discutiremos a possibilidade de adicionar campos como data de início, data de término, ID do usuário e prioridade da tarefa. Definiremos a estrutura da tabela e criaremos o conteúdo das tarefas.

### - Cadastro de tarefa

Nesta aula, vamos criar o Task Controller e o repositório para a nossa tarefa. O Task Controller será responsável por lidar com as requisições relacionadas às tarefas, enquanto o repositório será responsável por armazenar e recuperar os dados das tarefas. Vamos definir o mapeamento para as requisições relacionadas às tarefas e implementar o método de criação de tarefas. Vamos também adicionar validações para garantir que a criação de tarefas seja restrita ao usuário proprietário da tarefa. Na próxima aula, vamos abordar como resolver os problemas de criar tarefas para usuários inexistentes e sem permissão.

### - Realizando filtro

Nesta aula, vamos aprender sobre a utilização de filtros em uma aplicação Java. Vamos criar um filtro de autenticação básica, onde o usuário precisará passar suas credenciais para cadastrar uma tarefa. O filtro irá verificar se o usuário está cadastrado e se a senha está correta antes de permitir o cadastro. Vamos implementar o filtro utilizando a interface ServletFilter e o método doFilter, que nos permite barrar a requisição ou permitir que ela siga viagem.

### - Continuando a Implementação do Filtro

Nesta aula, vamos continuar a implementação do filtro utilizando o Once Per Request Filter do Spring. Isso facilita o trabalho com requisições HTTP em uma API, pois não precisamos converter os Servlet Request e Servlet Response para HTTP Servlet Request e HTTP Servlet Response. Vamos passar as informações de autenticação (usuário e senha) no Basic Auth e realizar a validação do usuário e senha. Em seguida, vamos decodificar o Basic 64 e separar o usuário e senha para verificação.

### - Decode da senha

Neste trecho da aula, vamos validar se um usuário existe no banco de dados. Utilizaremos o User Repository para fazer essa validação, utilizando o método Find by Username. Se o usuário existir, validaremos a senha. Caso contrário, retornaremos um erro para o usuário. Se a senha for válida, continuaremos com a execução normal do código. Caso contrário, retornaremos um erro de autorização. Faremos essa validação apenas para a rota de tasks.

### - Validando rota

Nesta aula, vamos aprender sobre validação de rotas em uma aplicação.

### - Setando atributo na request

Nesta aula, aprendemos a passar o ID do usuário autenticado para o controller através do filtro de autenticação. Antes, estávamos passando o ID do usuário diretamente no JSON da requisição, mas agora podemos utilizar a autenticação para obter esse ID. Removemos o ID do usuário do JSON e, no filtro, adicionamos o ID do usuário como um atributo no request. No controller, podemos recuperar esse atributo usando o método request.getAttribute. Com isso, garantimos mais segurança e simplificamos o processo de criação de tarefas, pois o usuário só poderá criar uma tarefa se estiver autenticado.

### - Validação das horas

Nesta aula, vamos aprender a adicionar validações em nossa aplicação. Vamos começar validando a hora. Atualmente, quando cadastramos uma tarefa, não fazemos nenhuma validação. Isso significa que podemos cadastrar uma tarefa com uma data que já passou. Vamos corrigir isso. Vamos validar se a data que estamos passando é maior do que a data atual. Se a data atual for maior que a data de início, lançaremos um erro. Além disso, também vamos validar se a data de término é maior do que a data de início. Essas validações garantem que as regras de hora sejam seguidas corretamente.

### - Listando as tarefas

Nesta aula, vamos criar uma funcionalidade para listar todas as tarefas de um usuário com base em suas credenciais. Já temos a validação para buscar as tarefas apenas do usuário em questão. Agora, vamos criar um método público para listar as tarefas, utilizando o HttpServletRequest e o método findAll do TaskRepository. No entanto, precisamos filtrar as tarefas pelo ID do usuário. Faremos isso utilizando o método findByIdUser no repositório e passando o ID do usuário obtido através do getAttribute. Em seguida, retornaremos a lista de tarefas encontradas. Por fim, faremos um teste para verificar se tudo está funcionando corretamente.

### - Update da tarefa

Nesta aula, aprendemos sobre como fazer o update de uma tarefa em um HTTP Servlet. Exploramos diferentes abordagens para realizar essa atualização, como definir um método de update para cada informação a ser alterada, fazer um mapeamento dos dados alterados ou copiar o objeto salvo e alterar as informações desejadas. Também vimos como utilizar variáveis de path para passar o ID da tarefa a ser atualizada na rota da requisição. Por fim, implementamos a funcionalidade de update em nosso código.

### - Update Parcial

Na aula anterior, aprendemos a fazer a atualização de uma tarefa no nosso aplicativo. No entanto, percebemos que toda vez que precisamos alterar um campo, precisamos passar o objeto completo, o que pode levar a erros se algum campo for esquecido. Para resolver esse problema, criamos uma função que verifica os campos nulos e faz a mescla dos atributos entre o objeto recebido na requisição e o objeto retornado do banco de dados. Para isso, utilizamos a classe BeanWrapper do Java para acessar as propriedades do objeto. Também criamos um método para copiar apenas as propriedades não nulas entre dois objetos. Essa lógica nos permite fazer atualizações parciais de forma dinâmica e reutilizável em outros lugares do código.

### - Validando usuário dono

Nesta aula, vamos realizar uma validação na atualização de tarefas em nossa aplicação. Atualmente, estamos validando se o usuário está autenticado, mas não verificamos se a tarefa pertence a ele. Vamos criar um novo usuário de teste e tentar atualizar uma tarefa que não pertence a ele. Precisamos garantir que, após autenticar o usuário, verifiquemos se a tarefa que ele está tentando alterar é realmente dele. Faremos essa validação e também verificaremos se a tarefa existe antes de permitir a alteração. Ao final da aula, corrigiremos um erro de duplicação de salvamento e teremos uma validação completa para garantir que apenas o dono da tarefa possa alterá-la.

### - Try catch

Nesta aula, aprendemos a customizar o tratamento de erros em uma aplicação Spring. Utilizamos a anotação @ControllerAdvice para criar um controlador de exceções global. Dentro desse controlador, definimos um método para tratar a exceção HTTPMessageNotReadableException. Utilizamos a classe ResponseEntity para retornar uma resposta personalizada ao usuário, com o status de erro e uma mensagem amigável. Também aprendemos a lançar exceções personalizadas em nosso código, utilizando a palavra-chave throws. Dessa forma, podemos tratar erros de forma mais adequada e fornecer mensagens claras aos usuários.

### - Live reload

Nesta aula, vamos aprender sobre o DevTools, uma dependência do Spring Boot que facilita o desenvolvimento de aplicações. O DevTools oferece recursos como Live Reload, que permite que a aplicação seja recarregada automaticamente sempre que houver uma alteração no código. Vamos ver como adicionar essa dependência ao nosso projeto, seja através do Maven ou do VS Code, e também como executar a aplicação usando o Maven CLI ou o modo de Debug do VS Code. Com o DevTools, podemos agilizar o processo de desenvolvimento e visualizar as alterações em tempo real.

### - Deploy

Nesta aula, aprendemos como colocar nossa aplicação Spring Boot em produção utilizando a plataforma render.com. Exploramos as opções gratuitas disponíveis, mas também discutimos as limitações desses ambientes compartilhados. Para começar, fizemos o cadastro no render.com e autenticamos usando o GitHub. Em seguida, fizemos uma alteração no código do projeto, criando um arquivo Dockerfile para configurar a imagem de construção da nossa aplicação. Utilizamos comandos como "expose" e "copy" para definir as configurações necessárias. Por fim, fizemos o push do código para o render.com e criamos um webservice, configurando o ambiente de execução e a versão gratuita. Testamos a aplicação e discutimos as opções de escalabilidade e uso de bancos de dados. O render.com é uma ótima opção para colocar nossa aplicação Spring Boot em produção de forma simples e eficiente.