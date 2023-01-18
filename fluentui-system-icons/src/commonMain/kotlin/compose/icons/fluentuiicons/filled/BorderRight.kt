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

public val FilledGroup.BorderRight: ImageVector
    get() {
        if (_borderRight != null) {
            return _borderRight!!
        }
        _borderRight = Builder(name = "BorderRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 5.0f)
                curveTo(13.5523f, 5.0f, 14.0f, 4.5523f, 14.0f, 4.0f)
                curveTo(14.0f, 3.4477f, 13.5523f, 3.0f, 13.0f, 3.0f)
                horizontalLineTo(11.0f)
                curveTo(10.4477f, 3.0f, 10.0f, 3.4477f, 10.0f, 4.0f)
                curveTo(10.0f, 4.5523f, 10.4477f, 5.0f, 11.0f, 5.0f)
                lineTo(13.0f, 5.0f)
                close()
                moveTo(5.0f, 11.0f)
                curveTo(5.0f, 10.4477f, 4.5523f, 10.0f, 4.0f, 10.0f)
                curveTo(3.4477f, 10.0f, 3.0f, 10.4477f, 3.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(3.0f, 13.5523f, 3.4477f, 14.0f, 4.0f, 14.0f)
                curveTo(4.5523f, 14.0f, 5.0f, 13.5523f, 5.0f, 13.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(14.0f, 20.0f)
                curveTo(14.0f, 20.5523f, 13.5523f, 21.0f, 13.0f, 21.0f)
                horizontalLineTo(11.0f)
                curveTo(10.4477f, 21.0f, 10.0f, 20.5523f, 10.0f, 20.0f)
                curveTo(10.0f, 19.4477f, 10.4477f, 19.0f, 11.0f, 19.0f)
                horizontalLineTo(13.0f)
                curveTo(13.5523f, 19.0f, 14.0f, 19.4477f, 14.0f, 20.0f)
                close()
                moveTo(6.0f, 3.0f)
                curveTo(6.5523f, 3.0f, 7.0f, 3.4477f, 7.0f, 4.0f)
                curveTo(7.0f, 4.5523f, 6.5523f, 5.0f, 6.0f, 5.0f)
                curveTo(5.4477f, 5.0f, 5.0f, 5.4477f, 5.0f, 6.0f)
                curveTo(5.0f, 6.5523f, 4.5523f, 7.0f, 4.0f, 7.0f)
                curveTo(3.4477f, 7.0f, 3.0f, 6.5523f, 3.0f, 6.0f)
                curveTo(3.0f, 4.3432f, 4.3432f, 3.0f, 6.0f, 3.0f)
                close()
                moveTo(7.0f, 20.0f)
                curveTo(7.0f, 20.5523f, 6.5523f, 21.0f, 6.0f, 21.0f)
                curveTo(4.3432f, 21.0f, 3.0f, 19.6569f, 3.0f, 18.0f)
                curveTo(3.0f, 17.4477f, 3.4477f, 17.0f, 4.0f, 17.0f)
                curveTo(4.5523f, 17.0f, 5.0f, 17.4477f, 5.0f, 18.0f)
                curveTo(5.0f, 18.5523f, 5.4477f, 19.0f, 6.0f, 19.0f)
                curveTo(6.5523f, 19.0f, 7.0f, 19.4477f, 7.0f, 20.0f)
                close()
                moveTo(18.0f, 21.0f)
                curveTo(17.4477f, 21.0f, 17.0f, 20.5523f, 17.0f, 20.0f)
                curveTo(17.0f, 19.4477f, 17.4477f, 19.0f, 18.0f, 19.0f)
                curveTo(18.5523f, 19.0f, 19.0f, 18.5523f, 19.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(19.0f, 5.4477f, 18.5523f, 5.0f, 18.0f, 5.0f)
                curveTo(17.4477f, 5.0f, 17.0f, 4.5523f, 17.0f, 4.0f)
                curveTo(17.0f, 3.4477f, 17.4477f, 3.0f, 18.0f, 3.0f)
                curveTo(19.6569f, 3.0f, 21.0f, 4.3432f, 21.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 19.6569f, 19.6569f, 21.0f, 18.0f, 21.0f)
                close()
            }
        }
        .build()
        return _borderRight!!
    }

private var _borderRight: ImageVector? = null
