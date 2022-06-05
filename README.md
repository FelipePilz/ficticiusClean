# Desafio backend do TOTVS Fluig!
O desafio proposto era criar uma **API Rest** de cadastro de veículos para armazenar os veículos utilizados e também que cálcule de previsão de gastos nas viagens.


## Informações 
Para fazer esse desafio foram utilizados:
- **Java** na versão **11**;
- **SpringBoot 2.7.0** e suas dependências;
- **H2 Database** para um banco de dados em cache;
- **POSTMAN** para fazer as requisições;
- **Maven** para gerenciar as dependências;
- **IntelliJ** como IDE.

## Execução
Para execução, pelo menos com o **IntelliJ** é simples:
1. Clonar o projeto;
2. Ter o Java 11 e Maven instalado.
3. Dar um mvn clean install no terminal
4. Dar 'run' na aplicação

## Requisições principais (Todas feitas a partir do localhost:8080)
*POST* em **'/vehicles'** para adicionar um novo veículo na API
```
{
"name": "x",
"brand": "x",
"model": "x",
"manufacturingYear": xxxx,
"averageCityConsumption": x.x,
"averageHighwayConsumption": x.x
}
```

*POST* em **'/expense'** para gerar uma lista ranqueada considerando o valor do combustivel
```
{
"gasPrice": x.xx,
"kmInCity": x,
"kmInHighway": x
}
```

## Requisições extras
*GET* em **'/vehicles'** para listar todos os veículos da **API** <br>
*GET* em **'/vehicles/{id}'** para listar o veículo com id especifico <br>
*DELETE* em **'/vehicles/{id}'** para deletar o veículo com id especifico



