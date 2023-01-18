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

public val RemixIcons.AmazonLine: ImageVector
    get() {
        if (_amazonLine != null) {
            return _amazonLine!!
        }
        _amazonLine = Builder(name = "AmazonLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.625f, 14.62f)
                curveToRelative(-1.107f, 1.619f, -2.728f, 2.384f, -4.625f, 2.384f)
                curveToRelative(-2.304f, 0.0f, -4.276f, -1.773f, -3.993f, -4.124f)
                curveToRelative(0.315f, -2.608f, 2.34f, -3.73f, 5.708f, -4.143f)
                curveToRelative(0.601f, -0.073f, 0.85f, -0.094f, 2.147f, -0.19f)
                lineToRelative(0.138f, -0.01f)
                verticalLineToRelative(-0.215f)
                curveTo(15.0f, 6.526f, 13.932f, 5.3f, 12.5f, 5.3f)
                curveToRelative(-1.437f, 0.0f, -2.44f, 0.747f, -3.055f, 2.526f)
                lineToRelative(-1.89f, -0.652f)
                curveTo(8.442f, 4.604f, 10.193f, 3.3f, 12.5f, 3.3f)
                curveToRelative(2.603f, 0.0f, 4.5f, 2.178f, 4.5f, 5.022f)
                curveToRelative(0.0f, 2.649f, 0.163f, 4.756f, 0.483f, 5.557f)
                curveToRelative(0.356f, 0.892f, 0.486f, 1.117f, 0.884f, 1.613f)
                lineToRelative(-1.56f, 1.251f)
                curveToRelative(-0.523f, -0.652f, -0.753f, -1.049f, -1.181f, -2.122f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(21.257f, 20.545f)
                curveToRelative(-0.271f, 0.2f, -0.742f, 0.081f, -0.529f, -0.44f)
                curveToRelative(0.265f, -0.648f, 0.547f, -1.408f, 0.262f, -1.752f)
                curveToRelative(-0.21f, -0.255f, -0.467f, -0.382f, -1.027f, -0.382f)
                curveToRelative(-0.46f, 0.0f, -0.69f, 0.06f, -0.995f, 0.08f)
                curveToRelative(-0.204f, 0.013f, -0.293f, -0.297f, -0.091f, -0.44f)
                arcToRelative(2.96f, 2.96f, 0.0f, false, true, 0.87f, -0.428f)
                curveToRelative(1.15f, -0.344f, 2.505f, -0.155f, 2.67f, 0.083f)
                curveToRelative(0.365f, 0.53f, -0.199f, 2.569f, -1.16f, 3.28f)
                close()
                moveTo(20.075f, 19.461f)
                arcToRelative(7.555f, 7.555f, 0.0f, false, true, -0.83f, 0.695f)
                curveToRelative(-2.122f, 1.616f, -4.87f, 2.46f, -7.258f, 2.46f)
                curveToRelative(-3.843f, 0.0f, -7.28f, -1.793f, -9.888f, -4.795f)
                curveToRelative(-0.223f, -0.23f, -0.038f, -0.566f, 0.223f, -0.384f)
                curveToRelative(2.81f, 2.077f, 6.288f, 3.333f, 9.889f, 3.333f)
                curveToRelative(2.265f, 0.0f, 4.708f, -0.537f, 7.035f, -1.693f)
                curveToRelative(0.162f, -0.076f, 0.344f, -0.18f, 0.503f, -0.254f)
                curveToRelative(0.367f, -0.21f, 0.69f, 0.306f, 0.326f, 0.638f)
                close()
                moveTo(15.01f, 10.541f)
                curveToRelative(-1.258f, 0.094f, -1.496f, 0.113f, -2.052f, 0.181f)
                curveToRelative(-2.552f, 0.313f, -3.797f, 1.003f, -3.965f, 2.398f)
                curveToRelative(-0.126f, 1.043f, 0.81f, 1.884f, 2.007f, 1.884f)
                curveToRelative(2.039f, 0.0f, 3.517f, -1.228f, 4.022f, -4.463f)
                horizontalLineToRelative(-0.012f)
                close()
            }
        }
        .build()
        return _amazonLine!!
    }

private var _amazonLine: ImageVector? = null
