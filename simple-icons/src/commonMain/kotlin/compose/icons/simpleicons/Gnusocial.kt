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

public val SimpleIcons.Gnusocial: ImageVector
    get() {
        if (_gnusocial != null) {
            return _gnusocial!!
        }
        _gnusocial = Builder(name = "Gnusocial", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.217f, 0.0f)
                curveTo(2.474f, 0.0f, 1.06f, 1.413f, 1.06f, 3.156f)
                lineTo(1.06f, 15.77f)
                curveToRelative(0.0f, 1.744f, 1.414f, 3.158f, 3.157f, 3.158f)
                horizontalLineToRelative(9.367f)
                curveTo(13.567f, 22.498f, 8.756f, 24.0f, 8.756f, 24.0f)
                reflectiveCurveToRelative(8.138f, -0.038f, 9.305f, -5.072f)
                horizontalLineToRelative(1.72f)
                curveToRelative(1.744f, 0.0f, 3.157f, -1.414f, 3.157f, -3.157f)
                lineTo(22.938f, 3.157f)
                curveTo(22.938f, 1.413f, 21.524f, 0.0f, 19.782f, 0.0f)
                lineTo(4.218f, 0.0f)
                close()
                moveTo(8.744f, 2.53f)
                curveToRelative(0.073f, -0.013f, 0.132f, -0.003f, 0.174f, 0.034f)
                curveToRelative(0.335f, 0.3f, -0.556f, 0.593f, -0.484f, 2.063f)
                curveToRelative(0.032f, 0.646f, -0.16f, 1.146f, 1.076f, 1.146f)
                curveToRelative(0.826f, 0.0f, 0.483f, -0.734f, 1.523f, -0.734f)
                curveToRelative(0.656f, 0.0f, 0.86f, 0.435f, 0.934f, 0.767f)
                curveToRelative(0.072f, -0.33f, 0.274f, -0.768f, 0.93f, -0.768f)
                curveToRelative(1.04f, 0.0f, 0.7f, 0.733f, 1.525f, 0.733f)
                curveToRelative(1.237f, 0.0f, 1.044f, -0.5f, 1.076f, -1.146f)
                curveToRelative(0.072f, -1.47f, -0.82f, -1.764f, -0.484f, -2.063f)
                curveToRelative(0.042f, -0.037f, 0.1f, -0.042f, 0.172f, -0.02f)
                curveToRelative(0.5f, 0.143f, 1.607f, 1.558f, 1.638f, 2.155f)
                curveToRelative(0.038f, 0.71f, 0.04f, 1.825f, -1.015f, 2.407f)
                curveToRelative(1.19f, 1.167f, 1.352f, 2.72f, 1.352f, 2.72f)
                lineToRelative(-2.045f, -0.034f)
                reflectiveCurveToRelative(-0.464f, -2.118f, -2.94f, -2.01f)
                curveToRelative(-2.474f, 0.108f, -2.796f, 0.538f, -2.796f, 3.156f)
                curveToRelative(0.0f, 2.617f, 1.147f, 3.517f, 2.905f, 3.585f)
                curveToRelative(2.76f, 0.108f, 2.51f, -1.433f, 2.51f, -1.433f)
                lineToRelative(-1.29f, 0.072f)
                lineToRelative(-0.718f, -1.937f)
                horizontalLineToRelative(4.41f)
                curveToRelative(0.0f, 2.116f, -0.897f, 5.414f, -5.092f, 5.2f)
                curveToRelative(-4.196f, -0.216f, -5.128f, -3.515f, -5.164f, -5.74f)
                curveToRelative(-0.018f, -1.225f, 0.188f, -2.602f, 1.2f, -3.574f)
                curveToRelative(-1.052f, -0.58f, -1.033f, -1.7f, -1.033f, -2.414f)
                curveToRelative(0.0f, -0.88f, 1.13f, -2.084f, 1.637f, -2.17f)
                close()
            }
        }
        .build()
        return _gnusocial!!
    }

private var _gnusocial: ImageVector? = null
