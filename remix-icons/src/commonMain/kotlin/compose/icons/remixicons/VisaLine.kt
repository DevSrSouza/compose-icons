package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.VisaLine: ImageVector
    get() {
        if (_visaLine != null) {
            return _visaLine!!
        }
        _visaLine = Builder(name = "VisaLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.222f, 15.768f)
                lineToRelative(-0.225f, -1.125f)
                horizontalLineToRelative(-2.514f)
                lineToRelative(-0.4f, 1.117f)
                lineToRelative(-2.015f, 0.004f)
                arcToRelative(4199.19f, 4199.19f, 0.0f, false, true, 2.884f, -6.918f)
                curveToRelative(0.164f, -0.391f, 0.455f, -0.59f, 0.884f, -0.588f)
                curveToRelative(0.328f, 0.003f, 0.863f, 0.003f, 1.606f, 0.001f)
                lineTo(24.0f, 15.765f)
                lineToRelative(-1.778f, 0.003f)
                close()
                moveTo(20.049f, 13.102f)
                horizontalLineToRelative(1.62f)
                lineToRelative(-0.605f, -2.82f)
                lineToRelative(-1.015f, 2.82f)
                close()
                moveTo(7.06f, 8.257f)
                lineToRelative(2.026f, 0.002f)
                lineToRelative(-3.132f, 7.51f)
                lineToRelative(-2.051f, -0.002f)
                arcToRelative(950.849f, 950.849f, 0.0f, false, true, -1.528f, -5.956f)
                curveToRelative(-0.1f, -0.396f, -0.298f, -0.673f, -0.679f, -0.804f)
                curveTo(1.357f, 8.89f, 0.792f, 8.71f, 0.0f, 8.465f)
                lineTo(0.0f, 8.26f)
                horizontalLineToRelative(3.237f)
                curveToRelative(0.56f, 0.0f, 0.887f, 0.271f, 0.992f, 0.827f)
                curveToRelative(0.106f, 0.557f, 0.372f, 1.975f, 0.8f, 4.254f)
                lineTo(7.06f, 8.257f)
                close()
                moveTo(11.87f, 8.259f)
                lineToRelative(-1.602f, 7.508f)
                lineToRelative(-1.928f, -0.002f)
                lineTo(9.94f, 8.257f)
                lineToRelative(1.93f, 0.002f)
                close()
                moveTo(15.78f, 8.12f)
                curveToRelative(0.577f, 0.0f, 1.304f, 0.18f, 1.722f, 0.345f)
                lineToRelative(-0.338f, 1.557f)
                curveToRelative(-0.378f, -0.152f, -1.0f, -0.357f, -1.523f, -0.35f)
                curveToRelative(-0.76f, 0.013f, -1.23f, 0.332f, -1.23f, 0.638f)
                curveToRelative(0.0f, 0.498f, 0.816f, 0.749f, 1.656f, 1.293f)
                curveToRelative(0.959f, 0.62f, 1.085f, 1.177f, 1.073f, 1.782f)
                curveToRelative(-0.013f, 1.256f, -1.073f, 2.495f, -3.309f, 2.495f)
                curveToRelative(-1.02f, -0.015f, -1.388f, -0.101f, -2.22f, -0.396f)
                lineToRelative(0.352f, -1.625f)
                curveToRelative(0.847f, 0.355f, 1.206f, 0.468f, 1.93f, 0.468f)
                curveToRelative(0.663f, 0.0f, 1.232f, -0.268f, 1.237f, -0.735f)
                curveToRelative(0.004f, -0.332f, -0.2f, -0.497f, -0.944f, -0.907f)
                curveToRelative(-0.744f, -0.411f, -1.788f, -0.98f, -1.774f, -2.122f)
                curveToRelative(0.017f, -1.462f, 1.402f, -2.443f, 3.369f, -2.443f)
                close()
            }
        }
        .build()
        return _visaLine!!
    }

private var _visaLine: ImageVector? = null
