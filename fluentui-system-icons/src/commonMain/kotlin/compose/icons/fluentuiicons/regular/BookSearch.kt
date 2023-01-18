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

public val RegularGroup.BookSearch: ImageVector
    get() {
        if (_bookSearch != null) {
            return _bookSearch!!
        }
        _bookSearch = Builder(name = "BookSearch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8185f, 11.795f)
                curveTo(15.2156f, 11.2028f, 15.4474f, 10.49f, 15.4474f, 9.7237f)
                curveTo(15.4474f, 7.6672f, 13.7802f, 6.0f, 11.7237f, 6.0f)
                curveTo(9.6671f, 6.0f, 8.0f, 7.6672f, 8.0f, 9.7237f)
                curveTo(8.0f, 11.7802f, 9.6671f, 13.4474f, 11.7237f, 13.4474f)
                curveTo(12.49f, 13.4474f, 13.2028f, 13.2156f, 13.795f, 12.8185f)
                lineTo(16.2711f, 15.2945f)
                lineTo(16.3381f, 15.3524f)
                lineTo(16.3455f, 15.3579f)
                curveTo(16.629f, 15.5682f, 17.031f, 15.5451f, 17.288f, 15.288f)
                curveTo(17.5707f, 15.0054f, 17.5707f, 14.5472f, 17.288f, 14.2646f)
                lineTo(14.8185f, 11.795f)
                close()
                moveTo(11.7237f, 7.4474f)
                curveTo(12.9809f, 7.4474f, 14.0f, 8.4665f, 14.0f, 9.7237f)
                curveTo(14.0f, 10.9809f, 12.9809f, 12.0f, 11.7237f, 12.0f)
                curveTo(10.4665f, 12.0f, 9.4474f, 10.9809f, 9.4474f, 9.7237f)
                curveTo(9.4474f, 8.4665f, 10.4665f, 7.4474f, 11.7237f, 7.4474f)
                close()
                moveTo(6.5f, 2.0f)
                curveTo(5.1193f, 2.0f, 4.0f, 3.1193f, 4.0f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(4.0f, 20.8807f, 5.1193f, 22.0f, 6.5f, 22.0f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 22.0f, 20.5f, 21.6642f, 20.5f, 21.25f)
                curveTo(20.5f, 20.8358f, 20.1642f, 20.5f, 19.75f, 20.5f)
                horizontalLineTo(6.5f)
                curveTo(5.9477f, 20.5f, 5.5f, 20.0523f, 5.5f, 19.5f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 19.5f, 20.5f, 19.1642f, 20.5f, 18.75f)
                verticalLineTo(4.5f)
                curveTo(20.5f, 3.1193f, 19.3807f, 2.0f, 18.0f, 2.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(19.0f, 18.0f)
                horizontalLineTo(5.5f)
                verticalLineTo(4.5f)
                curveTo(5.5f, 3.9477f, 5.9477f, 3.5f, 6.5f, 3.5f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 3.5f, 19.0f, 3.9477f, 19.0f, 4.5f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _bookSearch!!
    }

private var _bookSearch: ImageVector? = null
