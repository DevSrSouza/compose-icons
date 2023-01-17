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

public val SolidGroup.Ribbon: ImageVector
    get() {
        if (_ribbon != null) {
            return _ribbon!!
        }
        _ribbon = Builder(name = "Ribbon", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 96.0f)
                curveToRelative(39.5f, 0.0f, 66.8f, 12.2f, 81.9f, 21.5f)
                lineTo(245.6f, 184.0f)
                lineToRelative(79.3f, 87.4f)
                lineToRelative(36.3f, -40.0f)
                curveToRelative(14.7f, -16.2f, 22.8f, -37.3f, 22.8f, -59.1f)
                verticalLineToRelative(-27.0f)
                curveToRelative(0.0f, -15.6f, -4.1f, -30.8f, -12.0f, -44.3f)
                lineTo(337.7f, 42.0f)
                curveTo(326.4f, 22.7f, 307.0f, 6.8f, 282.1f, 3.5f)
                curveTo(267.8f, 1.6f, 248.4f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveToRelative(-43.8f, 1.6f, -58.0f, 3.5f)
                curveTo(141.0f, 6.8f, 121.7f, 22.7f, 110.4f, 42.0f)
                lineTo(76.0f, 101.0f)
                curveToRelative(-7.8f, 13.4f, -12.0f, 28.7f, -12.0f, 44.3f)
                verticalLineToRelative(27.0f)
                curveToRelative(0.0f, 21.9f, 8.1f, 42.9f, 22.8f, 59.1f)
                lineToRelative(57.9f, 63.8f)
                lineTo(224.0f, 382.6f)
                lineTo(334.2f, 504.1f)
                curveToRelative(6.4f, 7.0f, 16.3f, 9.7f, 25.4f, 6.6f)
                lineToRelative(72.0f, -24.0f)
                curveToRelative(7.7f, -2.6f, 13.6f, -8.8f, 15.6f, -16.7f)
                reflectiveCurveToRelative(0.0f, -16.2f, -5.4f, -22.2f)
                lineTo(303.3f, 295.2f)
                lineTo(224.0f, 207.8f)
                lineToRelative(-81.9f, -90.3f)
                curveTo(157.3f, 108.2f, 184.5f, 96.0f, 224.0f, 96.0f)
                close()
                moveTo(202.4f, 406.5f)
                lineTo(123.2f, 319.0f)
                lineTo(6.3f, 447.9f)
                curveToRelative(-5.4f, 6.0f, -7.5f, 14.4f, -5.4f, 22.2f)
                reflectiveCurveToRelative(7.9f, 14.1f, 15.6f, 16.7f)
                lineToRelative(72.0f, 24.0f)
                curveToRelative(9.0f, 3.0f, 19.0f, 0.4f, 25.4f, -6.6f)
                lineToRelative(88.6f, -97.7f)
                close()
            }
        }
        .build()
        return _ribbon!!
    }

private var _ribbon: ImageVector? = null
