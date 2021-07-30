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

public val SimpleIcons.Sass: ImageVector
    get() {
        if (_sass != null) {
            return _sass!!
        }
        _sass = Builder(name = "Sass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, 5.373f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.373f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(9.615f, 15.998f)
                curveToRelative(0.175f, 0.645f, 0.156f, 1.248f, -0.024f, 1.792f)
                lineToRelative(-0.065f, 0.18f)
                curveToRelative(-0.024f, 0.061f, -0.052f, 0.12f, -0.078f, 0.176f)
                curveToRelative(-0.14f, 0.29f, -0.326f, 0.56f, -0.555f, 0.81f)
                curveToRelative(-0.698f, 0.759f, -1.672f, 1.047f, -2.09f, 0.805f)
                curveToRelative(-0.45f, -0.262f, -0.226f, -1.335f, 0.584f, -2.19f)
                curveToRelative(0.871f, -0.918f, 2.12f, -1.509f, 2.12f, -1.509f)
                verticalLineToRelative(-0.003f)
                lineToRelative(0.108f, -0.061f)
                close()
                moveTo(19.526f, 5.137f)
                curveToRelative(-0.542f, -2.133f, -4.077f, -2.834f, -7.422f, -1.645f)
                curveToRelative(-1.989f, 0.707f, -4.144f, 1.818f, -5.693f, 3.267f)
                curveTo(4.568f, 8.48f, 4.275f, 9.98f, 4.396f, 10.607f)
                curveToRelative(0.427f, 2.211f, 3.457f, 3.657f, 4.703f, 4.73f)
                verticalLineToRelative(0.006f)
                curveToRelative(-0.367f, 0.18f, -3.056f, 1.529f, -3.686f, 2.925f)
                curveToRelative(-0.675f, 1.47f, 0.105f, 2.521f, 0.615f, 2.655f)
                curveToRelative(1.575f, 0.436f, 3.195f, -0.36f, 4.065f, -1.649f)
                curveToRelative(0.84f, -1.261f, 0.766f, -2.881f, 0.404f, -3.676f)
                curveToRelative(0.496f, -0.135f, 1.08f, -0.195f, 1.83f, -0.104f)
                curveToRelative(2.101f, 0.24f, 2.521f, 1.56f, 2.43f, 2.1f)
                curveToRelative(-0.09f, 0.539f, -0.523f, 0.854f, -0.674f, 0.944f)
                curveToRelative(-0.15f, 0.091f, -0.195f, 0.12f, -0.181f, 0.181f)
                curveToRelative(0.015f, 0.09f, 0.091f, 0.09f, 0.21f, 0.075f)
                curveToRelative(0.165f, -0.03f, 1.096f, -0.45f, 1.141f, -1.471f)
                curveToRelative(0.045f, -1.29f, -1.186f, -2.729f, -3.375f, -2.7f)
                curveToRelative(-0.9f, 0.016f, -1.471f, 0.091f, -1.875f, 0.256f)
                curveToRelative(-0.03f, -0.045f, -0.061f, -0.075f, -0.105f, -0.105f)
                curveToRelative(-1.35f, -1.455f, -3.855f, -2.475f, -3.75f, -4.41f)
                curveToRelative(0.03f, -0.705f, 0.285f, -2.564f, 4.8f, -4.814f)
                curveToRelative(3.705f, -1.846f, 6.661f, -1.335f, 7.171f, -0.21f)
                curveToRelative(0.733f, 1.604f, -1.576f, 4.59f, -5.431f, 5.024f)
                curveToRelative(-1.47f, 0.165f, -2.235f, -0.404f, -2.431f, -0.615f)
                curveToRelative(-0.209f, -0.225f, -0.239f, -0.24f, -0.314f, -0.194f)
                curveToRelative(-0.12f, 0.06f, -0.045f, 0.255f, 0.0f, 0.375f)
                curveToRelative(0.12f, 0.3f, 0.585f, 0.825f, 1.396f, 1.095f)
                curveToRelative(0.704f, 0.225f, 2.43f, 0.359f, 4.5f, -0.45f)
                curveToRelative(2.324f, -0.899f, 4.139f, -3.405f, 3.614f, -5.505f)
                lineToRelative(0.073f, 0.067f)
                close()
            }
        }
        .build()
        return _sass!!
    }

private var _sass: ImageVector? = null
