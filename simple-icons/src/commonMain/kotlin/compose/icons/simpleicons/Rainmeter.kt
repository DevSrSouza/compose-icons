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

public val SimpleIcons.Rainmeter: ImageVector
    get() {
        if (_rainmeter != null) {
            return _rainmeter!!
        }
        _rainmeter = Builder(name = "Rainmeter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.7f, 1.088f)
                lineTo(12.0f, 0.0f)
                lineToRelative(-0.7f, 1.088f)
                curveToRelative(-0.751f, 1.168f, -7.342f, 11.525f, -7.342f, 15.366f)
                curveTo(3.958f, 20.615f, 7.565f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(8.042f, -3.385f, 8.042f, -7.546f)
                curveToRelative(0.0f, -3.84f, -6.591f, -14.197f, -7.342f, -15.366f)
                close()
                moveTo(12.0f, 22.335f)
                curveToRelative(-3.516f, 0.0f, -6.377f, -2.638f, -6.377f, -5.881f)
                curveTo(5.623f, 13.908f, 9.732f, 6.756f, 12.0f, 3.1f)
                curveToRelative(2.268f, 3.656f, 6.377f, 10.809f, 6.377f, 13.355f)
                curveToRelative(0.0f, 3.242f, -2.861f, 5.88f, -6.377f, 5.88f)
                close()
                moveTo(16.957f, 16.318f)
                curveToRelative(0.0f, 2.548f, -2.22f, 4.615f, -4.957f, 4.615f)
                curveToRelative(-2.737f, 0.0f, -4.957f, -2.067f, -4.957f, -4.615f)
                curveToRelative(0.0f, -0.163f, 0.021f, -0.347f, 0.058f, -0.549f)
                curveToRelative(0.0f, 0.0f, 1.306f, -2.616f, 4.847f, 0.0f)
                curveToRelative(2.999f, 2.215f, 4.95f, 0.0f, 4.95f, 0.0f)
                curveToRelative(0.038f, 0.202f, 0.059f, 0.386f, 0.059f, 0.549f)
                close()
            }
        }
        .build()
        return _rainmeter!!
    }

private var _rainmeter: ImageVector? = null
