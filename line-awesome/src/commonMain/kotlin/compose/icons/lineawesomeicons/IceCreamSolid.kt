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

public val LineAwesomeIcons.IceCreamSolid: ImageVector
    get() {
        if (_iceCreamSolid != null) {
            return _iceCreamSolid!!
        }
        _iceCreamSolid = Builder(name = "IceCreamSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(13.8438f, 4.0f, 12.0078f, 5.3828f, 11.3125f, 7.3125f)
                curveTo(9.3906f, 8.0078f, 8.0f, 9.8398f, 8.0f, 12.0f)
                curveTo(8.0f, 12.0625f, 7.9961f, 12.125f, 8.0f, 12.1875f)
                curveTo(6.8438f, 12.6055f, 6.0f, 13.707f, 6.0f, 15.0f)
                curveTo(6.0f, 16.6445f, 7.3555f, 18.0f, 9.0f, 18.0f)
                lineTo(9.375f, 18.0f)
                lineTo(13.6875f, 26.5f)
                curveTo(13.6953f, 26.5156f, 13.7109f, 26.5156f, 13.7188f, 26.5313f)
                curveTo(14.1406f, 27.418f, 15.0156f, 28.0f, 16.0f, 28.0f)
                curveTo(16.9844f, 28.0f, 17.8594f, 27.418f, 18.2813f, 26.5313f)
                lineTo(18.3125f, 26.5313f)
                curveTo(18.3164f, 26.5234f, 18.3086f, 26.5078f, 18.3125f, 26.5f)
                lineTo(22.625f, 18.0f)
                lineTo(23.0f, 18.0f)
                curveTo(24.6445f, 18.0f, 26.0f, 16.6445f, 26.0f, 15.0f)
                curveTo(26.0f, 13.6875f, 25.1211f, 12.5898f, 23.9375f, 12.1875f)
                curveTo(23.6563f, 10.4922f, 22.5078f, 9.0703f, 20.9688f, 8.4063f)
                curveTo(20.668f, 5.9375f, 18.5469f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(17.3203f, 6.0f, 18.4375f, 6.8281f, 18.8438f, 8.0f)
                curveTo(16.5078f, 8.0742f, 14.5508f, 9.7773f, 14.0938f, 12.0f)
                lineTo(10.0f, 12.0f)
                curveTo(10.0f, 10.3477f, 11.3477f, 9.0f, 13.0f, 9.0f)
                curveTo(13.2773f, 9.0f, 13.5547f, 9.0547f, 13.8125f, 9.125f)
                curveTo(14.2539f, 8.5391f, 14.7656f, 8.0039f, 15.375f, 7.5938f)
                curveTo(14.8633f, 7.3164f, 14.3047f, 7.1484f, 13.7188f, 7.0625f)
                curveTo(14.2617f, 6.4141f, 15.0781f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(19.0f, 10.0f)
                curveTo(20.3203f, 10.0f, 21.4375f, 10.8281f, 21.8438f, 12.0f)
                lineTo(16.1563f, 12.0f)
                curveTo(16.5625f, 10.8281f, 17.6797f, 10.0f, 19.0f, 10.0f)
                close()
                moveTo(9.0f, 14.0f)
                lineTo(23.0f, 14.0f)
                curveTo(23.5664f, 14.0f, 24.0f, 14.4336f, 24.0f, 15.0f)
                curveTo(24.0f, 15.5664f, 23.5664f, 16.0f, 23.0f, 16.0f)
                lineTo(12.625f, 16.0f)
                lineTo(13.6563f, 18.0f)
                lineTo(20.375f, 18.0f)
                lineTo(16.5313f, 25.625f)
                lineTo(16.5f, 25.6563f)
                lineTo(16.5f, 25.6875f)
                curveTo(16.4102f, 25.8867f, 16.2188f, 26.0f, 16.0f, 26.0f)
                curveTo(15.7813f, 26.0f, 15.5898f, 25.8867f, 15.5f, 25.6875f)
                lineTo(15.5f, 25.6563f)
                lineTo(15.4688f, 25.625f)
                lineTo(10.9063f, 16.5625f)
                lineTo(10.625f, 16.0f)
                lineTo(9.0f, 16.0f)
                curveTo(8.4336f, 16.0f, 8.0f, 15.5664f, 8.0f, 15.0f)
                curveTo(8.0f, 14.4336f, 8.4336f, 14.0f, 9.0f, 14.0f)
                close()
            }
        }
        .build()
        return _iceCreamSolid!!
    }

private var _iceCreamSolid: ImageVector? = null
