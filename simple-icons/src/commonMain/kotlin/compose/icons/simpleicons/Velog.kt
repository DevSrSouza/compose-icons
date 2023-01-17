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

public val SimpleIcons.Velog: ImageVector
    get() {
        if (_velog != null) {
            return _velog!!
        }
        _velog = Builder(name = "Velog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 0.0f)
                curveTo(1.338f, 0.0f, 0.0f, 1.338f, 0.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.662f, 1.338f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.662f, 0.0f, 3.0f, -1.338f, 3.0f, -3.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.662f, -1.338f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                close()
                moveTo(9.883f, 6.25f)
                curveToRelative(0.63f, 0.0f, 1.005f, 0.3f, 1.125f, 0.9f)
                lineToRelative(1.463f, 8.303f)
                curveToRelative(0.465f, -0.615f, 0.846f, -1.133f, 1.146f, -1.553f)
                curveToRelative(0.465f, -0.66f, 0.893f, -1.418f, 1.283f, -2.273f)
                curveToRelative(0.405f, -0.855f, 0.608f, -1.62f, 0.608f, -2.295f)
                curveToRelative(0.0f, -0.405f, -0.113f, -0.727f, -0.338f, -0.967f)
                curveToRelative(-0.21f, -0.255f, -0.608f, -0.577f, -1.193f, -0.967f)
                curveToRelative(0.6f, -0.765f, 1.35f, -1.148f, 2.25f, -1.148f)
                curveToRelative(0.48f, 0.0f, 0.878f, 0.143f, 1.193f, 0.428f)
                curveToRelative(0.33f, 0.285f, 0.494f, 0.704f, 0.494f, 1.26f)
                curveToRelative(0.0f, 0.93f, -0.39f, 2.093f, -1.17f, 3.488f)
                curveToRelative(-0.765f, 1.38f, -2.241f, 3.457f, -4.431f, 6.232f)
                lineToRelative(-2.227f, 0.156f)
                lineToRelative(-1.711f, -9.628f)
                horizontalLineToRelative(-2.25f)
                lineTo(6.125f, 7.24f)
                curveToRelative(0.6f, -0.195f, 1.305f, -0.406f, 2.115f, -0.63f)
                curveToRelative(0.81f, -0.24f, 1.358f, -0.36f, 1.643f, -0.36f)
                close()
            }
        }
        .build()
        return _velog!!
    }

private var _velog: ImageVector? = null
