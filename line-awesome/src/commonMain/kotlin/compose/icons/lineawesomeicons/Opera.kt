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

public val LineAwesomeIcons.Opera: ImageVector
    get() {
        if (_opera != null) {
            return _opera!!
        }
        _opera = Builder(name = "Opera", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9688f, 4.0f)
                curveTo(9.6719f, 4.0f, 5.0f, 8.9453f, 5.0f, 15.9063f)
                curveTo(5.0f, 22.1914f, 9.4609f, 28.0f, 15.9688f, 28.0f)
                curveTo(22.5273f, 28.0f, 27.0f, 22.1914f, 27.0f, 15.9063f)
                curveTo(27.0f, 8.8828f, 22.2109f, 4.0f, 15.9688f, 4.0f)
                close()
                moveTo(15.9688f, 6.0f)
                curveTo(21.2109f, 6.0f, 25.0f, 9.7539f, 25.0f, 15.9063f)
                curveTo(25.0f, 21.2617f, 21.3438f, 26.0f, 15.9688f, 26.0f)
                curveTo(10.6523f, 26.0f, 7.0f, 21.2617f, 7.0f, 15.9063f)
                curveTo(7.0f, 9.793f, 10.6758f, 6.0f, 15.9688f, 6.0f)
                close()
                moveTo(15.9688f, 6.3125f)
                curveTo(14.9258f, 6.3125f, 13.9727f, 6.7188f, 13.3125f, 7.375f)
                curveTo(12.6523f, 8.0313f, 12.2344f, 8.8672f, 11.9375f, 9.7813f)
                curveTo(11.3398f, 11.6133f, 11.2188f, 13.7969f, 11.2188f, 15.7188f)
                curveTo(11.2188f, 17.4805f, 11.2852f, 19.7266f, 11.8438f, 21.6563f)
                curveTo(12.1211f, 22.6211f, 12.5156f, 23.5352f, 13.1875f, 24.25f)
                curveTo(13.8594f, 24.9648f, 14.8555f, 25.4375f, 15.9688f, 25.4375f)
                curveTo(17.0898f, 25.4375f, 18.0664f, 24.9609f, 18.75f, 24.25f)
                curveTo(19.4336f, 23.5391f, 19.8398f, 22.6211f, 20.125f, 21.6563f)
                curveTo(20.6992f, 19.7266f, 20.7813f, 17.5f, 20.7813f, 15.7188f)
                curveTo(20.7813f, 13.6523f, 20.6211f, 11.4922f, 20.0f, 9.6875f)
                curveTo(19.6875f, 8.7852f, 19.2656f, 7.9414f, 18.5938f, 7.3125f)
                curveTo(17.9219f, 6.6836f, 16.9961f, 6.3125f, 15.9688f, 6.3125f)
                close()
                moveTo(15.9688f, 8.3125f)
                curveTo(16.5391f, 8.3125f, 16.875f, 8.4609f, 17.2188f, 8.7813f)
                curveTo(17.5625f, 9.1016f, 17.8828f, 9.6133f, 18.125f, 10.3125f)
                curveTo(18.6094f, 11.7148f, 18.7813f, 13.7539f, 18.7813f, 15.7188f)
                curveTo(18.7813f, 17.4375f, 18.6758f, 19.5469f, 18.2188f, 21.0938f)
                curveTo(17.9883f, 21.8672f, 17.6719f, 22.5f, 17.3125f, 22.875f)
                curveTo(16.9531f, 23.25f, 16.5938f, 23.4375f, 15.9688f, 23.4375f)
                curveTo(15.3594f, 23.4375f, 15.0078f, 23.25f, 14.6563f, 22.875f)
                curveTo(14.3047f, 22.5f, 13.9727f, 21.8711f, 13.75f, 21.0938f)
                curveTo(13.3008f, 19.5391f, 13.2188f, 17.4258f, 13.2188f, 15.7188f)
                curveTo(13.2188f, 13.8906f, 13.375f, 11.8516f, 13.8438f, 10.4063f)
                curveTo(14.0781f, 9.6836f, 14.4102f, 9.1484f, 14.75f, 8.8125f)
                curveTo(15.0898f, 8.4766f, 15.4141f, 8.3125f, 15.9688f, 8.3125f)
                close()
            }
        }
        .build()
        return _opera!!
    }

private var _opera: ImageVector? = null
