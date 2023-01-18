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

public val FilledGroup.CommentEdit: ImageVector
    get() {
        if (_commentEdit != null) {
            return _commentEdit!!
        }
        _commentEdit = Builder(name = "CommentEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.25f)
                curveTo(2.0f, 4.4551f, 3.4551f, 3.0f, 5.25f, 3.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 3.0f, 22.0f, 4.4551f, 22.0f, 6.25f)
                verticalLineTo(10.9237f)
                curveTo(20.714f, 9.6793f, 18.6628f, 9.6923f, 17.3927f, 10.9624f)
                lineTo(11.4903f, 16.8648f)
                curveTo(11.018f, 17.3371f, 10.6829f, 17.9288f, 10.5209f, 18.5768f)
                lineTo(10.1263f, 20.1553f)
                lineTo(8.0f, 21.75f)
                curveTo(7.176f, 22.368f, 6.0f, 21.7801f, 6.0f, 20.75f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 18.0f, 2.0f, 16.5449f, 2.0f, 14.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(18.0999f, 11.6695f)
                lineTo(12.1974f, 17.5719f)
                curveTo(11.8533f, 17.916f, 11.6092f, 18.3472f, 11.4911f, 18.8194f)
                lineTo(11.0334f, 20.6501f)
                curveTo(10.8344f, 21.4462f, 11.5556f, 22.1674f, 12.3517f, 21.9683f)
                lineTo(14.1824f, 21.5106f)
                curveTo(14.6545f, 21.3926f, 15.0857f, 21.1485f, 15.4299f, 20.8043f)
                lineTo(21.3323f, 14.9019f)
                curveTo(22.2249f, 14.0093f, 22.2249f, 12.5621f, 21.3323f, 11.6695f)
                curveTo(20.4397f, 10.7768f, 18.9925f, 10.7768f, 18.0999f, 11.6695f)
                close()
            }
        }
        .build()
        return _commentEdit!!
    }

private var _commentEdit: ImageVector? = null
