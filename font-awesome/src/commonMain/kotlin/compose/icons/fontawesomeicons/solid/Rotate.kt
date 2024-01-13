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

public val SolidGroup.Rotate: ImageVector
    get() {
        if (_rotate != null) {
            return _rotate!!
        }
        _rotate = Builder(name = "Rotate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(142.9f, 142.9f)
                curveToRelative(62.2f, -62.2f, 162.7f, -62.5f, 225.3f, -1.0f)
                lineTo(327.0f, 183.0f)
                curveToRelative(-6.9f, 6.9f, -8.9f, 17.2f, -5.2f, 26.2f)
                reflectiveCurveToRelative(12.5f, 14.8f, 22.2f, 14.8f)
                horizontalLineTo(463.5f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                horizontalLineTo(472.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                verticalLineTo(72.0f)
                curveToRelative(0.0f, -9.7f, -5.8f, -18.5f, -14.8f, -22.2f)
                reflectiveCurveToRelative(-19.3f, -1.7f, -26.2f, 5.2f)
                lineTo(413.4f, 96.6f)
                curveToRelative(-87.6f, -86.5f, -228.7f, -86.2f, -315.8f, 1.0f)
                curveTo(73.2f, 122.0f, 55.6f, 150.7f, 44.8f, 181.4f)
                curveToRelative(-5.9f, 16.7f, 2.9f, 34.9f, 19.5f, 40.8f)
                reflectiveCurveToRelative(34.9f, -2.9f, 40.8f, -19.5f)
                curveToRelative(7.7f, -21.8f, 20.2f, -42.3f, 37.8f, -59.8f)
                close()
                moveTo(16.0f, 312.0f)
                verticalLineToRelative(7.6f)
                verticalLineToRelative(0.7f)
                verticalLineTo(440.0f)
                curveToRelative(0.0f, 9.7f, 5.8f, 18.5f, 14.8f, 22.2f)
                reflectiveCurveToRelative(19.3f, 1.7f, 26.2f, -5.2f)
                lineToRelative(41.6f, -41.6f)
                curveToRelative(87.6f, 86.5f, 228.7f, 86.2f, 315.8f, -1.0f)
                curveToRelative(24.4f, -24.4f, 42.1f, -53.1f, 52.9f, -83.7f)
                curveToRelative(5.9f, -16.7f, -2.9f, -34.9f, -19.5f, -40.8f)
                reflectiveCurveToRelative(-34.9f, 2.9f, -40.8f, 19.5f)
                curveToRelative(-7.7f, 21.8f, -20.2f, 42.3f, -37.8f, 59.8f)
                curveToRelative(-62.2f, 62.2f, -162.7f, 62.5f, -225.3f, 1.0f)
                lineTo(185.0f, 329.0f)
                curveToRelative(6.9f, -6.9f, 8.9f, -17.2f, 5.2f, -26.2f)
                reflectiveCurveToRelative(-12.5f, -14.8f, -22.2f, -14.8f)
                horizontalLineTo(48.4f)
                horizontalLineToRelative(-0.7f)
                horizontalLineTo(40.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _rotate!!
    }

private var _rotate: ImageVector? = null
