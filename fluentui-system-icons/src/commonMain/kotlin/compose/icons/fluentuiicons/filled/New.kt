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

public val FilledGroup.New: ImageVector
    get() {
        if (_new != null) {
            return _new!!
        }
        _new = Builder(name = "New", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                curveTo(18.5523f, 4.0f, 19.0f, 4.4477f, 19.0f, 5.0f)
                verticalLineTo(13.0f)
                curveTo(19.0f, 13.5523f, 18.5523f, 14.0f, 18.0f, 14.0f)
                curveTo(17.4477f, 14.0f, 17.0f, 13.5523f, 17.0f, 13.0f)
                verticalLineTo(5.0f)
                curveTo(17.0f, 4.4477f, 17.4477f, 4.0f, 18.0f, 4.0f)
                close()
                moveTo(4.0f, 18.0f)
                curveTo(4.0f, 17.4477f, 4.4477f, 17.0f, 5.0f, 17.0f)
                horizontalLineTo(13.0f)
                curveTo(13.5523f, 17.0f, 14.0f, 17.4477f, 14.0f, 18.0f)
                curveTo(14.0f, 18.5523f, 13.5523f, 19.0f, 13.0f, 19.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 19.0f, 4.0f, 18.5523f, 4.0f, 18.0f)
                close()
                moveTo(7.7071f, 6.2929f)
                curveTo(7.3166f, 5.9024f, 6.6834f, 5.9024f, 6.2929f, 6.2929f)
                curveTo(5.9024f, 6.6834f, 5.9024f, 7.3166f, 6.2929f, 7.7071f)
                lineTo(13.2929f, 14.7071f)
                curveTo(13.6834f, 15.0976f, 14.3166f, 15.0976f, 14.7071f, 14.7071f)
                curveTo(15.0976f, 14.3166f, 15.0976f, 13.6834f, 14.7071f, 13.2929f)
                lineTo(7.7071f, 6.2929f)
                close()
            }
        }
        .build()
        return _new!!
    }

private var _new: ImageVector? = null
