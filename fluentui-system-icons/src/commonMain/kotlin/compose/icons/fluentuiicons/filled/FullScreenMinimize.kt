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

public val FilledGroup.FullScreenMinimize: ImageVector
    get() {
        if (_fullScreenMinimize != null) {
            return _fullScreenMinimize!!
        }
        _fullScreenMinimize = Builder(name = "FullScreenMinimize", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                curveTo(9.0f, 3.4477f, 8.5523f, 3.0f, 8.0f, 3.0f)
                curveTo(7.4477f, 3.0f, 7.0f, 3.4477f, 7.0f, 4.0f)
                verticalLineTo(6.5f)
                curveTo(7.0f, 6.7761f, 6.7761f, 7.0f, 6.5f, 7.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 7.0f, 3.0f, 7.4477f, 3.0f, 8.0f)
                curveTo(3.0f, 8.5523f, 3.4477f, 9.0f, 4.0f, 9.0f)
                horizontalLineTo(6.5f)
                curveTo(7.8807f, 9.0f, 9.0f, 7.8807f, 9.0f, 6.5f)
                verticalLineTo(4.0f)
                close()
                moveTo(9.0f, 20.0f)
                curveTo(9.0f, 20.5523f, 8.5523f, 21.0f, 8.0f, 21.0f)
                curveTo(7.4477f, 21.0f, 7.0f, 20.5523f, 7.0f, 20.0f)
                verticalLineTo(17.5f)
                curveTo(7.0f, 17.2239f, 6.7761f, 17.0f, 6.5f, 17.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 17.0f, 3.0f, 16.5523f, 3.0f, 16.0f)
                curveTo(3.0f, 15.4477f, 3.4477f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(6.5f)
                curveTo(7.8807f, 15.0f, 9.0f, 16.1193f, 9.0f, 17.5f)
                verticalLineTo(20.0f)
                close()
                moveTo(16.0f, 3.0f)
                curveTo(15.4477f, 3.0f, 15.0f, 3.4477f, 15.0f, 4.0f)
                verticalLineTo(6.5f)
                curveTo(15.0f, 7.8807f, 16.1193f, 9.0f, 17.5f, 9.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 9.0f, 21.0f, 8.5523f, 21.0f, 8.0f)
                curveTo(21.0f, 7.4477f, 20.5523f, 7.0f, 20.0f, 7.0f)
                horizontalLineTo(17.5f)
                curveTo(17.2239f, 7.0f, 17.0f, 6.7761f, 17.0f, 6.5f)
                verticalLineTo(4.0f)
                curveTo(17.0f, 3.4477f, 16.5523f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(15.0f, 20.0f)
                curveTo(15.0f, 20.5523f, 15.4477f, 21.0f, 16.0f, 21.0f)
                curveTo(16.5523f, 21.0f, 17.0f, 20.5523f, 17.0f, 20.0f)
                verticalLineTo(17.5f)
                curveTo(17.0f, 17.2239f, 17.2239f, 17.0f, 17.5f, 17.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 17.0f, 21.0f, 16.5523f, 21.0f, 16.0f)
                curveTo(21.0f, 15.4477f, 20.5523f, 15.0f, 20.0f, 15.0f)
                horizontalLineTo(17.5f)
                curveTo(16.1193f, 15.0f, 15.0f, 16.1193f, 15.0f, 17.5f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _fullScreenMinimize!!
    }

private var _fullScreenMinimize: ImageVector? = null
