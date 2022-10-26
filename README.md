# cr-resume.io


This is a project for automating resume creation for free

## Test before pulling it
you can test endpoints: http://164.92.229.130:8080/swagger-ui/index.html

## Getting Started

Clone the project and run localhost:8080/swagger-ui/index.html. You will see bunch of api endpoints. To get started working with api, There is a json file named test.json, run endpoint "/resume/create"
with this json as request body. Then get id from response and use second endpoint named "/resume/generateAsPDF", give id as request param. After that click download file url.

### Prerequisites

Before getting started, You should customized datasource properties. I used postgresql but you can use any database of your choice.
```
spring.datasource.url=jdbc:<database_name>://<host_name>:<port>/<database>
spring.datasource.driverClassName=<driver_name>
spring.datasource.username=<datasource_username>
spring.datasource.password=<password>
```

Additionally you can add more templates but keep in mind that it should be ftl or ftlh file not html because I have used freemarker template engine to resolve template.
If code do not run or request can't be sent, there can be two possible mistakes : First there is syntax error at ftl file that freemarker can require object that's not given by backend.
Second: Request can not be sent due to mistake at json file so validate json beforehand. 



## Built With

* [Spring](http://www.docs.spring.io/1.0.2/docs/) - The java framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [Postgresql](https://org.postgresql.com) - Used to save datasources
* [Freemarker](https://freemarker.apache.org) - Used for template resolving
* [Itext7](https://kb.itextpdf.com) - Used for generating pdf and converting html to pdf
* etc
