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

public val FilledGroup.BorderTopBottom: ImageVector
    get() {
        if (_borderTopBottom != null) {
            return _borderTopBottom!!
        }
        _borderTopBottom = Builder(name = "BorderTopBottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 7.0f)
                curveTo(3.4477f, 7.0f, 3.0f, 6.5523f, 3.0f, 6.0f)
                curveTo(3.0f, 4.3432f, 4.3432f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(18.0f)
                curveTo(19.6569f, 3.0f, 21.0f, 4.3432f, 21.0f, 6.0f)
                curveTo(21.0f, 6.5523f, 20.5523f, 7.0f, 20.0f, 7.0f)
                curveTo(19.4477f, 7.0f, 19.0f, 6.5523f, 19.0f, 6.0f)
                curveTo(19.0f, 5.4477f, 18.5523f, 5.0f, 18.0f, 5.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 5.0f, 5.0f, 5.4477f, 5.0f, 6.0f)
                curveTo(5.0f, 6.5523f, 4.5523f, 7.0f, 4.0f, 7.0f)
                close()
                moveTo(5.0f, 11.0f)
                curveTo(5.0f, 10.4477f, 4.5523f, 10.0f, 4.0f, 10.0f)
                curveTo(3.4477f, 10.0f, 3.0f, 10.4477f, 3.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(3.0f, 13.5523f, 3.4477f, 14.0f, 4.0f, 14.0f)
                curveTo(4.5523f, 14.0f, 5.0f, 13.5523f, 5.0f, 13.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(19.0f, 11.0f)
                curveTo(19.0f, 10.4477f, 19.4477f, 10.0f, 20.0f, 10.0f)
                curveTo(20.5523f, 10.0f, 21.0f, 10.4477f, 21.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(21.0f, 13.5523f, 20.5523f, 14.0f, 20.0f, 14.0f)
                curveTo(19.4477f, 14.0f, 19.0f, 13.5523f, 19.0f, 13.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(3.0f, 18.0f)
                curveTo(3.0f, 17.4477f, 3.4477f, 17.0f, 4.0f, 17.0f)
                curveTo(4.5523f, 17.0f, 5.0f, 17.4477f, 5.0f, 18.0f)
                curveTo(5.0f, 18.5523f, 5.4477f, 19.0f, 6.0f, 19.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 19.0f, 19.0f, 18.5523f, 19.0f, 18.0f)
                curveTo(19.0f, 17.4477f, 19.4477f, 17.0f, 20.0f, 17.0f)
                curveTo(20.5523f, 17.0f, 21.0f, 17.4477f, 21.0f, 18.0f)
                curveTo(21.0f, 19.6569f, 19.6569f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(4.3432f, 21.0f, 3.0f, 19.6569f, 3.0f, 18.0f)
                close()
            }
        }
        .build()
        return _borderTopBottom!!
    }

private var _borderTopBottom: ImageVector? = null
