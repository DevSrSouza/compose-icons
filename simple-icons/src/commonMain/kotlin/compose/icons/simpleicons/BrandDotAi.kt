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

public val SimpleIcons.BrandDotAi: ImageVector
    get() {
        if (_brandDotAi != null) {
            return _brandDotAi!!
        }
        _brandDotAi = Builder(name = "BrandDotAi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.956f, 11.263f)
                curveTo(23.578f, 5.007f, 18.403f, 0.049f, 12.061f, 0.009f)
                horizontalLineToRelative(-0.142f)
                curveToRelative(-2.24f, 0.016f, -4.336f, 0.64f, -6.124f, 1.724f)
                arcTo(12.029f, 12.029f, 0.0f, false, false, 1.747f, 5.766f)
                curveTo(0.76f, 7.381f, 0.15f, 9.253f, 0.023f, 11.256f)
                curveToRelative(-0.015f, 0.247f, -0.023f, 0.494f, -0.023f, 0.747f)
                curveToRelative(0.0f, 0.25f, 0.01f, 0.5f, 0.025f, 0.746f)
                curveToRelative(0.123f, 2.003f, 0.734f, 3.873f, 1.723f, 5.49f)
                curveToRelative(1.0f, 1.648f, 2.384f, 3.03f, 4.024f, 4.033f)
                curveToRelative(1.798f, 1.074f, 3.897f, 1.705f, 6.129f, 1.72f)
                horizontalLineToRelative(0.18f)
                curveToRelative(6.343f, -0.043f, 11.497f, -4.99f, 11.889f, -11.239f)
                curveToRelative(0.014f, -0.24f, 0.03f, -0.496f, 0.03f, -0.735f)
                reflectiveCurveToRelative(0.0f, -0.495f, -0.016f, -0.734f)
                lineToRelative(-0.027f, -0.022f)
                close()
                moveTo(12.001f, 15.642f)
                verticalLineToRelative(3.83f)
                curveToRelative(0.096f, 2.34f, -0.57f, 2.73f, -1.37f, 2.766f)
                curveToRelative(-0.034f, 0.0f, -0.066f, 0.003f, -0.1f, 0.004f)
                curveToRelative(-4.556f, -0.645f, -8.157f, -4.257f, -8.783f, -8.822f)
                curveToRelative(-0.066f, -0.464f, -0.1f, -0.938f, -0.1f, -1.42f)
                curveToRelative(0.0f, -0.48f, 0.034f, -0.953f, 0.1f, -1.418f)
                curveToRelative(0.625f, -4.56f, 4.218f, -8.169f, 8.769f, -8.819f)
                lineToRelative(0.115f, 0.01f)
                curveToRelative(0.8f, 0.043f, 1.465f, 0.43f, 1.37f, 2.764f)
                verticalLineToRelative(3.828f)
                curveToRelative(-0.01f, 1.573f, 0.895f, 3.072f, 1.857f, 3.64f)
                curveToRelative(-0.962f, 0.56f, -1.868f, 1.875f, -1.858f, 3.634f)
                close()
            }
        }
        .build()
        return _brandDotAi!!
    }

private var _brandDotAi: ImageVector? = null
