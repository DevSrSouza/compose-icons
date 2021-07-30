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

public val LineAwesomeIcons.GrinStars: ImageVector
    get() {
        if (_grinStars != null) {
            return _grinStars!!
        }
        _grinStars = Builder(name = "GrinStars", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
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
                moveTo(12.0f, 10.2676f)
                lineTo(11.125f, 12.2324f)
                lineTo(9.0f, 12.4648f)
                lineTo(10.5898f, 13.8926f)
                lineTo(10.1426f, 16.0f)
                lineTo(12.0f, 14.9297f)
                lineTo(13.8574f, 16.0f)
                lineTo(13.4102f, 13.8926f)
                lineTo(15.0f, 12.4648f)
                lineTo(12.875f, 12.2324f)
                lineTo(12.0f, 10.2676f)
                close()
                moveTo(20.0f, 10.2676f)
                lineTo(19.125f, 12.2324f)
                lineTo(17.0f, 12.4648f)
                lineTo(18.5898f, 13.8926f)
                lineTo(18.1426f, 16.0f)
                lineTo(20.0f, 14.9297f)
                lineTo(21.8574f, 16.0f)
                lineTo(21.4102f, 13.8926f)
                lineTo(23.0f, 12.4648f)
                lineTo(20.875f, 12.2324f)
                lineTo(20.0f, 10.2676f)
                close()
                moveTo(10.8105f, 19.0f)
                lineTo(9.0898f, 20.0f)
                curveTo(9.2636f, 20.2987f, 9.455f, 20.5847f, 9.6641f, 20.8574f)
                curveTo(9.8731f, 21.1302f, 10.1005f, 21.3893f, 10.3418f, 21.6328f)
                curveTo(10.583f, 21.8763f, 10.8391f, 22.1054f, 11.1094f, 22.3164f)
                curveTo(11.65f, 22.7385f, 12.2447f, 23.0925f, 12.8828f, 23.3652f)
                curveTo(13.2019f, 23.5016f, 13.5323f, 23.6168f, 13.8711f, 23.7109f)
                curveTo(14.5486f, 23.8992f, 15.2625f, 24.0f, 16.0f, 24.0f)
                curveTo(18.2125f, 24.0f, 20.2107f, 23.0939f, 21.6582f, 21.6328f)
                curveTo(21.8995f, 21.3893f, 22.1269f, 21.1302f, 22.3359f, 20.8574f)
                curveTo(22.545f, 20.5847f, 22.7364f, 20.2987f, 22.9102f, 20.0f)
                lineTo(21.1895f, 19.0f)
                curveTo(20.2795f, 20.5662f, 18.696f, 21.6892f, 16.8203f, 21.9453f)
                curveTo(16.5524f, 21.9819f, 16.2787f, 22.0f, 16.0f, 22.0f)
                curveTo(15.7212f, 22.0f, 15.4476f, 21.9819f, 15.1797f, 21.9453f)
                curveTo(14.9117f, 21.9087f, 14.6495f, 21.8539f, 14.3945f, 21.7832f)
                curveTo(13.8847f, 21.6418f, 13.4034f, 21.435f, 12.959f, 21.1719f)
                curveTo(12.7368f, 21.0403f, 12.5228f, 20.8946f, 12.3203f, 20.7363f)
                curveTo(11.9154f, 20.4197f, 11.553f, 20.0514f, 11.2402f, 19.6426f)
                curveTo(11.0838f, 19.4382f, 10.9405f, 19.2237f, 10.8105f, 19.0f)
                close()
            }
        }
        .build()
        return _grinStars!!
    }

private var _grinStars: ImageVector? = null
