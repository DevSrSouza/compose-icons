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

public val FilledGroup.TableInsertRow: ImageVector
    get() {
        if (_tableInsertRow != null) {
            return _tableInsertRow!!
        }
        _tableInsertRow = Builder(name = "TableInsertRow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.25f, 4.5f)
                lineTo(3.75f, 4.5f)
                curveTo(3.3358f, 4.5f, 3.0f, 4.1642f, 3.0f, 3.75f)
                curveTo(3.0f, 3.3358f, 3.3358f, 3.0f, 3.75f, 3.0f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 3.0f, 21.0f, 3.3358f, 21.0f, 3.75f)
                curveTo(21.0f, 4.1642f, 20.6642f, 4.5f, 20.25f, 4.5f)
                close()
                moveTo(8.0f, 8.0f)
                horizontalLineTo(5.25f)
                curveTo(4.0074f, 8.0f, 3.0f, 8.8954f, 3.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 15.1046f, 4.0074f, 16.0f, 5.25f, 16.0f)
                horizontalLineTo(8.0f)
                lineTo(8.0f, 8.0f)
                close()
                moveTo(9.5f, 16.0f)
                horizontalLineTo(14.5f)
                lineTo(14.5f, 8.0f)
                horizontalLineTo(9.5f)
                lineTo(9.5f, 16.0f)
                close()
                moveTo(18.75f, 16.0f)
                horizontalLineTo(16.0f)
                lineTo(16.0f, 8.0f)
                horizontalLineTo(18.75f)
                curveTo(19.9926f, 8.0f, 21.0f, 8.8954f, 21.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(21.0f, 15.1046f, 19.9926f, 16.0f, 18.75f, 16.0f)
                close()
                moveTo(3.75f, 21.0f)
                lineTo(20.25f, 21.0f)
                curveTo(20.6642f, 21.0f, 21.0f, 20.6642f, 21.0f, 20.25f)
                curveTo(21.0f, 19.8358f, 20.6642f, 19.5f, 20.25f, 19.5f)
                lineTo(3.75f, 19.5f)
                curveTo(3.3358f, 19.5f, 3.0f, 19.8358f, 3.0f, 20.25f)
                curveTo(3.0f, 20.6642f, 3.3358f, 21.0f, 3.75f, 21.0f)
                close()
            }
        }
        .build()
        return _tableInsertRow!!
    }

private var _tableInsertRow: ImageVector? = null
