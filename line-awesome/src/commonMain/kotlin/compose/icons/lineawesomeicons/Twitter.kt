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

public val LineAwesomeIcons.Twitter: ImageVector
    get() {
        if (_twitter != null) {
            return _twitter!!
        }
        _twitter = Builder(name = "Twitter", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 8.5586f)
                curveTo(27.1172f, 8.9492f, 26.168f, 9.2148f, 25.1719f, 9.332f)
                curveTo(26.1875f, 8.7227f, 26.9688f, 7.7578f, 27.3359f, 6.6094f)
                curveTo(26.3867f, 7.1719f, 25.332f, 7.582f, 24.2109f, 7.8047f)
                curveTo(23.3125f, 6.8477f, 22.0313f, 6.2461f, 20.6172f, 6.2461f)
                curveTo(17.8984f, 6.2461f, 15.6914f, 8.4531f, 15.6914f, 11.1719f)
                curveTo(15.6914f, 11.5586f, 15.7344f, 11.9336f, 15.8203f, 12.293f)
                curveTo(11.7266f, 12.0898f, 8.0977f, 10.1289f, 5.6719f, 7.1484f)
                curveTo(5.2461f, 7.875f, 5.0039f, 8.7227f, 5.0039f, 9.625f)
                curveTo(5.0039f, 11.332f, 5.8711f, 12.8398f, 7.1953f, 13.7227f)
                curveTo(6.3867f, 13.6953f, 5.6289f, 13.4766f, 4.9648f, 13.1055f)
                curveTo(4.9648f, 13.1289f, 4.9648f, 13.1484f, 4.9648f, 13.168f)
                curveTo(4.9648f, 15.5547f, 6.6602f, 17.5469f, 8.9141f, 17.9961f)
                curveTo(8.5f, 18.1094f, 8.0664f, 18.1719f, 7.6172f, 18.1719f)
                curveTo(7.3008f, 18.1719f, 6.9883f, 18.1406f, 6.6914f, 18.082f)
                curveTo(7.3164f, 20.0391f, 9.1367f, 21.4609f, 11.2891f, 21.5039f)
                curveTo(9.6055f, 22.8242f, 7.4805f, 23.6094f, 5.1758f, 23.6094f)
                curveTo(4.7773f, 23.6094f, 4.3867f, 23.5859f, 4.0f, 23.5391f)
                curveTo(6.1797f, 24.9375f, 8.7656f, 25.7539f, 11.5469f, 25.7539f)
                curveTo(20.6055f, 25.7539f, 25.5586f, 18.25f, 25.5586f, 11.7422f)
                curveTo(25.5586f, 11.5313f, 25.5508f, 11.3164f, 25.543f, 11.1055f)
                curveTo(26.5039f, 10.4102f, 27.3398f, 9.543f, 28.0f, 8.5586f)
                close()
            }
        }
        .build()
        return _twitter!!
    }

private var _twitter: ImageVector? = null
