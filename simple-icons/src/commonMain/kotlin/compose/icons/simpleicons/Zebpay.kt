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

public val SimpleIcons.Zebpay: ImageVector
    get() {
        if (_zebpay != null) {
            return _zebpay!!
        }
        _zebpay = Builder(name = "Zebpay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.736f, 10.245f)
                reflectiveCurveTo(17.304f, 21.238f, 16.902f, 20.83f)
                lineToRelative(0.905f, -1.091f)
                lineTo(6.828f, 9.31f)
                curveToRelative(-0.331f, 0.279f, -0.698f, 0.592f, -1.092f, 0.935f)
                close()
                moveTo(0.856f, 14.625f)
                reflectiveCurveToRelative(-0.828f, 0.823f, -0.855f, 1.97f)
                curveToRelative(-0.018f, 0.52f, 0.134f, 1.108f, 0.604f, 1.713f)
                curveToRelative(0.0f, 0.0f, 0.007f, 0.012f, 0.026f, 0.035f)
                arcToRelative(2.267f, 2.267f, 0.0f, false, false, 0.733f, 0.51f)
                curveToRelative(0.038f, 0.016f, 0.08f, 0.035f, 0.126f, 0.05f)
                curveToRelative(0.11f, 0.042f, 0.237f, 0.077f, 0.373f, 0.108f)
                arcToRelative(4.28f, 4.28f, 0.0f, false, false, 1.217f, 0.064f)
                lineToRelative(0.222f, -0.023f)
                curveToRelative(0.076f, -0.011f, 0.153f, -0.02f, 0.232f, -0.034f)
                curveToRelative(0.08f, -0.012f, 0.161f, -0.027f, 0.245f, -0.042f)
                curveToRelative(0.007f, 0.0f, 0.011f, 0.0f, 0.02f, -0.004f)
                curveToRelative(0.007f, 0.0f, 0.015f, 0.0f, 0.022f, -0.004f)
                curveToRelative(0.768f, -0.151f, 1.706f, -0.467f, 2.836f, -1.022f)
                lineToRelative(-4.702f, -4.478f)
                curveToRelative(-0.373f, 0.38f, -0.743f, 0.767f, -1.1f, 1.156f)
                close()
                moveTo(9.132f, 7.153f)
                reflectiveCurveToRelative(-0.305f, 0.236f, -0.801f, 0.636f)
                lineToRelative(-0.294f, 0.236f)
                lineToRelative(10.907f, 10.378f)
                lineToRelative(0.92f, -1.093f)
                lineTo(9.161f, 7.12f)
                curveToRelative(-0.011f, 0.01f, -0.019f, 0.022f, -0.03f, 0.033f)
                close()
                moveTo(3.222f, 12.223f)
                lineTo(8.348f, 17.105f)
                arcToRelative(5.421f, 5.421f, 0.0f, false, true, 1.738f, -0.32f)
                lineTo(4.27f, 11.245f)
                curveToRelative(-0.343f, 0.314f, -0.693f, 0.64f, -1.047f, 0.978f)
                close()
                moveTo(8.751f, 3.338f)
                reflectiveCurveToRelative(-0.414f, 0.14f, -0.61f, 0.46f)
                lineTo(20.96f, 16.011f)
                lineToRelative(0.921f, -1.09f)
                lineTo(9.544f, 3.158f)
                curveToRelative(-0.276f, 0.04f, -0.544f, 0.096f, -0.793f, 0.18f)
                close()
                moveTo(14.71f, 3.781f)
                reflectiveCurveToRelative(-1.081f, -0.353f, -2.434f, -0.556f)
                lineToRelative(10.818f, 10.253f)
                lineToRelative(0.906f, -1.07f)
                lineToRelative(-0.722f, -0.682f)
                lineToRelative(-8.18f, -7.79f)
                curveToRelative(-0.128f, -0.05f, -0.256f, -0.103f, -0.388f, -0.155f)
                close()
            }
        }
        .build()
        return _zebpay!!
    }

private var _zebpay: ImageVector? = null
