Projeto de Automação de API

Exemplo básico de um projeto de automação para testar APIs (Backend).

Java + RestAssured + TestNG + mvn

Instalação:

    Certifique-se de ter configurado e instalado o Java em seu computador. O JDK 1.8 deve estar adequado. Recurso: https://java.com/en/download/help/download_options.html
    Você também precisará do Maven. Guia do Maven: https://maven.apache.org/install.html

Desejável:

    Um IDE, como o IntelliJ. Se estiver usando o Eclipse, também deve funcionar bem. https://www.jetbrains.com/es-es/idea/download/ (Certifique-se de baixar a versão Community, não a Ultimate)

Como executar os testes:

    Certifique-se de importar este projeto como um projeto Maven, em vez de apenas abrir a pasta principal.
    Se estiver usando o IntelliJ, você pode ir para a guia Maven e atualizar o projeto (opção Recarregar Todos os Projetos Maven), se estiver usando outro IDE ou nenhum IDE, vá para o terminal/console, vá para a localização do seu projeto e execute:

            mvn clean install

    Vá para a pasta do seu projeto > AutomationApiProject > src/test/testngRunners/ > arquivo SingleTest.xml > clique com o botão direito e execute
    Uma nova janela será aberta e, após alguns milissegundos, você obterá algo assim:

markdown

===============================================
 Suite de Automação de API
 Total de testes executados: 1, Falhas: 0, Ignorados: 0
===============================================

Processo finalizado com código de saída 0

Se ocorrer uma falha, pode ser um erro simples de endpoint,

se ocorrer um erro, certifique-se de que todas as dependências/pacotes Maven estejam totalmente instalados antes de executar (isso pode levar algum tempo)

Suites Disponíveis:

Existem pelo menos três tipos de suites de regressão neste projeto:

    Teste de Smoke: /src/test/testngRunners/SingleTest.xml
    Teste de Sanidade: /src/test/testngRunners/SanityApiRegression.xml
    Regressão Completa: /src/test/testngRunners/FullApiRegression.xml

se você já instalou o TestNG, basta clicar com o botão direito > executar '<seuarquivo>Regression.xml' ou para executar todos os testes, use este arquivo:
testng.xml

![alt text](https://github.com/cvera08/AutomationApiProject/blob/master/src/main/resources/Images/AutomationApiProject_–_API_Suites.png)

![alt text](https://github.com/cvera08/AutomationApiProject/blob/master/src/main/resources/Images/Test_Results_—_testng_xml.png)

**To dig in a bit more - Main Library documentation:** 
- https://rest-assured.io/
- - Github / Get Started: https://github.com/rest-assured/rest-assured/wiki/GettingStarted
