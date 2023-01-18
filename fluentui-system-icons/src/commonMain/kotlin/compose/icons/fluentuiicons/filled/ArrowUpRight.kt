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

public val FilledGroup.ArrowUpRight: ImageVector
    get() {
        if (_arrowUpRight != null) {
            return _arrowUpRight!!
        }
        _arrowUpRight = Builder(name = "ArrowUpRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.0f)
                curveTo(10.4477f, 3.0f, 10.0f, 3.4477f, 10.0f, 4.0f)
                curveTo(10.0f, 4.5523f, 10.4477f, 5.0f, 11.0f, 5.0f)
                horizontalLineTo(17.5857f)
                lineTo(3.2929f, 19.2928f)
                curveTo(2.9024f, 19.6833f, 2.9024f, 20.3164f, 3.2929f, 20.707f)
                curveTo(3.6834f, 21.0975f, 4.3166f, 21.0975f, 4.7071f, 20.707f)
                lineTo(19.0f, 6.4141f)
                verticalLineTo(13.0f)
                curveTo(19.0f, 13.5523f, 19.4477f, 14.0f, 20.0f, 14.0f)
                curveTo(20.5523f, 14.0f, 21.0f, 13.5523f, 21.0f, 13.0f)
                verticalLineTo(4.0f)
                curveTo(21.0f, 3.4477f, 20.5523f, 3.0f, 20.0f, 3.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _arrowUpRight!!
    }

private var _arrowUpRight: ImageVector? = null
