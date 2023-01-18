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

public val FilledGroup.LockClosed: ImageVector
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
                horizontalLineTo(18.5f)
                curveTo(19.3284f, 8.0f, 20.0f, 8.6716f, 20.0f, 9.5f)
                verticalLineTo(20.5f)
                curveTo(20.0f, 21.3284f, 19.3284f, 22.0f, 18.5f, 22.0f)
                horizontalLineTo(5.5f)
                curveTo(4.6716f, 22.0f, 4.0f, 21.3284f, 4.0f, 20.5f)
                verticalLineTo(9.5f)
                curveTo(4.0f, 8.6716f, 4.6716f, 8.0f, 5.5f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                curveTo(8.0f, 3.7909f, 9.7909f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0001f, 13.5f)
                curveTo(11.1717f, 13.5f, 10.5001f, 14.1716f, 10.5001f, 15.0f)
                curveTo(10.5001f, 15.8284f, 11.1717f, 16.5f, 12.0001f, 16.5f)
                curveTo(12.8286f, 16.5f, 13.5001f, 15.8284f, 13.5001f, 15.0f)
                curveTo(13.5001f, 14.1716f, 12.8286f, 13.5f, 12.0001f, 13.5f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(10.8954f, 4.0f, 10.0f, 4.8954f, 10.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                curveTo(14.0f, 4.8954f, 13.1046f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _lockClosed!!
    }

private var _lockClosed: ImageVector? = null
