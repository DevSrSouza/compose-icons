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

public val RegularGroup.TableInsertColumn: ImageVector
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
                moveTo(14.25f, 3.0f)
                curveTo(15.4926f, 3.0f, 16.5f, 4.0074f, 16.5f, 5.25f)
                lineTo(16.5f, 18.75f)
                curveTo(16.5f, 19.9926f, 15.4926f, 21.0f, 14.25f, 21.0f)
                horizontalLineTo(9.75f)
                curveTo(8.5074f, 21.0f, 7.5f, 19.9926f, 7.5f, 18.75f)
                lineTo(7.5f, 5.25f)
                curveTo(7.5f, 4.0074f, 8.5074f, 3.0f, 9.75f, 3.0f)
                horizontalLineTo(14.25f)
                close()
                moveTo(15.0f, 5.25f)
                curveTo(15.0f, 4.8358f, 14.6642f, 4.5f, 14.25f, 4.5f)
                lineTo(9.75f, 4.5f)
                curveTo(9.3358f, 4.5f, 9.0f, 4.8358f, 9.0f, 5.25f)
                verticalLineTo(8.5f)
                lineTo(15.0f, 8.5f)
                verticalLineTo(5.25f)
                close()
                moveTo(9.0f, 14.0f)
                lineTo(15.0f, 14.0f)
                verticalLineTo(10.0f)
                lineTo(9.0f, 10.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(9.0f, 15.5f)
                verticalLineTo(18.75f)
                curveTo(9.0f, 19.1642f, 9.3358f, 19.5f, 9.75f, 19.5f)
                horizontalLineTo(14.25f)
                curveTo(14.6642f, 19.5f, 15.0f, 19.1642f, 15.0f, 18.75f)
                verticalLineTo(15.5f)
                lineTo(9.0f, 15.5f)
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
