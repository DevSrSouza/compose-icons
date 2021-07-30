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

public val LineAwesomeIcons.Usb: ImageVector
    get() {
        if (_usb != null) {
            return _usb!!
        }
        _usb = Builder(name = "Usb", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                lineTo(13.0f, 8.0f)
                lineTo(15.0f, 8.0f)
                lineTo(15.0f, 20.0625f)
                curveTo(14.2188f, 19.7344f, 13.4102f, 19.6094f, 12.6563f, 19.5f)
                curveTo(11.7813f, 19.375f, 10.9844f, 19.25f, 10.5625f, 19.0313f)
                curveTo(10.1406f, 18.8125f, 10.0f, 18.707f, 10.0f, 18.0f)
                lineTo(10.0f, 15.7188f)
                curveTo(10.5977f, 15.3711f, 11.0f, 14.7383f, 11.0f, 14.0f)
                curveTo(11.0f, 12.8945f, 10.1055f, 12.0f, 9.0f, 12.0f)
                curveTo(7.8945f, 12.0f, 7.0f, 12.8945f, 7.0f, 14.0f)
                curveTo(7.0f, 14.7383f, 7.4023f, 15.3711f, 8.0f, 15.7188f)
                lineTo(8.0f, 18.0f)
                curveTo(8.0f, 19.293f, 8.7344f, 20.3125f, 9.625f, 20.7813f)
                curveTo(10.5156f, 21.25f, 11.4688f, 21.375f, 12.3438f, 21.5f)
                curveTo(13.2188f, 21.625f, 14.0156f, 21.75f, 14.4375f, 21.9688f)
                curveTo(14.8594f, 22.1875f, 15.0f, 22.293f, 15.0f, 23.0f)
                curveTo(15.0f, 23.0313f, 15.0f, 23.0625f, 15.0f, 23.0938f)
                lineTo(15.0f, 23.1875f)
                curveTo(13.8398f, 23.6016f, 13.0f, 24.6992f, 13.0f, 26.0f)
                curveTo(13.0f, 27.6563f, 14.3438f, 29.0f, 16.0f, 29.0f)
                curveTo(17.6563f, 29.0f, 19.0f, 27.6563f, 19.0f, 26.0f)
                curveTo(19.0f, 24.6992f, 18.1602f, 23.6016f, 17.0f, 23.1875f)
                curveTo(17.0078f, 23.125f, 17.0078f, 23.0625f, 17.0f, 23.0f)
                lineTo(17.0f, 21.1563f)
                curveTo(17.0039f, 21.1055f, 17.0039f, 21.0508f, 17.0f, 21.0f)
                curveTo(17.0f, 20.332f, 17.1914f, 20.1367f, 17.75f, 19.8125f)
                curveTo(18.3086f, 19.4883f, 19.25f, 19.2188f, 20.25f, 18.9688f)
                curveTo(21.25f, 18.7188f, 22.3086f, 18.4883f, 23.25f, 17.9375f)
                curveTo(24.1914f, 17.3867f, 25.0f, 16.332f, 25.0f, 15.0f)
                lineTo(25.0f, 13.0f)
                lineTo(26.0f, 13.0f)
                lineTo(26.0f, 9.0f)
                lineTo(22.0f, 9.0f)
                lineTo(22.0f, 13.0f)
                lineTo(23.0f, 13.0f)
                lineTo(23.0f, 15.0f)
                curveTo(23.0f, 15.668f, 22.8086f, 15.8633f, 22.25f, 16.1875f)
                curveTo(21.6914f, 16.5117f, 20.75f, 16.7813f, 19.75f, 17.0313f)
                curveTo(18.8359f, 17.2578f, 17.875f, 17.4844f, 17.0f, 17.9375f)
                lineTo(17.0f, 8.0f)
                lineTo(19.0f, 8.0f)
                close()
            }
        }
        .build()
        return _usb!!
    }

private var _usb: ImageVector? = null
