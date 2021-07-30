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

public val LineAwesomeIcons.Angry: ImageVector
    get() {
        if (_angry != null) {
            return _angry!!
        }
        _angry = Builder(name = "Angry", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.3828f, 4.0f, 4.0f, 9.3828f, 4.0f, 16.0f)
                curveTo(4.0f, 22.6172f, 9.3828f, 28.0f, 16.0f, 28.0f)
                curveTo(22.6172f, 28.0f, 28.0f, 22.6172f, 28.0f, 16.0f)
                curveTo(28.0f, 9.3828f, 22.6172f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.5352f, 6.0f, 26.0f, 10.4648f, 26.0f, 16.0f)
                curveTo(26.0f, 21.5352f, 21.5352f, 26.0f, 16.0f, 26.0f)
                curveTo(10.4648f, 26.0f, 6.0f, 21.5352f, 6.0f, 16.0f)
                curveTo(6.0f, 10.4648f, 10.4648f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(10.6875f, 12.0f)
                curveTo(10.2656f, 12.4258f, 10.0f, 13.0078f, 10.0f, 13.6563f)
                curveTo(10.0f, 14.9492f, 11.0508f, 16.0f, 12.3438f, 16.0f)
                curveTo(12.9883f, 16.0f, 13.5781f, 15.7383f, 14.0f, 15.3125f)
                close()
                moveTo(21.3125f, 12.0f)
                lineTo(18.0f, 15.3125f)
                curveTo(18.4219f, 15.7383f, 19.0117f, 16.0f, 19.6563f, 16.0f)
                curveTo(20.9492f, 16.0f, 22.0f, 14.9492f, 22.0f, 13.6563f)
                curveTo(22.0f, 13.0117f, 21.7383f, 12.4219f, 21.3125f, 12.0f)
                close()
                moveTo(18.5625f, 17.8438f)
                curveTo(18.418f, 17.8477f, 18.2656f, 17.8555f, 18.125f, 17.875f)
                curveTo(17.0039f, 18.043f, 16.1563f, 18.6563f, 15.4063f, 19.1563f)
                curveTo(14.6563f, 19.6563f, 13.9961f, 20.0469f, 13.5f, 20.125f)
                curveTo(13.0039f, 20.2031f, 12.5586f, 20.125f, 11.7188f, 19.2813f)
                lineTo(10.2813f, 20.7188f)
                curveTo(11.4141f, 21.8594f, 12.7031f, 22.2695f, 13.8125f, 22.0938f)
                curveTo(14.9219f, 21.918f, 15.7539f, 21.3086f, 16.5f, 20.8125f)
                curveTo(17.2461f, 20.3164f, 17.8867f, 19.9531f, 18.4063f, 19.875f)
                curveTo(18.9258f, 19.7969f, 19.4375f, 19.8633f, 20.3125f, 20.7188f)
                lineTo(21.6875f, 19.2813f)
                curveTo(20.6641f, 18.2813f, 19.5742f, 17.8281f, 18.5625f, 17.8438f)
                close()
            }
        }
        .build()
        return _angry!!
    }

private var _angry: ImageVector? = null
