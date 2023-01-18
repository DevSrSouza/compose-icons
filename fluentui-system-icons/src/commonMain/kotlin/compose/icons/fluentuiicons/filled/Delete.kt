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

public val FilledGroup.Delete: ImageVector
    get() {
        if (_delete != null) {
            return _delete!!
        }
        _delete = Builder(name = "Delete", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 5.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 3.8954f, 13.1046f, 3.0f, 12.0f, 3.0f)
                curveTo(10.8954f, 3.0f, 10.0f, 3.8954f, 10.0f, 5.0f)
                close()
                moveTo(8.5f, 5.0f)
                curveTo(8.5f, 3.067f, 10.067f, 1.5f, 12.0f, 1.5f)
                curveTo(13.933f, 1.5f, 15.5f, 3.067f, 15.5f, 5.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 5.0f, 22.0f, 5.3358f, 22.0f, 5.75f)
                curveTo(22.0f, 6.1642f, 21.6642f, 6.5f, 21.25f, 6.5f)
                horizontalLineTo(19.9309f)
                lineTo(18.7589f, 18.6112f)
                curveTo(18.5729f, 20.5334f, 16.9575f, 22.0f, 15.0263f, 22.0f)
                horizontalLineTo(8.9737f)
                curveTo(7.0425f, 22.0f, 5.4271f, 20.5334f, 5.2411f, 18.6112f)
                lineTo(4.0691f, 6.5f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 6.5f, 2.0f, 6.1642f, 2.0f, 5.75f)
                curveTo(2.0f, 5.3358f, 2.3358f, 5.0f, 2.75f, 5.0f)
                horizontalLineTo(8.5f)
                close()
                moveTo(10.5f, 9.75f)
                curveTo(10.5f, 9.3358f, 10.1642f, 9.0f, 9.75f, 9.0f)
                curveTo(9.3358f, 9.0f, 9.0f, 9.3358f, 9.0f, 9.75f)
                verticalLineTo(17.25f)
                curveTo(9.0f, 17.6642f, 9.3358f, 18.0f, 9.75f, 18.0f)
                curveTo(10.1642f, 18.0f, 10.5f, 17.6642f, 10.5f, 17.25f)
                verticalLineTo(9.75f)
                close()
                moveTo(14.25f, 9.0f)
                curveTo(13.8358f, 9.0f, 13.5f, 9.3358f, 13.5f, 9.75f)
                verticalLineTo(17.25f)
                curveTo(13.5f, 17.6642f, 13.8358f, 18.0f, 14.25f, 18.0f)
                curveTo(14.6642f, 18.0f, 15.0f, 17.6642f, 15.0f, 17.25f)
                verticalLineTo(9.75f)
                curveTo(15.0f, 9.3358f, 14.6642f, 9.0f, 14.25f, 9.0f)
                close()
            }
        }
        .build()
        return _delete!!
    }

private var _delete: ImageVector? = null
