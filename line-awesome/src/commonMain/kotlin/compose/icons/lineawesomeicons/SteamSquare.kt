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

public val LineAwesomeIcons.SteamSquare: ImageVector
    get() {
        if (_steamSquare != null) {
            return _steamSquare!!
        }
        _steamSquare = Builder(name = "SteamSquare", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 16.0f)
                lineTo(8.8125f, 17.5938f)
                curveTo(9.5234f, 16.6602f, 10.6211f, 16.0352f, 11.875f, 16.0f)
                lineTo(14.0313f, 12.75f)
                curveTo(14.1563f, 10.1016f, 16.3203f, 8.0f, 19.0f, 8.0f)
                curveTo(21.7617f, 8.0f, 24.0f, 10.2383f, 24.0f, 13.0f)
                curveTo(24.0f, 15.6797f, 21.8984f, 17.8438f, 19.25f, 17.9688f)
                lineTo(16.0f, 20.125f)
                curveTo(15.9375f, 22.2813f, 14.1719f, 24.0f, 12.0f, 24.0f)
                curveTo(9.7891f, 24.0f, 8.0f, 22.2109f, 8.0f, 20.0f)
                curveTo(8.0f, 19.8086f, 8.0352f, 19.6211f, 8.0625f, 19.4375f)
                lineTo(5.0f, 18.1563f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                close()
                moveTo(19.0f, 10.0f)
                curveTo(17.3477f, 10.0f, 16.0f, 11.3477f, 16.0f, 13.0f)
                curveTo(16.0f, 14.6523f, 17.3477f, 16.0f, 19.0f, 16.0f)
                curveTo(20.6523f, 16.0f, 22.0f, 14.6523f, 22.0f, 13.0f)
                curveTo(22.0f, 11.3477f, 20.6523f, 10.0f, 19.0f, 10.0f)
                close()
                moveTo(19.0f, 11.0f)
                curveTo(20.1094f, 11.0f, 21.0f, 11.8906f, 21.0f, 13.0f)
                curveTo(21.0f, 14.1094f, 20.1094f, 15.0f, 19.0f, 15.0f)
                curveTo(17.8906f, 15.0f, 17.0f, 14.1094f, 17.0f, 13.0f)
                curveTo(17.0f, 11.8906f, 17.8906f, 11.0f, 19.0f, 11.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(11.5469f, 18.0f, 11.1172f, 18.1484f, 10.7813f, 18.4063f)
                lineTo(12.375f, 19.0625f)
                curveTo(12.8867f, 19.2734f, 13.1523f, 19.8633f, 12.9375f, 20.375f)
                curveTo(12.7773f, 20.7578f, 12.3906f, 21.0f, 12.0f, 21.0f)
                curveTo(11.8711f, 21.0f, 11.75f, 20.9922f, 11.625f, 20.9375f)
                lineTo(10.0313f, 20.25f)
                curveTo(10.1602f, 21.2305f, 10.9844f, 22.0f, 12.0f, 22.0f)
                curveTo(13.1055f, 22.0f, 14.0f, 21.1055f, 14.0f, 20.0f)
                curveTo(14.0f, 18.8945f, 13.1055f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _steamSquare!!
    }

private var _steamSquare: ImageVector? = null
