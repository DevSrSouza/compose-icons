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

public val RegularGroup.LockClosed: ImageVector
    get() {
        if (_lockClosed != null) {
            return _lockClosed!!
        }
        _lockClosed = Builder(name = "LockClosed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(14.2091f, 2.0f, 16.0f, 3.7909f, 16.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(17.75f)
                curveTo(18.9926f, 8.0f, 20.0f, 9.0074f, 20.0f, 10.25f)
                verticalLineTo(19.75f)
                curveTo(20.0f, 20.9926f, 18.9926f, 22.0f, 17.75f, 22.0f)
                horizontalLineTo(6.25f)
                curveTo(5.0074f, 22.0f, 4.0f, 20.9926f, 4.0f, 19.75f)
                verticalLineTo(10.25f)
                curveTo(4.0f, 9.0074f, 5.0074f, 8.0f, 6.25f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                curveTo(8.0f, 3.7909f, 9.7909f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(17.75f, 9.5f)
                horizontalLineTo(6.25f)
                curveTo(5.8358f, 9.5f, 5.5f, 9.8358f, 5.5f, 10.25f)
                verticalLineTo(19.75f)
                curveTo(5.5f, 20.1642f, 5.8358f, 20.5f, 6.25f, 20.5f)
                horizontalLineTo(17.75f)
                curveTo(18.1642f, 20.5f, 18.5f, 20.1642f, 18.5f, 19.75f)
                verticalLineTo(10.25f)
                curveTo(18.5f, 9.8358f, 18.1642f, 9.5f, 17.75f, 9.5f)
                close()
                moveTo(12.0001f, 13.5f)
                curveTo(12.8286f, 13.5f, 13.5001f, 14.1716f, 13.5001f, 15.0f)
                curveTo(13.5001f, 15.8284f, 12.8286f, 16.5f, 12.0001f, 16.5f)
                curveTo(11.1717f, 16.5f, 10.5001f, 15.8284f, 10.5001f, 15.0f)
                curveTo(10.5001f, 14.1716f, 11.1717f, 13.5f, 12.0001f, 13.5f)
                close()
                moveTo(12.0f, 3.5f)
                curveTo(10.6193f, 3.5f, 9.5f, 4.6193f, 9.5f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(6.0f)
                curveTo(14.5f, 4.6193f, 13.3807f, 3.5f, 12.0f, 3.5f)
                close()
            }
        }
        .build()
        return _lockClosed!!
    }

private var _lockClosed: ImageVector? = null
