# Unit-One-Topic-5
This repository includes my learning on topics Regular Expression, Date and Time in Java. Some Basic codes performed on Eclipse are attached in the code section.

### What are Regular Expressions in JAVA?
Regular expressions are an extremely useful tool for manipulating text. Regular expressions are heavily used in the automatic generation of Web pages. A regular expression is a kind of pattern that can be applied to text (Strings, in Java)

**Benefits of Regular Expressions**
-If a regular expression matches a part of the text, then you can easily find out which part
-If a regular expression is complex, then you can easily find out which parts of the regular expression match which parts of the text
-With this information, you can readily extract parts of the text, or do substitutions in the text

**Package-_java.util.regex_**

**Parts of Regular Expression**
1. Pattern
Pattern p = Pattern.compile("[a-z]+");
2. Matcher
Matcher m = p.matcher("Now is the time");

### Some Simple patterns
- abc		exactly this sequence of three letters
- [abc]		any one of the letters a, b, or c
- [^abc]		any character except one of the letters a, b, or c (immediately within an open bracket, ^ means “not,” but anywhere else it just means the character ^)
- [a-z]		any one character from a through z, inclusive
- [a-zA-Z0-9]	any one letter or digit

### Date and Time in JAVA 8?
**Package** 
- java.time
- java.time.LocalDate
- java.time.chrono
- java.time.format
- java.time.temporal
- java.time.zone

These all classes have predefined methods that helps us to ease our work of inserting time and date in desired format in a java application.

### JDBC - Java Database Connectivity
It is an API used to connect and execute atatements on Database with the help of Drivers. The code for implementing JDBC is uploaded above in the code section.

### ResultSet in Java
A ResultSet is a Java object that contains the results of executing an SQL query.

### Statements in JDBC
The statement interface is used to create SQL basic statements in Java it provides methods to execute queries with the database. There are different types of statements that are used in JDBC as follows:

- Create Statement
- Prepared Statement
- Callable Statement

### References
https://drive.google.com/drive/folders/1VSG3kBPCAKQb5bPb-cO5B4EujsrPEmy5

https://docs.oracle.com/javase/8/docs/api/

https://www.geeksforgeeks.org/types-of-statements-in-jdbc/
