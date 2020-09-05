# Getting Started

Docker does not work for now

* Run MySql server on ```host:port```.
* Run project with VM param : ```-Ddb_host=host:port```, e,g ```-Ddb_host=127.0.0.1:3306```
* Check project with endpoint ```GET localhost:8181/PING``` 

Current endpoints :
* bot messages
* ```GET localhost:8181/bot-messages``` - find all
* ```GET localhost:8181/bot-messages/{id}``` - find by {id}
* ```POST localhost:8181/bot-messages``` - create
* ```PUT localhost:8181/bot-messages``` - update
- clients
* ```GET localhost:8181/clients``` - find all
* ```GET localhost:8181/clients/{id}``` - find by {id}
* ```POST localhost:8181/clients``` - create
* ```PUT localhost:8181/clients``` - update
* ```GET localhost:8181/clients/pageable?page=0&size=10%sort=name asc``` - pageable
- discounts
* ```GET localhost:8181/discounts``` - find all
* ```GET localhost:8181/discounts/{id}``` - find by {id}
* ```POST localhost:8181/discounts``` - create
* ```PUT localhost:8181/discounts``` - update
- prices
* ```GET localhost:8181/prices``` - find all
* ```GET localhost:8181/prices/{id}``` - find by {id}
* ```POST localhost:8181/prices``` - create
* ```PUT localhost:8181/prices``` - update

     
    