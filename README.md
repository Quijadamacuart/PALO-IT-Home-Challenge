## PALOIT_HomeChallenge
This repository contains 2 folders separated by subtask to satisfy the requirements of the Home Challenge
    
##### It should be clarified: For the first task  the application was tested in an Android environment.***
- The first folder called FirstTask contains the markdown file with the exploratory test cases, their scenarios and the answers to the questions:
Did everything work as expected? 
What errors were discovered?
How much time did you plan to spend on each charter?

- Now, answering the question "which area of the app or testing would you explore first and why?", I must say that since we are talking about an application inherent to income and expense transactions, which is its main core, you should test first the functionalities covering the transaction types, because they are finally the critical point of the application.

- On the other hand, we should talk about what kind of risks should be mitigated for this type of applications:

    - **Errors in the calculation of transactions:** If the personal finance application has errors in the transaction calculation functionality, there could be a distortion in the user's financial information, which could lead to wrong decision making. Therefore, it is important to perform rigorous testing of the application's functionality to ensure that transaction calculations are accurate.

    - **Lack of import and export functionality:** If the application does not allow for effective import and export of financial data, the user may have difficulty accessing their financial information outside of the application, which can make it difficult to manage their money. Therefore, the application must have adequate financial data import and export functionality.

    - **Application bugs:** The application should be thoroughly tested to ensure that it is working properly and that there are no errors in its operation. Users should be informed of errors and necessary corrections to minimize the impact of any technical problems.

    - **Improper use of financial information:** The application should have measures in place to prevent the misuse of the user's financial information. This may include implementing clear and transparent privacy and data security policies, as well as verifying the completeness and accuracy of financial information.

    - **Data security:** It is important to ensure that the user's personal and financial data is protected. To this end, the application should implement appropriate security measures, such as data encryption and user authentication.

- For the second task, the PetStore Swagger environment was configured to be able to run it locally, with the only difference that I had to modify the connection port that by default comes in **Port:8080** and change it to **Port:8081**, this because I have another application in my personal computer that by default keeps that **port (8080)** busy. 

- For this, we locate the **pom.xml** file inside the **swagger-petsote-master** folder, open it with any text editing tool and look for the code fragment where the **http connection port** is set, then modify the port number and finally save the changes.The execution of the local service was done with Maven, being this one of the options in the Readme of Swagger's GitHub repository that you can see in this link [Swagger PetStore](https://github.com/swagger-api/swagger-petstore#readme).

- The test automation project for the **Swagger PetStore REST API** was developed in **JAVA** language using **Spring Boot** and **RestAssured**, under the IDE **Intellij IDEA**, the necessary libraries and dependencies can be found in the **pom.xml** file of the project, it should be noted that the **Maven dependency manager** is being used.

- For the automated testing approach, I proposed to make a **CRUD** for the pets section, because I consider that they are the basic request to test an API.
On the other hand, I chose these technologies because I wanted to venture with something I did not know, so from the day the test was sent I spent several hours to acquire the knowledge through a course on the Udemy platform entitled: "**API testing - RestAssured (Spring boot) and HTTPClient**".