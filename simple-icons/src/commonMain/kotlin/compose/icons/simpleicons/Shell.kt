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

public val SimpleIcons.Shell: ImageVector
    get() {
        if (_shell != null) {
            return _shell!!
        }
        _shell = Builder(name = "Shell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.863f)
                curveTo(5.34f, 0.863f, 0.0f, 6.251f, 0.0f, 12.98f)
                curveToRelative(0.0f, 0.996f, 0.038f, 1.374f, 0.246f, 2.33f)
                lineToRelative(3.662f, 2.71f)
                lineToRelative(0.57f, 4.515f)
                horizontalLineToRelative(6.102f)
                lineToRelative(0.326f, 0.227f)
                curveToRelative(0.377f, 0.262f, 0.705f, 0.375f, 1.082f, 0.375f)
                curveToRelative(0.352f, 0.0f, 0.732f, -0.101f, 1.024f, -0.313f)
                lineToRelative(0.39f, -0.289f)
                horizontalLineToRelative(6.094f)
                lineToRelative(0.563f, -4.515f)
                lineToRelative(3.695f, -2.71f)
                curveToRelative(0.208f, -0.956f, 0.246f, -1.334f, 0.246f, -2.33f)
                curveTo(24.0f, 6.252f, 18.661f, 0.863f, 12.0f, 0.863f)
                close()
                moveTo(12.996f, 3.121f)
                curveToRelative(0.9f, 0.0f, 1.778f, 0.224f, 2.512f, 0.649f)
                lineToRelative(-2.465f, 12.548f)
                lineToRelative(3.42f, -12.062f)
                curveToRelative(1.059f, 0.36f, 1.863f, 0.941f, 2.508f, 1.814f)
                lineToRelative(0.025f, 0.034f)
                lineToRelative(-4.902f, 10.615f)
                lineToRelative(5.572f, -9.713f)
                lineToRelative(0.033f, 0.03f)
                curveToRelative(0.758f, 0.708f, 1.247f, 1.567f, 1.492f, 2.648f)
                lineToRelative(-6.195f, 7.666f)
                lineToRelative(6.436f, -6.5f)
                lineToRelative(0.01f, 0.021f)
                curveToRelative(0.253f, 0.563f, 0.417f, 1.36f, 0.417f, 1.996f)
                curveToRelative(0.0f, 0.509f, -0.024f, 0.712f, -0.164f, 1.25f)
                lineToRelative(-3.554f, 2.602f)
                lineToRelative(-0.467f, 3.71f)
                horizontalLineToRelative(-4.475f)
                lineToRelative(-0.517f, 0.395f)
                curveToRelative(-0.199f, 0.158f, -0.482f, 0.266f, -0.682f, 0.266f)
                curveToRelative(-0.199f, 0.0f, -0.483f, -0.108f, -0.682f, -0.266f)
                lineToRelative(-0.517f, -0.394f)
                lineTo(6.322f, 20.43f)
                lineToRelative(-0.445f, -3.61f)
                lineToRelative(-3.627f, -2.666f)
                curveToRelative(-0.11f, -0.436f, -0.16f, -0.83f, -0.16f, -1.261f)
                curveToRelative(0.0f, -0.72f, 0.159f, -1.49f, 0.426f, -2.053f)
                lineToRelative(0.013f, -0.024f)
                lineToRelative(6.45f, 6.551f)
                lineTo(2.75f, 9.621f)
                curveToRelative(0.25f, -1.063f, 0.874f, -2.09f, 1.64f, -2.713f)
                lineToRelative(5.542f, 9.776f)
                lineTo(4.979f, 6.1f)
                curveToRelative(0.555f, -0.814f, 1.45f, -1.455f, 2.546f, -1.827f)
                lineToRelative(3.424f, 12.069f)
                lineTo(8.355f, 3.816f)
                lineToRelative(0.055f, -0.03f)
                curveToRelative(0.814f, -0.45f, 1.598f, -0.657f, 2.457f, -0.657f)
                curveToRelative(0.195f, 0.0f, 0.286f, 0.004f, 0.528f, 0.03f)
                lineToRelative(0.587f, 13.05f)
                lineToRelative(0.46f, -13.059f)
                curveToRelative(0.224f, -0.025f, 0.309f, -0.029f, 0.554f, -0.029f)
                close()
            }
        }
        .build()
        return _shell!!
    }

private var _shell: ImageVector? = null
