# [compose-icons](https://github.com/DevSrSouza/compose-icons)

Compose icons is a pack of libraries that provide well known Icon Packs to use in Jetpack Compose Multiplatform (it works on Desktop and Android). The library usage is similar to Compose Material Icons.

Currently, the Jetpack Compose(Android) and Jetbrains Compose (Desktop/Multiplatform) are a separated artifact and builds, this means that for the library to support both is need artifacts for both.

In the future, when Compose Desktop and Android use the same artifact, the project will migrate to it and use only one artifact for both. 

![](https://i.imgur.com/tkN9U0B.png)

## Compose versions

- Jetpack Compose (Android): `1.0.0-aplha10`
- Jetbrains Compose (Desktop): `0.3.0-build140`

## Adding to your project

Add the project repository:
```kotlin
repositories {
    maven("https://dl.bintray.com/devsrsouza/compose")
}
```

For [Jetpack Compose (Android)](https://developer.android.com/jetpack/compose):
```kotlin
implementation("compose.icons.android:ICON_PACK:0.1.0-SNAPSHOT")
```

For [Jetbrains Compose (Desktop)](https://www.jetbrains.com/lp/compose/):
```kotlin
implementation("compose.icons.jetbrains:ICON_PACK:0.1.0-SNAPSHOT")
```

## Icon Packs

| Icon pack | Icon Version | Dependency | Code accessor |
| --- | --- | --- | --- |
| [Simple-Icons](https://simpleicons.org/) | 4.7.0 | `simple-icons` | SimpleIcons |
| [Feather](https://feathericons.com/) | 4.28.0 | `feather` | FeatherIcons |
| [Tabler Icons](https://github.com/tabler/tabler-icons) | 1.38.1 | `tabler-icons` | TablerIcons |
| [Eva Icons](https://github.com/akveo/eva-icons/) | 1.1.3 | `eva-icons` | EvaIcons |
| [Font Awesome](https://fontawesome.com/) | 5.15.2 | `font-awesome` | FontAwesomeIcons |

## How the project works

The project uses Kotlin Scripting (main.kts) to download and generate the icons into Compose source code, to generate the source code it uses the tooling library [svg-to-compose](https://github.com/DevSrSouza/svg-to-compose).

## Contribution

If you know a icon pack that the project could support, please, submit an issue :D