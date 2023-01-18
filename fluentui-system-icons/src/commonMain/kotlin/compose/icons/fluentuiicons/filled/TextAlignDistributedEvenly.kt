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

public val FilledGroup.TextAlignDistributedEvenly: ImageVector
    get() {
        if (_textAlignDistributedEvenly != null) {
            return _textAlignDistributedEvenly!!
        }
        _textAlignDistributedEvenly = Builder(name = "TextAlignDistributedEvenly", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                curveTo(2.0f, 5.4477f, 2.4477f, 5.0f, 3.0f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 5.0f, 22.0f, 5.4477f, 22.0f, 6.0f)
                curveTo(22.0f, 6.5523f, 21.5523f, 7.0f, 21.0f, 7.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 7.0f, 2.0f, 6.5523f, 2.0f, 6.0f)
                close()
                moveTo(5.7071f, 15.2929f)
                curveTo(5.3166f, 14.9024f, 4.6834f, 14.9024f, 4.2929f, 15.2929f)
                lineTo(2.2929f, 17.2929f)
                curveTo(1.9024f, 17.6834f, 1.9024f, 18.3166f, 2.2929f, 18.7071f)
                lineTo(4.2929f, 20.7071f)
                curveTo(4.6834f, 21.0976f, 5.3166f, 21.0976f, 5.7071f, 20.7071f)
                curveTo(6.0976f, 20.3166f, 6.0976f, 19.6834f, 5.7071f, 19.2929f)
                lineTo(5.4142f, 19.0f)
                horizontalLineTo(18.5858f)
                lineTo(18.2929f, 19.2929f)
                curveTo(17.9024f, 19.6834f, 17.9024f, 20.3166f, 18.2929f, 20.7071f)
                curveTo(18.6834f, 21.0976f, 19.3166f, 21.0976f, 19.7071f, 20.7071f)
                lineTo(21.7071f, 18.7071f)
                curveTo(22.0976f, 18.3166f, 22.0976f, 17.6834f, 21.7071f, 17.2929f)
                lineTo(19.7071f, 15.2929f)
                curveTo(19.3166f, 14.9024f, 18.6834f, 14.9024f, 18.2929f, 15.2929f)
                curveTo(17.9024f, 15.6834f, 17.9024f, 16.3166f, 18.2929f, 16.7071f)
                lineTo(18.5858f, 17.0f)
                horizontalLineTo(5.4142f)
                lineTo(5.7071f, 16.7071f)
                curveTo(6.0976f, 16.3166f, 6.0976f, 15.6834f, 5.7071f, 15.2929f)
                close()
                moveTo(3.0f, 11.0f)
                curveTo(2.4477f, 11.0f, 2.0f, 11.4477f, 2.0f, 12.0f)
                curveTo(2.0f, 12.5523f, 2.4477f, 13.0f, 3.0f, 13.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 13.0f, 22.0f, 12.5523f, 22.0f, 12.0f)
                curveTo(22.0f, 11.4477f, 21.5523f, 11.0f, 21.0f, 11.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _textAlignDistributedEvenly!!
    }

private var _textAlignDistributedEvenly: ImageVector? = null
