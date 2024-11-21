# [compose-icons](https://github.com/DevSrSouza/compose-icons)

Compose Multiplatform icons is a pack of libraries that provide well known Icon Packs. The library usage is inspired by Compose Material Icons.

## Compose Support
- Android
- Desktop
- iOS
- MacOS Native
- Web (JSCanvas)
- Wasm JS

![](https://user-images.githubusercontent.com/29736164/111044124-6b131080-8425-11eb-9b03-0d3b409377a5.png)

## Adding to your project

Add the project repository:
```kotlin
repositories {
    mavenCentral()
}
```

```kotlin
implementation("br.com.devsrsouza.compose.icons:{ICON_PACK}:1.1.1")
```

** `{ICON_PACK}` is a placeholder, you should replace it with your icon pack of choose.

example: `br.com.devsrsouza.compose.icons:font-awesome:1.1.1`

## Example

```kotlin
Icon(
    imageVector = FontAwesomeIcons.Brands.Github,
)
```

You can find all code reference in the docs of the icon packs bellow.

## Icon Packs

| Icon pack | Icon Version | Dependency | All Icons Docs |
| --- | --- | --- | --- |
| [css.gg](https://css.gg) | 2.1.1 | `css-gg` | [docs](css-gg/DOCUMENTATION.md) |
| [Erik Flowers' Weather Icons](https://github.com/erikflowers/weather-icons) | 2.0.12 | `erikflowers-weather-icons` | [docs](erikflowers-weather-icons/DOCUMENTATION.md) |
| [Eva Icons](https://akveo.github.io/eva-icons) | 1.1.3 | `eva-icons` | [docs](eva-icons/DOCUMENTATION.md) |
| [Feather](https://feathericons.com) | 4.29.2 | `feather` | [docs](feather/DOCUMENTATION.md) |
| [Font Awesome](https://fontawesome.com) | 6.6.0 | `font-awesome` | [docs](font-awesome/DOCUMENTATION.md) |
| [Line Awesome](https://icons8.com/line-awesome) | 1.3.1 (78a1012) | `line-awesome` | [docs](line-awesome/DOCUMENTATION.md) |
| [Linea](https://github.com/linea-io/Linea-Iconset) | 1.0 | `linea` | [docs](linea/DOCUMENTATION.md) |
| [Octicons](https://primer.style/octicons) | 19.12.0 | `octicons` | [docs](octicons/DOCUMENTATION.md) |
| [Simple-Icons](https://simpleicons.org) | 13.16.0 | `simple-icons` | [docs](simple-icons/DOCUMENTATION.md) |
| [Tabler Icons](https://tabler-icons.io) | 3.22.0 | `tabler-icons` | [docs](tabler-icons/DOCUMENTATION.md) |

## Version Catalog

```toml
[versions]
composeIcons = "1.1.1"

[libraries]
composeIcons-cssGg = { module = "br.com.devsrsouza.compose.icons:css-gg", version.ref = "composeIcons" }
composeIcons-weatherIcons = { module = "br.com.devsrsouza.compose.icons:erikflowers-weather-icons", version.ref = "composeIcons" }
composeIcons-evaIcons = { module = "br.com.devsrsouza.compose.icons:eva-icons", version.ref = "composeIcons" }
composeIcons-feather = { module = "br.com.devsrsouza.compose.icons:feather", version.ref = "composeIcons" }
composeIcons-fontAwesome = { module = "br.com.devsrsouza.compose.icons:font-awesome", version.ref = "composeIcons" }
composeIcons-lineAwesome = { module = "br.com.devsrsouza.compose.icons:line-awesome", version.ref = "composeIcons" }
composeIcons-linea = { module = "br.com.devsrsouza.compose.icons:linea", version.ref = "composeIcons" }
composeIcons-octicons = { module = "br.com.devsrsouza.compose.icons:octicons", version.ref = "composeIcons" }
composeIcons-simpleIcons = { module = "br.com.devsrsouza.compose.icons:simple-icons", version.ref = "composeIcons" }
composeIcons-tablerIcons = { module = "br.com.devsrsouza.compose.icons:tabler-icons", version.ref = "composeIcons" }
```

## Roadmap
- Add more icon packs
- Migrate code generator to Gradle
- Remove icons source from repository and check the abi when generate.
- Improve sample app
- Documentation to how add icon packs

## How the project works

The project uses Kotlin Scripting (main.kts) to download and generate the icons into Compose source code, to generate the source code it uses the tooling library [svg-to-compose](https://github.com/DevSrSouza/svg-to-compose).

## Contribution

If you know a icon pack that the project could support, please, submit an issue :D

## License

The icon packs have their own license that you can find at the [All Icons Docs](#Icon-Packs)

Project license:
```
MIT License

Copyright (c) 2021 DevSrSouza

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

```

## Development

Update API Dump: `./gradlew desktopApiDump`
Checking API Dump: `./gradlew desktopApiCheck`
