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

public val FilledGroup.TextContinuous: ImageVector
    get() {
        if (_textContinuous != null) {
            return _textContinuous!!
        }
        _textContinuous = Builder(name = "TextContinuous", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                curveTo(3.0f, 5.4477f, 3.4477f, 5.0f, 4.0f, 5.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 5.0f, 21.0f, 5.4477f, 21.0f, 6.0f)
                curveTo(21.0f, 6.5523f, 20.5523f, 7.0f, 20.0f, 7.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 7.0f, 3.0f, 6.5523f, 3.0f, 6.0f)
                close()
                moveTo(8.0f, 10.0f)
                curveTo(8.0f, 9.4477f, 8.4477f, 9.0f, 9.0f, 9.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 9.0f, 21.0f, 9.4477f, 21.0f, 10.0f)
                curveTo(21.0f, 10.5523f, 20.5523f, 11.0f, 20.0f, 11.0f)
                horizontalLineTo(9.0f)
                curveTo(8.4477f, 11.0f, 8.0f, 10.5523f, 8.0f, 10.0f)
                close()
                moveTo(8.0f, 14.0f)
                curveTo(8.0f, 13.4477f, 8.4477f, 13.0f, 9.0f, 13.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 13.0f, 21.0f, 13.4477f, 21.0f, 14.0f)
                curveTo(21.0f, 14.5523f, 20.5523f, 15.0f, 20.0f, 15.0f)
                horizontalLineTo(9.0f)
                curveTo(8.4477f, 15.0f, 8.0f, 14.5523f, 8.0f, 14.0f)
                close()
                moveTo(20.0f, 19.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 19.0f, 3.0f, 18.5523f, 3.0f, 18.0f)
                curveTo(3.0f, 17.4477f, 3.4477f, 17.0f, 4.0f, 17.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 17.0f, 21.0f, 17.4477f, 21.0f, 18.0f)
                curveTo(21.0f, 18.5523f, 20.5523f, 19.0f, 20.0f, 19.0f)
                close()
                moveTo(3.2929f, 11.2071f)
                curveTo(2.9024f, 10.8166f, 2.9024f, 10.1834f, 3.2929f, 9.7929f)
                curveTo(3.6834f, 9.4024f, 4.3166f, 9.4024f, 4.7071f, 9.7929f)
                lineTo(6.2071f, 11.2929f)
                curveTo(6.5976f, 11.6834f, 6.5976f, 12.3166f, 6.2071f, 12.7071f)
                lineTo(4.7071f, 14.2071f)
                curveTo(4.3166f, 14.5976f, 3.6834f, 14.5976f, 3.2929f, 14.2071f)
                curveTo(2.9024f, 13.8166f, 2.9024f, 13.1834f, 3.2929f, 12.7929f)
                lineTo(4.0858f, 12.0f)
                lineTo(3.2929f, 11.2071f)
                close()
            }
        }
        .build()
        return _textContinuous!!
    }

private var _textContinuous: ImageVector? = null
