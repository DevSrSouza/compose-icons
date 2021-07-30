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

public val SimpleIcons.Bitly: ImageVector
    get() {
        if (_bitly != null) {
            return _bitly!!
        }
        _bitly = Builder(name = "Bitly", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.055f, 21.26f)
                curveToRelative(-1.345f, 0.022f, -2.325f, -0.41f, -2.386f, -1.585f)
                curveToRelative(-0.025f, -0.44f, -0.018f, -0.91f, 0.002f, -1.192f)
                curveToRelative(0.137f, -1.716f, 1.333f, -2.95f, 2.53f, -3.19f)
                curveToRelative(1.482f, -0.294f, 2.455f, 0.38f, 2.455f, 2.31f)
                curveToRelative(0.0f, 1.303f, -0.36f, 3.618f, -2.59f, 3.657f)
                horizontalLineToRelative(-0.016f)
                close()
                moveTo(11.923f, 0.0f)
                curveTo(5.32f, 0.0f, 0.0f, 5.297f, 0.0f, 12.224f)
                curveToRelative(0.0f, 3.594f, 1.92f, 7.062f, 4.623f, 9.147f)
                curveToRelative(0.52f, 0.4f, 1.138f, 0.367f, 1.497f, 0.02f)
                curveToRelative(0.297f, -0.285f, 0.272f, -0.984f, -0.285f, -1.475f)
                curveToRelative(-2.16f, -1.886f, -3.652f, -4.76f, -3.652f, -7.635f)
                curveToRelative(0.0f, -5.15f, 4.58f, -9.49f, 9.74f, -9.49f)
                curveToRelative(6.28f, 0.0f, 9.636f, 5.102f, 9.636f, 9.43f)
                curveToRelative(0.0f, 2.65f, -1.29f, 5.84f, -3.626f, 7.874f)
                curveToRelative(0.015f, 0.0f, 0.493f, -0.942f, 0.493f, -2.784f)
                curveToRelative(0.0f, -3.13f, -1.976f, -4.836f, -4.28f, -4.836f)
                curveToRelative(-1.663f, 0.0f, -2.667f, 0.598f, -3.34f, 1.152f)
                curveToRelative(0.0f, -1.272f, 0.045f, -3.652f, 0.045f, -3.652f)
                curveToRelative(0.0f, -1.572f, -0.54f, -2.83f, -2.47f, -2.86f)
                curveToRelative(-1.11f, -0.015f, -1.932f, 0.493f, -2.44f, 1.647f)
                curveToRelative(-0.18f, 0.436f, -0.12f, 0.916f, 0.254f, 1.125f)
                curveToRelative(0.3f, 0.18f, 0.81f, 0.046f, 1.046f, -0.284f)
                curveToRelative(0.165f, -0.21f, 0.254f, -0.254f, 0.404f, -0.24f)
                curveToRelative(0.24f, 0.03f, 0.257f, 0.405f, 0.257f, 0.66f)
                curveToRelative(0.014f, 0.193f, 0.193f, 2.903f, 0.088f, 9.865f)
                curveTo(7.98f, 21.798f, 9.493f, 24.0f, 13.1f, 24.0f)
                curveToRelative(1.56f, 0.0f, 2.756f, -0.435f, 4.493f, -1.422f)
                curveTo(20.243f, 21.08f, 24.0f, 17.758f, 24.0f, 12.128f)
                curveTo(23.953f, 5.045f, 18.265f, 0.0f, 11.933f, 0.0f)
            }
        }
        .build()
        return _bitly!!
    }

private var _bitly: ImageVector? = null
