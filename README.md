# cd2sbgnml-webservice
An easily deployable small webservice to translate CellDesigner-SBGN-ML files with cd2sbgnml

#Sending Requests
##CellDesigner to SBGN-ML Conversion
```
curl -X POST --data "xml=$(cat src/main/resources/example.xml)" http://localhost:4567/cd2sbgnml
```
##SBGN-ML to CellDesigner Conversion
```
curl -X POST --data "xml=$(cat src/main/resources/example.sbgn)" http://localhost:4567/sbgnml2cd
```