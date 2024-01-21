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

public val SolidGroup.Cannabis: ImageVector
    get() {
        if (_cannabis != null) {
            return _cannabis!!
        }
        _cannabis = Builder(name = "Cannabis", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                curveToRelative(5.3f, 0.0f, 10.3f, 2.7f, 13.3f, 7.1f)
                curveToRelative(15.8f, 23.5f, 36.7f, 63.7f, 49.2f, 109.0f)
                curveToRelative(7.2f, 26.4f, 11.8f, 55.2f, 10.4f, 84.0f)
                curveToRelative(11.5f, -8.8f, 23.7f, -16.7f, 35.8f, -23.6f)
                curveToRelative(41.0f, -23.3f, 84.4f, -36.9f, 112.2f, -42.5f)
                curveToRelative(5.2f, -1.0f, 10.7f, 0.6f, 14.4f, 4.4f)
                reflectiveCurveToRelative(5.4f, 9.2f, 4.4f, 14.5f)
                curveToRelative(-5.6f, 27.7f, -19.3f, 70.9f, -42.7f, 111.7f)
                curveToRelative(-9.1f, 15.9f, -19.9f, 31.7f, -32.4f, 46.3f)
                curveToRelative(27.8f, 6.6f, 52.4f, 17.3f, 67.2f, 25.5f)
                curveToRelative(5.1f, 2.8f, 8.2f, 8.2f, 8.2f, 14.0f)
                reflectiveCurveToRelative(-3.2f, 11.2f, -8.2f, 14.0f)
                curveToRelative(-15.2f, 8.4f, -40.9f, 19.5f, -69.8f, 26.1f)
                curveToRelative(-20.2f, 4.6f, -42.9f, 7.2f, -65.2f, 4.6f)
                lineToRelative(8.3f, 33.1f)
                curveToRelative(1.5f, 6.1f, -0.6f, 12.4f, -5.5f, 16.4f)
                reflectiveCurveToRelative(-11.6f, 4.6f, -17.2f, 1.9f)
                lineTo(280.0f, 417.2f)
                verticalLineTo(488.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                verticalLineTo(417.2f)
                lineToRelative(-58.5f, 29.1f)
                curveToRelative(-5.6f, 2.8f, -12.3f, 2.1f, -17.2f, -1.9f)
                reflectiveCurveToRelative(-7.0f, -10.3f, -5.5f, -16.4f)
                lineToRelative(8.3f, -33.1f)
                curveToRelative(-22.2f, 2.6f, -45.0f, 0.0f, -65.2f, -4.6f)
                curveToRelative(-28.9f, -6.6f, -54.6f, -17.6f, -69.8f, -26.1f)
                curveToRelative(-5.1f, -2.8f, -8.2f, -8.2f, -8.2f, -14.0f)
                reflectiveCurveToRelative(3.2f, -11.2f, 8.2f, -14.0f)
                curveToRelative(14.8f, -8.2f, 39.4f, -18.8f, 67.2f, -25.5f)
                curveTo(78.9f, 296.3f, 68.1f, 280.5f, 59.0f, 264.6f)
                curveToRelative(-23.4f, -40.8f, -37.1f, -84.0f, -42.7f, -111.7f)
                curveToRelative(-1.1f, -5.2f, 0.6f, -10.7f, 4.4f, -14.5f)
                reflectiveCurveToRelative(9.2f, -5.4f, 14.4f, -4.4f)
                curveToRelative(27.9f, 5.5f, 71.2f, 19.2f, 112.2f, 42.5f)
                curveToRelative(12.1f, 6.9f, 24.3f, 14.7f, 35.8f, 23.6f)
                curveToRelative(-1.4f, -28.7f, 3.1f, -57.6f, 10.4f, -84.0f)
                curveToRelative(12.5f, -45.3f, 33.4f, -85.5f, 49.2f, -109.0f)
                curveToRelative(3.0f, -4.4f, 8.0f, -7.1f, 13.3f, -7.1f)
                close()
            }
        }
        .build()
        return _cannabis!!
    }

private var _cannabis: ImageVector? = null
