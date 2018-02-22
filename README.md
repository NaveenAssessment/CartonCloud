# CartonCloud
Java Dev Test

Carton Cloud Assignment

Assumptions:
1.	Used Jackson for JSON to POJO objects

Git Hub Repository
https://github.com/NaveenAssessment/CartonCloud

SOFTWARE USED
1. Java 8 
2. Spring Boot 1.5.10.RELEASE 
3. Maven 3.3.9 
4. Jackson2 for json to pojo mapping
5. Spring fox  2.6.1 for Swagger Open API
6. IDE - Spring Tool Suit


STEPS TO RUN THE APPLICATION AS JAVA APPLICATION AND INVOKE REST API

Note:
- This application is packaged as a jar, which has Tomcat 8, embedded in
Spring Boot Application.
- Make sure you are using JDK 1.8 and Maven 3.x
- Application runs on default tomcat port 8080. 

DESIGN AND SOLUTION APPROACH 

Spring Boot Starter Class
- OrderServiceApiApplication.java Spring Boot framework is used to develop the service

Rest Controller
- PurchaseOrderController.java Order Management API service is exposed as a rest service

Service Class
-	PurchaseOrdersService.java Service class to fetch ProductOrderDetails through rest services.
-	OrderCalculationService.java Provides business logic for total calculation
-	OrderTotalServiceImpl.java Service Orchestration class

Config Class
-	BeanConfig.java Spring Bean configuration class for RestTemplate
-	SecurityConfig.java Security Config class for Basic Authentication



Testing with Postman

Enter Basic Authentication and URL details 

“demo:pwd1234”
POST http://localhost:8080/test


Specify Content-Type – application/JSON


Enter Request under body section in JSON Format
{ "purchase_order_ids": [2344, 2345, 2346] }


 

JSON Response

[
    {
        "product_type_id": 1,
        "total": 41.5
    },
    {
        "product_type_id": 2,
        "total": 13.8
    },
    {
        "product_type_id": 3,
        "total": 0
    }
]
