# Desafio backend do TOTVS Fluig!

Para um banco de dados em cache foi utilizado o **H2 Database** <br>
Para mandar as requisições foram usados o **POSTMAN**

*POST* em **'/expense'** para gerar uma lista ranqueada considerando o valor do combustivel
```
{
"gasPrice": x.xx,
"kmInCity": x,
"kmInHighway": x
}
```

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
