package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.SteamSymbol: ImageVector
    get() {
        if (_steamSymbol != null) {
            return _steamSymbol!!
        }
        _steamSymbol = Builder(name = "SteamSymbol", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.0f)
                curveTo(18.7457f, 6.0f, 16.0947f, 8.6042f, 16.0078f, 11.8379f)
                lineTo(12.3379f, 17.084f)
                curveTo(12.0659f, 17.0325f, 11.7867f, 17.0f, 11.5f, 17.0f)
                curveTo(10.5517f, 17.0f, 9.6736f, 17.2978f, 8.9473f, 17.8008f)
                lineTo(4.0f, 15.8438f)
                lineTo(4.0f, 21.2207f)
                lineTo(7.1055f, 22.4492f)
                curveTo(7.5429f, 24.4755f, 9.345f, 26.0f, 11.5f, 26.0f)
                curveTo(13.7036f, 26.0f, 15.5343f, 24.4051f, 15.918f, 22.3105f)
                lineTo(21.6914f, 17.9844f)
                curveTo(21.7942f, 17.9896f, 21.8959f, 18.0f, 22.0f, 18.0f)
                curveTo(25.309f, 18.0f, 28.0f, 15.309f, 28.0f, 12.0f)
                curveTo(28.0f, 8.691f, 25.309f, 6.0f, 22.0f, 6.0f)
                close()
                moveTo(22.0f, 8.0f)
                curveTo(24.206f, 8.0f, 26.0f, 9.794f, 26.0f, 12.0f)
                curveTo(26.0f, 14.206f, 24.206f, 16.0f, 22.0f, 16.0f)
                curveTo(19.794f, 16.0f, 18.0f, 14.206f, 18.0f, 12.0f)
                curveTo(18.0f, 9.794f, 19.794f, 8.0f, 22.0f, 8.0f)
                close()
                moveTo(22.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 22.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 22.0f, 9.0f)
                close()
                moveTo(11.5f, 18.0f)
                curveTo(13.43f, 18.0f, 15.0f, 19.57f, 15.0f, 21.5f)
                curveTo(15.0f, 23.43f, 13.43f, 25.0f, 11.5f, 25.0f)
                curveTo(10.0787f, 25.0f, 8.8581f, 24.1454f, 8.3105f, 22.9258f)
                lineTo(10.5801f, 23.8242f)
                curveTo(10.8821f, 23.9442f, 11.192f, 24.002f, 11.498f, 24.002f)
                curveTo(12.494f, 24.002f, 13.4362f, 23.4039f, 13.8242f, 22.4219f)
                curveTo(14.3332f, 21.1379f, 13.7039f, 19.6838f, 12.4199f, 19.1758f)
                lineTo(10.1426f, 18.2734f)
                curveTo(10.5601f, 18.0971f, 11.019f, 18.0f, 11.5f, 18.0f)
                close()
            }
        }
        .build()
        return _steamSymbol!!
    }

private var _steamSymbol: ImageVector? = null
