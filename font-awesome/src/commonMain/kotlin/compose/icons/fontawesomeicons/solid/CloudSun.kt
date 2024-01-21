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
                moveTo(294.2f, 1.2f)
                curveToRelative(5.1f, 2.1f, 8.7f, 6.7f, 9.6f, 12.1f)
                lineToRelative(14.1f, 84.7f)
                lineToRelative(84.7f, 14.1f)
                curveToRelative(5.4f, 0.9f, 10.0f, 4.5f, 12.1f, 9.6f)
                reflectiveCurveToRelative(1.5f, 10.9f, -1.6f, 15.4f)
                lineToRelative(-38.5f, 55.0f)
                curveToRelative(-2.2f, -0.1f, -4.4f, -0.2f, -6.7f, -0.2f)
                curveToRelative(-23.3f, 0.0f, -45.1f, 6.2f, -64.0f, 17.1f)
                lineToRelative(0.0f, -1.1f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(-96.0f, 43.0f, -96.0f, 96.0f)
                reflectiveCurveToRelative(43.0f, 96.0f, 96.0f, 96.0f)
                curveToRelative(8.1f, 0.0f, 15.9f, -1.0f, 23.4f, -2.9f)
                curveToRelative(-36.6f, 18.1f, -63.3f, 53.1f, -69.8f, 94.9f)
                lineToRelative(-24.4f, 17.0f)
                curveToRelative(-4.5f, 3.1f, -10.3f, 3.8f, -15.4f, 1.6f)
                reflectiveCurveToRelative(-8.7f, -6.7f, -9.6f, -12.1f)
                lineTo(98.1f, 317.9f)
                lineTo(13.4f, 303.8f)
                curveToRelative(-5.4f, -0.9f, -10.0f, -4.5f, -12.1f, -9.6f)
                reflectiveCurveToRelative(-1.5f, -10.9f, 1.6f, -15.4f)
                lineTo(52.5f, 208.0f)
                lineTo(2.9f, 137.2f)
                curveToRelative(-3.2f, -4.5f, -3.8f, -10.3f, -1.6f, -15.4f)
                reflectiveCurveToRelative(6.7f, -8.7f, 12.1f, -9.6f)
                lineTo(98.1f, 98.1f)
                lineToRelative(14.1f, -84.7f)
                curveToRelative(0.9f, -5.4f, 4.5f, -10.0f, 9.6f, -12.1f)
                reflectiveCurveToRelative(10.9f, -1.5f, 15.4f, 1.6f)
                lineTo(208.0f, 52.5f)
                lineTo(278.8f, 2.9f)
                curveToRelative(4.5f, -3.2f, 10.3f, -3.8f, 15.4f, -1.6f)
                close()
                moveTo(144.0f, 208.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 128.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, -128.0f, 0.0f)
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
