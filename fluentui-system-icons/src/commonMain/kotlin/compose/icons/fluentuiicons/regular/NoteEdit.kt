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

public val RegularGroup.NoteEdit: ImageVector
    get() {
        if (_noteEdit != null) {
            return _noteEdit!!
        }
        _noteEdit = Builder(name = "NoteEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(11.1651f)
                lineTo(11.5209f, 19.5768f)
                curveTo(11.5273f, 19.5511f, 11.534f, 19.5255f, 11.541f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 19.5f, 4.5f, 18.7165f, 4.5f, 17.75f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.75f)
                lineTo(7.9344f, 10.9949f)
                curveTo(9.6435f, 10.8992f, 11.0f, 9.483f, 11.0f, 7.75f)
                verticalLineTo(4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 4.5f, 19.5f, 5.2835f, 19.5f, 6.25f)
                verticalLineTo(11.2324f)
                curveTo(19.9789f, 11.0419f, 20.4935f, 10.9685f, 21.0f, 11.0122f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(10.8713f)
                curveTo(10.2746f, 3.0f, 9.7023f, 3.2371f, 9.2803f, 3.659f)
                lineTo(3.659f, 9.2803f)
                curveTo(3.2371f, 9.7023f, 3.0f, 10.2746f, 3.0f, 10.8713f)
                verticalLineTo(17.75f)
                close()
                moveTo(7.75f, 9.5f)
                horizontalLineTo(5.561f)
                lineTo(9.5f, 5.561f)
                verticalLineTo(7.75f)
                lineTo(9.4942f, 7.8935f)
                curveTo(9.4212f, 8.7929f, 8.6682f, 9.5f, 7.75f, 9.5f)
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
        return _noteEdit!!
    }

private var _noteEdit: ImageVector? = null
