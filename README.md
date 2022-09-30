# Kotlin Reduces Clutter

This repository highlights some differences between Java and Kotlin.  It helps demonstrates how Kotlin's syntax can be more concise yet quite readable relative to Java.

## High Level Topics Touched

Detailed below is the different topics covered and where to find the examples in each language.

### Getters/Setters vs Kotlin Data Class
- Java: JavaGetAndSet
- Kotlin: KotlinGetAndSet
- Test: GetAndSetTest

### Lambda definitions
- Java: JavaLambda, FilterLambda
- Kotlin: KotlinLambda
- Test: KotlinLambdaTest

### Type aliases
- Java: JavaNoAliases
- Kotlin: KotlinHasAliases

### Parameter Passing
- Java: JavaParameters
- Kotlin: KotlinParameters
- Test: ParameterPassingTest

### Text Blocks and String Interpolation
- Java: JavaString
- Kotlin: KotlinString
- Test: StringTest

### Null Safety
- Java: LackOfNullSafety
- Kotlin: NullSafety
- Test: NullSafetyTest

### Smart Casting
- Java: LessSmartCasting
- Kotlin: SmartCasting
- Test: SmartCastingTest

### Type Inference
Basically in every Kotlin file

### Gradle DSL
The project was built with Kotlin's Gradle DSL, which can be viewed in build.gradle.kts.

## How to compile/run tests

The only requirements to use this are Java's JDK 1.8 and internet access. Gradle will handle the rest of the dependencies.

### Windows

From the command prompt/PowerShell

```powershell
gradlew.bat build
```

### MacOS/Linux
From your shell of choice

```bash
./gradlew build
```
