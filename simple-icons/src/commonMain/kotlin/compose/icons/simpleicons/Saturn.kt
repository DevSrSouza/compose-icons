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

public val SimpleIcons.Saturn: ImageVector
    get() {
        if (_saturn != null) {
            return _saturn!!
        }
        _saturn = Builder(name = "Saturn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.039f, 11.459f)
                curveToRelative(0.001f, 0.015f, 0.022f, 0.244f, 0.03f, 0.407f)
                curveToRelative(0.006f, 0.113f, 0.0f, 0.29f, 0.0f, 0.3f)
                curveToRelative(0.003f, 0.0f, 0.029f, 0.023f, 0.03f, 0.024f)
                curveToRelative(1.428f, 1.17f, 2.943f, 2.767f, 3.204f, 3.94f)
                curveToRelative(0.073f, 0.325f, 0.056f, 0.618f, -0.072f, 0.868f)
                curveToRelative(-0.152f, 0.293f, -0.439f, 0.503f, -0.834f, 0.638f)
                curveToRelative(-2.046f, 0.7f, -6.925f, -0.642f, -10.907f, -2.609f)
                curveToRelative(-2.845f, -1.406f, -5.342f, -3.081f, -7.032f, -4.719f)
                curveToRelative(-1.57f, -1.523f, -1.995f, -2.71f, -1.59f, -3.427f)
                curveToRelative(0.155f, -0.271f, 0.42f, -0.472f, 0.776f, -0.609f)
                curveToRelative(1.299f, -0.507f, 3.788f, -0.152f, 6.239f, 0.579f)
                curveToRelative(-1.16f, 0.866f, -1.968f, 2.034f, -2.342f, 3.202f)
                lineToRelative(-0.001f, 0.007f)
                arcToRelative(0.051f, 0.051f, 0.0f, false, true, -0.001f, 0.006f)
                curveToRelative(-0.115f, 1.07f, 1.434f, 2.47f, 3.0f, 3.25f)
                curveToRelative(-0.002f, -0.006f, 0.084f, 0.032f, 0.084f, 0.026f)
                curveToRelative(-0.002f, -0.006f, -0.015f, -0.109f, -0.017f, -0.113f)
                curveToRelative(-0.366f, -2.66f, 1.648f, -6.64f, 3.765f, -7.513f)
                curveToRelative(0.136f, -0.056f, 0.254f, -0.09f, 0.27f, -0.095f)
                lineToRelative(-0.273f, -0.027f)
                curveToRelative(-0.074f, -0.006f, -0.148f, -0.013f, -0.228f, -0.015f)
                arcToRelative(7.464f, 7.464f, 0.0f, false, false, -0.272f, -0.01f)
                arcToRelative(6.443f, 6.443f, 0.0f, false, false, -3.4f, 0.892f)
                curveTo(5.378f, 5.057f, 2.383f, 4.892f, 1.13f, 5.31f)
                curveToRelative(-0.497f, 0.167f, -0.833f, 0.418f, -1.0f, 0.751f)
                curveToRelative(-0.174f, 0.35f, -0.175f, 0.79f, -0.002f, 1.306f)
                curveToRelative(0.57f, 1.704f, 3.058f, 4.032f, 6.211f, 6.099f)
                curveToRelative(0.457f, 2.407f, 2.615f, 4.875f, 5.703f, 5.204f)
                lineToRelative(0.142f, 0.015f)
                arcToRelative(0.278f, 0.278f, 0.0f, false, true, 0.05f, 0.0f)
                arcToRelative(6.618f, 6.618f, 0.0f, false, false, -0.173f, -0.132f)
                curveToRelative(-0.955f, -0.736f, -1.813f, -1.949f, -2.107f, -3.0f)
                lineToRelative(0.185f, 0.093f)
                lineToRelative(0.143f, 0.07f)
                curveToRelative(4.985f, 2.465f, 10.215f, 3.72f, 12.53f, 2.947f)
                curveToRelative(0.519f, -0.174f, 0.9f, -0.418f, 1.075f, -0.768f)
                curveToRelative(0.167f, -0.335f, 0.139f, -0.78f, -0.029f, -1.278f)
                curveToRelative(-0.436f, -1.3f, -2.304f, -3.284f, -4.675f, -5.052f)
                arcToRelative(5.003f, 5.003f, 0.0f, false, false, -0.145f, -0.107f)
            }
        }
        .build()
        return _saturn!!
    }

private var _saturn: ImageVector? = null
