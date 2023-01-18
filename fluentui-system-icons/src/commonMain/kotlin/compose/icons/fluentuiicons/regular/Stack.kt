package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Stack: ImageVector
    get() {
        if (_stack != null) {
            return _stack!!
        }
        _stack = Builder(name = "Stack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                horizontalLineTo(15.0f)
                curveTo(16.1046f, 4.0f, 17.0f, 4.8954f, 17.0f, 6.0f)
                verticalLineTo(13.0f)
                curveTo(17.0f, 14.1046f, 16.1046f, 15.0f, 15.0f, 15.0f)
                horizontalLineTo(4.0f)
                curveTo(2.8954f, 15.0f, 2.0f, 14.1046f, 2.0f, 13.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.8954f, 2.8954f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(15.0f, 5.5f)
                horizontalLineTo(4.0f)
                curveTo(3.7239f, 5.5f, 3.5f, 5.7239f, 3.5f, 6.0f)
                verticalLineTo(13.0f)
                curveTo(3.5f, 13.2761f, 3.7239f, 13.5f, 4.0f, 13.5f)
                horizontalLineTo(15.0f)
                curveTo(15.2761f, 13.5f, 15.5f, 13.2761f, 15.5f, 13.0f)
                verticalLineTo(6.0f)
                curveTo(15.5f, 5.7239f, 15.2761f, 5.5f, 15.0f, 5.5f)
                close()
                moveTo(4.563f, 16.0f)
                curveTo(4.785f, 16.8626f, 5.5681f, 17.5f, 6.5f, 17.5f)
                horizontalLineTo(15.5f)
                curveTo(17.7091f, 17.5f, 19.5f, 15.7091f, 19.5f, 13.5f)
                verticalLineTo(8.5f)
                curveTo(19.5f, 7.5681f, 18.8626f, 6.785f, 18.0f, 6.563f)
                verticalLineTo(13.5f)
                curveTo(18.0f, 14.8807f, 16.8807f, 16.0f, 15.5f, 16.0f)
                horizontalLineTo(4.563f)
                close()
                moveTo(7.063f, 18.5f)
                curveTo(7.285f, 19.3626f, 8.0681f, 20.0f, 9.0f, 20.0f)
                horizontalLineTo(16.25f)
                curveTo(19.4256f, 20.0f, 22.0f, 17.4256f, 22.0f, 14.25f)
                verticalLineTo(11.0f)
                curveTo(22.0f, 10.0681f, 21.3626f, 9.285f, 20.5f, 9.063f)
                verticalLineTo(14.25f)
                curveTo(20.5f, 16.5972f, 18.5972f, 18.5f, 16.25f, 18.5f)
                horizontalLineTo(7.063f)
                close()
            }
        }
        .build()
        return _stack!!
    }

private var _stack: ImageVector? = null
