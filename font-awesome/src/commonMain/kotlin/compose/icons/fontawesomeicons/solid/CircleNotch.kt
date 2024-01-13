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

public val SolidGroup.CircleNotch: ImageVector
    get() {
        if (_circleNotch != null) {
            return _circleNotch!!
        }
        _circleNotch = Builder(name = "CircleNotch", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.7f, 32.1f)
                curveToRelative(5.0f, 16.9f, -4.6f, 34.8f, -21.5f, 39.8f)
                curveTo(121.8f, 95.6f, 64.0f, 169.1f, 64.0f, 256.0f)
                curveToRelative(0.0f, 106.0f, 86.0f, 192.0f, 192.0f, 192.0f)
                reflectiveCurveToRelative(192.0f, -86.0f, 192.0f, -192.0f)
                curveToRelative(0.0f, -86.9f, -57.8f, -160.4f, -137.1f, -184.1f)
                curveToRelative(-16.9f, -5.0f, -26.6f, -22.9f, -21.5f, -39.8f)
                reflectiveCurveToRelative(22.9f, -26.6f, 39.8f, -21.5f)
                curveTo(434.9f, 42.1f, 512.0f, 140.0f, 512.0f, 256.0f)
                curveToRelative(0.0f, 141.4f, -114.6f, 256.0f, -256.0f, 256.0f)
                reflectiveCurveTo(0.0f, 397.4f, 0.0f, 256.0f)
                curveTo(0.0f, 140.0f, 77.1f, 42.1f, 182.9f, 10.6f)
                curveToRelative(16.9f, -5.0f, 34.8f, 4.6f, 39.8f, 21.5f)
                close()
            }
        }
        .build()
        return _circleNotch!!
    }

private var _circleNotch: ImageVector? = null
