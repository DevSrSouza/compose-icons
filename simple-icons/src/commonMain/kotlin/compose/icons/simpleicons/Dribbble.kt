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

public val SimpleIcons.Dribbble: ImageVector
    get() {
        if (_dribbble != null) {
            return _dribbble!!
        }
        _dribbble = Builder(name = "Dribbble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.385f, 24.0f, 0.0f, 18.615f, 0.0f, 12.0f)
                reflectiveCurveTo(5.385f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.385f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.385f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(22.12f, 13.642f)
                curveToRelative(-0.35f, -0.11f, -3.17f, -0.953f, -6.384f, -0.438f)
                curveToRelative(1.34f, 3.684f, 1.887f, 6.684f, 1.992f, 7.308f)
                curveToRelative(2.3f, -1.555f, 3.936f, -4.02f, 4.395f, -6.87f)
                close()
                moveTo(16.005f, 21.45f)
                curveToRelative(-0.153f, -0.9f, -0.75f, -4.032f, -2.19f, -7.77f)
                lineToRelative(-0.066f, 0.02f)
                curveToRelative(-5.79f, 2.015f, -7.86f, 6.025f, -8.04f, 6.4f)
                curveToRelative(1.73f, 1.358f, 3.92f, 2.166f, 6.29f, 2.166f)
                curveToRelative(1.42f, 0.0f, 2.77f, -0.29f, 4.0f, -0.814f)
                close()
                moveTo(4.385f, 18.87f)
                curveToRelative(0.232f, -0.4f, 3.045f, -5.055f, 8.332f, -6.765f)
                curveToRelative(0.135f, -0.045f, 0.27f, -0.084f, 0.405f, -0.12f)
                curveToRelative(-0.26f, -0.585f, -0.54f, -1.167f, -0.832f, -1.74f)
                curveTo(7.17f, 11.775f, 2.206f, 11.71f, 1.756f, 11.7f)
                lineToRelative(-0.004f, 0.312f)
                curveToRelative(0.0f, 2.633f, 0.998f, 5.037f, 2.634f, 6.855f)
                close()
                moveTo(1.965f, 9.915f)
                curveToRelative(0.46f, 0.008f, 4.683f, 0.026f, 9.477f, -1.248f)
                curveToRelative(-1.698f, -3.018f, -3.53f, -5.558f, -3.8f, -5.928f)
                curveToRelative(-2.868f, 1.35f, -5.01f, 3.99f, -5.676f, 7.17f)
                close()
                moveTo(9.6f, 2.052f)
                curveToRelative(0.282f, 0.38f, 2.145f, 2.914f, 3.822f, 6.0f)
                curveToRelative(3.645f, -1.365f, 5.19f, -3.44f, 5.373f, -3.702f)
                curveToRelative(-1.81f, -1.61f, -4.19f, -2.586f, -6.795f, -2.586f)
                curveToRelative(-0.825f, 0.0f, -1.63f, 0.1f, -2.4f, 0.285f)
                close()
                moveTo(19.935f, 5.535f)
                curveToRelative(-0.218f, 0.29f, -1.935f, 2.493f, -5.724f, 4.04f)
                curveToRelative(0.24f, 0.49f, 0.47f, 0.985f, 0.68f, 1.486f)
                curveToRelative(0.08f, 0.18f, 0.15f, 0.36f, 0.22f, 0.53f)
                curveToRelative(3.41f, -0.43f, 6.8f, 0.26f, 7.14f, 0.33f)
                curveToRelative(-0.02f, -2.42f, -0.88f, -4.64f, -2.31f, -6.38f)
                close()
            }
        }
        .build()
        return _dribbble!!
    }

private var _dribbble: ImageVector? = null
