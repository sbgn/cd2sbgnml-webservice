# cd2sbgnml-webservice
An easily deployable small webservice to translate CellDesigner-SBGN-ML files with cd2sbgnml

# Sending Requests
## CellDesigner to SBGN-ML Conversion
```
curl -X POST --data "xml=$(cat src/main/resources/example.xml)" http://localhost:4567/cd2sbgnml
```
## SBGN-ML to CellDesigner Conversion
```
curl -X POST --data "xml=$(cat src/main/resources/example.sbgn)" http://localhost:4567/sbgnml2cd
```

# Install 
## Install cd2sbgnml jar to local Maven repository
```
mvn install:install-file -Dfile=lib/cd2sbgnml-0.4.3-app.jar -DgroupId=fr.curie -DartifactId=cd2sbgnml -Dversion=0.4.3 -Dpackaging=jar
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
java -jar target/cd2sbgnml-webservice-0.1-jar-with-dependencies.jar 
```