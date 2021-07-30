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

public val SimpleIcons.Logmein: ImageVector
    get() {
        if (_logmein != null) {
            return _logmein!!
        }
        _logmein = Builder(name = "Logmein", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.372f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.372f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.628f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(5.379f, 4.768f)
                horizontalLineToRelative(1.74f)
                curveToRelative(0.147f, 0.0f, 0.288f, 0.004f, 0.424f, 0.01f)
                arcToRelative(0.376f, 0.376f, 0.0f, false, true, 0.303f, 0.152f)
                arcToRelative(0.684f, 0.684f, 0.0f, false, true, 0.11f, 0.364f)
                curveToRelative(0.007f, 0.149f, 0.01f, 0.31f, 0.01f, 0.484f)
                verticalLineToRelative(12.093f)
                curveToRelative(0.0f, 0.176f, 0.004f, 0.37f, 0.01f, 0.587f)
                curveToRelative(0.006f, 0.216f, -0.024f, 0.377f, -0.091f, 0.485f)
                curveToRelative(-0.054f, 0.094f, -0.174f, 0.17f, -0.363f, 0.222f)
                arcToRelative(0.754f, 0.754f, 0.0f, false, true, -0.304f, 0.02f)
                arcToRelative(2.533f, 2.533f, 0.0f, false, false, -0.323f, -0.02f)
                lineTo(5.702f, 19.165f)
                curveToRelative(-0.149f, 0.0f, -0.286f, -0.006f, -0.415f, -0.02f)
                arcToRelative(0.572f, 0.572f, 0.0f, false, true, -0.314f, -0.12f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, true, -0.12f, -0.304f)
                arcToRelative(4.164f, 4.164f, 0.0f, false, true, -0.02f, -0.424f)
                lineTo(4.833f, 6.203f)
                curveToRelative(0.0f, -0.188f, -0.004f, -0.41f, -0.01f, -0.667f)
                curveToRelative(-0.007f, -0.255f, 0.024f, -0.437f, 0.09f, -0.545f)
                arcToRelative(0.595f, 0.595f, 0.0f, false, true, 0.264f, -0.202f)
                curveToRelative(0.04f, 0.0f, 0.078f, -0.004f, 0.11f, -0.01f)
                arcToRelative(0.536f, 0.536f, 0.0f, false, true, 0.092f, -0.011f)
                close()
                moveTo(15.906f, 8.455f)
                curveToRelative(0.201f, -0.008f, 0.386f, -0.001f, 0.548f, 0.019f)
                curveToRelative(0.565f, 0.032f, 1.053f, 0.144f, 1.464f, 0.338f)
                curveToRelative(0.539f, 0.257f, 0.963f, 0.634f, 1.273f, 1.133f)
                curveToRelative(0.095f, 0.148f, 0.168f, 0.307f, 0.222f, 0.475f)
                curveToRelative(0.055f, 0.169f, 0.11f, 0.34f, 0.164f, 0.515f)
                curveToRelative(0.026f, 0.108f, 0.042f, 0.21f, 0.05f, 0.304f)
                curveToRelative(0.005f, 0.094f, 0.023f, 0.19f, 0.05f, 0.284f)
                curveToRelative(0.0f, 0.08f, 0.007f, 0.134f, 0.02f, 0.16f)
                curveToRelative(0.027f, 0.19f, 0.04f, 0.385f, 0.04f, 0.587f)
                verticalLineToRelative(5.661f)
                curveToRelative(0.0f, 0.257f, -0.004f, 0.503f, -0.01f, 0.738f)
                curveToRelative(-0.008f, 0.237f, -0.105f, 0.39f, -0.294f, 0.456f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, true, -0.283f, 0.04f)
                horizontalLineToRelative(-1.415f)
                curveToRelative(-0.163f, 0.0f, -0.307f, -0.01f, -0.435f, -0.03f)
                arcToRelative(0.418f, 0.418f, 0.0f, false, true, -0.293f, -0.173f)
                arcToRelative(0.613f, 0.613f, 0.0f, false, true, -0.09f, -0.313f)
                arcToRelative(8.825f, 8.825f, 0.0f, false, true, -0.01f, -0.416f)
                verticalLineToRelative(-4.426f)
                curveToRelative(0.0f, -0.5f, -0.02f, -0.961f, -0.06f, -1.386f)
                curveToRelative(-0.042f, -0.424f, -0.163f, -0.785f, -0.365f, -1.082f)
                arcToRelative(1.427f, 1.427f, 0.0f, false, false, -0.668f, -0.51f)
                curveToRelative(-0.186f, -0.095f, -0.488f, -0.156f, -0.827f, -0.156f)
                curveToRelative(-0.397f, 0.0f, -0.74f, 0.083f, -0.912f, 0.207f)
                curveToRelative(-0.139f, 0.057f, -0.26f, 0.124f, -0.362f, 0.197f)
                curveToRelative(-0.433f, 0.31f, -0.688f, 0.762f, -0.77f, 1.354f)
                curveToRelative(-0.08f, 0.594f, -0.123f, 1.261f, -0.123f, 2.002f)
                verticalLineToRelative(4.125f)
                curveToRelative(0.0f, 0.121f, -0.02f, 0.223f, -0.06f, 0.304f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, true, -0.323f, 0.262f)
                curveToRelative(-0.149f, 0.027f, -0.33f, 0.04f, -0.545f, 0.04f)
                lineTo(10.88f, 19.164f)
                curveToRelative(-0.15f, 0.0f, -0.297f, -0.006f, -0.446f, -0.02f)
                curveToRelative(-0.148f, -0.013f, -0.256f, -0.06f, -0.323f, -0.142f)
                curveToRelative(-0.095f, -0.12f, -0.139f, -0.294f, -0.131f, -0.525f)
                curveToRelative(0.006f, -0.23f, 0.009f, -0.446f, 0.009f, -0.647f)
                lineTo(9.989f, 9.6f)
                curveToRelative(0.0f, -0.147f, 0.004f, -0.282f, 0.01f, -0.403f)
                arcToRelative(0.507f, 0.507f, 0.0f, false, true, 0.112f, -0.305f)
                arcToRelative(0.24f, 0.24f, 0.0f, false, true, 0.132f, -0.09f)
                curveToRelative(0.06f, -0.02f, 0.124f, -0.037f, 0.191f, -0.05f)
                horizontalLineToRelative(0.102f)
                curveToRelative(0.068f, -0.014f, 0.138f, -0.022f, 0.212f, -0.022f)
                horizontalLineToRelative(1.06f)
                curveToRelative(0.109f, 0.0f, 0.214f, 0.005f, 0.316f, 0.012f)
                curveToRelative(0.1f, 0.006f, 0.19f, 0.023f, 0.271f, 0.05f)
                curveToRelative(0.095f, 0.04f, 0.16f, 0.1f, 0.193f, 0.181f)
                curveToRelative(0.03f, 0.072f, 0.03f, 0.147f, 0.054f, 0.24f)
                curveToRelative(0.056f, 0.23f, 0.118f, 0.486f, 0.291f, 0.508f)
                curveToRelative(0.08f, 0.01f, 0.159f, -0.025f, 0.224f, -0.09f)
                curveToRelative(0.031f, -0.022f, 0.114f, -0.11f, 0.14f, -0.144f)
                curveToRelative(0.095f, -0.114f, 0.28f, -0.278f, 0.388f, -0.346f)
                curveToRelative(0.078f, -0.058f, 0.142f, -0.1f, 0.202f, -0.136f)
                curveToRelative(0.192f, -0.134f, 0.483f, -0.261f, 0.832f, -0.36f)
                curveToRelative(0.014f, -0.006f, 0.028f, -0.012f, 0.042f, -0.016f)
                curveToRelative(0.112f, -0.036f, 0.225f, -0.062f, 0.342f, -0.077f)
                lineToRelative(0.159f, -0.029f)
                curveToRelative(0.224f, -0.038f, 0.442f, -0.06f, 0.643f, -0.068f)
                close()
            }
        }
        .build()
        return _logmein!!
    }

private var _logmein: ImageVector? = null
