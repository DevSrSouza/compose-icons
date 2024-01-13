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

public val SolidGroup.CircleNodes: ImageVector
    get() {
        if (_circleNodes != null) {
            return _circleNodes!!
        }
        _circleNodes = Builder(name = "CircleNodes", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(418.4f, 157.9f)
                curveToRelative(35.3f, -8.3f, 61.6f, -40.0f, 61.6f, -77.9f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                curveToRelative(-43.4f, 0.0f, -78.7f, 34.5f, -80.0f, 77.5f)
                lineTo(136.2f, 151.1f)
                curveTo(121.7f, 136.8f, 101.9f, 128.0f, 80.0f, 128.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, 35.8f, -80.0f, 80.0f)
                reflectiveCurveToRelative(35.8f, 80.0f, 80.0f, 80.0f)
                curveToRelative(12.2f, 0.0f, 23.8f, -2.7f, 34.1f, -7.6f)
                lineTo(259.7f, 407.8f)
                curveToRelative(-2.4f, 7.6f, -3.7f, 15.8f, -3.7f, 24.2f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                reflectiveCurveToRelative(80.0f, -35.8f, 80.0f, -80.0f)
                curveToRelative(0.0f, -27.7f, -14.0f, -52.1f, -35.4f, -66.4f)
                lineToRelative(37.8f, -207.7f)
                close()
                moveTo(156.3f, 232.2f)
                curveToRelative(2.2f, -6.9f, 3.5f, -14.2f, 3.7f, -21.7f)
                lineToRelative(183.8f, -73.5f)
                curveToRelative(3.6f, 3.5f, 7.4f, 6.7f, 11.6f, 9.5f)
                lineTo(317.6f, 354.1f)
                curveToRelative(-5.5f, 1.3f, -10.8f, 3.1f, -15.8f, 5.5f)
                lineTo(156.3f, 232.2f)
                close()
            }
        }
        .build()
        return _circleNodes!!
    }

private var _circleNodes: ImageVector? = null
