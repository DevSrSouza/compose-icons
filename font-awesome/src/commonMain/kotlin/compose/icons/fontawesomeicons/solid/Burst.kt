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

public val SolidGroup.Burst: ImageVector
    get() {
        if (_burst != null) {
            return _burst!!
        }
        _burst = Builder(name = "Burst", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(37.6f, 4.2f)
                curveTo(28.0f, -2.3f, 15.2f, -1.1f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-9.4f, 21.0f, -2.8f, 30.5f)
                lineToRelative(112.0f, 163.3f)
                lineTo(16.6f, 233.2f)
                curveTo(6.7f, 236.4f, 0.0f, 245.6f, 0.0f, 256.0f)
                reflectiveCurveToRelative(6.7f, 19.6f, 16.6f, 22.8f)
                lineToRelative(103.1f, 33.4f)
                lineTo(66.8f, 412.8f)
                curveToRelative(-4.9f, 9.3f, -3.2f, 20.7f, 4.3f, 28.1f)
                reflectiveCurveToRelative(18.8f, 9.2f, 28.1f, 4.3f)
                lineToRelative(100.6f, -52.9f)
                lineToRelative(33.4f, 103.1f)
                curveToRelative(3.2f, 9.9f, 12.4f, 16.6f, 22.8f, 16.6f)
                reflectiveCurveToRelative(19.6f, -6.7f, 22.8f, -16.6f)
                lineToRelative(33.4f, -103.1f)
                lineToRelative(100.6f, 52.9f)
                curveToRelative(9.3f, 4.9f, 20.7f, 3.2f, 28.1f, -4.3f)
                reflectiveCurveToRelative(9.2f, -18.8f, 4.3f, -28.1f)
                lineTo(392.3f, 312.2f)
                lineToRelative(103.1f, -33.4f)
                curveToRelative(9.9f, -3.2f, 16.6f, -12.4f, 16.6f, -22.8f)
                reflectiveCurveToRelative(-6.7f, -19.6f, -16.6f, -22.8f)
                lineTo(388.9f, 198.7f)
                lineToRelative(25.7f, -70.4f)
                curveToRelative(3.2f, -8.8f, 1.0f, -18.6f, -5.6f, -25.2f)
                reflectiveCurveToRelative(-16.4f, -8.8f, -25.2f, -5.6f)
                lineToRelative(-70.4f, 25.7f)
                lineTo(278.8f, 16.6f)
                curveTo(275.6f, 6.7f, 266.4f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveToRelative(-19.6f, 6.7f, -22.8f, 16.6f)
                lineToRelative(-32.3f, 99.6f)
                lineTo(37.6f, 4.2f)
                close()
            }
        }
        .build()
        return _burst!!
    }

private var _burst: ImageVector? = null
