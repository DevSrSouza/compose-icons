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

public val FilledGroup.ArrowUpLeft: ImageVector
    get() {
        if (_arrowUpLeft != null) {
            return _arrowUpLeft!!
        }
        _arrowUpLeft = Builder(name = "ArrowUpLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                curveTo(13.5523f, 3.0f, 14.0f, 3.4477f, 14.0f, 4.0f)
                curveTo(14.0f, 4.5523f, 13.5523f, 5.0f, 13.0f, 5.0f)
                horizontalLineTo(6.4144f)
                lineTo(20.7071f, 19.2928f)
                curveTo(21.0976f, 19.6833f, 21.0976f, 20.3164f, 20.7071f, 20.707f)
                curveTo(20.3166f, 21.0975f, 19.6834f, 21.0975f, 19.2929f, 20.707f)
                lineTo(5.0f, 6.4141f)
                verticalLineTo(13.0f)
                curveTo(5.0f, 13.5523f, 4.5523f, 14.0f, 4.0f, 14.0f)
                curveTo(3.4477f, 14.0f, 3.0f, 13.5523f, 3.0f, 13.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _arrowUpLeft!!
    }

private var _arrowUpLeft: ImageVector? = null
