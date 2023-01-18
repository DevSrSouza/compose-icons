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

public val FilledGroup.ArrowCollapseAll: ImageVector
    get() {
        if (_arrowCollapseAll != null) {
            return _arrowCollapseAll!!
        }
        _arrowCollapseAll = Builder(name = "ArrowCollapseAll", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.0f)
                curveTo(2.0f, 4.4477f, 2.4477f, 4.0f, 3.0f, 4.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 4.0f, 22.0f, 4.4477f, 22.0f, 5.0f)
                curveTo(22.0f, 5.5523f, 21.5523f, 6.0f, 21.0f, 6.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 6.0f, 2.0f, 5.5523f, 2.0f, 5.0f)
                close()
                moveTo(6.2929f, 8.2929f)
                curveTo(6.6834f, 7.9024f, 7.3166f, 7.9024f, 7.7071f, 8.2929f)
                lineTo(10.7071f, 11.2929f)
                curveTo(11.0976f, 11.6834f, 11.0976f, 12.3166f, 10.7071f, 12.7071f)
                curveTo(10.3166f, 13.0976f, 9.6834f, 13.0976f, 9.2929f, 12.7071f)
                lineTo(8.0f, 11.4142f)
                verticalLineTo(19.0f)
                curveTo(8.0f, 19.5523f, 7.5523f, 20.0f, 7.0f, 20.0f)
                curveTo(6.4477f, 20.0f, 6.0f, 19.5523f, 6.0f, 19.0f)
                verticalLineTo(11.4142f)
                lineTo(4.7071f, 12.7071f)
                curveTo(4.3166f, 13.0976f, 3.6834f, 13.0976f, 3.2929f, 12.7071f)
                curveTo(2.9024f, 12.3166f, 2.9024f, 11.6834f, 3.2929f, 11.2929f)
                lineTo(6.2929f, 8.2929f)
                close()
                moveTo(21.0f, 10.0f)
                horizontalLineTo(12.0f)
                curveTo(11.4477f, 10.0f, 11.0f, 9.5523f, 11.0f, 9.0f)
                curveTo(11.0f, 8.4477f, 11.4477f, 8.0f, 12.0f, 8.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 8.0f, 22.0f, 8.4477f, 22.0f, 9.0f)
                curveTo(22.0f, 9.5523f, 21.5523f, 10.0f, 21.0f, 10.0f)
                close()
            }
        }
        .build()
        return _arrowCollapseAll!!
    }

private var _arrowCollapseAll: ImageVector? = null
