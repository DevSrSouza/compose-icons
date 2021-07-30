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

public val LineAwesomeIcons.PhoneSolid: ImageVector
    get() {
        if (_phoneSolid != null) {
            return _phoneSolid!!
        }
        _phoneSolid = Builder(name = "PhoneSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.6563f, 3.0f)
                curveTo(8.1328f, 3.0f, 7.6172f, 3.1875f, 7.1875f, 3.5313f)
                lineTo(7.125f, 3.5625f)
                lineTo(7.0938f, 3.5938f)
                lineTo(3.9688f, 6.8125f)
                lineTo(4.0f, 6.8438f)
                curveTo(3.0352f, 7.7344f, 2.7383f, 9.0664f, 3.1563f, 10.2188f)
                curveTo(3.1602f, 10.2266f, 3.1523f, 10.2422f, 3.1563f, 10.25f)
                curveTo(4.0039f, 12.6758f, 6.1719f, 17.3594f, 10.4063f, 21.5938f)
                curveTo(14.6563f, 25.8438f, 19.4023f, 27.9258f, 21.75f, 28.8438f)
                lineTo(21.7813f, 28.8438f)
                curveTo(22.9961f, 29.25f, 24.3125f, 28.9609f, 25.25f, 28.1563f)
                lineTo(28.4063f, 25.0f)
                curveTo(29.2344f, 24.1719f, 29.2344f, 22.7344f, 28.4063f, 21.9063f)
                lineTo(24.3438f, 17.8438f)
                lineTo(24.3125f, 17.7813f)
                curveTo(23.4844f, 16.9531f, 22.0156f, 16.9531f, 21.1875f, 17.7813f)
                lineTo(19.1875f, 19.7813f)
                curveTo(18.4648f, 19.4336f, 16.7422f, 18.543f, 15.0938f, 16.9688f)
                curveTo(13.457f, 15.4063f, 12.6211f, 13.6094f, 12.3125f, 12.9063f)
                lineTo(14.3125f, 10.9063f)
                curveTo(15.1523f, 10.0664f, 15.168f, 8.668f, 14.2813f, 7.8438f)
                lineTo(14.3125f, 7.8125f)
                lineTo(14.2188f, 7.7188f)
                lineTo(10.2188f, 3.5938f)
                lineTo(10.1875f, 3.5625f)
                lineTo(10.125f, 3.5313f)
                curveTo(9.6953f, 3.1875f, 9.1797f, 3.0f, 8.6563f, 3.0f)
                close()
                moveTo(8.6563f, 5.0f)
                curveTo(8.7305f, 5.0f, 8.8047f, 5.0352f, 8.875f, 5.0938f)
                lineTo(12.875f, 9.1875f)
                lineTo(12.9688f, 9.2813f)
                curveTo(12.9609f, 9.2734f, 13.0273f, 9.3789f, 12.9063f, 9.5f)
                lineTo(10.4063f, 12.0f)
                lineTo(9.9375f, 12.4375f)
                lineTo(10.1563f, 13.0625f)
                curveTo(10.1563f, 13.0625f, 11.3047f, 16.1367f, 13.7188f, 18.4375f)
                lineTo(13.9375f, 18.625f)
                curveTo(16.2617f, 20.7461f, 19.0f, 21.9063f, 19.0f, 21.9063f)
                lineTo(19.625f, 22.1875f)
                lineTo(22.5938f, 19.2188f)
                curveTo(22.7656f, 19.0469f, 22.7344f, 19.0469f, 22.9063f, 19.2188f)
                lineTo(27.0f, 23.3125f)
                curveTo(27.1719f, 23.4844f, 27.1719f, 23.4219f, 27.0f, 23.5938f)
                lineTo(23.9375f, 26.6563f)
                curveTo(23.4766f, 27.0508f, 22.9883f, 27.1328f, 22.4063f, 26.9375f)
                curveTo(20.1406f, 26.0469f, 15.7383f, 24.1133f, 11.8125f, 20.1875f)
                curveTo(7.8555f, 16.2305f, 5.7891f, 11.7422f, 5.0313f, 9.5625f)
                curveTo(4.8789f, 9.1563f, 4.9883f, 8.5547f, 5.3438f, 8.25f)
                lineTo(5.4063f, 8.1875f)
                lineTo(8.4375f, 5.0938f)
                curveTo(8.5078f, 5.0352f, 8.582f, 5.0f, 8.6563f, 5.0f)
                close()
            }
        }
        .build()
        return _phoneSolid!!
    }

private var _phoneSolid: ImageVector? = null
