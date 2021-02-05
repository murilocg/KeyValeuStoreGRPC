# Key Store GRPC

Aplicação de armazenamento Key Store em Java

## Alunos integrantes da equipe

* Murilo Costa Gonçalves
* João Pedro Teles de Andrades Pereira

## Instruções de utilização

## Requisitos

- Java 13
- Maven 3.6.X
- Protoc
- protoc-gen-grpc-java Plugin

### Código compilatos

Para executar o código com os arquivos .jar baixe nas releases do projeto os arquivos server.jar e client.jar.

#### Executando o servidor

Para iniciar o servidor execute o seguinte comando `java -jar server.jar` , o servidor irá iniciar na porta 50051 da máquina.

#### Executando o Client

O Cliente pode executar 3 ações distintas: put, get e getAllKeys.

* put: recebe os parâmetros key e value.
* get: recebe o parâmetro key e retorna o valor armazenado no servidor.
* getAllKeys: retorna todas as keys armazenadas no servidor.

Para executar o cliente siga o padrão `java -jar client.jar <serverHost>:<serverPort> <action> <p1> <p2>`

- serverHost: O host do servidor
- serverPort: A porta que o servidor está executando, nesse caso será a 50051.
- action: put, get ou getAllKeys.
- <p1> e <p2>: parâmetros para as ações.
  
Exemplos de execução do client:

* PUT: `java -jar client.jar localhost:50051 put nome Joãozinho`
* GET: `java -jar client.jar localhost:50051 get nome`
* GETALLKEYS: `java -jar client.jar localhost:50051 getAllKeys`

### Compilando o código

Caso seja necessário compilar o código na pasta scripts temos o script compila.bat, para Windows, que irá gerar código para o GRPC e compilar o client e o servidor com o Maven. Para gerar o código do GRPC será necessário que você tenha na máquina o protoc e o plugin protoc-gen-grpc-java instalados. Uma vez, gerado o código basta executa-la como uma aplicação java normal.
