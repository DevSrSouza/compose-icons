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

public val SolidGroup.Broom: ImageVector
    get() {
        if (_broom != null) {
            return _broom!!
        }
        _broom = Builder(name = "Broom", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(566.6f, 54.6f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.8f, 0.0f, -45.3f)
                reflectiveCurveToRelative(-32.8f, -12.5f, -45.3f, 0.0f)
                lineToRelative(-192.0f, 192.0f)
                lineToRelative(-34.7f, -34.7f)
                curveToRelative(-4.2f, -4.2f, -10.0f, -6.6f, -16.0f, -6.6f)
                curveToRelative(-12.5f, 0.0f, -22.6f, 10.1f, -22.6f, 22.6f)
                verticalLineToRelative(29.1f)
                lineTo(364.3f, 320.0f)
                horizontalLineToRelative(29.1f)
                curveToRelative(12.5f, 0.0f, 22.6f, -10.1f, 22.6f, -22.6f)
                curveToRelative(0.0f, -6.0f, -2.4f, -11.8f, -6.6f, -16.0f)
                lineToRelative(-34.7f, -34.7f)
                lineToRelative(192.0f, -192.0f)
                close()
                moveTo(341.1f, 353.4f)
                lineTo(222.6f, 234.9f)
                curveToRelative(-42.7f, -3.7f, -85.2f, 11.7f, -115.8f, 42.3f)
                lineToRelative(-8.0f, 8.0f)
                curveTo(76.5f, 307.5f, 64.0f, 337.7f, 64.0f, 369.2f)
                curveToRelative(0.0f, 6.8f, 7.1f, 11.2f, 13.2f, 8.2f)
                lineToRelative(51.1f, -25.5f)
                curveToRelative(5.0f, -2.5f, 9.5f, 4.1f, 5.4f, 7.9f)
                lineTo(7.3f, 473.4f)
                curveTo(2.7f, 477.6f, 0.0f, 483.6f, 0.0f, 489.9f)
                curveTo(0.0f, 502.1f, 9.9f, 512.0f, 22.1f, 512.0f)
                lineToRelative(173.3f, 0.0f)
                curveToRelative(38.8f, 0.0f, 75.9f, -15.4f, 103.4f, -42.8f)
                curveToRelative(30.6f, -30.6f, 45.9f, -73.1f, 42.3f, -115.8f)
                close()
            }
        }
        .build()
        return _broom!!
    }

private var _broom: ImageVector? = null
