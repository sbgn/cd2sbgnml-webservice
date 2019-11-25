# cd2sbgnml-webservice
An easily deployable webservice to translate CellDesigner and SBGN-ML files in both directions using [cd2sbgnml](https://github.com/sbgn/cd2sbgnml) library. Choose a port number to deploy the web service, will be mentioned as ```your_port_number``` in this file.

**A sample deployment of this webservice can be found in [Newt](http://web.newteditor.org/) under the File menu. ```File | Import | CellDesigner```  imports a map in a CellDesigner file to SBGNML and displays in Newt. Similarly, one can export the current SBGN map into CellDesigner file using ```File | Export | CellDesigner File```.**

# Sending Requests
## CellDesigner to SBGN-ML Conversion
```
curl -X POST --data "xml=$(cat src/main/resources/example.xml)" http://localhost:your_port_number/cd2sbgnml
```
## SBGN-ML to CellDesigner Conversion
```
curl -X POST --data "xml=$(cat src/main/resources/example.sbgn)" http://localhost:your_port_number/sbgnml2cd
```

# Install 
## Install cd2sbgnml jar to local Maven repository
```
mvn install:install-file -Dfile=lib/cd2sbgnml-0.4.4-app.jar -DgroupId=fr.curie -DartifactId=cd2sbgnml -Dversion=0.4.4 -Dpackaging=jar
```

## Compile/Build with Maven
```
mvn clean install
```

## Build Jar with Dependencies 
```
mvn clean package assembly:single
```

# Run webservice
```
java -jar target/cd2sbgnml-webservice-0.1-jar-with-dependencies.jar your_port_number
```
