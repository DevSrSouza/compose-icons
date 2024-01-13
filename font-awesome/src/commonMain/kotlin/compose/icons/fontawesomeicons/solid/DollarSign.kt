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
                curveToRelative(0.4f, 0.1f, 0.7f, 0.1f, 1.1f, 0.2f)
                lineToRelative(48.0f, 8.8f)
                curveToRelative(17.4f, 3.2f, 28.9f, 19.9f, 25.7f, 37.2f)
                reflectiveCurveToRelative(-19.9f, 28.9f, -37.2f, 25.7f)
                lineToRelative(-47.5f, -8.7f)
                curveToRelative(-31.3f, -4.6f, -58.9f, -1.5f, -78.3f, 6.2f)
                reflectiveCurveToRelative(-27.2f, 18.3f, -29.0f, 28.1f)
                curveToRelative(-2.0f, 10.7f, -0.5f, 16.7f, 1.2f, 20.4f)
                curveToRelative(1.8f, 3.9f, 5.5f, 8.3f, 12.8f, 13.2f)
                curveToRelative(16.3f, 10.7f, 41.3f, 17.7f, 73.7f, 26.3f)
                lineToRelative(2.9f, 0.8f)
                curveToRelative(28.6f, 7.6f, 63.6f, 16.8f, 89.6f, 33.8f)
                curveToRelative(14.2f, 9.3f, 27.6f, 21.9f, 35.9f, 39.5f)
                curveToRelative(8.5f, 17.9f, 10.3f, 37.9f, 6.4f, 59.2f)
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
                curveToRelative(-16.1f, -7.2f, -23.4f, -26.1f, -16.2f, -42.2f)
                reflectiveCurveToRelative(26.1f, -23.4f, 42.2f, -16.2f)
                curveToRelative(20.9f, 9.3f, 55.3f, 18.5f, 75.2f, 21.6f)
                curveToRelative(31.9f, 4.7f, 58.2f, 2.0f, 76.0f, -5.3f)
                curveToRelative(16.9f, -6.9f, 24.6f, -16.9f, 26.8f, -28.9f)
                curveToRelative(1.9f, -10.6f, 0.4f, -16.7f, -1.3f, -20.4f)
                curveToRelative(-1.9f, -4.0f, -5.6f, -8.4f, -13.0f, -13.3f)
                curveToRelative(-16.4f, -10.7f, -41.5f, -17.7f, -74.0f, -26.3f)
                lineToRelative(-2.8f, -0.7f)
                lineToRelative(0.0f, 0.0f)
                curveTo(119.4f, 279.3f, 84.4f, 270.0f, 58.4f, 253.0f)
                curveToRelative(-14.2f, -9.3f, -27.5f, -22.0f, -35.8f, -39.6f)
                curveToRelative(-8.4f, -17.9f, -10.1f, -37.9f, -6.1f, -59.2f)
                curveTo(23.7f, 116.0f, 52.3f, 91.2f, 84.8f, 78.3f)
                curveToRelative(13.3f, -5.3f, 27.9f, -8.9f, 43.2f, -11.0f)
                verticalLineTo(32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _dollarSign!!
    }

private var _dollarSign: ImageVector? = null
