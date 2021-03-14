# [compose-icons](https://github.com/DevSrSouza/compose-icons)

Compose icons is a pack of libraries that provide well known Icon Packs to use in Jetpack Compose Multiplatform. The library usage is inspired by Compose Material Icons.

![](https://user-images.githubusercontent.com/29736164/111044124-6b131080-8425-11eb-9b03-0d3b409377a5.png)

## Compose versions

- Jetpack Compose (Android): `1.0.0-beta01`
- Jetbrains Compose (Desktop): `0.3.1`

## Adding to your project

Add the project repository:
```kotlin
repositories {
    mavenCentral()
}
```

For [Jetpack Compose (Android)](https://developer.android.com/jetpack/compose):
```kotlin
implementation("br.com.devsrsouza.compose.icons.android:ICON_PACK:0.1.1")
```

For [Jetbrains Compose (Desktop)](https://www.jetbrains.com/lp/compose/):
```kotlin
implementation("br.com.devsrsouza.compose.icons.jetbrains:ICON_PACK:0.1.1")
```

## Example

```kotlin
Icon(
    imageVector = FontAwesomeIcons.Brands.Github,
)
```

## Icon Packs

| Icon pack | Icon Version | Dependency | All Icons Docs |
| --- | --- | --- | --- |
| [Simple-Icons](https://simpleicons.org/) | 4.14.0 | `simple-icons` | [docs](simple-icons/DOCUMENTATION.md) |
| [Feather](https://feathericons.com/) | 4.28.0 | `feather` | [docs](feather/DOCUMENTATION.md) |
| [Tabler Icons](https://github.com/tabler/tabler-icons) | 1.39.1 | `tabler-icons` | [docs](tabler-icons/DOCUMENTATION.md) |
| [Eva Icons](https://github.com/akveo/eva-icons/) | 1.1.3 | `eva-icons` | [docs](eva-icons/DOCUMENTATION.md) |
| [Font Awesome](https://fontawesome.com/) | 5.15.2 | `font-awesome` | [docs](font-awesome/DOCUMENTATION.md) |

## How the project works

The project uses Kotlin Scripting (main.kts) to download and generate the icons into Compose source code, to generate the source code it uses the tooling library [svg-to-compose](https://github.com/DevSrSouza/svg-to-compose).

Currently, the Jetpack Compose(Android) and Jetbrains Compose (Desktop/Multiplatform) are a separated artifact and builds, this means that for the library to support both is need artifacts for both.

In the future, when Compose Desktop and Android use the same artifact, the project will migrate to it and use only one artifact for both.

## Contribution

If you know a icon pack that the project could support, please, submit an issue :D