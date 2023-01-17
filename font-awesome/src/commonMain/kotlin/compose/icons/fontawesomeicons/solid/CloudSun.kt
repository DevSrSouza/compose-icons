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

public val SolidGroup.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) {
            return _cloudSun!!
        }
        _cloudSun = Builder(name = "CloudSun", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(122.4f, 1.2f)
                curveTo(127.6f, -0.9f, 133.4f, -0.2f, 137.9f, 3.0f)
                lineToRelative(70.3f, 50.3f)
                lineTo(278.5f, 3.0f)
                curveToRelative(4.5f, -3.2f, 10.3f, -3.9f, 15.4f, -1.8f)
                reflectiveCurveToRelative(8.8f, 6.7f, 9.7f, 12.2f)
                lineToRelative(14.1f, 85.3f)
                lineTo(403.0f, 112.8f)
                curveToRelative(5.4f, 0.9f, 10.1f, 4.6f, 12.2f, 9.7f)
                reflectiveCurveToRelative(1.4f, 10.9f, -1.8f, 15.4f)
                lineToRelative(-38.8f, 54.3f)
                curveToRelative(-2.2f, -0.1f, -4.3f, -0.2f, -6.5f, -0.2f)
                curveToRelative(-23.2f, 0.0f, -45.0f, 6.2f, -63.8f, 17.0f)
                curveToRelative(0.1f, -12.5f, -2.2f, -25.3f, -7.3f, -37.6f)
                curveToRelative(-20.3f, -49.0f, -76.4f, -72.2f, -125.4f, -52.0f)
                reflectiveCurveToRelative(-72.2f, 76.4f, -52.0f, 125.4f)
                curveToRelative(18.3f, 44.3f, 66.0f, 67.5f, 111.1f, 56.6f)
                curveToRelative(-36.3f, 18.2f, -62.8f, 53.3f, -69.1f, 94.9f)
                lineToRelative(-23.6f, 16.9f)
                curveToRelative(-4.5f, 3.2f, -10.3f, 3.9f, -15.4f, 1.8f)
                reflectiveCurveToRelative(-8.8f, -6.7f, -9.7f, -12.2f)
                lineTo(98.7f, 317.7f)
                lineTo(13.4f, 303.6f)
                curveToRelative(-5.5f, -0.9f, -10.1f, -4.6f, -12.2f, -9.7f)
                reflectiveCurveTo(-0.2f, 282.9f, 3.0f, 278.5f)
                lineToRelative(50.3f, -70.3f)
                lineTo(3.0f, 137.9f)
                curveToRelative(-3.2f, -4.5f, -3.9f, -10.3f, -1.8f, -15.4f)
                reflectiveCurveToRelative(6.7f, -8.8f, 12.2f, -9.7f)
                lineTo(98.7f, 98.7f)
                lineToRelative(14.1f, -85.3f)
                curveToRelative(0.9f, -5.5f, 4.6f, -10.1f, 9.7f, -12.2f)
                close()
                moveTo(149.0f, 232.7f)
                curveToRelative(-13.5f, -32.7f, 2.0f, -70.1f, 34.6f, -83.6f)
                reflectiveCurveToRelative(70.1f, 2.0f, 83.6f, 34.6f)
                reflectiveCurveToRelative(-2.0f, 70.1f, -34.6f, 83.6f)
                reflectiveCurveToRelative(-70.1f, -2.0f, -83.6f, -34.6f)
                close()
                moveTo(639.9f, 431.9f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                horizontalLineTo(288.0f)
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
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
