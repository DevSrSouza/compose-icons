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

public val SolidGroup.DollarSign: ImageVector
    get() {
        if (_dollarSign != null) {
            return _dollarSign!!
        }
        _dollarSign = Builder(name = "DollarSign", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineTo(67.7f)
                curveToRelative(1.6f, 0.2f, 3.1f, 0.4f, 4.7f, 0.7f)
                curveToRelative(10.6f, 1.6f, 42.1f, 6.7f, 55.1f, 10.0f)
                curveToRelative(17.1f, 4.3f, 27.5f, 21.7f, 23.2f, 38.9f)
                reflectiveCurveToRelative(-21.7f, 27.5f, -38.9f, 23.2f)
                curveToRelative(-9.3f, -2.4f, -37.6f, -7.0f, -48.9f, -8.7f)
                curveToRelative(-32.1f, -4.8f, -59.6f, -2.4f, -78.5f, 4.9f)
                curveToRelative(-18.3f, 7.0f, -25.9f, 16.9f, -27.9f, 28.0f)
                curveToRelative(-1.9f, 10.7f, -0.5f, 16.8f, 1.3f, 20.6f)
                curveToRelative(1.9f, 4.0f, 5.6f, 8.5f, 12.9f, 13.4f)
                curveToRelative(16.2f, 10.8f, 41.1f, 17.9f, 73.3f, 26.7f)
                lineToRelative(2.8f, 0.8f)
                curveToRelative(28.4f, 7.7f, 63.2f, 17.2f, 89.0f, 34.3f)
                curveToRelative(14.1f, 9.4f, 27.3f, 22.1f, 35.5f, 39.7f)
                curveToRelative(8.3f, 17.8f, 10.1f, 37.8f, 6.3f, 59.1f)
                curveToRelative(-6.9f, 38.0f, -33.1f, 63.4f, -65.6f, 76.7f)
                curveToRelative(-13.7f, 5.6f, -28.6f, 9.2f, -44.4f, 11.0f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(445.1f)
                curveToRelative(-0.4f, -0.1f, -0.9f, -0.1f, -1.3f, -0.2f)
                lineToRelative(-0.2f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-24.4f, -3.8f, -64.5f, -14.3f, -91.5f, -26.3f)
                curveToRelative(-16.2f, -7.2f, -23.4f, -26.1f, -16.2f, -42.2f)
                reflectiveCurveToRelative(26.1f, -23.4f, 42.2f, -16.2f)
                curveToRelative(20.9f, 9.3f, 55.3f, 18.4f, 75.2f, 21.6f)
                curveToRelative(31.9f, 4.7f, 58.2f, 2.0f, 76.0f, -5.3f)
                curveToRelative(16.9f, -6.9f, 24.6f, -16.9f, 26.8f, -28.9f)
                curveToRelative(1.9f, -10.7f, 0.5f, -16.8f, -1.3f, -20.6f)
                curveToRelative(-1.9f, -4.0f, -5.6f, -8.5f, -12.9f, -13.4f)
                curveToRelative(-16.2f, -10.8f, -41.1f, -17.9f, -73.3f, -26.7f)
                lineToRelative(-2.8f, -0.8f)
                curveToRelative(-28.4f, -7.7f, -63.2f, -17.2f, -89.0f, -34.3f)
                curveToRelative(-14.1f, -9.4f, -27.3f, -22.1f, -35.5f, -39.7f)
                curveToRelative(-8.3f, -17.8f, -10.1f, -37.8f, -6.3f, -59.1f)
                curveTo(25.0f, 114.1f, 53.0f, 89.3f, 86.0f, 76.7f)
                curveToRelative(13.0f, -5.0f, 27.2f, -8.2f, 42.0f, -10.0f)
                verticalLineTo(32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _dollarSign!!
    }

private var _dollarSign: ImageVector? = null
