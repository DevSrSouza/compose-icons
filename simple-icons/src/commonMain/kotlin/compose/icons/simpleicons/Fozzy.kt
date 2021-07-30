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

public val SimpleIcons.Fozzy: ImageVector
    get() {
        if (_fozzy != null) {
            return _fozzy!!
        }
        _fozzy = Builder(name = "Fozzy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.494f, 20.48f)
                lineToRelative(-0.998f, -2.095f)
                lineToRelative(5.787f, -11.273f)
                curveToRelative(0.897f, 1.396f, 1.496f, 3.092f, 1.496f, 4.888f)
                curveToRelative(0.0f, 3.99f, -2.594f, 7.382f, -6.285f, 8.48f)
                close()
                moveTo(12.998f, 0.029f)
                curveTo(5.615f, -0.471f, -0.47f, 5.615f, 0.028f, 12.998f)
                curveToRelative(0.5f, 5.786f, 5.188f, 10.475f, 10.974f, 10.973f)
                curveToRelative(7.383f, 0.5f, 13.468f, -5.586f, 12.97f, -12.969f)
                curveTo(23.471f, 5.216f, 18.783f, 0.527f, 12.997f, 0.03f)
                close()
                moveTo(7.112f, 4.717f)
                curveToRelative(1.297f, -0.897f, 2.793f, -1.396f, 4.39f, -1.496f)
                lineTo(8.807f, 8.409f)
                lineTo(7.112f, 4.717f)
                close()
                moveTo(10.603f, 12.1f)
                lineToRelative(4.19f, -8.38f)
                curveToRelative(0.798f, 0.3f, 1.497f, 0.598f, 2.195f, 1.097f)
                lineTo(11.9f, 14.793f)
                lineTo(10.603f, 12.1f)
                close()
                moveTo(3.221f, 12.0f)
                curveToRelative(0.0f, -1.796f, 0.599f, -3.492f, 1.496f, -4.888f)
                lineToRelative(6.485f, 13.667f)
                curveTo(6.712f, 20.38f, 3.22f, 16.589f, 3.22f, 12.0f)
                close()
            }
        }
        .build()
        return _fozzy!!
    }

private var _fozzy: ImageVector? = null
