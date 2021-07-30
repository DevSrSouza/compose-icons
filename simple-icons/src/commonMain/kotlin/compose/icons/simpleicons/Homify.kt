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

public val SimpleIcons.Homify: ImageVector
    get() {
        if (_homify != null) {
            return _homify!!
        }
        _homify = Builder(name = "Homify", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.383f, 10.561f)
                arcToRelative(1.727f, 1.727f, 0.0f, false, true, 0.0f, 0.055f)
                lineToRelative(-0.004f, 0.048f)
                curveToRelative(-0.088f, 2.33f, -0.057f, 11.357f, -0.057f, 11.823f)
                curveToRelative(0.002f, 1.078f, -0.826f, 1.943f, -1.596f, 1.283f)
                lineToRelative(-6.98f, -5.53f)
                arcToRelative(373.72f, 373.72f, 0.0f, false, true, -4.742f, 4.925f)
                curveToRelative(-0.977f, 0.946f, -1.786f, -1.327f, -1.045f, -1.808f)
                curveToRelative(0.066f, -0.042f, 2.223f, -1.95f, 4.61f, -4.05f)
                lineTo(5.4f, 13.214f)
                curveToRelative(-0.446f, -0.356f, -0.618f, -0.946f, -0.363f, -1.261f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, true, 0.328f, -0.127f)
                arcToRelative(0.47f, 0.47f, 0.0f, false, true, 0.164f, 0.037f)
                curveToRelative(1.596f, 0.722f, 3.962f, 2.492f, 6.314f, 4.329f)
                curveToRelative(2.45f, -2.15f, 4.805f, -4.191f, 5.116f, -4.364f)
                curveToRelative(0.38f, -0.214f, 0.48f, 0.354f, 0.354f, 0.516f)
                curveToRelative(-0.131f, 0.166f, -2.169f, 2.326f, -4.408f, 4.678f)
                curveToRelative(2.204f, 1.732f, 4.294f, 3.389f, 5.614f, 4.137f)
                lineToRelative(0.217f, -10.62f)
                curveToRelative(-0.17f, -0.206f, -5.332f, -7.163f, -5.892f, -7.746f)
                curveToRelative(-0.892f, 0.78f, -5.566f, 6.112f, -5.802f, 6.342f)
                curveToRelative(1.067f, 0.11f, 5.597f, 0.382f, 8.452f, 0.684f)
                curveToRelative(0.721f, 0.07f, 1.2f, 0.606f, -0.346f, 0.59f)
                lineToRelative(-11.105f, -0.015f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, true, -0.394f, -0.267f)
                arcToRelative(0.415f, 0.415f, 0.0f, false, true, 0.094f, -0.457f)
                curveTo(3.8f, 9.613f, 11.782f, 0.748f, 12.454f, 0.184f)
                arcTo(0.702f, 0.702f, 0.0f, false, true, 12.935f, 0.0f)
                arcToRelative(0.732f, 0.732f, 0.0f, false, true, 0.483f, 0.227f)
                curveToRelative(0.083f, 0.077f, 4.292f, 5.94f, 6.344f, 8.802f)
                curveToRelative(0.492f, 0.678f, 0.617f, 1.137f, 0.621f, 1.5f)
                close()
            }
        }
        .build()
        return _homify!!
    }

private var _homify: ImageVector? = null
