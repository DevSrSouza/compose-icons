package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Shortcut: ImageVector
    get() {
        if (_shortcut != null) {
            return _shortcut!!
        }
        _shortcut = Builder(name = "Shortcut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(6.0f, 0.0f)
                arcToRelative(5.975f, 5.975f, 0.0f, false, false, -4.242f, 1.758f)
                arcToRelative(5.998f, 5.998f, 0.0f, false, false, 0.0f, 8.484f)
                lineToRelative(2.137f, 2.137f)
                arcTo(6.007f, 6.007f, 0.0f, false, false, 0.0f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(5.975f, 5.975f, 0.0f, false, false, 4.242f, -1.758f)
                arcToRelative(5.998f, 5.998f, 0.0f, false, false, 0.0f, -8.484f)
                lineToRelative(-2.137f, -2.137f)
                arcTo(6.002f, 6.002f, 0.0f, false, false, 24.0f, 6.0f)
                close()
                moveTo(3.404f, 20.598f)
                curveToRelative(-0.694f, -0.694f, -1.075f, -1.615f, -1.075f, -2.596f)
                reflectiveCurveToRelative(0.38f, -1.903f, 1.075f, -2.595f)
                arcToRelative(3.65f, 3.65f, 0.0f, false, true, 2.443f, -1.074f)
                lineToRelative(7.34f, 7.34f)
                lineTo(6.0f, 21.673f)
                arcToRelative(3.664f, 3.664f, 0.0f, false, true, -2.596f, -1.075f)
                close()
                moveTo(20.596f, 15.404f)
                curveTo(21.29f, 16.1f, 21.67f, 17.02f, 21.67f, 18.0f)
                reflectiveCurveToRelative(-0.38f, 1.904f, -1.075f, 2.596f)
                arcTo(3.644f, 3.644f, 0.0f, false, true, 18.0f, 21.67f)
                arcToRelative(3.64f, 3.64f, 0.0f, false, true, -2.596f, -1.075f)
                lineToRelative(-12.0f, -11.998f)
                curveTo(2.71f, 7.904f, 2.33f, 6.983f, 2.33f, 6.002f)
                reflectiveCurveToRelative(0.38f, -1.903f, 1.075f, -2.595f)
                curveTo(4.1f, 2.712f, 5.02f, 2.33f, 6.0f, 2.33f)
                reflectiveCurveToRelative(1.904f, 0.381f, 2.596f, 1.076f)
                lineToRelative(12.0f, 11.997f)
                close()
                moveTo(20.596f, 8.598f)
                arcToRelative(3.65f, 3.65f, 0.0f, false, true, -2.443f, 1.073f)
                lineToRelative(-7.34f, -7.342f)
                lineTo(18.0f, 2.329f)
                arcToRelative(3.64f, 3.64f, 0.0f, false, true, 2.596f, 1.075f)
                curveTo(21.29f, 4.1f, 21.67f, 5.02f, 21.67f, 6.0f)
                reflectiveCurveToRelative(-0.38f, 1.904f, -1.075f, 2.598f)
                close()
            }
        }
        .build()
        return _shortcut!!
    }

private var _shortcut: ImageVector? = null
