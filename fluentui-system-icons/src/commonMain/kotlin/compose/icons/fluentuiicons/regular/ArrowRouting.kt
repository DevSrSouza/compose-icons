package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ArrowRouting: ImageVector
    get() {
        if (_arrowRouting != null) {
            return _arrowRouting!!
        }
        _arrowRouting = Builder(name = "ArrowRouting", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.7801f, 2.2197f)
                curveTo(18.4872f, 1.9268f, 18.0123f, 1.9268f, 17.7195f, 2.2197f)
                curveTo(17.4266f, 2.5126f, 17.4266f, 2.9874f, 17.7195f, 3.2803f)
                lineTo(19.4391f, 5.0f)
                horizontalLineTo(13.2498f)
                curveTo(11.731f, 5.0f, 10.4998f, 6.2312f, 10.4998f, 7.75f)
                lineTo(10.4996f, 17.2469f)
                curveTo(10.4996f, 17.9373f, 9.94f, 18.4969f, 9.2497f, 18.4969f)
                horizontalLineTo(7.9581f)
                curveTo(7.7187f, 17.0796f, 6.4855f, 16.0f, 5.0f, 16.0f)
                curveTo(3.3432f, 16.0f, 2.0f, 17.3432f, 2.0f, 19.0f)
                curveTo(2.0f, 20.6569f, 3.3432f, 22.0001f, 5.0f, 22.0001f)
                curveTo(6.3074f, 22.0001f, 7.4195f, 21.1638f, 7.8305f, 19.9969f)
                horizontalLineTo(9.2497f)
                curveTo(10.7684f, 19.9969f, 11.9996f, 18.7657f, 11.9996f, 17.247f)
                lineTo(11.9998f, 7.75f)
                curveTo(11.9998f, 7.0596f, 12.5594f, 6.5f, 13.2498f, 6.5f)
                horizontalLineTo(19.4391f)
                lineTo(17.7195f, 8.2197f)
                curveTo(17.4266f, 8.5126f, 17.4266f, 8.9874f, 17.7195f, 9.2803f)
                curveTo(18.0123f, 9.5732f, 18.4872f, 9.5732f, 18.7801f, 9.2803f)
                lineTo(21.7801f, 6.2803f)
                curveTo(22.073f, 5.9874f, 22.073f, 5.5126f, 21.7801f, 5.2197f)
                lineTo(18.7801f, 2.2197f)
                close()
                moveTo(3.5f, 19.0f)
                curveTo(3.5f, 18.1716f, 4.1716f, 17.5f, 5.0f, 17.5f)
                curveTo(5.8285f, 17.5f, 6.5001f, 18.1716f, 6.5001f, 19.0f)
                curveTo(6.5001f, 19.8285f, 5.8285f, 20.5001f, 5.0f, 20.5001f)
                curveTo(4.1716f, 20.5001f, 3.5f, 19.8285f, 3.5f, 19.0f)
                close()
            }
        }
        .build()
        return _arrowRouting!!
    }

private var _arrowRouting: ImageVector? = null
