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

public val SimpleIcons.Epel: ImageVector
    get() {
        if (_epel != null) {
            return _epel!!
        }
        _epel = Builder(name = "Epel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.702f, 2.361f)
                curveToRelative(-1.188f, 0.11f, -0.88f, 0.154f, 1.98f, 0.286f)
                curveToRelative(5.677f, 0.242f, 9.043f, 1.144f, 11.353f, 2.993f)
                curveToRelative(1.232f, 1.012f, 2.187f, 3.146f, 2.187f, 3.146f)
                reflectiveCurveToRelative(-3.639f, 0.836f, -7.797f, 1.65f)
                curveToRelative(-4.159f, 0.814f, -7.46f, 1.54f, -7.327f, 1.584f)
                curveToRelative(0.352f, 0.11f, 5.214f, -0.484f, 10.319f, -1.276f)
                lineToRelative(4.87f, -0.734f)
                curveToRelative(0.078f, -0.012f, 0.036f, 0.394f, 0.036f, 0.514f)
                curveToRelative(0.0f, 1.1f, -1.122f, 2.948f, -2.794f, 4.599f)
                curveToRelative(-2.75f, 2.684f, -6.623f, 4.686f, -11.573f, 5.962f)
                curveToRelative(-1.364f, 0.352f, -2.2f, 0.638f, -1.892f, 0.638f)
                curveToRelative(1.188f, 0.044f, 5.742f, -1.298f, 7.81f, -2.266f)
                curveToRelative(2.685f, -1.276f, 4.401f, -2.508f, 6.491f, -4.664f)
                curveToRelative(1.48f, -1.842f, 2.994f, -2.796f, 3.056f, -5.017f)
                lineToRelative(3.06f, -0.506f)
                curveToRelative(1.629f, -0.264f, 3.103f, -0.55f, 3.28f, -0.616f)
                curveToRelative(0.241f, -0.088f, 0.285f, -0.352f, 0.197f, -1.012f)
                curveToRelative(-0.154f, -1.21f, -1.1f, -2.156f, -3.014f, -3.037f)
                curveToRelative(-2.904f, -1.342f, -5.88f, -1.603f, -7.442f, -0.68f)
                curveToRelative(-0.173f, 0.101f, -0.376f, 0.417f, -0.534f, 0.486f)
                arcToRelative(1079.7f, 1079.7f, 0.0f, false, false, -2.365f, -0.862f)
                curveTo(7.567f, 2.515f, 3.848f, 2.075f, 0.702f, 2.361f)
                close()
                moveTo(19.734f, 5.134f)
                curveToRelative(1.628f, 0.484f, 4.18f, 2.014f, 3.792f, 2.09f)
                lineToRelative(-3.066f, 0.601f)
                lineToRelative(-3.386f, 0.772f)
                curveToRelative(-0.644f, -1.435f, -1.491f, -2.232f, -2.628f, -3.305f)
                lineToRelative(0.133f, -0.327f)
                curveToRelative(0.322f, -0.796f, 2.536f, -0.602f, 5.155f, 0.169f)
                close()
            }
        }
        .build()
        return _epel!!
    }

private var _epel: ImageVector? = null
