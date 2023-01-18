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

public val FilledGroup.ShiftsOpen: ImageVector
    get() {
        if (_shiftsOpen != null) {
            return _shiftsOpen!!
        }
        _shiftsOpen = Builder(name = "ShiftsOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0001f, 3.0f)
                curveTo(14.4478f, 3.0f, 14.0001f, 3.4477f, 14.0001f, 4.0f)
                curveTo(14.0001f, 4.5523f, 14.4478f, 5.0f, 15.0001f, 5.0f)
                lineTo(17.5f, 5.0f)
                curveTo(18.3284f, 5.0f, 19.0f, 5.6716f, 19.0f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(19.0f, 18.3285f, 18.3284f, 19.0f, 17.5f, 19.0f)
                horizontalLineTo(15.0001f)
                curveTo(14.4478f, 19.0f, 14.0001f, 19.4478f, 14.0001f, 20.0f)
                curveTo(14.0001f, 20.5523f, 14.4478f, 21.0f, 15.0001f, 21.0f)
                horizontalLineTo(17.5f)
                curveTo(19.433f, 21.0f, 21.0f, 19.433f, 21.0f, 17.5f)
                verticalLineTo(6.5f)
                curveTo(21.0f, 4.567f, 19.433f, 3.0f, 17.5f, 3.0f)
                lineTo(15.0001f, 3.0f)
                close()
                moveTo(5.0f, 6.5001f)
                curveTo(5.0f, 5.6716f, 5.6716f, 5.0001f, 6.5f, 5.0001f)
                horizontalLineTo(9.0f)
                curveTo(9.5523f, 5.0001f, 10.0f, 4.5523f, 10.0f, 4.0001f)
                curveTo(10.0f, 3.4478f, 9.5523f, 3.0001f, 9.0f, 3.0001f)
                horizontalLineTo(6.5f)
                curveTo(4.567f, 3.0001f, 3.0f, 4.567f, 3.0f, 6.5001f)
                verticalLineTo(17.5f)
                curveTo(3.0f, 19.433f, 4.567f, 21.0f, 6.5f, 21.0f)
                horizontalLineTo(9.0f)
                curveTo(9.5523f, 21.0f, 10.0f, 20.5523f, 10.0f, 20.0f)
                curveTo(10.0f, 19.4478f, 9.5523f, 19.0f, 9.0f, 19.0f)
                horizontalLineTo(6.5f)
                curveTo(5.6716f, 19.0f, 5.0f, 18.3285f, 5.0f, 17.5f)
                lineTo(5.0f, 6.5001f)
                close()
                moveTo(12.5f, 7.0f)
                curveTo(12.5f, 6.4477f, 12.0523f, 6.0f, 11.5f, 6.0f)
                curveTo(10.9477f, 6.0f, 10.5f, 6.4477f, 10.5f, 7.0f)
                verticalLineTo(13.0f)
                curveTo(10.5f, 13.5523f, 10.9477f, 14.0f, 11.5f, 14.0f)
                horizontalLineTo(15.9967f)
                curveTo(16.5489f, 14.0f, 16.9967f, 13.5523f, 16.9967f, 13.0f)
                curveTo(16.9967f, 12.4477f, 16.5489f, 12.0f, 15.9967f, 12.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _shiftsOpen!!
    }

private var _shiftsOpen: ImageVector? = null
