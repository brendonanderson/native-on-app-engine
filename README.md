# native-on-app-engine
Sample project for running a natively compiled Java application on Google App Engine

## Prerequisites:
- Install SDKMan to manage versions of various software: `https://sdkman.io/install`
- Install GraalVM - `sdk install java 22.1 .0.r17-grl`
- Install native-image from GraalVM - `gu install native-image` https://www.graalvm.org/22.0/reference-manual/native-image/
- Install Gradle - `sdk install gradle`
- Install Micronaut CLI - `sdk install micronaut`
- Create Micronaut project and directory - `mn create-app com.improving.native-on-app-engine --build=gradle --lang=java --features=graalvm`
- Install zlib and musl in order to statically compile the code properly - `https://www.graalvm.org/22.1/reference-manual/native-image/StaticImages/#prerequisites`
- Install gcloud cli: `https://cloud.google.com/sdk/docs/install`
- Create a project in Google App Engine standard environment
- Set the project ID in the `appengine` configuration in `build.gradle`


To set the environment to the local profile, set the environment variable `MICRONAUT_ENVIRONMENTS=local`