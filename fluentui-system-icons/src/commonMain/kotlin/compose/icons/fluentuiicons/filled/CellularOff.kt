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

public val FilledGroup.CellularOff: ImageVector
    get() {
        if (_cellularOff != null) {
            return _cellularOff!!
        }
        _cellularOff = Builder(name = "CellularOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(11.0f, 12.0608f)
                verticalLineTo(19.0f)
                curveTo(11.0f, 19.5523f, 11.4477f, 20.0f, 12.0f, 20.0f)
                curveTo(12.5523f, 20.0f, 13.0f, 19.5523f, 13.0f, 19.0f)
                verticalLineTo(14.0609f)
                lineTo(15.0f, 16.0609f)
                verticalLineTo(19.0046f)
                curveTo(15.0f, 19.5544f, 15.4477f, 20.0f, 16.0f, 20.0f)
                curveTo(16.5523f, 20.0f, 17.0f, 19.5544f, 17.0f, 19.0046f)
                verticalLineTo(18.061f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(19.0f, 15.8183f)
                lineTo(21.0f, 17.8183f)
                verticalLineTo(5.9992f)
                curveTo(21.0f, 5.4474f, 20.5523f, 5.0f, 20.0f, 5.0f)
                curveTo(19.4477f, 5.0f, 19.0f, 5.4474f, 19.0f, 5.9992f)
                verticalLineTo(15.8183f)
                close()
                moveTo(15.0f, 11.8182f)
                lineTo(17.0f, 13.8183f)
                verticalLineTo(8.9954f)
                curveTo(17.0f, 8.4457f, 16.5523f, 8.0f, 16.0f, 8.0f)
                curveTo(15.4477f, 8.0f, 15.0f, 8.4457f, 15.0f, 8.9954f)
                verticalLineTo(11.8182f)
                close()
                moveTo(8.0f, 14.0f)
                curveTo(8.5523f, 14.0f, 9.0f, 14.4451f, 9.0f, 14.9942f)
                verticalLineTo(19.0059f)
                curveTo(9.0f, 19.5549f, 8.5523f, 20.0f, 8.0f, 20.0f)
                curveTo(7.4477f, 20.0f, 7.0f, 19.5549f, 7.0f, 19.0059f)
                verticalLineTo(14.9942f)
                curveTo(7.0f, 14.4451f, 7.4477f, 14.0f, 8.0f, 14.0f)
                close()
                moveTo(4.0f, 17.0f)
                curveTo(4.5523f, 17.0f, 5.0f, 17.4403f, 5.0f, 17.9836f)
                verticalLineTo(19.0164f)
                curveTo(5.0f, 19.5597f, 4.5523f, 20.0f, 4.0f, 20.0f)
                curveTo(3.4477f, 20.0f, 3.0f, 19.5597f, 3.0f, 19.0164f)
                verticalLineTo(17.9836f)
                curveTo(3.0f, 17.4403f, 3.4477f, 17.0f, 4.0f, 17.0f)
                close()
            }
        }
        .build()
        return _cellularOff!!
    }

private var _cellularOff: ImageVector? = null
