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

public val FilledGroup.DeleteOff: ImageVector
    get() {
        if (_deleteOff != null) {
            return _deleteOff!!
        }
        _deleteOff = Builder(name = "DeleteOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.9393f, 5.0f)
                lineTo(2.2197f, 3.2803f)
                curveTo(1.9268f, 2.9874f, 1.9268f, 2.5126f, 2.2197f, 2.2197f)
                curveTo(2.5126f, 1.9268f, 2.9874f, 1.9268f, 3.2803f, 2.2197f)
                lineTo(21.7801f, 20.7198f)
                curveTo(22.073f, 21.0127f, 22.073f, 21.4876f, 21.7801f, 21.7805f)
                curveTo(21.4872f, 22.0734f, 21.0123f, 22.0734f, 20.7194f, 21.7805f)
                lineTo(18.5293f, 19.5903f)
                curveTo(17.9867f, 21.0098f, 16.6131f, 22.0f, 15.0263f, 22.0f)
                horizontalLineTo(8.9737f)
                curveTo(7.0425f, 22.0f, 5.4271f, 20.5334f, 5.2411f, 18.6112f)
                lineTo(4.0691f, 6.5f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 6.5f, 2.0f, 6.1642f, 2.0f, 5.75f)
                curveTo(2.0f, 5.3358f, 2.3358f, 5.0f, 2.75f, 5.0f)
                horizontalLineTo(3.9393f)
                close()
                moveTo(15.0f, 16.0609f)
                lineTo(13.5f, 14.5609f)
                verticalLineTo(17.25f)
                curveTo(13.5f, 17.6642f, 13.8358f, 18.0f, 14.25f, 18.0f)
                curveTo(14.6642f, 18.0f, 15.0f, 17.6642f, 15.0f, 17.25f)
                verticalLineTo(16.0609f)
                close()
                moveTo(10.5f, 11.5608f)
                lineTo(9.0f, 10.0608f)
                verticalLineTo(17.25f)
                curveTo(9.0f, 17.6642f, 9.3358f, 18.0f, 9.75f, 18.0f)
                curveTo(10.1642f, 18.0f, 10.5f, 17.6642f, 10.5f, 17.25f)
                verticalLineTo(11.5608f)
                close()
                moveTo(15.0f, 9.75f)
                verticalLineTo(11.8186f)
                lineTo(19.0265f, 15.8452f)
                lineTo(19.9309f, 6.5f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 6.5f, 22.0f, 6.1642f, 22.0f, 5.75f)
                curveTo(22.0f, 5.3358f, 21.6642f, 5.0f, 21.25f, 5.0f)
                horizontalLineTo(15.5f)
                curveTo(15.5f, 3.067f, 13.933f, 1.5f, 12.0f, 1.5f)
                curveTo(10.067f, 1.5f, 8.5f, 3.067f, 8.5f, 5.0f)
                horizontalLineTo(8.1816f)
                lineTo(13.5f, 10.3185f)
                verticalLineTo(9.75f)
                curveTo(13.5f, 9.3358f, 13.8358f, 9.0f, 14.25f, 9.0f)
                curveTo(14.6642f, 9.0f, 15.0f, 9.3358f, 15.0f, 9.75f)
                close()
                moveTo(14.0f, 5.0f)
                horizontalLineTo(10.0f)
                curveTo(10.0f, 3.8954f, 10.8954f, 3.0f, 12.0f, 3.0f)
                curveTo(13.1046f, 3.0f, 14.0f, 3.8954f, 14.0f, 5.0f)
                close()
            }
        }
        .build()
        return _deleteOff!!
    }

private var _deleteOff: ImageVector? = null
