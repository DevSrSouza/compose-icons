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

public val FilledGroup.FullScreenMaximize: ImageVector
    get() {
        if (_fullScreenMaximize != null) {
            return _fullScreenMaximize!!
        }
        _fullScreenMaximize = Builder(name = "FullScreenMaximize", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                curveTo(5.0f, 5.4477f, 5.4477f, 5.0f, 6.0f, 5.0f)
                horizontalLineTo(8.0f)
                curveTo(8.5523f, 5.0f, 9.0f, 4.5523f, 9.0f, 4.0f)
                curveTo(9.0f, 3.4477f, 8.5523f, 3.0f, 8.0f, 3.0f)
                horizontalLineTo(6.0f)
                curveTo(4.3432f, 3.0f, 3.0f, 4.3432f, 3.0f, 6.0f)
                verticalLineTo(8.0f)
                curveTo(3.0f, 8.5523f, 3.4477f, 9.0f, 4.0f, 9.0f)
                curveTo(4.5523f, 9.0f, 5.0f, 8.5523f, 5.0f, 8.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(5.0f, 18.0f)
                curveTo(5.0f, 18.5523f, 5.4477f, 19.0f, 6.0f, 19.0f)
                horizontalLineTo(8.0f)
                curveTo(8.5523f, 19.0f, 9.0f, 19.4477f, 9.0f, 20.0f)
                curveTo(9.0f, 20.5523f, 8.5523f, 21.0f, 8.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(4.3432f, 21.0f, 3.0f, 19.6569f, 3.0f, 18.0f)
                verticalLineTo(16.0f)
                curveTo(3.0f, 15.4477f, 3.4477f, 15.0f, 4.0f, 15.0f)
                curveTo(4.5523f, 15.0f, 5.0f, 15.4477f, 5.0f, 16.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(18.0f, 5.0f)
                curveTo(18.5523f, 5.0f, 19.0f, 5.4477f, 19.0f, 6.0f)
                verticalLineTo(8.0f)
                curveTo(19.0f, 8.5523f, 19.4477f, 9.0f, 20.0f, 9.0f)
                curveTo(20.5523f, 9.0f, 21.0f, 8.5523f, 21.0f, 8.0f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 4.3432f, 19.6569f, 3.0f, 18.0f, 3.0f)
                horizontalLineTo(16.0f)
                curveTo(15.4477f, 3.0f, 15.0f, 3.4477f, 15.0f, 4.0f)
                curveTo(15.0f, 4.5523f, 15.4477f, 5.0f, 16.0f, 5.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(19.0f, 18.0f)
                curveTo(19.0f, 18.5523f, 18.5523f, 19.0f, 18.0f, 19.0f)
                horizontalLineTo(16.0f)
                curveTo(15.4477f, 19.0f, 15.0f, 19.4477f, 15.0f, 20.0f)
                curveTo(15.0f, 20.5523f, 15.4477f, 21.0f, 16.0f, 21.0f)
                horizontalLineTo(18.0f)
                curveTo(19.6569f, 21.0f, 21.0f, 19.6569f, 21.0f, 18.0f)
                verticalLineTo(16.0f)
                curveTo(21.0f, 15.4477f, 20.5523f, 15.0f, 20.0f, 15.0f)
                curveTo(19.4477f, 15.0f, 19.0f, 15.4477f, 19.0f, 16.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _fullScreenMaximize!!
    }

private var _fullScreenMaximize: ImageVector? = null
