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

public val FilledGroup.TableStackLeft: ImageVector
    get() {
        if (_tableStackLeft != null) {
            return _tableStackLeft!!
        }
        _tableStackLeft = Builder(name = "TableStackLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 21.0f, 21.0f, 19.5449f, 21.0f, 17.75f)
                verticalLineTo(16.0f)
                lineTo(16.0f, 16.0f)
                lineTo(16.0f, 21.0f)
                close()
                moveTo(16.0f, 14.5f)
                lineTo(21.0f, 14.5f)
                lineTo(21.0f, 9.5f)
                lineTo(16.0f, 9.5f)
                lineTo(16.0f, 14.5f)
                close()
                moveTo(14.5f, 9.5f)
                lineTo(14.5f, 14.5f)
                lineTo(9.5f, 14.5f)
                lineTo(9.5f, 9.5f)
                lineTo(14.5f, 9.5f)
                close()
                moveTo(16.0f, 8.0f)
                lineTo(21.0f, 8.0f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(16.0f)
                lineTo(16.0f, 8.0f)
                close()
                moveTo(14.5f, 3.0f)
                lineTo(14.5f, 8.0f)
                lineTo(9.5f, 8.0f)
                lineTo(9.5f, 3.75f)
                curveTo(9.5f, 3.5511f, 9.579f, 3.3603f, 9.7197f, 3.2197f)
                curveTo(9.8603f, 3.079f, 10.0511f, 3.0f, 10.25f, 3.0f)
                horizontalLineTo(14.5f)
                close()
                moveTo(14.5f, 16.0f)
                lineTo(14.5f, 21.0f)
                lineTo(10.25f, 21.0f)
                curveTo(9.8358f, 21.0f, 9.5f, 20.6642f, 9.5f, 20.25f)
                lineTo(9.5f, 16.0f)
                lineTo(14.5f, 16.0f)
                close()
                moveTo(4.5f, 3.75f)
                curveTo(4.5f, 3.3358f, 4.1642f, 3.0f, 3.75f, 3.0f)
                curveTo(3.3358f, 3.0f, 3.0f, 3.3358f, 3.0f, 3.75f)
                verticalLineTo(20.25f)
                curveTo(3.0f, 20.6642f, 3.3358f, 21.0f, 3.75f, 21.0f)
                curveTo(4.1642f, 21.0f, 4.5f, 20.6642f, 4.5f, 20.25f)
                lineTo(4.5f, 3.75f)
                close()
            }
        }
        .build()
        return _tableStackLeft!!
    }

private var _tableStackLeft: ImageVector? = null
