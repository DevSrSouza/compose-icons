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

public val RegularGroup.ColumnEdit: ImageVector
    get() {
        if (_columnEdit != null) {
            return _columnEdit!!
        }
        _columnEdit = Builder(name = "ColumnEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 5.75f)
                curveTo(5.25f, 5.0596f, 4.6904f, 4.5f, 4.0f, 4.5f)
                horizontalLineTo(3.25f)
                curveTo(2.8358f, 4.5f, 2.5f, 4.1642f, 2.5f, 3.75f)
                curveTo(2.5f, 3.3358f, 2.8358f, 3.0f, 3.25f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(5.5188f, 3.0f, 6.75f, 4.2312f, 6.75f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(6.75f, 19.7688f, 5.5188f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(3.25f)
                curveTo(2.8358f, 21.0f, 2.5f, 20.6642f, 2.5f, 20.25f)
                curveTo(2.5f, 19.8358f, 2.8358f, 19.5f, 3.25f, 19.5f)
                horizontalLineTo(4.0f)
                curveTo(4.6904f, 19.5f, 5.25f, 18.9404f, 5.25f, 18.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(10.75f, 4.5f)
                curveTo(10.0596f, 4.5f, 9.5f, 5.0596f, 9.5f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(9.5f, 18.9404f, 10.0596f, 19.5f, 10.75f, 19.5f)
                horizontalLineTo(11.541f)
                curveTo(11.534f, 19.5255f, 11.5273f, 19.5511f, 11.5209f, 19.5768f)
                lineTo(11.1651f, 21.0f)
                horizontalLineTo(10.75f)
                curveTo(9.2312f, 21.0f, 8.0f, 19.7688f, 8.0f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(8.0f, 4.2312f, 9.2312f, 3.0f, 10.75f, 3.0f)
                horizontalLineTo(13.25f)
                curveTo(14.7688f, 3.0f, 16.0f, 4.2312f, 16.0f, 5.75f)
                verticalLineTo(14.355f)
                lineTo(14.5f, 15.855f)
                verticalLineTo(5.75f)
                curveTo(14.5f, 5.0596f, 13.9404f, 4.5f, 13.25f, 4.5f)
                horizontalLineTo(10.75f)
                close()
                moveTo(19.0f, 5.75f)
                verticalLineTo(11.4828f)
                curveTo(18.7839f, 11.6154f, 18.5798f, 11.7752f, 18.3927f, 11.9624f)
                lineTo(17.5f, 12.855f)
                verticalLineTo(5.75f)
                curveTo(17.5f, 4.2312f, 18.7312f, 3.0f, 20.25f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.4142f, 3.0f, 21.75f, 3.3358f, 21.75f, 3.75f)
                curveTo(21.75f, 4.1642f, 21.4142f, 4.5f, 21.0f, 4.5f)
                horizontalLineTo(20.25f)
                curveTo(19.5596f, 4.5f, 19.0f, 5.0596f, 19.0f, 5.75f)
                close()
                moveTo(19.0999f, 12.6695f)
                lineTo(13.1974f, 18.5719f)
                curveTo(12.8533f, 18.916f, 12.6092f, 19.3472f, 12.4911f, 19.8194f)
                lineTo(12.0334f, 21.6501f)
                curveTo(11.8344f, 22.4462f, 12.5556f, 23.1674f, 13.3517f, 22.9683f)
                lineTo(15.1824f, 22.5106f)
                curveTo(15.6545f, 22.3926f, 16.0857f, 22.1485f, 16.4299f, 21.8043f)
                lineTo(22.3323f, 15.9019f)
                curveTo(23.2249f, 15.0093f, 23.2249f, 13.5621f, 22.3323f, 12.6695f)
                curveTo(21.4397f, 11.7768f, 19.9925f, 11.7768f, 19.0999f, 12.6695f)
                close()
            }
        }
        .build()
        return _columnEdit!!
    }

private var _columnEdit: ImageVector? = null
