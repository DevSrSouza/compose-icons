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

public val FilledGroup.TextAlignDistributedVertical: ImageVector
    get() {
        if (_textAlignDistributedVertical != null) {
            return _textAlignDistributedVertical!!
        }
        _textAlignDistributedVertical = Builder(name = "TextAlignDistributedVertical", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 5.4142f)
                lineTo(19.0f, 21.0f)
                curveTo(19.0f, 21.5523f, 18.5523f, 22.0f, 18.0f, 22.0f)
                curveTo(17.4477f, 22.0f, 17.0f, 21.5523f, 17.0f, 21.0f)
                lineTo(17.0f, 5.4142f)
                lineTo(16.7071f, 5.7071f)
                curveTo(16.3166f, 6.0976f, 15.6834f, 6.0976f, 15.2929f, 5.7071f)
                curveTo(14.9024f, 5.3166f, 14.9024f, 4.6834f, 15.2929f, 4.2929f)
                lineTo(17.2929f, 2.2929f)
                curveTo(17.6834f, 1.9024f, 18.3166f, 1.9024f, 18.7071f, 2.2929f)
                lineTo(20.7071f, 4.2929f)
                curveTo(21.0976f, 4.6834f, 21.0976f, 5.3166f, 20.7071f, 5.7071f)
                curveTo(20.3166f, 6.0976f, 19.6834f, 6.0976f, 19.2929f, 5.7071f)
                lineTo(19.0f, 5.4142f)
                close()
                moveTo(5.0f, 18.5858f)
                lineTo(4.7071f, 18.2929f)
                curveTo(4.3166f, 17.9024f, 3.6834f, 17.9024f, 3.2929f, 18.2929f)
                curveTo(2.9024f, 18.6834f, 2.9024f, 19.3166f, 3.2929f, 19.7071f)
                lineTo(5.2929f, 21.7071f)
                curveTo(5.6834f, 22.0976f, 6.3166f, 22.0976f, 6.7071f, 21.7071f)
                lineTo(8.7071f, 19.7071f)
                curveTo(9.0976f, 19.3166f, 9.0976f, 18.6834f, 8.7071f, 18.2929f)
                curveTo(8.3166f, 17.9024f, 7.6834f, 17.9024f, 7.2929f, 18.2929f)
                lineTo(7.0f, 18.5858f)
                lineTo(7.0f, 3.0f)
                curveTo(7.0f, 2.4477f, 6.5523f, 2.0f, 6.0f, 2.0f)
                curveTo(5.4477f, 2.0f, 5.0f, 2.4477f, 5.0f, 3.0f)
                lineTo(5.0f, 18.5858f)
                close()
                moveTo(13.0f, 3.0f)
                curveTo(13.0f, 2.4477f, 12.5523f, 2.0f, 12.0f, 2.0f)
                curveTo(11.4477f, 2.0f, 11.0f, 2.4477f, 11.0f, 3.0f)
                lineTo(11.0f, 21.0f)
                curveTo(11.0f, 21.5523f, 11.4477f, 22.0f, 12.0f, 22.0f)
                curveTo(12.5523f, 22.0f, 13.0f, 21.5523f, 13.0f, 21.0f)
                lineTo(13.0f, 3.0f)
                close()
            }
        }
        .build()
        return _textAlignDistributedVertical!!
    }

private var _textAlignDistributedVertical: ImageVector? = null
