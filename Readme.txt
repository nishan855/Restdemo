/////////////////////////////////////////////////////////////////
Question 7 (only). Refer to other repo for 1-6.
////////////////////////////////////////////////////////////////

This part is completed with spring boot as a maven project.


JDK version: Open-JDK 16
IDE: IntelliJ (mine)
Testing: Postman

Dependencies: spring-boot-starter-web

////////////////////////////////////////////////////////////////////
Run Confguration and setup
////////////////////////////////////////////////////////////////////

1. Clone to github repo.
2. Choose the root directory(Restdemo) and Open existing project.
3. Run as a single springBoot Application.

/////////////////////////////////////////////////////////////////////
  Request Testing (Postman)
//////////////////////////////////////////////////////////////////////

1. Testing the Post Method (addEmployee)
        - go to url: localhost:8080/addEmployee
        -  Choose "Post" as method. (get request not allowed)
        - send JSON object as the body.
                for that: select Body -> raw -> and put your object(JSON)

                for example:
                       {
                           "id" : "456",
                           "name": "Decartes",
                           "gender": "male"
                       }
         - Send Request to the addEmployee API.


 2. Testing the get Method (filterEmployee)
           - go to url: localhost:8080/addEmployee
           - go to url: localhost:8080/filterEmployee
           - Choose "GET" as method. (Post request not allowed)
           -Send gender parameters you want to filter.
                 for that: Select Params, On key put gender, on Value put Male (or any other gender you want to filter)
                        key: gender    Value: Maler (or Whatever based on filtration)
           - You will receive response as an Array of object in JSON.