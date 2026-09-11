```bash
# Padrão Factory Method - Ferramentas de Segurança

Implementação do padrão de projeto **Factory Method** em Java, demonstrando a criação de objetos de forma flexível e desacoplada.

## Descrição

Este projeto implementa o padrão Factory Method para criar diferentes tipos de ferramentas de segurança sem expor a lógica de criação ao código cliente. O padrão permite que o sistema seja estendido com novas ferramentas sem modificar o código existente, seguindo o **Princípio Aberto/Fechado (Open/Closed Principle)**.

### Contexto
O sistema gerencia diferentes ferramentas de cibersegurança:
-  **Criptografia** - Aplicação de algoritmos de criptografia
-  **Logger** - Registro de logs de segurança
-  **Scanner** - Varredura de vulnerabilidades
-  **Backup** - Backup seguro de dados

## Estrutura do Projeto
src/
── main/
│ └── padroescriacao/factorymethod/
│ ├── IFerramentaSeguranca.java (Interface comum)
│ ├── SegurancaFactory.java (Factory que cria as ferramentas)
│ ├── FerramentaCriptografia.java (Implementação concreta)
│ ├── FerramentaLogger.java (Implementação concreta)
│ ├── FerramentaScanner.java (Implementação concreta)
│ ├── FerramentaBackup.java (Implementação concreta)
│ └── FerramentaInvalida.java (Classe para teste de exceção)
│
└── test/
── padroescriacao/factorymethod/
├── SegurancaFactoryTest.java
├── FerramentaCriptografiaTest.java
├── FerramentaLoggerTest.java
├── FerramentaScannerTest.java
└── FerramentaBackupTest.java

## Padrão Factory Method

### Problema Resolvido
Sem o Factory Method, o código cliente precisaria instanciar diretamente cada classe concreta, criando acoplamento forte. Com o padrão:
- A criação de objetos é centralizada na Factory
- O código cliente depende apenas da interface
- Novas ferramentas podem ser adicionadas sem modificar o cliente
- Tratamento de erros centralizado (classes inválidas ou inexistentes)

### Componentes
- **IFerramentaSeguranca**: Interface comum com métodos `executar()` e `cancelar()`
- **Ferramentas Concretas**: Implementações específicas de cada ferramenta
- **SegurancaFactory**: Factory que cria instâncias baseadas em parâmetros
- **Tratamento de Exceções**: Validação de classes inválidas e inexistentes

## Testes

O projeto possui **10 casos de teste** implementados com **JUnit 5**, cobrindo:
- Execução e cancelamento de cada ferramenta
- Tratamento de exceção para ferramenta inexistente
- Tratamento de exceção para classe inválida (que não implementa a interface)

### Como Executar os Testes

1. Abra o projeto no **IntelliJ IDEA**
2. Clique com o botão direito na pasta `test`
3. Selecione **Run 'All Tests'**
4. Verifique se todos os testes passam (barra verde)

Ou via terminal:
```bash
mvn test

## Diagrama de Classes

O diagrama UML está disponível na imagem diagrama-factory-method.png e mostra:
A interface IFerramentaSeguranca
As 4 implementações concretas
A factory SegurancaFactory
A classe de teste SegurancaFactoryTest
A classe FerramentaInvalida (para validação de exceções)
️
## Tecnologias
Java 21
JUnit 5 (JUnit Jupiter)
IntelliJ IDEA
Maven (gerenciamento de dependências)
Draw.io (diagrama UML)

## Conceitos Aplicados

- Padrão Criacional Factory Method
- Programação orientada a interfaces
- Princípio da Responsabilidade Única (SRP)
- Princípio Aberto/Fechado (OCP)
- Testes Unitários com JUnit
- Reflexão (Reflection) para instanciação dinâmica
