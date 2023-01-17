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

public val SimpleIcons.Honey: ImageVector
    get() {
        if (_honey != null) {
            return _honey!!
        }
        _honey = Builder(name = "Honey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.416f, 5.59f)
                curveToRelative(0.04f, -0.994f, 0.254f, -2.312f, 0.909f, -3.091f)
                curveToRelative(0.922f, -1.09f, 2.794f, -0.914f, 3.102f, 0.658f)
                curveToRelative(0.146f, 0.767f, -0.054f, 1.708f, -0.402f, 2.367f)
                curveToRelative(-0.734f, 1.439f, -2.1f, 2.622f, -3.636f, 3.026f)
                curveToRelative(0.013f, -0.901f, 0.0f, -2.071f, 0.027f, -2.96f)
                close()
                moveTo(21.956f, 19.494f)
                curveToRelative(-0.775f, 0.901f, -1.764f, 1.6f, -2.714f, 1.56f)
                curveToRelative(-1.07f, -0.04f, -0.963f, -1.372f, -0.963f, -2.124f)
                verticalLineToRelative(-3.16f)
                curveToRelative(0.014f, -0.605f, 0.014f, -1.21f, -0.053f, -1.802f)
                curveToRelative(-0.174f, -1.761f, -1.204f, -3.173f, -3.142f, -3.307f)
                curveToRelative(-3.37f, -0.135f, -4.706f, 3.132f, -5.695f, 5.821f)
                verticalLineToRelative(-5.89f)
                curveToRelative(2.94f, -0.456f, 7.02f, -2.11f, 7.14f, -5.875f)
                curveToRelative(0.2f, -6.4f, -10.563f, -6.629f, -10.523f, 1.426f)
                curveToRelative(0.014f, 0.618f, 0.014f, 1.802f, 0.014f, 2.42f)
                curveToRelative(-1.445f, -0.215f, -2.608f, -2.34f, -3.143f, -3.604f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, false, -0.427f, -0.215f)
                curveTo(0.43f, 5.27f, 0.137f, 7.407f, 1.5f, 8.86f)
                curveToRelative(1.124f, 1.197f, 2.915f, 1.654f, 4.493f, 1.735f)
                curveToRelative(-0.013f, 4.664f, -0.013f, 7.542f, -0.013f, 12.194f)
                curveToRelative(0.067f, 0.66f, 0.962f, 0.835f, 1.484f, 0.848f)
                curveToRelative(0.588f, 0.013f, 1.684f, -0.16f, 1.738f, -0.928f)
                curveToRelative(0.187f, -2.286f, 2.125f, -9.036f, 4.76f, -9.036f)
                curveToRelative(0.613f, 0.0f, 0.908f, 0.403f, 0.908f, 0.995f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 2.286f, 1.284f, 3.818f, 3.623f, 3.832f)
                curveToRelative(2.073f, 0.0f, 3.891f, -1.72f, 4.8f, -3.698f)
                curveToRelative(0.281f, -0.632f, -0.922f, -1.278f, -1.337f, -0.807f)
                close()
            }
        }
        .build()
        return _honey!!
    }

private var _honey: ImageVector? = null
