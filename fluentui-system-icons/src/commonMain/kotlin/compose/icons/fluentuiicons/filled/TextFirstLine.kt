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

public val FilledGroup.TextFirstLine: ImageVector
    get() {
        if (_textFirstLine != null) {
            return _textFirstLine!!
        }
        _textFirstLine = Builder(name = "TextFirstLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.7071f, 3.2929f)
                curveTo(3.3166f, 2.9024f, 2.6834f, 2.9024f, 2.2929f, 3.2929f)
                curveTo(1.9024f, 3.6834f, 1.9024f, 4.3166f, 2.2929f, 4.7071f)
                lineTo(3.5858f, 6.0f)
                lineTo(2.2929f, 7.2929f)
                curveTo(1.9024f, 7.6834f, 1.9024f, 8.3166f, 2.2929f, 8.7071f)
                curveTo(2.6834f, 9.0976f, 3.3166f, 9.0976f, 3.7071f, 8.7071f)
                lineTo(5.7071f, 6.7071f)
                curveTo(6.0976f, 6.3166f, 6.0976f, 5.6834f, 5.7071f, 5.2929f)
                lineTo(3.7071f, 3.2929f)
                close()
                moveTo(10.0f, 5.0f)
                curveTo(9.4477f, 5.0f, 9.0f, 5.4477f, 9.0f, 6.0f)
                curveTo(9.0f, 6.5523f, 9.4477f, 7.0f, 10.0f, 7.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 7.0f, 22.0f, 6.5523f, 22.0f, 6.0f)
                curveTo(22.0f, 5.4477f, 21.5523f, 5.0f, 21.0f, 5.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(21.0f, 17.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 17.0f, 2.0f, 17.4477f, 2.0f, 18.0f)
                curveTo(2.0f, 18.5523f, 2.4477f, 19.0f, 3.0f, 19.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 19.0f, 22.0f, 18.5523f, 22.0f, 18.0f)
                curveTo(22.0f, 17.4477f, 21.5523f, 17.0f, 21.0f, 17.0f)
                close()
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 11.4477f, 2.4477f, 11.0f, 3.0f, 11.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 11.0f, 22.0f, 11.4477f, 22.0f, 12.0f)
                curveTo(22.0f, 12.5523f, 21.5523f, 13.0f, 21.0f, 13.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 13.0f, 2.0f, 12.5523f, 2.0f, 12.0f)
                close()
            }
        }
        .build()
        return _textFirstLine!!
    }

private var _textFirstLine: ImageVector? = null
