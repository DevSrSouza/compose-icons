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

public val SimpleIcons.Lastdotfm: ImageVector
    get() {
        if (_lastdotfm != null) {
            return _lastdotfm!!
        }
        _lastdotfm = Builder(name = "Lastdotfm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.584f, 17.21f)
                lineToRelative(-0.88f, -2.392f)
                reflectiveCurveToRelative(-1.43f, 1.594f, -3.573f, 1.594f)
                curveToRelative(-1.897f, 0.0f, -3.244f, -1.649f, -3.244f, -4.288f)
                curveToRelative(0.0f, -3.382f, 1.704f, -4.591f, 3.381f, -4.591f)
                curveToRelative(2.42f, 0.0f, 3.189f, 1.567f, 3.849f, 3.574f)
                lineToRelative(0.88f, 2.749f)
                curveToRelative(0.88f, 2.666f, 2.529f, 4.81f, 7.285f, 4.81f)
                curveToRelative(3.409f, 0.0f, 5.718f, -1.044f, 5.718f, -3.793f)
                curveToRelative(0.0f, -2.227f, -1.265f, -3.381f, -3.63f, -3.931f)
                lineToRelative(-1.758f, -0.385f)
                curveToRelative(-1.21f, -0.275f, -1.567f, -0.77f, -1.567f, -1.595f)
                curveToRelative(0.0f, -0.934f, 0.742f, -1.484f, 1.952f, -1.484f)
                curveToRelative(1.32f, 0.0f, 2.034f, 0.495f, 2.144f, 1.677f)
                lineToRelative(2.749f, -0.33f)
                curveToRelative(-0.22f, -2.474f, -1.924f, -3.492f, -4.729f, -3.492f)
                curveToRelative(-2.474f, 0.0f, -4.893f, 0.935f, -4.893f, 3.932f)
                curveToRelative(0.0f, 1.87f, 0.907f, 3.051f, 3.189f, 3.601f)
                lineToRelative(1.87f, 0.44f)
                curveToRelative(1.402f, 0.33f, 1.869f, 0.907f, 1.869f, 1.704f)
                curveToRelative(0.0f, 1.017f, -0.99f, 1.43f, -2.86f, 1.43f)
                curveToRelative(-2.776f, 0.0f, -3.93f, -1.457f, -4.59f, -3.464f)
                lineToRelative(-0.907f, -2.75f)
                curveToRelative(-1.155f, -3.573f, -2.997f, -4.893f, -6.653f, -4.893f)
                curveTo(2.144f, 5.333f, 0.0f, 7.89f, 0.0f, 12.233f)
                curveToRelative(0.0f, 4.18f, 2.144f, 6.434f, 5.993f, 6.434f)
                curveToRelative(3.106f, 0.0f, 4.591f, -1.457f, 4.591f, -1.457f)
                close()
            }
        }
        .build()
        return _lastdotfm!!
    }

private var _lastdotfm: ImageVector? = null
