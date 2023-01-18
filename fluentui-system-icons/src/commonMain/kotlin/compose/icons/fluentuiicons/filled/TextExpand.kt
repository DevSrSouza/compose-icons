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

public val FilledGroup.TextExpand: ImageVector
    get() {
        if (_textExpand != null) {
            return _textExpand!!
        }
        _textExpand = Builder(name = "TextExpand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 18.0f)
                curveTo(6.4477f, 18.0f, 6.0f, 18.4477f, 6.0f, 19.0f)
                curveTo(6.0f, 19.5523f, 6.4477f, 20.0f, 7.0f, 20.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 20.0f, 22.0f, 19.5523f, 22.0f, 19.0f)
                curveTo(22.0f, 18.4477f, 21.5523f, 18.0f, 21.0f, 18.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(13.0f, 9.0f)
                curveTo(13.0f, 8.4477f, 13.4477f, 8.0f, 14.0f, 8.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 8.0f, 22.0f, 8.4477f, 22.0f, 9.0f)
                curveTo(22.0f, 9.5523f, 21.5523f, 10.0f, 21.0f, 10.0f)
                horizontalLineTo(14.0f)
                curveTo(13.4477f, 10.0f, 13.0f, 9.5523f, 13.0f, 9.0f)
                close()
                moveTo(6.0f, 4.0f)
                curveTo(6.0f, 3.4477f, 6.4477f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                curveTo(22.0f, 4.5523f, 21.5523f, 5.0f, 21.0f, 5.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 5.0f, 6.0f, 4.5523f, 6.0f, 4.0f)
                close()
                moveTo(13.0f, 14.0f)
                curveTo(13.0f, 13.4477f, 13.4477f, 13.0f, 14.0f, 13.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 13.0f, 22.0f, 13.4477f, 22.0f, 14.0f)
                curveTo(22.0f, 14.5523f, 21.5523f, 15.0f, 21.0f, 15.0f)
                horizontalLineTo(14.0f)
                curveTo(13.4477f, 15.0f, 13.0f, 14.5523f, 13.0f, 14.0f)
                close()
                moveTo(11.0f, 11.5f)
                curveTo(11.0f, 13.9853f, 8.9853f, 16.0f, 6.5f, 16.0f)
                curveTo(4.0147f, 16.0f, 2.0f, 13.9853f, 2.0f, 11.5f)
                curveTo(2.0f, 9.0147f, 4.0147f, 7.0f, 6.5f, 7.0f)
                curveTo(8.9853f, 7.0f, 11.0f, 9.0147f, 11.0f, 11.5f)
                close()
                moveTo(7.0f, 9.5f)
                curveTo(7.0f, 9.2239f, 6.7761f, 9.0f, 6.5f, 9.0f)
                curveTo(6.2239f, 9.0f, 6.0f, 9.2239f, 6.0f, 9.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.5f)
                curveTo(4.2239f, 11.0f, 4.0f, 11.2239f, 4.0f, 11.5f)
                curveTo(4.0f, 11.7761f, 4.2239f, 12.0f, 4.5f, 12.0f)
                horizontalLineTo(6.0f)
                lineTo(6.0f, 13.5f)
                curveTo(6.0f, 13.7761f, 6.2239f, 14.0f, 6.5f, 14.0f)
                curveTo(6.7761f, 14.0f, 7.0f, 13.7761f, 7.0f, 13.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.5f)
                curveTo(8.7761f, 12.0f, 9.0f, 11.7761f, 9.0f, 11.5f)
                curveTo(9.0f, 11.2239f, 8.7761f, 11.0f, 8.5f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _textExpand!!
    }

private var _textExpand: ImageVector? = null
