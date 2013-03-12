========================
BUILD OUTPUT DESCRIPTION
========================

When you build an Java application project that has a main class, the IDE
automatically copies all of the JAR
files on the projects classpath to your projects dist/lib folder. The IDE
also adds each of the JAR files to the Class-Path element in the application
JAR files manifest file (MANIFEST.MF).

To run the project from the command line, go to the dist folder and
type the following:

java -jar "Build_A_Car.jar" 

To distribute this project, zip up the dist folder (including the lib folder)
and distribute the ZIP file.

Notes:

* If two JAR files on the project classpath have the same name, only the first
JAR file is copied to the lib folder.
* Only JAR files are copied to the lib folder.
If the classpath contains other types of files or folders, these files (folders)
are not copied.
* If a library on the projects classpath also has a Class-Path element
specified in the manifest,the content of the Class-Path element has to be on
the projects runtime path.
* To set a main class in a standard Java project, right-click the project node
in the Projects window and choose Properties. Then click Run and enter the
class name in the Main Class field. Alternatively, you can manually type the
class name in the manifest Main-Class element.


========================
HOW TO USE THE PROGRAM
========================
The program has 3 hardware available for customizing the car. (Body, Window, Tyre). Each of the hardware has two models for the user to choose based upon their preference to build the car. The different hardware can be navigated using the Previous and Next button, and only one model can be selected for each hardware. Besides that, there is a textfield located below the GUI for the user to specify the speed the car should move in kilometer per hour (km/h). The Start button needs to be clicked to drive the car, and user can select hardware when the car is moving and its graphic gets updated instantly. Note that the speed cannot be change during the car is moving, unless the car is stopped by triggering the Stop button, and start again to see the car moves in the updated speed. 