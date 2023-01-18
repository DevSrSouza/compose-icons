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

public val FilledGroup.SaveEdit: ImageVector
    get() {
        if (_saveEdit != null) {
            return _saveEdit!!
        }
        _saveEdit = Builder(name = "SaveEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.75f, 3.0f)
                horizontalLineTo(5.75f)
                curveTo(4.2312f, 3.0f, 3.0f, 4.2312f, 3.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(3.0f, 19.7688f, 4.2312f, 21.0f, 5.75f, 21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                curveTo(6.0f, 13.7574f, 7.0074f, 12.75f, 8.25f, 12.75f)
                horizontalLineTo(15.6031f)
                lineTo(17.3907f, 10.9624f)
                curveTo(18.0317f, 10.3214f, 18.8742f, 10.0004f, 19.713f, 10.0f)
                horizontalLineTo(19.7151f)
                curveTo(20.1521f, 10.0002f, 20.59f, 10.0874f, 21.0f, 10.2615f)
                verticalLineTo(8.2855f)
                curveTo(21.0f, 7.4236f, 20.6576f, 6.5969f, 20.0481f, 5.9874f)
                lineTo(18.0126f, 3.9519f)
                curveTo(17.4114f, 3.3508f, 16.5991f, 3.0095f, 15.75f, 3.0002f)
                verticalLineTo(7.5f)
                curveTo(15.75f, 8.7426f, 14.7426f, 9.75f, 13.5f, 9.75f)
                horizontalLineTo(9.0f)
                curveTo(7.7574f, 9.75f, 6.75f, 8.7426f, 6.75f, 7.5f)
                verticalLineTo(3.0f)
                close()
                moveTo(14.1031f, 14.25f)
                lineTo(11.4883f, 16.8648f)
                curveTo(11.016f, 17.3371f, 10.681f, 17.9288f, 10.519f, 18.5768f)
                lineTo(10.0613f, 20.4075f)
                curveTo(10.011f, 20.6088f, 9.9913f, 20.8075f, 9.9985f, 21.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(15.0f)
                curveTo(7.5f, 14.5858f, 7.8358f, 14.25f, 8.25f, 14.25f)
                horizontalLineTo(14.1031f)
                close()
                moveTo(14.25f, 3.0f)
                verticalLineTo(7.5f)
                curveTo(14.25f, 7.9142f, 13.9142f, 8.25f, 13.5f, 8.25f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 8.25f, 8.25f, 7.9142f, 8.25f, 7.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(14.25f)
                close()
                moveTo(19.7152f, 11.0f)
                horizontalLineTo(19.7131f)
                curveTo(19.1285f, 11.0003f, 18.5439f, 11.2234f, 18.0979f, 11.6695f)
                lineTo(12.1955f, 17.5719f)
                curveTo(11.8513f, 17.916f, 11.6072f, 18.3472f, 11.4892f, 18.8194f)
                lineTo(11.0315f, 20.6501f)
                curveTo(10.8325f, 21.4462f, 11.5536f, 22.1674f, 12.3497f, 21.9683f)
                lineTo(14.1804f, 21.5106f)
                curveTo(14.6526f, 21.3926f, 15.0838f, 21.1485f, 15.4279f, 20.8043f)
                lineTo(21.3303f, 14.9019f)
                curveTo(22.223f, 14.0093f, 22.223f, 12.5621f, 21.3303f, 11.6695f)
                curveTo(20.8843f, 11.2234f, 20.2998f, 11.0003f, 19.7152f, 11.0f)
                close()
            }
        }
        .build()
        return _saveEdit!!
    }

private var _saveEdit: ImageVector? = null
