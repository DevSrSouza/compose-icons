package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.CoreosFill: ImageVector
    get() {
        if (_coreosFill != null) {
            return _coreosFill!!
        }
        _coreosFill = Builder(name = "CoreosFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(8.329f, 12.304f)
                curveToRelative(-0.04f, 0.85f, 0.037f, 1.697f, 0.118f, 2.544f)
                curveToRelative(0.005f, 0.06f, 0.027f, 0.074f, 0.08f, 0.08f)
                curveToRelative(0.406f, 0.054f, 0.813f, 0.102f, 1.222f, 0.127f)
                curveToRelative(0.964f, 0.061f, 1.928f, 0.139f, 2.896f, 0.085f)
                curveToRelative(0.55f, -0.03f, 1.1f, -0.048f, 1.648f, -0.095f)
                curveToRelative(0.78f, -0.068f, 1.56f, -0.155f, 2.33f, -0.312f)
                curveToRelative(0.958f, -0.194f, 1.907f, -0.425f, 2.8f, -0.845f)
                curveToRelative(0.406f, -0.19f, 0.79f, -0.415f, 1.114f, -0.736f)
                curveToRelative(0.238f, -0.235f, 0.408f, -0.507f, 0.41f, -0.86f)
                arcToRelative(8.92f, 8.92f, 0.0f, false, false, -0.045f, -0.94f)
                arcToRelative(9.022f, 9.022f, 0.0f, false, false, -0.481f, -2.18f)
                curveToRelative(-0.584f, -1.618f, -1.51f, -2.989f, -2.826f, -4.07f)
                arcToRelative(8.87f, 8.87f, 0.0f, false, false, -3.851f, -1.863f)
                curveToRelative(-0.5f, -0.105f, -1.006f, -0.144f, -1.514f, -0.18f)
                curveToRelative(-0.573f, -0.041f, -1.064f, 0.12f, -1.488f, 0.514f)
                curveToRelative(-0.495f, 0.457f, -0.837f, 1.024f, -1.122f, 1.633f)
                curveToRelative(-0.667f, 1.427f, -0.973f, 2.954f, -1.166f, 4.508f)
                arcToRelative(15.215f, 15.215f, 0.0f, false, false, -0.125f, 2.59f)
                close()
                moveTo(11.899f, 7.274f)
                curveToRelative(0.959f, 0.03f, 1.77f, 0.324f, 2.494f, 0.856f)
                arcToRelative(4.326f, 4.326f, 0.0f, false, true, 1.714f, 2.612f)
                curveToRelative(0.068f, 0.304f, 0.097f, 0.612f, 0.103f, 0.922f)
                curveToRelative(0.005f, 0.209f, -0.11f, 0.362f, -0.262f, 0.49f)
                curveToRelative(-0.307f, 0.258f, -0.67f, 0.401f, -1.05f, 0.508f)
                curveToRelative(-0.74f, 0.207f, -1.496f, 0.326f, -2.265f, 0.366f)
                curveToRelative(-0.5f, 0.026f, -1.0f, 0.035f, -1.5f, 0.01f)
                curveToRelative(-0.192f, -0.01f, -0.385f, -0.024f, -0.577f, -0.032f)
                curveToRelative(-0.06f, -0.002f, -0.08f, -0.02f, -0.084f, -0.081f)
                curveToRelative(-0.023f, -0.434f, -0.057f, -0.868f, -0.05f, -1.302f)
                curveToRelative(0.016f, -1.026f, 0.094f, -2.045f, 0.397f, -3.034f)
                curveToRelative(0.1f, -0.329f, 0.223f, -0.65f, 0.42f, -0.936f)
                curveToRelative(0.173f, -0.25f, 0.378f, -0.437f, 0.66f, -0.38f)
                close()
            }
        }
        .build()
        return _coreosFill!!
    }

private var _coreosFill: ImageVector? = null
