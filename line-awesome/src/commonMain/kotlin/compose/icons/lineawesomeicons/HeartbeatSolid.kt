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

public val LineAwesomeIcons.HeartbeatSolid: ImageVector
    get() {
        if (_heartbeatSolid != null) {
            return _heartbeatSolid!!
        }
        _heartbeatSolid = Builder(name = "HeartbeatSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7813f, 5.0f)
                curveTo(6.4922f, 5.0f, 3.0f, 8.3008f, 3.0f, 12.3594f)
                curveTo(3.0f, 12.5781f, 3.0195f, 12.7852f, 3.0352f, 13.0f)
                lineTo(5.0391f, 13.0f)
                curveTo(5.0195f, 12.7891f, 5.0f, 12.5781f, 5.0f, 12.3594f)
                curveTo(5.0f, 9.4063f, 7.5938f, 7.0f, 10.7813f, 7.0f)
                curveTo(12.2383f, 7.0f, 13.6289f, 7.5039f, 14.6992f, 8.418f)
                lineTo(16.0f, 9.5313f)
                lineTo(17.3008f, 8.418f)
                curveTo(18.3672f, 7.5039f, 19.7578f, 7.0f, 21.2188f, 7.0f)
                curveTo(24.4063f, 7.0f, 27.0f, 9.4063f, 27.0f, 12.3594f)
                curveTo(27.0f, 17.4805f, 22.1758f, 20.5156f, 18.2969f, 22.957f)
                curveTo(17.4102f, 23.5117f, 16.6328f, 24.0039f, 16.0f, 24.4688f)
                curveTo(15.3672f, 24.0039f, 14.5898f, 23.5117f, 13.7031f, 22.957f)
                curveTo(11.8945f, 21.8203f, 9.8828f, 20.5508f, 8.2461f, 19.0f)
                lineTo(5.5313f, 19.0f)
                curveTo(7.5117f, 21.4102f, 10.3164f, 23.1875f, 12.6406f, 24.6523f)
                curveTo(13.6133f, 25.2617f, 14.4492f, 25.7891f, 15.043f, 26.2539f)
                curveTo(15.043f, 26.2539f, 15.9922f, 26.9922f, 16.0f, 27.0f)
                curveTo(16.0039f, 26.9922f, 16.9531f, 26.2539f, 16.9531f, 26.2539f)
                curveTo(17.5469f, 25.7891f, 18.3828f, 25.2617f, 19.3594f, 24.6523f)
                curveTo(23.4258f, 22.0898f, 29.0f, 18.5859f, 29.0f, 12.3594f)
                curveTo(29.0f, 8.3008f, 25.5078f, 5.0f, 21.2188f, 5.0f)
                curveTo(19.2695f, 5.0f, 17.4219f, 5.6797f, 16.0f, 6.8984f)
                curveTo(14.5781f, 5.6797f, 12.7266f, 5.0f, 10.7813f, 5.0f)
                close()
                moveTo(11.9688f, 9.3867f)
                lineTo(9.6328f, 15.2188f)
                lineTo(9.4141f, 15.0f)
                lineTo(3.0f, 15.0f)
                lineTo(3.0f, 17.0f)
                lineTo(8.5859f, 17.0f)
                lineTo(10.3633f, 18.7813f)
                lineTo(12.0313f, 14.6133f)
                lineTo(15.0313f, 21.6133f)
                lineTo(17.1016f, 16.4375f)
                lineTo(17.3828f, 17.0f)
                lineTo(19.2695f, 17.0f)
                curveTo(19.6289f, 17.6172f, 20.2852f, 18.0f, 21.0f, 18.0f)
                curveTo(22.1055f, 18.0f, 23.0f, 17.1055f, 23.0f, 16.0f)
                curveTo(23.0f, 14.8945f, 22.1055f, 14.0f, 21.0f, 14.0f)
                curveTo(20.2852f, 14.0f, 19.625f, 14.3828f, 19.2695f, 15.0f)
                lineTo(18.6172f, 15.0f)
                lineTo(16.8984f, 11.5625f)
                lineTo(14.9688f, 16.3867f)
                close()
            }
        }
        .build()
        return _heartbeatSolid!!
    }

private var _heartbeatSolid: ImageVector? = null
