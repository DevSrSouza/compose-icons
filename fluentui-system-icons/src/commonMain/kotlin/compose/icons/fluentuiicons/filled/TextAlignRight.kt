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

public val FilledGroup.TextAlignRight: ImageVector
    get() {
        if (_textAlignRight != null) {
            return _textAlignRight!!
        }
        _textAlignRight = Builder(name = "TextAlignRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                curveTo(5.0f, 5.4477f, 5.4477f, 5.0f, 6.0f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 5.0f, 22.0f, 5.4477f, 22.0f, 6.0f)
                curveTo(22.0f, 6.5523f, 21.5523f, 7.0f, 21.0f, 7.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 7.0f, 5.0f, 6.5523f, 5.0f, 6.0f)
                close()
                moveTo(9.0f, 18.0f)
                curveTo(9.0f, 17.4477f, 9.4477f, 17.0f, 10.0f, 17.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 17.0f, 22.0f, 17.4477f, 22.0f, 18.0f)
                curveTo(22.0f, 18.5523f, 21.5523f, 19.0f, 21.0f, 19.0f)
                horizontalLineTo(10.0f)
                curveTo(9.4477f, 19.0f, 9.0f, 18.5523f, 9.0f, 18.0f)
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
        return _textAlignRight!!
    }

private var _textAlignRight: ImageVector? = null
