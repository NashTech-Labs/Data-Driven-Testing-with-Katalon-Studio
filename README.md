# Data Driven Testing with Katalon Studio

Katalon Studio is a codeless automation tool. It serves as a single tool to automate test cases for  multiple platforms. 

## What is Data Driven Testing

Data Driven Testing is when the test data is derived from external data sources such as CSV, spreadsheets etc.

## What are the various DDT methods supported by Katalon Studio

Katalon Studio supports various methods to bind the values in test cases using external sources. Katalon Studio currently provides the support for following external file sources :

Using CSV
Using Excel
Using Database

## Execution Steps: 

### Data Driven Testing using CSV

1. Go to Data Files
2. Edit DataSet_CSV.dat file 
3. Add your file path: `<dataSourceUrl>Your file location</dataSourceUrl>`
4. Save
5. Open the project in Katalon Studio
6. Add Your Test Case in the Suite
7. Run the suite

### Data Driven Testing using Excel

1. Go to Data Files
2. Edit DataSet_Excel.dat file 
3. Add your file path: `<dataSourceUrl>Your file location</dataSourceUrl>`
4. Save
5. Open the project in Katalon Studio
6. Add Your Test Case in the Suite
7. Run the suite

### Data Driven Testing using Database

1. Using Global Configuration
  -Go to settings > external
   -Open com.kms.katalon.core.db.DatabaseSettings.properties
   -Change the URL in format : jdbc:mysql://host:port/DB_NAME
   -Add your username and password (encrypted form)
   -Save
   -Open the project in Katalon Studio
   -Add Your Test Case in the Suite
   -Run the suite
   
2. Using Local configuration
   -Go to Data Files
   -Edit DataSet_Database.dat file
   -Set `<usingGlobalDBSetting>false</usingGlobalDBSetting>`
   -Add you query between `<query>SQL query</query>`
   -Add the URL, user and password in tags `<dataSourceUrl>`, `<user>` and `<password>`
   -Open the project in Katalon Studio
   -Add Your Test Case in the Suite
   -Run the suite
