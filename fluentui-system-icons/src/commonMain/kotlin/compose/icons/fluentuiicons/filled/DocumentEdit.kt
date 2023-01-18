package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.DocumentEdit: ImageVector
    get() {
        if (_documentEdit != null) {
            return _documentEdit!!
        }
        _documentEdit = Builder(name = "DocumentEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(8.0f)
                curveTo(12.0f, 9.1046f, 12.8954f, 10.0f, 14.0f, 10.0f)
                horizontalLineTo(18.9209f)
                curveTo(18.324f, 10.2196f, 17.7756f, 10.5541f, 17.3621f, 10.9704f)
                lineTo(11.3114f, 17.0623f)
                curveTo(10.9598f, 17.4164f, 10.7086f, 17.8576f, 10.5836f, 18.3407f)
                lineTo(10.0588f, 20.3701f)
                curveTo(9.9049f, 20.9651f, 10.0168f, 21.5396f, 10.3007f, 22.0f)
                horizontalLineTo(5.5f)
                curveTo(4.6716f, 22.0f, 4.0f, 21.3284f, 4.0f, 20.5f)
                verticalLineTo(3.5f)
                curveTo(4.0f, 2.6716f, 4.6716f, 2.0f, 5.5f, 2.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(13.5f, 2.5f)
                verticalLineTo(8.0f)
                curveTo(13.5f, 8.2761f, 13.7239f, 8.5f, 14.0f, 8.5f)
                horizontalLineTo(19.5f)
                lineTo(13.5f, 2.5f)
                close()
                moveTo(12.1957f, 17.5719f)
                lineTo(18.0981f, 11.6695f)
                curveTo(18.9907f, 10.7768f, 20.4379f, 10.7768f, 21.3305f, 11.6695f)
                curveTo(22.2231f, 12.5621f, 22.2231f, 14.0093f, 21.3305f, 14.9019f)
                lineTo(15.4281f, 20.8043f)
                curveTo(15.084f, 21.1485f, 14.6528f, 21.3926f, 14.1806f, 21.5106f)
                lineTo(12.3499f, 21.9683f)
                curveTo(11.5538f, 22.1674f, 10.8326f, 21.4462f, 11.0317f, 20.6501f)
                lineTo(11.4894f, 18.8194f)
                curveTo(11.6074f, 18.3472f, 11.8515f, 17.916f, 12.1957f, 17.5719f)
                close()
            }
        }
        .build()
        return _documentEdit!!
    }

private var _documentEdit: ImageVector? = null
