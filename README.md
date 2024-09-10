
# Nearby
Nearby is a real-time app that helps people connect with others nearby who share common interests, making it easy to meet and interact locally.
It is build with Kotlin Multiplatform & Jetpack Compose following clean architecture.


## Working of Kotlin Multiplatform 
- The Kotlin compiler produces different outputs for each target platform:
    - JVM bytecode for Android and server-side applications
    - Native code for iOS and other native platforms
![image](https://github.com/user-attachments/assets/e012125b-0cf0-47ad-b516-c3b8b198f7b9)



## Project Structure of Kotlin Multiplatform 
- it consists of 3 module i.e androidApp, iosApp, shared
- Shared module is connected with androidApp using Gradle and for iosApp, the shared module is compiled into a framework using a Gradle task, which is then integrated into the Xcode project.
![image](https://github.com/user-attachments/assets/28a1afb6-be83-4ca4-bcac-44ec3536f397)


