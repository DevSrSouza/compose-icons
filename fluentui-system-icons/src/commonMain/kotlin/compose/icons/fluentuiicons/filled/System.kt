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

public val FilledGroup.System: ImageVector
    get() {
        if (_system != null) {
            return _system!!
        }
        _system = Builder(name = "System", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.946f, 5.0f)
                horizontalLineTo(19.0541f)
                curveTo(20.6781f, 5.0f, 22.0f, 6.3043f, 22.0f, 7.92f)
                verticalLineTo(16.08f)
                curveTo(22.0f, 17.6957f, 20.6781f, 19.0f, 19.0541f, 19.0f)
                horizontalLineTo(4.946f)
                curveTo(3.3219f, 19.0f, 2.0f, 17.6957f, 2.0f, 16.08f)
                verticalLineTo(7.92f)
                curveTo(2.0f, 6.3043f, 3.3219f, 5.0f, 4.946f, 5.0f)
                close()
                moveTo(4.946f, 7.0f)
                curveTo(4.4205f, 7.0f, 4.0f, 7.4149f, 4.0f, 7.92f)
                verticalLineTo(16.08f)
                curveTo(4.0f, 16.5851f, 4.4205f, 17.0f, 4.946f, 17.0f)
                horizontalLineTo(19.0541f)
                curveTo(19.5795f, 17.0f, 20.0f, 16.5851f, 20.0f, 16.08f)
                verticalLineTo(7.92f)
                curveTo(20.0f, 7.4149f, 19.5795f, 7.0f, 19.0541f, 7.0f)
                horizontalLineTo(4.946f)
                close()
            }
        }
        .build()
        return _system!!
    }

private var _system: ImageVector? = null
