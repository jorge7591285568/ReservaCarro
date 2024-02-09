# ReservaCarro
(2023.2) Avaliação POO
Para essa avaliação deve ser desenvolvido um sistema seguindo uma arquitetura de três camadas, que consiste em uma separação clara e distinta das responsabilidades entre a apresentação, a lógica de negócios e os dados. 
Na camada de apresentação, serão implementadas as interfaces gráficas do usuário (GUI), onde os usuários interagem com o sistema. Essa camada será responsável por receber entradas do usuário, exibir informações e fornecer feedback sobre as ações realizadas.
Na camada de lógica de negócios, estarão as regras e processos que regem o funcionamento do sistema.
Aqui, serão implementadas todas as funcionalidades específicas do domínio do problema, como cálculos, validações e fluxos de trabalho. Essa camada é responsável por garantir a consistência dos dados e a execução correta das operações solicitadas pelos usuários.
Por fim, na camada de dados, serão gerenciados o acesso e a manipulação dos dados do sistema. 
Isso inclui a comunicação com o banco de dados, lista em memória ou qualquer outro mecanismo de armazenamento de dados utilizado. Essa camada será responsável por realizar operações de leitura, escrita e atualização nos dados do sistema, seguindo as regras definidas na camada de lógica de negócios.
Para a atividade proposta, você deve seguir um modelo de implementação que defina métodos padrões para todas as classes que representam entidades manipuláveis pelo usuário.
Por exemplo, para um sistema de biblioteca digital, a classe Livro poderia ter métodos como adicionar, remover e pesquisar, para um sistema de frota de veículo a classe Carro poderia ter métodos como adicionar, remover e pesquisar, etc.
Implemente uma classe chamada Entidade que encapsule comportamentos e atributos comuns a todas as entidades manipuláveis pelo sistema. Essa classe pode conter métodos ou atributos compartilhados entre diferentes entidades, como identificador único, data de criação, data de modificação, etc.
Utilize tratamento específicos para lidar com possíveis excepcionalidades durante a execução do sistema. Crie tratamentos personalizados que representem situações específicas e inesperadas que podem ocorrer durante a interação do usuário com o sistema, como tentativa de adicionar um livro duplicado na biblioteca, tentativa de reservar um quarto de hotel em uma data já ocupada, etc.
Certifique-se de lançar e capturar essas exceções de forma adequada, fornecendo mensagens claras e instruções para o usuário sobre como lidar com o problema.
Sistema de Reservas de Carros:

Crie um sistema para reservar carros de aluguel. 
Existem diferentes tipos de carros disponíveis, como compactos, sedans, SUVs, etc.
Cada um com informações como marca, modelo, ano e capacidade de passageiros. 
Os clientes podem fazer reservas para datas específicas e escolher o tipo de carro. 
O sistema deve verificar a disponibilidade de carros e calcular o preço total da reserva com base no tipo de carro escolhido e no período de locação.
