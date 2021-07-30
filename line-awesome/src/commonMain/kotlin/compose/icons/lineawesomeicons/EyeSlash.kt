package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) {
            return _eyeSlash!!
        }
        _eyeSlash = Builder(name = "EyeSlash", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.7188f, 2.2813f)
                lineTo(2.2813f, 3.7188f)
                lineTo(8.5f, 9.9063f)
                lineTo(19.5938f, 21.0f)
                lineTo(21.5f, 22.9375f)
                lineTo(28.2813f, 29.7188f)
                lineTo(29.7188f, 28.2813f)
                lineTo(23.5f, 22.0625f)
                curveTo(27.7344f, 19.9648f, 30.5742f, 16.8516f, 30.75f, 16.6563f)
                lineTo(31.3438f, 16.0f)
                lineTo(30.75f, 15.3438f)
                curveTo(30.4805f, 15.043f, 24.0859f, 8.0f, 16.0f, 8.0f)
                curveTo(14.043f, 8.0f, 12.1953f, 8.4297f, 10.5f, 9.0625f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(18.1523f, 10.0f, 20.1875f, 10.6055f, 22.0f, 11.4375f)
                curveTo(22.6445f, 12.5156f, 23.0f, 13.7344f, 23.0f, 15.0f)
                curveTo(23.0f, 16.8164f, 22.2969f, 18.4766f, 21.1563f, 19.7188f)
                lineTo(18.3125f, 16.875f)
                curveTo(18.7305f, 16.3633f, 19.0f, 15.7148f, 19.0f, 15.0f)
                curveTo(19.0f, 13.3438f, 17.6563f, 12.0f, 16.0f, 12.0f)
                curveTo(15.2852f, 12.0f, 14.6367f, 12.2695f, 14.125f, 12.6875f)
                lineTo(12.0938f, 10.6563f)
                curveTo(13.3359f, 10.2734f, 14.6367f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(6.6875f, 10.9063f)
                curveTo(3.4805f, 12.8789f, 1.3984f, 15.1758f, 1.25f, 15.3438f)
                lineTo(0.6563f, 16.0f)
                lineTo(1.25f, 16.6563f)
                curveTo(1.5078f, 16.9453f, 7.4297f, 23.4258f, 15.0625f, 23.9375f)
                curveTo(15.3711f, 23.9688f, 15.6836f, 24.0f, 16.0f, 24.0f)
                curveTo(16.3164f, 24.0f, 16.6289f, 23.9688f, 16.9375f, 23.9375f)
                curveTo(17.7617f, 23.8828f, 18.5664f, 23.7734f, 19.3438f, 23.5938f)
                lineTo(17.5625f, 21.8125f)
                curveTo(17.0547f, 21.9297f, 16.5391f, 22.0f, 16.0f, 22.0f)
                curveTo(12.1406f, 22.0f, 9.0f, 18.8594f, 9.0f, 15.0f)
                curveTo(9.0f, 14.4688f, 9.0703f, 13.9492f, 9.1875f, 13.4375f)
                close()
                moveTo(7.25f, 12.9375f)
                curveTo(7.0898f, 13.6133f, 7.0f, 14.3008f, 7.0f, 15.0f)
                curveTo(7.0f, 16.7383f, 7.4883f, 18.3398f, 8.3438f, 19.7188f)
                curveTo(6.0547f, 18.4063f, 4.3047f, 16.8672f, 3.4063f, 16.0f)
                curveTo(4.1523f, 15.2773f, 5.4961f, 14.0781f, 7.25f, 12.9375f)
                close()
                moveTo(24.75f, 12.9375f)
                curveTo(26.5039f, 14.0781f, 27.8438f, 15.2773f, 28.5938f, 16.0f)
                curveTo(27.6953f, 16.8672f, 25.918f, 18.4375f, 23.625f, 19.75f)
                curveTo(24.4844f, 18.3711f, 25.0f, 16.7383f, 25.0f, 15.0f)
                curveTo(25.0f, 14.3008f, 24.9102f, 13.6094f, 24.75f, 12.9375f)
                close()
            }
        }
        .build()
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
