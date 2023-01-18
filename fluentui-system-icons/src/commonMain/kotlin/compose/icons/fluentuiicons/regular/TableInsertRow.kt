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

public val RegularGroup.TableInsertRow: ImageVector
    get() {
        if (_tableInsertRow != null) {
            return _tableInsertRow!!
        }
        _tableInsertRow = Builder(name = "TableInsertRow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.25f, 3.0f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 3.0f, 3.0f, 3.3358f, 3.0f, 3.75f)
                curveTo(3.0f, 4.1642f, 3.3358f, 4.5f, 3.75f, 4.5f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 4.5f, 21.0f, 4.1642f, 21.0f, 3.75f)
                curveTo(21.0f, 3.3358f, 20.6642f, 3.0f, 20.25f, 3.0f)
                close()
                moveTo(3.0f, 9.75f)
                curveTo(3.0f, 8.5074f, 4.0074f, 7.5f, 5.25f, 7.5f)
                horizontalLineTo(18.75f)
                curveTo(19.9926f, 7.5f, 21.0f, 8.5074f, 21.0f, 9.75f)
                verticalLineTo(14.25f)
                curveTo(21.0f, 15.4926f, 19.9926f, 16.5f, 18.75f, 16.5f)
                lineTo(5.25f, 16.5f)
                curveTo(4.0074f, 16.5f, 3.0f, 15.4926f, 3.0f, 14.25f)
                verticalLineTo(9.75f)
                close()
                moveTo(5.25f, 9.0f)
                curveTo(4.8358f, 9.0f, 4.5f, 9.3358f, 4.5f, 9.75f)
                verticalLineTo(14.25f)
                curveTo(4.5f, 14.6642f, 4.8358f, 15.0f, 5.25f, 15.0f)
                horizontalLineTo(8.5f)
                lineTo(8.5f, 9.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(14.0f, 15.0f)
                lineTo(14.0f, 9.0f)
                horizontalLineTo(10.0f)
                lineTo(10.0f, 15.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(15.5f, 15.0f)
                horizontalLineTo(18.75f)
                curveTo(19.1642f, 15.0f, 19.5f, 14.6642f, 19.5f, 14.25f)
                verticalLineTo(9.75f)
                curveTo(19.5f, 9.3358f, 19.1642f, 9.0f, 18.75f, 9.0f)
                horizontalLineTo(15.5f)
                lineTo(15.5f, 15.0f)
                close()
                moveTo(3.75f, 19.5f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 19.5f, 21.0f, 19.8358f, 21.0f, 20.25f)
                curveTo(21.0f, 20.6642f, 20.6642f, 21.0f, 20.25f, 21.0f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 21.0f, 3.0f, 20.6642f, 3.0f, 20.25f)
                curveTo(3.0f, 19.8358f, 3.3358f, 19.5f, 3.75f, 19.5f)
                close()
            }
        }
        .build()
        return _tableInsertRow!!
    }

private var _tableInsertRow: ImageVector? = null
