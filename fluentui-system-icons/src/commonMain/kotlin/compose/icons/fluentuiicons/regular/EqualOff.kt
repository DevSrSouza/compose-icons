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

public val RegularGroup.EqualOff: ImageVector
    get() {
        if (_equalOff != null) {
            return _equalOff!!
        }
        _equalOff = Builder(name = "EqualOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(6.9392f, 8.0f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 8.0f, 3.0f, 8.3358f, 3.0f, 8.75f)
                curveTo(3.0f, 9.1642f, 3.3358f, 9.5f, 3.75f, 9.5f)
                horizontalLineTo(8.4392f)
                lineTo(13.4391f, 14.5f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 14.5f, 3.0f, 14.8358f, 3.0f, 15.25f)
                curveTo(3.0f, 15.6642f, 3.3358f, 16.0f, 3.75f, 16.0f)
                horizontalLineTo(14.9391f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(20.25f, 14.5f)
                horizontalLineTo(17.6817f)
                lineTo(19.1817f, 16.0f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 16.0f, 21.0f, 15.6642f, 21.0f, 15.25f)
                curveTo(21.0f, 14.8358f, 20.6642f, 14.5f, 20.25f, 14.5f)
                close()
                moveTo(11.1819f, 8.0f)
                lineTo(12.6818f, 9.5f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 9.5f, 21.0f, 9.1642f, 21.0f, 8.75f)
                curveTo(21.0f, 8.3358f, 20.6642f, 8.0f, 20.25f, 8.0f)
                horizontalLineTo(11.1819f)
                close()
            }
        }
        .build()
        return _equalOff!!
    }

private var _equalOff: ImageVector? = null
