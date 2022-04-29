# Automação de testes UI e API

## Descrição do seu projeto
Foram construídos casos de testes baseado em um ccenário definido para testes UI e API:
* Para o UI: Fazer uma compra de três produtos com usuário existen e outra criando um novo usuário.
* Para API: quatro métodos de uma API REST foram testes cuja documentação está descrita no site [API para testes](https://reqres.in/)

##	Funcionalidades
### Foram criadas dois projetos Maven no repositório [ Portifolio-MatheusQADEV](https://github.com/MatheusDEVQA/Portifolio-MatheusQADEV.git)
* No projeto **com.automationpractice**
 Temos no pacote **com/automationpractice** as classes de testes com usuário existe e uma bônus
* No projeto **projeto.api.java** as classes ApiPost(Validar os métodos PATCH e POST) e ApiGet(Para validar os métodos GET SINGLE USER e GET LIST USERS)

##	Como os usuários podem utilizá-lo;
* Para utilizar os projetos é necessário clonar o projeto do GitHub num diretório de sua preferência:
cd "diretorio de sua preferencia"
git clone [ Portifolio-MatheusQADEV](https://github.com/MatheusDEVQA/Portifolio-MatheusQADEV.git)
* Importar os dois projetos para a IDE eclipse
* Verificar as depências no POM.xml, abrir as classes de testes e executar o RUN
