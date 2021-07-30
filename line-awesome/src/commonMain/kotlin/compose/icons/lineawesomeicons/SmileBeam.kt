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

public val LineAwesomeIcons.SmileBeam: ImageVector
    get() {
        if (_smileBeam != null) {
            return _smileBeam!!
        }
        _smileBeam = Builder(name = "SmileBeam", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(11.0f, 12.0f)
                curveTo(8.906f, 12.0f, 7.3906f, 13.207f, 7.3906f, 13.207f)
                lineTo(8.6094f, 14.793f)
                curveTo(8.6094f, 14.793f, 9.693f, 14.0f, 11.002f, 14.0f)
                curveTo(12.311f, 14.0f, 13.3926f, 14.793f, 13.3926f, 14.793f)
                lineTo(14.6113f, 13.207f)
                curveTo(14.6093f, 13.207f, 13.094f, 12.0f, 11.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveTo(18.906f, 12.0f, 17.3906f, 13.207f, 17.3906f, 13.207f)
                lineTo(18.6094f, 14.793f)
                curveTo(18.6094f, 14.793f, 19.693f, 14.0f, 21.002f, 14.0f)
                curveTo(22.311f, 14.0f, 23.3926f, 14.793f, 23.3926f, 14.793f)
                lineTo(24.6113f, 13.207f)
                curveTo(24.6093f, 13.207f, 23.094f, 12.0f, 21.0f, 12.0f)
                close()
                moveTo(10.8105f, 19.0f)
                lineTo(9.0898f, 20.0f)
                curveTo(9.2636f, 20.2987f, 9.455f, 20.5847f, 9.6641f, 20.8574f)
                curveTo(9.8731f, 21.1302f, 10.1005f, 21.3893f, 10.3418f, 21.6328f)
                curveTo(10.8243f, 22.1198f, 11.3684f, 22.5459f, 11.9609f, 22.8965f)
                curveTo(12.2572f, 23.0718f, 12.5638f, 23.2289f, 12.8828f, 23.3652f)
                curveTo(13.2019f, 23.5016f, 13.5323f, 23.6168f, 13.8711f, 23.7109f)
                curveTo(14.2098f, 23.8051f, 14.5588f, 23.8771f, 14.9141f, 23.9258f)
                curveTo(15.2694f, 23.9745f, 15.6313f, 24.0f, 16.0f, 24.0f)
                curveTo(16.3687f, 24.0f, 16.7306f, 23.9745f, 17.0859f, 23.9258f)
                curveTo(18.8625f, 23.6823f, 20.452f, 22.8504f, 21.6582f, 21.6328f)
                curveTo(21.8995f, 21.3893f, 22.1269f, 21.1302f, 22.3359f, 20.8574f)
                curveTo(22.545f, 20.5847f, 22.7364f, 20.2987f, 22.9102f, 20.0f)
                lineTo(21.1895f, 19.0f)
                curveTo(20.2795f, 20.5662f, 18.696f, 21.6892f, 16.8203f, 21.9453f)
                curveTo(16.5524f, 21.9819f, 16.2787f, 22.0f, 16.0f, 22.0f)
                curveTo(15.7212f, 22.0f, 15.4476f, 21.9819f, 15.1797f, 21.9453f)
                curveTo(14.9117f, 21.9087f, 14.6495f, 21.8539f, 14.3945f, 21.7832f)
                curveTo(13.8847f, 21.6418f, 13.4034f, 21.435f, 12.959f, 21.1719f)
                curveTo(12.5146f, 20.9088f, 12.1072f, 20.5898f, 11.7461f, 20.2246f)
                curveTo(11.5655f, 20.042f, 11.3966f, 19.847f, 11.2402f, 19.6426f)
                curveTo(11.0838f, 19.4382f, 10.9405f, 19.2237f, 10.8105f, 19.0f)
                close()
            }
        }
        .build()
        return _smileBeam!!
    }

private var _smileBeam: ImageVector? = null
