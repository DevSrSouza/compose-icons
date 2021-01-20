# compose-icons

Compose icons is a pack of libraries that provide well known Icon Packs to use in Jetpack Compose Multiplatform (it works on Desktop and Android).

![](https://i.imgur.com/tkN9U0B.png)

## Icon Packs

| Icon pack | Icon Version | Dependency | Code accessor |
| --- | --- | --- |
| [Simple-Icons](https://simpleicons.org/) | 4.7.0 | TODO | SimpleIcons |
| [Feather](https://feathericons.com/) | 4.28.0 | TODO | FeatherIcons |
| [Tabler Icons](https://github.com/tabler/tabler-icons) | 1.38.1 | TODO | TablerIcons |
| [Eva Icons](https://github.com/akveo/eva-icons/) | 1.1.3 | TODO | EvaIcons |

## How the project works

The project uses Kotlin Scripting (main.kts) to download and generate the icons into Compose source code, to generate the source code it uses the tooling library [svg-to-compose](https://github.com/DevSrSouza/svg-to-compose).

## Contribution

If you know a free icon pack that the project could support, please, submit an issue :D