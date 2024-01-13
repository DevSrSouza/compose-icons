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

public val SolidGroup.Gem: ImageVector
    get() {
        if (_gem != null) {
            return _gem!!
        }
        _gem = Builder(name = "Gem", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.7f, 33.8f)
                curveToRelative(4.5f, -6.1f, 11.7f, -9.8f, 19.3f, -9.8f)
                lineTo(376.0f, 24.0f)
                curveToRelative(7.6f, 0.0f, 14.8f, 3.6f, 19.3f, 9.8f)
                lineToRelative(112.0f, 152.0f)
                curveToRelative(6.8f, 9.2f, 6.1f, 21.9f, -1.5f, 30.4f)
                lineToRelative(-232.0f, 256.0f)
                curveToRelative(-4.5f, 5.0f, -11.0f, 7.9f, -17.8f, 7.9f)
                reflectiveCurveToRelative(-13.2f, -2.9f, -17.8f, -7.9f)
                lineToRelative(-232.0f, -256.0f)
                curveToRelative(-7.7f, -8.5f, -8.3f, -21.2f, -1.5f, -30.4f)
                lineToRelative(112.0f, -152.0f)
                close()
                moveTo(155.2f, 73.6f)
                curveToRelative(-3.3f, 2.5f, -4.2f, 7.0f, -2.1f, 10.5f)
                lineToRelative(57.4f, 95.6f)
                lineTo(63.3f, 192.0f)
                curveToRelative(-4.1f, 0.3f, -7.3f, 3.8f, -7.3f, 8.0f)
                reflectiveCurveToRelative(3.2f, 7.6f, 7.3f, 8.0f)
                lineToRelative(192.0f, 16.0f)
                curveToRelative(0.4f, 0.0f, 0.9f, 0.0f, 1.3f, 0.0f)
                lineToRelative(192.0f, -16.0f)
                curveToRelative(4.1f, -0.3f, 7.3f, -3.8f, 7.3f, -8.0f)
                reflectiveCurveToRelative(-3.2f, -7.6f, -7.3f, -8.0f)
                lineTo(301.5f, 179.8f)
                lineToRelative(57.4f, -95.6f)
                curveToRelative(2.1f, -3.5f, 1.2f, -8.1f, -2.1f, -10.5f)
                reflectiveCurveToRelative(-7.9f, -2.0f, -10.7f, 1.0f)
                lineTo(256.0f, 172.2f)
                lineTo(165.9f, 74.6f)
                curveToRelative(-2.8f, -3.0f, -7.4f, -3.4f, -10.7f, -1.0f)
                close()
            }
        }
        .build()
        return _gem!!
    }

private var _gem: ImageVector? = null
