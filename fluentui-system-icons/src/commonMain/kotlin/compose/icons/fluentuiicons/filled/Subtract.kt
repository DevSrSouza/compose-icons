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

public val FilledGroup.Subtract: ImageVector
    get() {
        if (_subtract != null) {
            return _subtract!!
        }
        _subtract = Builder(name = "Subtract", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.9961f, 13.0f)
                horizontalLineTo(19.9996f)
                curveTo(20.5519f, 13.0f, 20.9996f, 12.5523f, 20.9996f, 12.0f)
                curveTo(20.9996f, 11.4477f, 20.5519f, 11.0f, 19.9996f, 11.0f)
                horizontalLineTo(3.9961f)
                curveTo(3.4438f, 11.0f, 2.9961f, 11.4477f, 2.9961f, 12.0f)
                curveTo(2.9961f, 12.5523f, 3.4438f, 13.0f, 3.9961f, 13.0f)
                close()
            }
        }
        .build()
        return _subtract!!
    }

private var _subtract: ImageVector? = null
