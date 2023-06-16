# Tools and Language 
### 1. Kotlin
### 2. Figma 
### 3. Android Studio 

# Library 
### 1. Tensorflow
### 2. Retrofit 
### 3. Recycler View
### 4. Android Material 
### 5. Constraint Layout 
### 6. Priyankvasa
### 7. Okhttp

# Tengkulak and Rice Price Feature
### Diagram : 
<img src="https://i.ibb.co/mqYVczx/Diagram.png" alt="Diagram" border="0">

##### The mobile app also features a rice middleman (Tengkulak) and rice price, which are created using networking retrofit and MVVM. An API is required, an adapter is needed to display data in the Recycler View, a View Model class is needed to pass data to the Fragment and persist data from configuration changes, and Live Data is needed to keep the data up to date

# Detection Feature 
### Diagram : 
<img src="https://i.ibb.co/Z1dT3Kw/Diagram-1.png" alt="Diagram-1" border="0">

##### The TFlite model is integrated into the Android application project through the Interpreter, which acts as a bridge between the model and the application code. The image to be analyzed is fed into the TFlite model, which processes it and applies algorithms and methods learned during the training process. The analysis results are displayed in the application's output.

# Prerequisites
Before using the Android Kotlin project, ensure that you have the following prerequisites installed:

Android Studio: The latest version of Android Studio should be installed on your development machine.
Kotlin: Kotlin programming language should be set up in your Android Studio environment.

# Getting Started

The Android Kotlin project follows a standard structure. Here are the key components and directories you should be aware of:

* app directory: Contains the main application module and its related files, including the main activity, layouts, resources, and Kotlin code.
* manifests directory: Contains the AndroidManifest.xml file that declares essential information about the application, such as permissions, activities, and services.
* java directory: Contains the Kotlin source code files organized in a package structure.
* res directory: Contains various resource files, such as layouts, strings, colors, and drawables used by the application.
* build.gradle files: Contains the project-level and module-level build scripts. These files define the dependencies, configurations, and build settings for the project.
