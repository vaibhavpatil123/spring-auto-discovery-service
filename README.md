spring-auto-discovery-service
https://github.com/vaibhavpatil123/spring-auto-discovery-client-eureka/blob/master/README.md

1 About this example 

This example can help to understand quickly - Spring Cloud Netflix – Eureka service registery design pattern 

What is Pattern: Service registry?
it is micro service application pattern used to discover services without hard coded URLS of service. Helpful for client and server side load balancing 
Refer 
http://microservices.io/patterns/service-registry.html



2 How to build 
Build 2 applications using maven 
https://github.com/vaibhavpatil123/spring-auto-discovery-client-eureka 
https://github.com/vaibhavpatil123/spring-auto-discovery-service 

2 How to run 
Run 1st https://github.com/vaibhavpatil123/spring-auto-discovery-service  application 

Output would be 
http://localhost:8761/ running service regisery 


Then run client https://github.com/vaibhavpatil123/spring-auto-discovery-client-eureka app 
output would be for page url http://<autoUrl>1:8181/hi 
  Hello from EurekaClient!
  
  here autoUrl generated using service regisery refer -Instances currently registered with Eureka>>Status seaction for this 
  
  Some referance links 
  

https://stackoverflow.com/questions/8662919/jersey-no-webapplication-provider-is-present-when-jersey-dependency-added/8740721
https://stackoverflow.com/questions/32616329/eureka-never-unregisters-a-service
 
