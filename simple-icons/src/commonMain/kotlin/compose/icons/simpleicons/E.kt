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

public val SimpleIcons.E: ImageVector
    get() {
        if (_e != null) {
            return _e!!
        }
        _e = Builder(name = "E", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.1381f, 0.0533f)
                curveTo(9.6246f, -0.2791f, 6.0635f, 0.9503f, 3.4923f, 3.5341f)
                curveTo(0.0641f, 6.9792f, -0.9475f, 12.1708f, 0.9366f, 16.6509f)
                curveToRelative(1.8841f, 4.4801f, 6.3025f, 7.3888f, 11.1625f, 7.3483f)
                arcToRelative(2.2749f, 2.2749f, 0.0f, true, false, -0.0376f, -4.5489f)
                curveToRelative(-3.0283f, 0.0253f, -5.7572f, -1.7706f, -6.9312f, -4.5622f)
                curveToRelative(-1.174f, -2.7916f, -0.5492f, -5.9982f, 1.587f, -8.1448f)
                curveToRelative(2.1362f, -2.1467f, 5.339f, -2.7873f, 8.1363f, -1.627f)
                curveToRelative(2.0716f, 0.8593f, 3.5908f, 2.5793f, 4.2409f, 4.641f)
                horizontalLineTo(12.0506f)
                arcToRelative(2.275f, 2.275f, 0.0f, true, false, 0.0f, 4.5501f)
                horizontalLineToRelative(9.6749f)
                arcToRelative(2.2749f, 2.2749f, 0.0f, false, false, 2.2745f, -2.2672f)
                curveToRelative(0.0167f, -4.8601f, -2.9136f, -9.264f, -7.4029f, -11.1261f)
                curveToRelative(-1.1223f, -0.4655f, -2.2878f, -0.75f, -3.459f, -0.8608f)
                close()
            }
        }
        .build()
        return _e!!
    }

private var _e: ImageVector? = null
