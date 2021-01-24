# backyard-activities
Spring boot application to perform CURD operations 


# What does this application do

1. It has updated banner

    https://github.com/jesintha/backyard-activities/blob/master/src/main/resources/static/backyard_banner.txt

2. It creates an inmemory database with the following schema


           Id  | Activities     
          -----| -------------
           1   | Bonfire
           2   | Barbeque
           3   |Swimming
 
 
3. It does have 2 different database setup in place based on the profile, it can be a dev or a test profile. So if you run with the following VM argument, a dev dabase would be created.

            -Dspring.profiles.active=dev
     
4. It has the below REST api operations:

            GET   http://localhost:8081/backyard/activities
            GET   http://localhost:8081/backyard/activities/1
            POST  http://localhost:8081/backyard/activities
            PATCH http://localhost:8081/backyard/activities/1
            DEL   http://localhost:8081/backyard/activities/1
            
            GET   http://localhost:8081/backyard/welcome
                        The above operation loads the city from spring cloud configuration.
                          https://github.com/jesintha/spring-boot-config-repo/blob/master/backyard-activities.yml

5. It has a CORS filter implemented.

# Softwares
  Install an IDE eclipse/intellij <br />
  Install lombok jar <br /> 
    https://www.baeldung.com/lombok-ide

# Running the spring boot application
  Download the zip or clone the Git repository. <br />
    Unzip the zip file (if you downloaded one) <br />
  Open Command Prompt and Change directory (cd) to folder containing pom.xml <br />
  Open Eclipse <br />
  File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip <br />
  Select the right project <br />
  Choose the Spring Boot Application file (search for @SpringBootApplication) <br />
  Right Click on the file and Run as Java Application  <br />
