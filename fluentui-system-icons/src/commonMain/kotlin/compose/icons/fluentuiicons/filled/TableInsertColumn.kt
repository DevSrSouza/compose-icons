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

public val FilledGroup.TableInsertColumn: ImageVector
    get() {
        if (_tableInsertColumn != null) {
            return _tableInsertColumn!!
        }
        _tableInsertColumn = Builder(name = "TableInsertColumn", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 3.75f)
                lineTo(4.5f, 20.25f)
                curveTo(4.5f, 20.6642f, 4.1642f, 21.0f, 3.75f, 21.0f)
                curveTo(3.3358f, 21.0f, 3.0f, 20.6642f, 3.0f, 20.25f)
                verticalLineTo(3.75f)
                curveTo(3.0f, 3.3358f, 3.3358f, 3.0f, 3.75f, 3.0f)
                curveTo(4.1642f, 3.0f, 4.5f, 3.3358f, 4.5f, 3.75f)
                close()
                moveTo(16.0f, 5.25f)
                curveTo(16.0f, 4.0074f, 15.1046f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(10.0f)
                curveTo(8.8954f, 3.0f, 8.0f, 4.0074f, 8.0f, 5.25f)
                verticalLineTo(8.0f)
                lineTo(16.0f, 8.0f)
                verticalLineTo(5.25f)
                close()
                moveTo(8.0f, 14.5f)
                verticalLineTo(9.5f)
                lineTo(16.0f, 9.5f)
                verticalLineTo(14.5f)
                lineTo(8.0f, 14.5f)
                close()
                moveTo(8.0f, 16.0f)
                verticalLineTo(18.75f)
                curveTo(8.0f, 19.9926f, 8.8954f, 21.0f, 10.0f, 21.0f)
                horizontalLineTo(14.0f)
                curveTo(15.1046f, 21.0f, 16.0f, 19.9926f, 16.0f, 18.75f)
                verticalLineTo(16.0f)
                lineTo(8.0f, 16.0f)
                close()
                moveTo(21.0f, 20.25f)
                verticalLineTo(3.75f)
                curveTo(21.0f, 3.3358f, 20.6642f, 3.0f, 20.25f, 3.0f)
                curveTo(19.8358f, 3.0f, 19.5f, 3.3358f, 19.5f, 3.75f)
                verticalLineTo(20.25f)
                curveTo(19.5f, 20.6642f, 19.8358f, 21.0f, 20.25f, 21.0f)
                curveTo(20.6642f, 21.0f, 21.0f, 20.6642f, 21.0f, 20.25f)
                close()
            }
        }
        .build()
        return _tableInsertColumn!!
    }

private var _tableInsertColumn: ImageVector? = null
