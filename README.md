# jqa-demo

A simple demo project for jQAssistant (http://jqassistant.org/). The following topics are covered
* Annotations
* Complex classes / methods
* Deep hierarchies
* Inner / outer dependencies
* Interface method usage
* Package cycles

The following example do currently not work due to an upgrade to jQAssistant 1.3.0
* JaCoCo coverage
* PlantUML

There are 3 basic gradle tasks for execution
* jqascan
* jqavalidate
* jqaserver


## Run JQA scan

Scans the code and stores the results in jqassistant/store.
```
./gradlew clean build jqascan
```


## Run JQA validation

Validates the rules in jqassistant/rules. There are examples for XML and AsciiDoc based rules.
```
./gradlew jqavalidate
```


## Run JQA server

Runs the Neo4j server version 3 to explore the code and help write own rules.
```
./gradlew jqaserver
```
