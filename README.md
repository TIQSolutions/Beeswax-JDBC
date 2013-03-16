# Beeswax JDBC

This repository contains the source code for the beeswax jdbc driver, a tool for connecting to impala using the jdbc interface.
Note that impala is an open source project by cloudera using a SQL dialect (HiveQL) to query data from a hadoop cluster.  
Impala is also available on [github](https://github.com/cloudera/impala).

## Getting started

### Prerequisites

For using the driver, you need to have a properly installed [hadoop](http://hadoop.apache.org/) cluster environment, running [impala](http://blog.cloudera.com/blog/2012/10/cloudera-impala-real-time-queries-in-apache-hadoop-for-real/) on it.
Especially the DNS settings have to be consistent, because hadoop uses hostnames frequently. 
We assume that your impala service is started and well configured. If you are able use impala with the command line interface, you'll be alright.       

#### Referenced TIQ libraries

We built this project using our jdbc driver generation stack. To create the driver on your own, you need to install these tools in your local maven repository (mvn install).
Of course they are open source software too and you can checkout them on github:

[JDBC-Annotations](https://github.com/TIQSolutions/JDBC-Annotations) - only needed at build time

[JDBC-Utils](https://github.com/TIQSolutions/JDBC-Utilities) - runtime dependency

You must build them considering the instructions on their project sites. 

#### Build the project
This project is built with maven. You should install maven on your operating system to be able to build the project. 
Use 'mvn -package' in the root directory of the project (the project's POM file is located there). 
After a successful build process it will generate a zip file in the "target" folder, containing the driver jar and the dependencies of it in a "lib" sub directory.

**Note** that the tests of the driver will require some data in impala. Therefore, you should skip the tests. 

### Usage

After building, you can extract the generated zip file in a directory of your choice. 
Then you can connect with an arbitrary tool (Sqirrel SQL, Execute Query, ... etc) or using the java programming language. 
The full qualified driver name is: 

```java
de.tiq.beeswax.jdbc.BeeswaxDriver
```

#### Connection URL

The connection URL for the driver looks like this:

**jdbc:beeswax://host:port/<database>**


**Example:**

_jdbc:beeswax://slave1.impala.cloudera:21000/default_

## Developer info
  
Note that this driver is in beta state. Some errors might be raised during the query process.

Please report them to us using the issue feature on the github site.  

## Colophon		

### Company

This project is developed by TIQ Solutions GmbH, a german enterprise for data quality management.
You can contact us: info@tiq-solutions.de 

### License 

The project is licensed under terms of a dual treatment. For non-commercial projects, the source code is provided under terms of the [GPL](http://www.gnu.org/licenses/gpl-2.0.html).
If you wish to include this project in a proprietary context, you must be granted a special vendor license.   