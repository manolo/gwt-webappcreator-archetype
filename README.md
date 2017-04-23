

### An archetype to create GWT Projects based on webAppCreator Template

This is the equivalent project produced by the tool:

       $ /opt/gwt/gwt-2.8.0/webAppCreator \
           -templates readme,sample,maven \
           -out my-gwt-app com.example.MyGwtApp

#### Installing the archetype locally

1. Clone this project.

        $ git clone https://github.com/manolo/gwt-pwa-archetype.git
 
2. Assuming that you have installed maven, compile and install the archetype by running:

        $ mvn clean install

#### Using the archetype

- To create a new GWT project run:

        $ mvn archetype:generate -DarchetypeArtifactId=gwt-webappcreator-archetype \
                -DarchetypeVersion=1.0-SNAPSHOT \
                -DarchetypeGroupId=com.github.manolo \
                -DgroupId=com.example \
                -DartifactId=my-gwt-app \
                -DprojectName=MyGwtApp \
                -Dpackage=com.example 
                       
#### Compiling and running your project         

- Change to the project folder.
  - To build the GWT package execute:

            $ mvn clean package
            
- You will get a `.war` file ready for deploy in the `target` folder.

- To run the application in development mode run:

        $ mvn gwt:devmode
