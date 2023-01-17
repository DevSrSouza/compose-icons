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

public val SimpleIcons.Fanfou: ImageVector
    get() {
        if (_fanfou != null) {
            return _fanfou!!
        }
        _fanfou = Builder(name = "Fanfou", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.96f, 0.0655f)
                lineToRelative(1.369f, 2.082f)
                curveToRelative(-3.2662f, 0.9041f, -6.8623f, 1.5142f, -10.7875f, 1.8302f)
                verticalLineToRelative(3.8061f)
                lineTo(22.736f, 7.7838f)
                curveToRelative(-0.448f, 4.4272f, -1.616f, 7.9444f, -3.5041f, 10.5525f)
                curveToRelative(1.239f, 1.475f, 2.8271f, 2.788f, 4.7682f, 3.9381f)
                lineToRelative(-1.7f, 1.6601f)
                arcToRelative(25.133f, 25.133f, 0.0f, false, true, -4.5823f, -3.7402f)
                arcToRelative(20.9459f, 20.9459f, 0.0f, false, true, -4.9932f, 3.7402f)
                lineToRelative(-1.528f, -1.726f)
                curveToRelative(2.143f, -1.2121f, 3.8151f, -2.4762f, 5.0192f, -3.7932f)
                curveToRelative(-1.599f, -2.5201f, -2.6441f, -5.2913f, -3.1352f, -8.3124f)
                horizontalLineToRelative(-0.54f)
                curveToRelative(0.07f, 5.5593f, -0.892f, 10.1604f, -2.8851f, 13.8056f)
                lineToRelative(-2.002f, -1.396f)
                curveToRelative(1.73f, -3.0302f, 2.594f, -7.2944f, 2.594f, -12.7916f)
                lineTo(10.2475f, 1.8966f)
                curveToRelative(4.2872f, -0.167f, 8.1904f, -0.776f, 11.7125f, -1.8301f)
                close()
                moveTo(20.0628f, 10.1039f)
                horizontalLineToRelative(-4.6102f)
                curveToRelative(0.35f, 2.3001f, 1.115f, 4.4132f, 2.2921f, 6.3353f)
                curveToRelative(1.184f, -1.861f, 1.9571f, -3.9732f, 2.3181f, -6.3353f)
                close()
                moveTo(9.4054f, 3.6227f)
                curveToRelative(-0.123f, 1.984f, -0.51f, 4.0441f, -1.159f, 6.1772f)
                lineToRelative(-2.1461f, -0.618f)
                curveToRelative(0.308f, -0.887f, 0.584f, -1.9551f, 0.83f, -3.2002f)
                lineTo(3.583f, 5.9817f)
                curveTo(2.96f, 7.4998f, 2.314f, 8.8299f, 1.646f, 9.9709f)
                lineTo(0.0f, 8.18f)
                curveTo(1.186f, 6.0817f, 2.138f, 3.3845f, 2.8581f, 0.0924f)
                lineToRelative(2.2401f, 0.646f)
                arcToRelative(63.5656f, 63.5656f, 0.0f, false, true, -0.764f, 2.8842f)
                close()
                moveTo(8.4444f, 19.3773f)
                curveToRelative(-1.6161f, 1.616f, -3.1532f, 2.9021f, -4.6102f, 3.8602f)
                lineTo(2.45f, 21.3274f)
                curveToRelative(0.255f, -0.22f, 0.382f, -0.554f, 0.382f, -1.002f)
                lineTo(2.832f, 8.4308f)
                horizontalLineToRelative(2.3451f)
                verticalLineToRelative(10.8404f)
                curveToRelative(0.623f, -0.483f, 1.396f, -1.185f, 2.3181f, -2.107f)
                close()
            }
        }
        .build()
        return _fanfou!!
    }

private var _fanfou: ImageVector? = null
