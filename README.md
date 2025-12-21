Landon Hotel Scheduling Application (Spring Boot + Angular + Docker)

This project is a full-stack hotel scheduling application developed using a Java Spring Boot backend and an Angular frontend. The application was enhanced to support multithreading, internationalization, time zone conversion, and containerization, following enterprise software development practices.

Key features include a multithreaded welcome message implemented using Java threads and resource bundles to support both English and French localization, meeting Canadian bilingual requirements. The frontend displays reservation pricing in U.S. dollars, Canadian dollars, and euros, formatted for international users. The backend also includes time zone conversion logic to display online live presentation times across Eastern Time (ET), Mountain Time (MT), and UTC.

The application is fully containerized using Docker, enabling consistent deployment across environments. A Dockerfile is provided to build a single image containing the complete application. Additionally, the project includes documentation describing how the application can be deployed to cloud services such as AWS using container-based deployment strategies.

Technologies Used

Java 17

Spring Boot

Angular

Maven

Docker

Java Multithreading

Internationalization (i18n)

Java Time API
