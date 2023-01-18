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

public val FilledGroup.TextUnderline: ImageVector
    get() {
        if (_textUnderline != null) {
            return _textUnderline!!
        }
        _textUnderline = Builder(name = "TextUnderline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 5.0f)
                curveTo(17.0f, 4.7348f, 16.8946f, 4.4804f, 16.7071f, 4.2929f)
                curveTo(16.5196f, 4.1054f, 16.2652f, 4.0f, 16.0f, 4.0f)
                horizontalLineTo(8.0f)
                curveTo(7.7348f, 4.0f, 7.4804f, 4.1054f, 7.2929f, 4.2929f)
                curveTo(7.1054f, 4.4804f, 7.0f, 4.7348f, 7.0f, 5.0f)
                lineTo(7.0f, 15.5f)
                curveTo(7.0f, 16.0523f, 7.4477f, 16.5f, 8.0f, 16.5f)
                curveTo(8.5523f, 16.5f, 9.0f, 16.0523f, 9.0f, 15.5f)
                lineTo(9.0f, 6.0f)
                lineTo(15.0f, 6.0f)
                verticalLineTo(15.5f)
                curveTo(15.0f, 16.0523f, 15.4477f, 16.5f, 16.0f, 16.5f)
                curveTo(16.5523f, 16.5f, 17.0f, 16.0523f, 17.0f, 15.5f)
                verticalLineTo(5.0f)
                close()
                moveTo(7.0f, 18.0f)
                curveTo(6.4477f, 18.0f, 6.0f, 18.4477f, 6.0f, 19.0f)
                curveTo(6.0f, 19.5523f, 6.4477f, 20.0f, 7.0f, 20.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 20.0f, 18.0f, 19.5523f, 18.0f, 19.0f)
                curveTo(18.0f, 18.4477f, 17.5523f, 18.0f, 17.0f, 18.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _textUnderline!!
    }

private var _textUnderline: ImageVector? = null
