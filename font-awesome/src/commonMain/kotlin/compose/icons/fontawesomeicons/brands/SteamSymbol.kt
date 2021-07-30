package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.SteamSymbol: ImageVector
    get() {
        if (_steamSymbol != null) {
            return _steamSymbol!!
        }
        _steamSymbol = Builder(name = "SteamSymbol", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(395.5f, 177.5f)
                curveToRelative(0.0f, 33.8f, -27.5f, 61.0f, -61.0f, 61.0f)
                curveToRelative(-33.8f, 0.0f, -61.0f, -27.3f, -61.0f, -61.0f)
                reflectiveCurveToRelative(27.3f, -61.0f, 61.0f, -61.0f)
                curveToRelative(33.5f, 0.0f, 61.0f, 27.2f, 61.0f, 61.0f)
                close()
                moveTo(448.0f, 177.7f)
                curveToRelative(0.0f, 63.0f, -51.0f, 113.8f, -113.7f, 113.8f)
                lineTo(225.0f, 371.3f)
                curveToRelative(-4.0f, 43.0f, -40.5f, 76.8f, -84.5f, 76.8f)
                curveToRelative(-40.5f, 0.0f, -74.7f, -28.8f, -83.0f, -67.0f)
                lineTo(0.0f, 358.0f)
                lineTo(0.0f, 250.7f)
                lineTo(97.2f, 290.0f)
                curveToRelative(15.1f, -9.2f, 32.2f, -13.3f, 52.0f, -11.5f)
                lineToRelative(71.0f, -101.7f)
                curveToRelative(0.5f, -62.3f, 51.5f, -112.8f, 114.0f, -112.8f)
                curveTo(397.0f, 64.0f, 448.0f, 115.0f, 448.0f, 177.7f)
                close()
                moveTo(203.0f, 363.0f)
                curveToRelative(0.0f, -34.7f, -27.8f, -62.5f, -62.5f, -62.5f)
                curveToRelative(-4.5f, 0.0f, -9.0f, 0.5f, -13.5f, 1.5f)
                lineToRelative(26.0f, 10.5f)
                curveToRelative(25.5f, 10.2f, 38.0f, 39.0f, 27.7f, 64.5f)
                curveToRelative(-10.2f, 25.5f, -39.2f, 38.0f, -64.7f, 27.5f)
                curveToRelative(-10.2f, -4.0f, -20.5f, -8.3f, -30.7f, -12.2f)
                curveToRelative(10.5f, 19.7f, 31.2f, 33.2f, 55.2f, 33.2f)
                curveToRelative(34.7f, 0.0f, 62.5f, -27.8f, 62.5f, -62.5f)
                close()
                moveTo(410.5f, 177.7f)
                curveToRelative(0.0f, -42.0f, -34.3f, -76.2f, -76.2f, -76.2f)
                curveToRelative(-42.3f, 0.0f, -76.5f, 34.2f, -76.5f, 76.2f)
                curveToRelative(0.0f, 42.2f, 34.3f, 76.2f, 76.5f, 76.2f)
                curveToRelative(41.9f, 0.1f, 76.2f, -33.9f, 76.2f, -76.2f)
                close()
            }
        }
        .build()
        return _steamSymbol!!
    }

private var _steamSymbol: ImageVector? = null
