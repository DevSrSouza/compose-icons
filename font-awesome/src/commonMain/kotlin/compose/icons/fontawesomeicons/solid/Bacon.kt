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

public val SolidGroup.Bacon: ImageVector
    get() {
        if (_bacon != null) {
            return _bacon!!
        }
        _bacon = Builder(name = "Bacon", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(439.2f, 1.2f)
                curveToRelative(11.2f, -3.2f, 23.2f, -0.1f, 31.4f, 8.1f)
                lineTo(518.0f, 56.7f)
                lineToRelative(-26.5f, 7.9f)
                curveToRelative(-58.0f, 16.6f, -98.1f, 39.6f, -129.6f, 67.4f)
                curveToRelative(-31.2f, 27.5f, -53.2f, 59.1f, -75.1f, 90.9f)
                lineToRelative(-2.3f, 3.3f)
                curveTo(241.6f, 288.7f, 195.0f, 356.6f, 72.8f, 417.7f)
                lineTo(37.9f, 435.2f)
                lineTo(9.4f, 406.6f)
                curveToRelative(-7.3f, -7.3f, -10.6f, -17.6f, -9.0f, -27.8f)
                reflectiveCurveToRelative(8.1f, -18.9f, 17.3f, -23.5f)
                curveTo(136.1f, 296.2f, 180.9f, 231.0f, 223.3f, 169.3f)
                lineToRelative(2.3f, -3.4f)
                curveToRelative(21.8f, -31.8f, 44.9f, -64.9f, 77.7f, -93.9f)
                curveToRelative(33.4f, -29.5f, 75.8f, -53.6f, 135.9f, -70.8f)
                close()
                moveTo(61.8f, 459.0f)
                lineToRelative(25.4f, -12.7f)
                curveToRelative(129.5f, -64.7f, 179.9f, -138.1f, 223.8f, -202.0f)
                lineToRelative(2.2f, -3.3f)
                curveToRelative(22.1f, -32.1f, 42.1f, -60.5f, 69.9f, -85.1f)
                curveToRelative(27.5f, -24.3f, 63.4f, -45.2f, 117.3f, -60.6f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.2f, -0.1f)
                lineToRelative(43.1f, -12.9f)
                lineToRelative(23.0f, 23.0f)
                curveToRelative(8.0f, 8.0f, 11.2f, 19.7f, 8.3f, 30.7f)
                reflectiveCurveToRelative(-11.3f, 19.6f, -22.2f, 22.7f)
                curveToRelative(-51.9f, 14.8f, -85.6f, 34.7f, -111.1f, 57.2f)
                curveToRelative(-26.1f, 23.0f, -45.1f, 49.9f, -67.3f, 82.1f)
                lineToRelative(-2.2f, 3.2f)
                curveTo(327.8f, 365.9f, 275.5f, 442.0f, 142.3f, 508.6f)
                curveToRelative(-12.3f, 6.2f, -27.2f, 3.7f, -36.9f, -6.0f)
                lineTo(61.8f, 459.0f)
                close()
            }
        }
        .build()
        return _bacon!!
    }

private var _bacon: ImageVector? = null
