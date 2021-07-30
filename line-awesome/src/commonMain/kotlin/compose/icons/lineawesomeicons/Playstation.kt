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

public val LineAwesomeIcons.Playstation: ImageVector
    get() {
        if (_playstation != null) {
            return _playstation!!
        }
        _playstation = Builder(name = "Playstation", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9375f, 6.0f)
                lineTo(12.9375f, 24.75f)
                lineTo(17.0f, 26.0f)
                lineTo(17.0f, 10.3438f)
                curveTo(17.0f, 9.9297f, 17.0469f, 9.6445f, 17.2188f, 9.4688f)
                curveTo(17.3906f, 9.2305f, 17.5703f, 9.2109f, 17.8125f, 9.3125f)
                curveTo(18.4023f, 9.4844f, 18.6563f, 9.9805f, 18.6563f, 10.8438f)
                lineTo(18.6563f, 17.1563f)
                curveTo(19.9727f, 17.7773f, 21.168f, 17.8438f, 22.0313f, 17.1875f)
                curveTo(22.9336f, 16.5664f, 23.4063f, 15.4414f, 23.4063f, 13.7813f)
                curveTo(23.4063f, 12.0547f, 23.0781f, 10.7422f, 22.3125f, 9.875f)
                curveTo(21.6211f, 8.9414f, 20.3984f, 8.1836f, 18.5938f, 7.5625f)
                curveTo(16.3438f, 6.8359f, 14.4609f, 6.3203f, 12.9375f, 6.0f)
                close()
                moveTo(11.6875f, 17.3438f)
                lineTo(10.875f, 17.5938f)
                lineTo(5.8438f, 19.4063f)
                lineTo(4.9688f, 19.75f)
                curveTo(3.6523f, 20.3047f, 2.9648f, 20.8867f, 3.0f, 21.4063f)
                curveTo(3.0703f, 22.168f, 3.9414f, 22.7109f, 5.5f, 23.125f)
                curveTo(7.5234f, 23.6719f, 9.5859f, 23.7813f, 11.6875f, 23.4688f)
                lineTo(11.6875f, 21.3438f)
                lineTo(10.875f, 21.6563f)
                lineTo(10.0f, 22.0f)
                lineTo(8.5313f, 22.2813f)
                lineTo(7.1563f, 22.0938f)
                curveTo(6.8789f, 21.918f, 6.8242f, 21.7344f, 7.0f, 21.5625f)
                curveTo(7.1719f, 21.457f, 7.4102f, 21.3242f, 7.6875f, 21.2188f)
                lineTo(8.625f, 20.875f)
                lineTo(11.6875f, 19.8125f)
                close()
                moveTo(23.3438f, 18.3438f)
                curveTo(22.9688f, 18.3281f, 22.582f, 18.3555f, 22.2188f, 18.375f)
                curveTo(20.8711f, 18.4023f, 19.5f, 18.6406f, 18.0625f, 19.0938f)
                lineTo(18.0625f, 21.5938f)
                lineTo(20.9063f, 20.5938f)
                lineTo(22.375f, 20.0938f)
                curveTo(22.375f, 20.0938f, 22.9375f, 19.9492f, 23.3438f, 19.8438f)
                curveTo(23.9648f, 19.6797f, 24.625f, 19.9063f, 24.625f, 19.9063f)
                curveTo(25.0039f, 19.9414f, 25.1797f, 20.0742f, 25.25f, 20.25f)
                curveTo(25.3203f, 20.457f, 25.082f, 20.6367f, 24.5625f, 20.8125f)
                lineTo(23.2813f, 21.3125f)
                lineTo(18.0625f, 23.1875f)
                lineTo(18.0625f, 25.625f)
                lineTo(20.5f, 24.75f)
                lineTo(26.3438f, 22.6875f)
                lineTo(27.0625f, 22.375f)
                curveTo(28.4492f, 21.8555f, 29.0703f, 21.2852f, 29.0f, 20.5938f)
                curveTo(28.9648f, 19.9336f, 28.1992f, 19.418f, 26.8125f, 18.9688f)
                curveTo(25.6445f, 18.5781f, 24.4688f, 18.3867f, 23.3438f, 18.3438f)
                close()
            }
        }
        .build()
        return _playstation!!
    }

private var _playstation: ImageVector? = null
