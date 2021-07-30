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

public val LineAwesomeIcons.GlideG: ImageVector
    get() {
        if (_glideG != null) {
            return _glideG!!
        }
        _glideG = Builder(name = "GlideG", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0352f, 3.0f)
                curveTo(10.1902f, 3.0f, 7.0f, 8.7732f, 7.0f, 13.0742f)
                curveTo(7.0f, 17.5382f, 9.8365f, 20.0117f, 14.2695f, 20.0117f)
                curveTo(14.8785f, 20.0117f, 14.8281f, 19.9611f, 14.8281f, 20.2051f)
                curveTo(13.9701f, 26.7511f, 10.2168f, 26.9648f, 10.2168f, 25.0098f)
                curveTo(10.2168f, 23.0188f, 12.9662f, 22.5243f, 12.9922f, 22.4023f)
                curveTo(12.9762f, 21.7823f, 10.604f, 21.0f, 10.0f, 21.0f)
                curveTo(8.279f, 21.005f, 7.0f, 23.1082f, 7.0f, 24.5352f)
                curveTo(7.0f, 27.1712f, 8.5408f, 29.0f, 11.2168f, 29.0f)
                curveTo(15.1468f, 29.0f, 18.0213f, 25.0482f, 18.9043f, 21.6152f)
                curveTo(19.6713f, 18.5432f, 19.4733f, 18.4026f, 19.9043f, 18.1836f)
                curveTo(21.5393f, 17.3606f, 22.825f, 17.5723f, 24.668f, 17.5723f)
                curveTo(25.572f, 17.5723f, 26.2162f, 17.761f, 27.6582f, 18.0f)
                curveTo(27.8052f, 18.0f, 27.998f, 17.8531f, 27.998f, 17.7051f)
                curveTo(27.999f, 17.2991f, 26.381f, 14.3404f, 26.0f, 14.1934f)
                curveTo(25.822f, 14.1224f, 25.4118f, 14.0f, 25.2188f, 14.0f)
                curveTo(23.3347f, 14.0f, 21.9816f, 14.3842f, 20.3926f, 15.2832f)
                lineTo(20.3477f, 15.2383f)
                curveTo(20.7037f, 12.8363f, 22.0f, 10.2853f, 22.0f, 7.8223f)
                curveTo(22.0f, 4.1913f, 19.6002f, 3.0f, 16.0352f, 3.0f)
                close()
                moveTo(16.2891f, 5.8281f)
                curveTo(17.2341f, 5.8281f, 17.7656f, 6.218f, 17.7656f, 7.0f)
                curveTo(17.7606f, 7.726f, 17.6285f, 8.4463f, 17.4805f, 9.1523f)
                curveTo(17.0085f, 11.4223f, 16.0764f, 13.9898f, 15.6094f, 16.2598f)
                curveTo(15.4924f, 16.7778f, 14.9342f, 16.6543f, 14.4922f, 16.6543f)
                curveTo(12.5472f, 16.6543f, 12.0f, 14.5324f, 12.0f, 12.9434f)
                curveTo(12.0f, 10.5564f, 12.9186f, 7.3939f, 15.1426f, 6.1699f)
                curveTo(15.4976f, 5.9619f, 15.8931f, 5.8281f, 16.2891f, 5.8281f)
                close()
            }
        }
        .build()
        return _glideG!!
    }

private var _glideG: ImageVector? = null
