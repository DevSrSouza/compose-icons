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

public val FilledGroup.ArrowDownLeft: ImageVector
    get() {
        if (_arrowDownLeft != null) {
            return _arrowDownLeft!!
        }
        _arrowDownLeft = Builder(name = "ArrowDownLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 20.9999f)
                curveTo(13.5523f, 20.9999f, 14.0f, 20.5521f, 14.0f, 19.9999f)
                curveTo(14.0f, 19.4476f, 13.5523f, 18.9999f, 13.0f, 18.9999f)
                horizontalLineTo(6.4144f)
                lineTo(20.7071f, 4.7071f)
                curveTo(21.0976f, 4.3166f, 21.0976f, 3.6834f, 20.7071f, 3.2929f)
                curveTo(20.3166f, 2.9024f, 19.6834f, 2.9024f, 19.2929f, 3.2929f)
                lineTo(5.0f, 17.5858f)
                verticalLineTo(10.9999f)
                curveTo(5.0f, 10.4476f, 4.5523f, 9.9999f, 4.0f, 9.9999f)
                curveTo(3.4477f, 9.9999f, 3.0f, 10.4476f, 3.0f, 10.9999f)
                verticalLineTo(19.9999f)
                curveTo(3.0f, 20.5521f, 3.4477f, 20.9999f, 4.0f, 20.9999f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _arrowDownLeft!!
    }

private var _arrowDownLeft: ImageVector? = null
