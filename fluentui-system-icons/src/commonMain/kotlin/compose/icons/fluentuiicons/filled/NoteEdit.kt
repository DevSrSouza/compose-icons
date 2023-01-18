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

public val FilledGroup.NoteEdit: ImageVector
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
                curveTo(11.6829f, 18.9288f, 12.018f, 18.3371f, 12.4903f, 17.8648f)
                lineTo(18.3927f, 11.9624f)
                curveTo(19.1066f, 11.2485f, 20.0672f, 10.9318f, 21.0f, 11.0122f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.75f)
                curveTo(11.0f, 9.5449f, 9.5449f, 11.0f, 7.75f, 11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.75f)
                close()
                moveTo(9.5f, 3.44f)
                lineTo(3.44f, 9.5f)
                horizontalLineTo(7.75f)
                curveTo(8.7165f, 9.5f, 9.5f, 8.7165f, 9.5f, 7.75f)
                verticalLineTo(3.44f)
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
