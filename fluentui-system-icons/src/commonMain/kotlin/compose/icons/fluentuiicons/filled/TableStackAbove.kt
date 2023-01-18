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

public val FilledGroup.TableStackAbove: ImageVector
    get() {
        if (_tableStackAbove != null) {
            return _tableStackAbove!!
        }
        _tableStackAbove = Builder(name = "TableStackAbove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.25f, 4.5f)
                curveTo(20.6642f, 4.5f, 21.0f, 4.1642f, 21.0f, 3.75f)
                curveTo(21.0f, 3.3358f, 20.6642f, 3.0f, 20.25f, 3.0f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 3.0f, 3.0f, 3.3358f, 3.0f, 3.75f)
                curveTo(3.0f, 4.1642f, 3.3358f, 4.5f, 3.75f, 4.5f)
                lineTo(20.25f, 4.5f)
                close()
                moveTo(14.5f, 9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(14.5f)
                close()
                moveTo(9.5f, 16.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(21.0f)
                lineTo(9.5f, 21.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(8.0f, 9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.25f)
                curveTo(3.0f, 9.8358f, 3.3358f, 9.5f, 3.75f, 9.5f)
                horizontalLineTo(8.0f)
                close()
                moveTo(8.0f, 16.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(21.0f, 16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 21.0f, 21.0f, 19.5449f, 21.0f, 17.75f)
                verticalLineTo(16.0f)
                close()
                moveTo(16.0f, 14.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(10.25f)
                curveTo(21.0f, 10.0511f, 20.921f, 9.8603f, 20.7803f, 9.7197f)
                curveTo(20.6397f, 9.579f, 20.4489f, 9.5f, 20.25f, 9.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _tableStackAbove!!
    }

private var _tableStackAbove: ImageVector? = null
