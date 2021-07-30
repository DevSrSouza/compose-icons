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

public val SimpleIcons.Ubuntu: ImageVector
    get() {
        if (_ubuntu != null) {
            return _ubuntu!!
        }
        _ubuntu = Builder(name = "Ubuntu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(6.623f, 0.0f, 12.0f, 5.377f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.377f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.623f, 0.0f, 12.0f)
                reflectiveCurveTo(5.377f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(15.279f, 17.68f)
                curveToRelative(-0.766f, 0.441f, -1.029f, 1.422f, -0.586f, 2.189f)
                curveToRelative(0.441f, 0.765f, 1.422f, 1.028f, 2.188f, 0.584f)
                curveToRelative(0.766f, -0.441f, 1.029f, -1.422f, 0.585f, -2.189f)
                curveToRelative(-0.441f, -0.765f, -1.421f, -1.028f, -2.187f, -0.584f)
                close()
                moveTo(12.0f, 16.68f)
                curveToRelative(-0.705f, 0.0f, -1.373f, -0.157f, -1.971f, -0.435f)
                lineTo(8.916f, 18.24f)
                curveToRelative(0.93f, 0.459f, 1.978f, 0.721f, 3.084f, 0.721f)
                curveToRelative(0.646f, 0.0f, 1.268f, -0.091f, 1.86f, -0.256f)
                curveToRelative(0.104f, -0.643f, 0.485f, -1.234f, 1.095f, -1.587f)
                curveToRelative(0.609f, -0.351f, 1.313f, -0.386f, 1.92f, -0.156f)
                curveToRelative(1.186f, -1.163f, 1.957f, -2.749f, 2.07f, -4.515f)
                lineToRelative(-2.285f, -0.033f)
                curveToRelative(-0.21f, 2.391f, -2.215f, 4.266f, -4.66f, 4.266f)
                close()
                moveTo(7.32f, 12.0f)
                curveToRelative(0.0f, -1.583f, 0.787f, -2.981f, 1.99f, -3.83f)
                lineTo(8.14f, 6.209f)
                curveToRelative(-1.404f, 0.93f, -2.445f, 2.369f, -2.881f, 4.035f)
                curveToRelative(0.506f, 0.404f, 0.83f, 1.034f, 0.83f, 1.74f)
                curveToRelative(0.0f, 0.704f, -0.324f, 1.319f, -0.83f, 1.739f)
                curveToRelative(0.436f, 1.665f, 1.477f, 3.104f, 2.881f, 4.034f)
                lineToRelative(1.17f, -1.965f)
                curveTo(8.107f, 14.97f, 7.32f, 13.574f, 7.32f, 12.0f)
                close()
                moveTo(3.84f, 10.398f)
                curveToRelative(-0.885f, 0.0f, -1.602f, 0.717f, -1.602f, 1.602f)
                reflectiveCurveToRelative(0.717f, 1.602f, 1.602f, 1.602f)
                reflectiveCurveTo(5.441f, 12.885f, 5.441f, 12.0f)
                reflectiveCurveToRelative(-0.716f, -1.602f, -1.601f, -1.602f)
                close()
                moveTo(12.0f, 7.32f)
                curveToRelative(2.445f, 0.0f, 4.45f, 1.875f, 4.66f, 4.265f)
                lineToRelative(2.285f, -0.034f)
                curveToRelative(-0.113f, -1.765f, -0.885f, -3.35f, -2.07f, -4.516f)
                curveToRelative(-0.609f, 0.232f, -1.313f, 0.194f, -1.92f, -0.154f)
                curveToRelative(-0.609f, -0.352f, -0.99f, -0.945f, -1.095f, -1.591f)
                curveToRelative(-0.594f, -0.16f, -1.214f, -0.25f, -1.86f, -0.25f)
                curveToRelative(-1.11f, 0.0f, -2.155f, 0.26f, -3.084f, 0.72f)
                lineToRelative(1.113f, 1.995f)
                curveToRelative(0.6f, -0.279f, 1.268f, -0.435f, 1.971f, -0.435f)
                close()
                moveTo(15.279f, 6.319f)
                curveToRelative(0.765f, 0.442f, 1.746f, 0.181f, 2.189f, -0.585f)
                curveToRelative(0.441f, -0.765f, 0.181f, -1.746f, -0.588f, -2.19f)
                curveToRelative(-0.765f, -0.44f, -1.746f, -0.179f, -2.189f, 0.589f)
                curveToRelative(-0.441f, 0.764f, -0.18f, 1.744f, 0.588f, 2.186f)
                close()
            }
        }
        .build()
        return _ubuntu!!
    }

private var _ubuntu: ImageVector? = null
