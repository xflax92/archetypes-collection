# archetypes-collection
Maven archetype with spring-boot and rest endpoint integration example with embedded H2 database.

# Using the archetype

## Installing it
Once you have cloned the reopository, from archetype-springboot-rest directory you can install it by default with the next command.

mvn clean install

After that you should have in your .m2 directory the next route com\xflax\archetypes\rest-archetype\1.0

## Creating the project
mvn archetype:generate -DarchetypeGroupId=com.xflax.archetypes -DarchetypeArtifactId=rest-archetype -DarchetypeVersion=1.0 -DgroupId=com.xflax.restful -DartifactId=rest-sample -Dversion=1.0.0-SNAPSHOT