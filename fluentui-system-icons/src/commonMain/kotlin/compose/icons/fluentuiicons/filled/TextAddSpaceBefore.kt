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

public val FilledGroup.TextAddSpaceBefore: ImageVector
    get() {
        if (_textAddSpaceBefore != null) {
            return _textAddSpaceBefore!!
        }
        _textAddSpaceBefore = Builder(name = "TextAddSpaceBefore", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.2929f, 6.2071f)
                curveTo(8.9024f, 5.8166f, 8.9024f, 5.1834f, 9.2929f, 4.7929f)
                curveTo(9.6834f, 4.4024f, 10.3166f, 4.4024f, 10.7071f, 4.7929f)
                lineTo(12.0f, 6.0858f)
                lineTo(13.2929f, 4.7929f)
                curveTo(13.6834f, 4.4024f, 14.3166f, 4.4024f, 14.7071f, 4.7929f)
                curveTo(15.0976f, 5.1834f, 15.0976f, 5.8166f, 14.7071f, 6.2071f)
                lineTo(12.7071f, 8.2071f)
                curveTo(12.3166f, 8.5976f, 11.6834f, 8.5976f, 11.2929f, 8.2071f)
                lineTo(9.2929f, 6.2071f)
                close()
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 11.4477f, 3.4477f, 11.0f, 4.0f, 11.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 11.0f, 21.0f, 11.4477f, 21.0f, 12.0f)
                curveTo(21.0f, 12.5523f, 20.5523f, 13.0f, 20.0f, 13.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 13.0f, 3.0f, 12.5523f, 3.0f, 12.0f)
                close()
                moveTo(3.0f, 18.0f)
                curveTo(3.0f, 17.4477f, 3.4477f, 17.0f, 4.0f, 17.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 17.0f, 21.0f, 17.4477f, 21.0f, 18.0f)
                curveTo(21.0f, 18.5523f, 20.5523f, 19.0f, 20.0f, 19.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 19.0f, 3.0f, 18.5523f, 3.0f, 18.0f)
                close()
            }
        }
        .build()
        return _textAddSpaceBefore!!
    }

private var _textAddSpaceBefore: ImageVector? = null
