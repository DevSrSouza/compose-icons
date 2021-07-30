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

public val LineAwesomeIcons.SmokingSolid: ImageVector
    get() {
        if (_smokingSolid != null) {
            return _smokingSolid!!
        }
        _smokingSolid = Builder(name = "SmokingSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0313f, 4.0f)
                curveTo(15.6719f, 4.3594f, 15.4063f, 4.7852f, 15.0938f, 5.4688f)
                curveTo(14.7813f, 6.1523f, 14.5039f, 7.0117f, 14.5f, 7.9688f)
                curveTo(14.4961f, 8.9258f, 14.8281f, 10.0195f, 15.6875f, 10.8438f)
                curveTo(16.5469f, 11.668f, 17.8594f, 12.2031f, 19.6875f, 12.4375f)
                curveTo(21.2109f, 12.6328f, 22.1914f, 12.8828f, 22.75f, 13.2188f)
                curveTo(23.3086f, 13.5547f, 23.5391f, 13.8984f, 23.7188f, 14.7188f)
                lineTo(25.6875f, 14.2813f)
                curveTo(25.4297f, 13.1016f, 24.7773f, 12.0977f, 23.7813f, 11.5f)
                curveTo(22.7852f, 10.9023f, 21.5664f, 10.6445f, 19.9375f, 10.4375f)
                curveTo(18.3789f, 10.2383f, 17.5078f, 9.8008f, 17.0625f, 9.375f)
                curveTo(16.6172f, 8.9492f, 16.5f, 8.5117f, 16.5f, 7.9688f)
                curveTo(16.5f, 7.4258f, 16.6758f, 6.8164f, 16.9063f, 6.3125f)
                curveTo(17.1367f, 5.8086f, 17.4922f, 5.3516f, 17.4375f, 5.4063f)
                close()
                moveTo(21.5625f, 4.3125f)
                lineTo(21.5625f, 6.3125f)
                curveTo(22.1836f, 6.3125f, 22.9844f, 6.4063f, 23.5938f, 6.75f)
                curveTo(24.2031f, 7.0938f, 24.7188f, 7.6016f, 24.8438f, 9.0625f)
                lineTo(24.9375f, 10.0f)
                lineTo(25.8438f, 10.0f)
                curveTo(26.3594f, 10.0f, 27.4336f, 10.1602f, 27.9688f, 10.625f)
                curveTo(28.2344f, 10.8594f, 28.4063f, 11.1328f, 28.4688f, 11.6563f)
                curveTo(28.5313f, 12.1797f, 28.4375f, 12.9805f, 27.9688f, 14.125f)
                lineTo(29.8438f, 14.875f)
                curveTo(30.4023f, 13.5156f, 30.5859f, 12.3867f, 30.4688f, 11.4063f)
                curveTo(30.3516f, 10.4258f, 29.875f, 9.6445f, 29.2813f, 9.125f)
                curveTo(28.3789f, 8.3359f, 27.3984f, 8.1328f, 26.5938f, 8.0625f)
                curveTo(26.2461f, 6.6172f, 25.5234f, 5.5273f, 24.5938f, 5.0f)
                curveTo(23.4727f, 4.3633f, 22.3047f, 4.3125f, 21.5625f, 4.3125f)
                close()
                moveTo(1.0f, 16.0f)
                lineTo(1.0f, 22.0f)
                lineTo(31.0f, 22.0f)
                lineTo(31.0f, 16.0f)
                close()
                moveTo(3.0f, 18.0f)
                lineTo(23.0f, 18.0f)
                lineTo(23.0f, 20.0f)
                lineTo(3.0f, 20.0f)
                close()
                moveTo(25.0f, 18.0f)
                lineTo(26.0f, 18.0f)
                lineTo(26.0f, 20.0f)
                lineTo(25.0f, 20.0f)
                close()
                moveTo(28.0f, 18.0f)
                lineTo(29.0f, 18.0f)
                lineTo(29.0f, 20.0f)
                lineTo(28.0f, 20.0f)
                close()
            }
        }
        .build()
        return _smokingSolid!!
    }

private var _smokingSolid: ImageVector? = null
