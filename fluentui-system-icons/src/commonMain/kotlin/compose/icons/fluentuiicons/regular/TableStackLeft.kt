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

public val RegularGroup.TableStackLeft: ImageVector
    get() {
        if (_tableStackLeft != null) {
            return _tableStackLeft!!
        }
        _tableStackLeft = Builder(name = "TableStackLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 3.75f)
                curveTo(4.5f, 3.3358f, 4.1642f, 3.0f, 3.75f, 3.0f)
                curveTo(3.3358f, 3.0f, 3.0f, 3.3358f, 3.0f, 3.75f)
                verticalLineTo(20.25f)
                curveTo(3.0f, 20.6642f, 3.3358f, 21.0f, 3.75f, 21.0f)
                curveTo(4.1642f, 21.0f, 4.5f, 20.6642f, 4.5f, 20.25f)
                lineTo(4.5f, 3.75f)
                close()
                moveTo(8.5f, 3.75f)
                curveTo(8.5f, 3.3358f, 8.8358f, 3.0f, 9.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(9.25f)
                curveTo(8.8358f, 21.0f, 8.5f, 20.6642f, 8.5f, 20.25f)
                verticalLineTo(3.75f)
                close()
                moveTo(10.0f, 10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(10.0f, 15.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(10.0f)
                close()
                moveTo(15.5f, 15.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 19.5f, 19.5f, 18.7165f, 19.5f, 17.75f)
                verticalLineTo(15.5f)
                horizontalLineTo(15.5f)
                close()
                moveTo(15.5f, 10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.5f)
                close()
                moveTo(19.5f, 8.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.2835f, 18.7165f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(8.5f)
                horizontalLineTo(19.5f)
                close()
                moveTo(10.0f, 4.5f)
                verticalLineTo(8.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.5f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _tableStackLeft!!
    }

private var _tableStackLeft: ImageVector? = null
