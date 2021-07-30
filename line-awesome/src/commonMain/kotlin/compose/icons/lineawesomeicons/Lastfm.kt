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

public val LineAwesomeIcons.Lastfm: ImageVector
    get() {
        if (_lastfm != null) {
            return _lastfm!!
        }
        _lastfm = Builder(name = "Lastfm", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3477f, 22.0781f)
                lineTo(13.3203f, 19.2891f)
                curveTo(13.3203f, 19.2891f, 11.6523f, 21.1484f, 9.1523f, 21.1484f)
                curveTo(6.9414f, 21.1484f, 5.3672f, 19.2227f, 5.3672f, 16.1445f)
                curveTo(5.3672f, 12.1992f, 7.3555f, 10.7891f, 9.3125f, 10.7891f)
                curveTo(12.1367f, 10.7891f, 13.0313f, 12.6172f, 13.8047f, 14.957f)
                lineTo(14.8281f, 18.1641f)
                curveTo(15.8555f, 21.2773f, 17.7813f, 23.7773f, 23.3281f, 23.7773f)
                curveTo(27.3047f, 23.7773f, 30.0f, 22.5586f, 30.0f, 19.3516f)
                curveTo(30.0f, 16.7539f, 28.5234f, 15.4063f, 25.7656f, 14.7656f)
                lineTo(23.7109f, 14.3164f)
                curveTo(22.3008f, 13.9961f, 21.8828f, 13.418f, 21.8828f, 12.457f)
                curveTo(21.8828f, 11.3672f, 22.75f, 10.7227f, 24.1602f, 10.7227f)
                curveTo(25.6992f, 10.7227f, 26.5352f, 11.3008f, 26.6641f, 12.6797f)
                lineTo(29.8711f, 12.2969f)
                curveTo(29.6133f, 9.4102f, 27.625f, 8.2227f, 24.3516f, 8.2227f)
                curveTo(21.4688f, 8.2227f, 18.6445f, 9.3125f, 18.6445f, 12.8086f)
                curveTo(18.6445f, 14.9883f, 19.7031f, 16.3672f, 22.3633f, 17.0117f)
                lineTo(24.5469f, 17.5234f)
                curveTo(26.1797f, 17.9102f, 26.7266f, 18.582f, 26.7266f, 19.5117f)
                curveTo(26.7266f, 20.6992f, 25.5703f, 21.1797f, 23.3906f, 21.1797f)
                curveTo(20.1523f, 21.1797f, 18.8047f, 19.4805f, 18.0352f, 17.1406f)
                lineTo(16.9766f, 13.9336f)
                curveTo(15.6289f, 9.7617f, 13.4805f, 8.2227f, 9.2148f, 8.2227f)
                curveTo(4.5039f, 8.2227f, 2.0f, 11.2031f, 2.0f, 16.2734f)
                curveTo(2.0f, 21.1484f, 4.5039f, 23.7773f, 8.9922f, 23.7773f)
                curveTo(12.6172f, 23.7773f, 14.3477f, 22.0781f, 14.3477f, 22.0781f)
                close()
            }
        }
        .build()
        return _lastfm!!
    }

private var _lastfm: ImageVector? = null
