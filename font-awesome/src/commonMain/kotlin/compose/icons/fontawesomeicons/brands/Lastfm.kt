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

public val BrandsGroup.Lastfm: ImageVector
    get() {
        if (_lastfm != null) {
            return _lastfm!!
        }
        _lastfm = Builder(name = "Lastfm", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.8f, 367.1f)
                lineToRelative(-18.8f, -51.0f)
                reflectiveCurveToRelative(-30.5f, 34.0f, -76.2f, 34.0f)
                curveToRelative(-40.5f, 0.0f, -69.2f, -35.2f, -69.2f, -91.5f)
                curveToRelative(0.0f, -72.1f, 36.4f, -97.9f, 72.1f, -97.9f)
                curveToRelative(66.5f, 0.0f, 74.8f, 53.3f, 100.9f, 134.9f)
                curveToRelative(18.8f, 56.9f, 54.0f, 102.6f, 155.4f, 102.6f)
                curveToRelative(72.7f, 0.0f, 122.0f, -22.3f, 122.0f, -80.9f)
                curveToRelative(0.0f, -72.9f, -62.7f, -80.6f, -115.0f, -92.1f)
                curveToRelative(-25.8f, -5.9f, -33.4f, -16.4f, -33.4f, -34.0f)
                curveToRelative(0.0f, -19.9f, 15.8f, -31.7f, 41.6f, -31.7f)
                curveToRelative(28.2f, 0.0f, 43.4f, 10.6f, 45.7f, 35.8f)
                lineToRelative(58.6f, -7.0f)
                curveToRelative(-4.7f, -52.8f, -41.1f, -74.5f, -100.9f, -74.5f)
                curveToRelative(-52.8f, 0.0f, -104.4f, 19.9f, -104.4f, 83.9f)
                curveToRelative(0.0f, 39.9f, 19.4f, 65.1f, 68.0f, 76.8f)
                curveToRelative(44.9f, 10.6f, 79.8f, 13.8f, 79.8f, 45.7f)
                curveToRelative(0.0f, 21.7f, -21.1f, 30.5f, -61.0f, 30.5f)
                curveToRelative(-59.2f, 0.0f, -83.9f, -31.1f, -97.9f, -73.9f)
                curveToRelative(-32.0f, -96.8f, -43.6f, -163.0f, -161.3f, -163.0f)
                curveTo(45.7f, 113.8f, 0.0f, 168.3f, 0.0f, 261.0f)
                curveToRelative(0.0f, 89.1f, 45.7f, 137.2f, 127.9f, 137.2f)
                curveToRelative(66.2f, 0.0f, 97.9f, -31.1f, 97.9f, -31.1f)
                close()
            }
        }
        .build()
        return _lastfm!!
    }

private var _lastfm: ImageVector? = null
