# multiplatform sample

### Running iOS
- IPhone: `./gradlew :sample:iosDeployIPhone8Debug`
- IPad: `./gradlew :sample:iosDeployIPadDebug`

### Running MacOS Native app (Desktop using Kotlin Native)
```shell
./gradlew :sample:runNativeDebug
```

### Running JVM Native app (Desktop)
```shell
./gradlew :samples:multiplatform:run
```

### Running Web Compose Canvas
```shell
./gradlew :sample:jsBrowserDevelopmentRun
```

### Building Android App
```shell
./gradlew :sample:assembleDebug
```

If you want to run Android sample in the emulator, you can open the project and run the application configuration `sample` on Android Studio.
