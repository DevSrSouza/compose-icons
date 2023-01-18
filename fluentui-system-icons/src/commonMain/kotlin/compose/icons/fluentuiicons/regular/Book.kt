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

public val RegularGroup.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }
        _book = Builder(name = "Book", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                curveTo(7.0f, 5.4477f, 7.4477f, 5.0f, 8.0f, 5.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 5.0f, 17.0f, 5.4477f, 17.0f, 6.0f)
                verticalLineTo(8.0f)
                curveTo(17.0f, 8.5523f, 16.5523f, 9.0f, 16.0f, 9.0f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 9.0f, 7.0f, 8.5523f, 7.0f, 8.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(8.5f, 7.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(7.5f)
                close()
                moveTo(4.0f, 4.5f)
                curveTo(4.0f, 3.1193f, 5.1193f, 2.0f, 6.5f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.3807f, 2.0f, 20.5f, 3.1193f, 20.5f, 4.5f)
                verticalLineTo(18.75f)
                curveTo(20.5f, 19.1642f, 20.1642f, 19.5f, 19.75f, 19.5f)
                horizontalLineTo(5.5f)
                curveTo(5.5f, 20.0523f, 5.9477f, 20.5f, 6.5f, 20.5f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 20.5f, 20.5f, 20.8358f, 20.5f, 21.25f)
                curveTo(20.5f, 21.6642f, 20.1642f, 22.0f, 19.75f, 22.0f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 22.0f, 4.0f, 20.8807f, 4.0f, 19.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(5.5f, 18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.5f)
                curveTo(19.0f, 3.9477f, 18.5523f, 3.5f, 18.0f, 3.5f)
                horizontalLineTo(6.5f)
                curveTo(5.9477f, 3.5f, 5.5f, 3.9477f, 5.5f, 4.5f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _book!!
    }

private var _book: ImageVector? = null
