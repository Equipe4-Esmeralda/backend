## Sistema de Transferência de Pacientes (STP)

Este projeto Spring Boot implementa um sistema para gerenciar transferências de pacientes entre unidades hospitalares. O sistema permite que médicos solicitem transferências, acompanhem o status das solicitações e gerenciem os detalhes das transferências aprovadas.

### Funcionalidades Principais

- Solicitação de Transferência: Médicos podem criar solicitações de transferência, especificando o paciente, o motivo da transferência, a prioridade e outras informações relevantes.
    
- Aprovação de Solicitação: As solicitações podem ser aprovadas ou rejeitadas por outros usuários autorizados.
    
- Gerenciamento de Transferências: Após a aprovação da solicitação, uma transferência é criada e pode ser gerenciada, incluindo informações sobre o meio de transporte, horários, medicamentos administrados, procedimentos, etc.

### Tecnologias Utilizadas

- Backend:
    - Spring Boot
    - Spring Data JPA (para persistência de dados)
    - Lombok (para simplificar o código)
- Banco de Dados:
    - H2 (banco de dados em memória para desenvolvimento)
    - PostgreSQL (ou outro banco de dados relacional para produção)
- Frontend:
    - JavaScript, HTML, CSS (para a interface do usuário)

### Como Executar o Projeto

#### Pré-requisitos:
- Java JDK (versão 17 ou superior)
- Maven
- Banco de dados H2 / PostgreSQL (opcional, para produção)

#### Configurar o Banco de Dados:
- Crie um banco de dados PostgreSQL (se estiver usando em produção).
- Atualize as configurações do banco de dados no arquivo application.properties.

#### Compilar e Executar:
    - Abra o terminal e navegue até a pasta raiz do projeto.
    - Execute o comando mvn spring-boot:run.

### Acessar a Aplicação:
- A aplicação estará disponível em http://localhost:8081.
- O módulo Swagger pode ser acessado em http://localhost:8081/swagger-ui/index.html

### Próximos Passos

- Implementar o frontend da aplicação (páginas HTML, formulários, etc.).
- Configurar o deploy da aplicação em um ambiente de produção.