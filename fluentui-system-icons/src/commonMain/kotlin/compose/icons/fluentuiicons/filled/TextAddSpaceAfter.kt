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

public val FilledGroup.TextAddSpaceAfter: ImageVector
    get() {
        if (_textAddSpaceAfter != null) {
            return _textAddSpaceAfter!!
        }
        _textAddSpaceAfter = Builder(name = "TextAddSpaceAfter", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 7.0f)
                curveTo(3.0f, 6.4477f, 3.4477f, 6.0f, 4.0f, 6.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 6.0f, 21.0f, 6.4477f, 21.0f, 7.0f)
                curveTo(21.0f, 7.5523f, 20.5523f, 8.0f, 20.0f, 8.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 8.0f, 3.0f, 7.5523f, 3.0f, 7.0f)
                close()
                moveTo(3.0f, 13.0f)
                curveTo(3.0f, 12.4477f, 3.4477f, 12.0f, 4.0f, 12.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 12.0f, 21.0f, 12.4477f, 21.0f, 13.0f)
                curveTo(21.0f, 13.5523f, 20.5523f, 14.0f, 20.0f, 14.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 14.0f, 3.0f, 13.5523f, 3.0f, 13.0f)
                close()
                moveTo(9.2929f, 18.2929f)
                curveTo(8.9024f, 18.6834f, 8.9024f, 19.3166f, 9.2929f, 19.7071f)
                curveTo(9.6834f, 20.0976f, 10.3166f, 20.0976f, 10.7071f, 19.7071f)
                lineTo(12.0f, 18.4142f)
                lineTo(13.2929f, 19.7071f)
                curveTo(13.6834f, 20.0976f, 14.3166f, 20.0976f, 14.7071f, 19.7071f)
                curveTo(15.0976f, 19.3166f, 15.0976f, 18.6834f, 14.7071f, 18.2929f)
                lineTo(12.7071f, 16.2929f)
                curveTo(12.3166f, 15.9024f, 11.6834f, 15.9024f, 11.2929f, 16.2929f)
                lineTo(9.2929f, 18.2929f)
                close()
            }
        }
        .build()
        return _textAddSpaceAfter!!
    }

private var _textAddSpaceAfter: ImageVector? = null
