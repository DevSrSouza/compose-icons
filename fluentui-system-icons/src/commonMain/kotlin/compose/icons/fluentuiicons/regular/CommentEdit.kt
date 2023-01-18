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

public val RegularGroup.CommentEdit: ImageVector
    get() {
        if (_commentEdit != null) {
            return _commentEdit!!
        }
        _commentEdit = Builder(name = "CommentEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 14.75f)
                curveTo(2.0f, 16.5449f, 3.4551f, 18.0f, 5.25f, 18.0f)
                horizontalLineTo(5.9992f)
                lineTo(6.0f, 20.7499f)
                curveTo(6.0f, 21.0196f, 6.0874f, 21.2822f, 6.249f, 21.4984f)
                curveTo(6.6625f, 22.0512f, 7.4458f, 22.1642f, 7.9987f, 21.7507f)
                lineTo(10.1239f, 20.1608f)
                lineTo(10.5199f, 18.5768f)
                curveTo(10.5914f, 18.2911f, 10.6965f, 18.0162f, 10.8322f, 17.7578f)
                lineTo(7.4999f, 20.2506f)
                lineTo(7.4988f, 16.5f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 16.5f, 3.5f, 15.7165f, 3.5f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(3.5f, 5.2835f, 4.2835f, 4.5f, 5.25f, 4.5f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 4.5f, 20.5f, 5.2835f, 20.5f, 6.25f)
                verticalLineTo(10.0946f)
                curveTo(21.0475f, 10.2288f, 21.5671f, 10.5054f, 22.0f, 10.9246f)
                verticalLineTo(6.25f)
                curveTo(22.0f, 4.4551f, 20.5449f, 3.0f, 18.75f, 3.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 3.0f, 2.0f, 4.4551f, 2.0f, 6.25f)
                verticalLineTo(14.75f)
                close()
                moveTo(18.0979f, 11.6695f)
                lineTo(12.1955f, 17.5719f)
                curveTo(11.8513f, 17.916f, 11.6072f, 18.3472f, 11.4892f, 18.8194f)
                lineTo(11.0315f, 20.6501f)
                curveTo(10.8325f, 21.4462f, 11.5536f, 22.1674f, 12.3497f, 21.9683f)
                lineTo(14.1804f, 21.5106f)
                curveTo(14.6526f, 21.3926f, 15.0838f, 21.1485f, 15.4279f, 20.8043f)
                lineTo(21.3303f, 14.9019f)
                curveTo(22.223f, 14.0093f, 22.223f, 12.5621f, 21.3303f, 11.6695f)
                curveTo(20.4377f, 10.7768f, 18.9905f, 10.7768f, 18.0979f, 11.6695f)
                close()
            }
        }
        .build()
        return _commentEdit!!
    }

private var _commentEdit: ImageVector? = null
