package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) {
            return _cloudMoon!!
        }
        _cloudMoon = Builder(name = "CloudMoon", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(495.8f, 0.0f)
                curveToRelative(5.5f, 0.0f, 10.9f, 0.2f, 16.3f, 0.7f)
                curveToRelative(7.0f, 0.6f, 12.8f, 5.7f, 14.3f, 12.5f)
                reflectiveCurveToRelative(-1.6f, 13.9f, -7.7f, 17.3f)
                curveToRelative(-44.4f, 25.2f, -74.4f, 73.0f, -74.4f, 127.8f)
                curveToRelative(0.0f, 81.0f, 65.5f, 146.6f, 146.2f, 146.6f)
                curveToRelative(8.6f, 0.0f, 17.0f, -0.7f, 25.1f, -2.1f)
                curveToRelative(6.9f, -1.2f, 13.8f, 2.2f, 17.0f, 8.5f)
                reflectiveCurveToRelative(1.9f, 13.8f, -3.1f, 18.7f)
                curveToRelative(-34.5f, 33.6f, -81.7f, 54.4f, -133.6f, 54.4f)
                curveToRelative(-9.3f, 0.0f, -18.4f, -0.7f, -27.4f, -1.9f)
                curveToRelative(-11.2f, -22.6f, -29.8f, -40.9f, -52.6f, -51.7f)
                curveToRelative(-2.7f, -58.5f, -50.3f, -105.3f, -109.2f, -106.7f)
                curveToRelative(-1.7f, -10.4f, -2.6f, -21.0f, -2.6f, -31.8f)
                curveTo(304.0f, 86.1f, 389.8f, 0.0f, 495.8f, 0.0f)
                close()
                moveTo(447.9f, 431.9f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                horizontalLineTo(96.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                curveToRelative(0.0f, -47.6f, 34.6f, -87.0f, 80.0f, -94.6f)
                lineToRelative(0.0f, -1.3f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                curveToRelative(34.9f, 0.0f, 65.4f, 18.6f, 82.2f, 46.4f)
                curveToRelative(13.0f, -9.1f, 28.8f, -14.4f, 45.8f, -14.4f)
                curveToRelative(44.2f, 0.0f, 80.0f, 35.8f, 80.0f, 80.0f)
                curveToRelative(0.0f, 5.9f, -0.6f, 11.7f, -1.9f, 17.2f)
                curveToRelative(37.4f, 6.7f, 65.8f, 39.4f, 65.8f, 78.7f)
                close()
            }
        }
        .build()
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
