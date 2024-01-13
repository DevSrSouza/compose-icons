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

public val SimpleIcons.Shelly: ImageVector
    get() {
        if (_shelly != null) {
            return _shelly!!
        }
        _shelly = Builder(name = "Shelly", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.033f, 0.88f)
                curveToRelative(1.07f, -0.443f, 2.495f, -0.679f, 4.322f, -0.679f)
                horizontalLineToRelative(5.762f)
                curveToRelative(-0.167f, 0.61f, -0.548f, 1.087f, -1.142f, 1.436f)
                curveToRelative(-0.532f, 0.308f, -1.14f, 0.463f, -1.823f, 0.463f)
                horizontalLineToRelative(-0.927f)
                curveToRelative(-0.89f, 0.0f, -1.663f, 0.154f, -2.32f, 0.463f)
                curveToRelative(-0.859f, 0.403f, -1.286f, 1.0f, -1.286f, 1.789f)
                curveToRelative(0.0f, 0.893f, 0.59f, 1.594f, 1.774f, 2.1f)
                arcToRelative(7.423f, 7.423f, 0.0f, false, false, 2.927f, 0.581f)
                curveToRelative(1.318f, 0.0f, 2.416f, -0.29f, 3.297f, -0.867f)
                curveToRelative(1.024f, -0.664f, 1.535f, -1.616f, 1.535f, -2.857f)
                curveToRelative(0.0f, -0.854f, -0.325f, -2.08f, -0.976f, -3.676f)
                curveToRelative(-0.65f, -1.597f, -0.975f, -2.837f, -0.975f, -3.723f)
                curveToRelative(0.0f, -2.79f, 2.305f, -4.233f, 6.916f, -4.324f)
                curveToRelative(0.641f, -0.01f, 1.337f, -0.005f, 1.916f, -0.004f)
                curveToRelative(0.593f, 0.0f, 1.144f, 0.05f, 1.66f, 0.147f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(16.758f, 5.691f)
                curveToRelative(-1.206f, 0.0f, -1.809f, 0.502f, -1.809f, 1.506f)
                curveToRelative(0.0f, 0.514f, 0.356f, 1.665f, 1.067f, 3.451f)
                curveToRelative(0.71f, 1.787f, 1.064f, 3.186f, 1.064f, 4.198f)
                curveToRelative(0.0f, 2.166f, -1.202f, 3.791f, -3.607f, 4.875f)
                curveToRelative(-1.794f, 0.797f, -3.892f, 1.197f, -6.297f, 1.197f)
                curveToRelative(-1.268f, 0.0f, -2.442f, -0.114f, -3.543f, -0.316f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 24.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.781f, -4.256f)
                arcToRelative(3.404f, 3.404f, 0.0f, false, true, -0.832f, 0.77f)
                horizontalLineToRelative(-4.371f)
                lineToRelative(1.425f, -2.828f)
                arcToRelative(299.94f, 299.94f, 0.0f, false, false, -2.683f, 0.005f)
                close()
            }
        }
        .build()
        return _shelly!!
    }

private var _shelly: ImageVector? = null
