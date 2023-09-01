# D387 – ADVANCED JAVA - PERFORMANCE ASSESSMENT 1

Below are the submission details for parts A-D.

## PART A
* This is the private external GitLab repository. It is named "000877914_D387" to follow the requested format.
* "WGU-Evaluation” has been added as a member with reporter access.
* There has been a commit after each of the required parts.

## PART B
### B1
Below are the filenames, description of changes and line numbers for parts C1, C2, C3, D2 and D3. All line numbers are based on the current version of the repository. All files are relative to src/
* C1 - Welcome Message
    * main/resources/welcome_en_US.properties
    * main/resources/welcome_fr_CA.properties
    * main/resources/welcome.properties
        * All lines in these files pertain to and were created for this part.
        * These files all serve the same purpose. They provide the translation strings for Translation.java

    * main/java/edu/wgu/d387_sample_code/l18n/Translation.java
        * All lines in this file pertain to and were created for this part.
        * The purpose of this file is to establish functions to load the resource bundles and get the welcome message.

    * main/java/edu/wgu/d387_sample_code/D387SampleCodeApplication.java
        * Lines 17-31 of this file were added for this part.
        * These lines create the instances of the translation bundles.
        * After the Translation objects are created, the resources themselves are loaded by Thread objects.

    * main/java/edu/wgu/d387_sample_code/rest/WelcomeMessageResource.java
        * All lines in this file pertain to and were created for this part.
        * This file provides the REST interface for accessing the translations for the welcome message.
    
    * main/java/edu/wgu/d387_sample_code/rest/ResourceConstants.java
        * Line 8 adds a constant for the WelcomeMessageResource request mapping.

    * main/UI/src/app/app.component.ts
        * Line 30 adds the variable to hold the welcome message strings.
        * Line 40 initializes the variable that holds the welcome message string.
        * Lines 90-92 add the function called on line 40.
        * These changes fetch the welcome message from the REST API on initialization of the page.

    * main/UI/src/app/app.component.html
        * Line 19 adds the actual message on the screen.


* C2

    * main/UI/src/app/app.component.ts
        * Line 120-121 add variables to hold new currency strings.
        * Line 58-61 add rough currency conversions to the component and stores it in the appropriate variables.
    * main/UI/src/app/app.component.html
        * Line 83-85 add new entries for currency and modify original to say "USD".

* C3
    * main/java/edu/wgu/d387_sample_code/l18n/TimeConverter.java
        * All lines in this file pertain to and were created for this part.
        * The purpose of this file is to create the string for the online meeting given an input time.

    * main/java/edu/wgu/d387_sample_code/rest/SplashTextResource.java
        * All lines in this file pertain to and were created for this part.
        * This file provides the REST interface for accessing the online meeting message.
    
    * main/java/edu/wgu/d387_sample_code/rest/ResourceConstants.java
        * Line 6 adds a constant for the SplashTextResource request mapping.

    * main/UI/src/app/app.component.ts
        * Line 31 adds the variable to hold the online meeting message string.
        * Line 39 initializes the variable that holds the welcome message string.
        * Lines 86-88 add the function called on line 39.
        * These changes fetch the online meeting message from the REST API on initialization of the page.

    * main/UI/src/app/app.component.html
        * Line 30 adds the online meeting notification to the screen.
* D2
    * Changes made in the README file under the heading of the name D2.
* D3
    * Changes made in the README file under the heading of the name D3.

### B2
The URL for this repository was submitted with the submission.

Each note should include file name, line number, and change.


## PART C
All changes were made as instructed in the assessment. Specifics are listed in part B1.

## PART D
### D1
The Dockerfile was created at the root of the solution and commited to GitLab.

### D2
Screenshots for this part were submitted separately. 
The command used to build the image was `docker build -t landon_hotel .`
The command used to run the image in a container was `docker run -it -p 8080:8080 --name D387_000877914 --rm landon_hotel`

## PART E
The needed zip file was submitted.


