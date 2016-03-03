# spock-poc
Para utilizar a IDE do Eclipse, devem ser feitos os seguintes passos:
1. Instale o plugin do Groovy no Eclipse.
2. Para que seja possível também visualizar cobertura de testes unitários, instale também o Eclemma
3. Crie um projeto Groovy, importando o fonte.
4. Selecione as seguintes pastas na aba Source Folder do Build Path:
	* src/main/java
	* src/test/groovy
5. Selecione a pasta src/test/groovy e configure o seguinte diretório como Output Folder: target/test-classes
6. Compile o projeto através do maven
7. Habilite o Eclemma para o projeto para ver a cobertura dos testes
8. Rode os testes através da opção JUnit Test.
