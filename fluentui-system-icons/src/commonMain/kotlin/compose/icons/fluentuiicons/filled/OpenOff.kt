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

public val FilledGroup.OpenOff: ImageVector
    get() {
        if (_openOff != null) {
            return _openOff!!
        }
        _openOff = Builder(name = "OpenOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                lineTo(21.7801f, 20.7198f)
                curveTo(22.073f, 21.0127f, 22.073f, 21.4876f, 21.7801f, 21.7805f)
                curveTo(21.4872f, 22.0734f, 21.0123f, 22.0734f, 20.7194f, 21.7805f)
                lineTo(19.637f, 20.698f)
                curveTo(19.0924f, 21.0474f, 18.4447f, 21.25f, 17.7496f, 21.25f)
                horizontalLineTo(6.2499f)
                curveTo(4.317f, 21.25f, 2.75f, 19.683f, 2.75f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(2.75f, 5.555f, 2.9526f, 4.9072f, 3.302f, 4.3626f)
                lineTo(2.2197f, 3.2803f)
                curveTo(1.9268f, 2.9874f, 1.9268f, 2.5126f, 2.2197f, 2.2197f)
                curveTo(2.5126f, 1.9268f, 2.9874f, 1.9268f, 3.2803f, 2.2197f)
                close()
                moveTo(18.1382f, 19.1992f)
                lineTo(4.8008f, 5.8615f)
                curveTo(4.7676f, 5.9854f, 4.7499f, 6.1156f, 4.7499f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(4.7499f, 18.5784f, 5.4215f, 19.25f, 6.2499f, 19.25f)
                horizontalLineTo(17.7496f)
                curveTo(17.884f, 19.25f, 18.0143f, 19.2323f, 18.1382f, 19.1992f)
                close()
                moveTo(12.9016f, 9.7198f)
                lineTo(14.2799f, 11.0981f)
                curveTo(14.3427f, 11.0588f, 14.4021f, 11.0118f, 14.4568f, 10.9571f)
                lineTo(19.25f, 6.1643f)
                verticalLineTo(10.25f)
                curveTo(19.25f, 10.8023f, 19.6978f, 11.25f, 20.25f, 11.25f)
                curveTo(20.8023f, 11.25f, 21.25f, 10.8023f, 21.25f, 10.25f)
                verticalLineTo(3.75f)
                curveTo(21.25f, 3.1977f, 20.8023f, 2.75f, 20.25f, 2.75f)
                horizontalLineTo(13.7497f)
                curveTo(13.1975f, 2.75f, 12.7498f, 3.1977f, 12.7498f, 3.75f)
                curveTo(12.7498f, 4.3023f, 13.1975f, 4.75f, 13.7497f, 4.75f)
                horizontalLineTo(17.8359f)
                lineTo(13.0427f, 9.5429f)
                curveTo(12.988f, 9.5975f, 12.941f, 9.6569f, 12.9016f, 9.7198f)
                close()
                moveTo(21.2365f, 18.0548f)
                lineTo(19.2496f, 16.0679f)
                verticalLineTo(13.75f)
                curveTo(19.2496f, 13.1977f, 19.6973f, 12.75f, 20.2496f, 12.75f)
                curveTo(20.8018f, 12.75f, 21.2495f, 13.1977f, 21.2495f, 13.75f)
                verticalLineTo(17.75f)
                curveTo(21.2495f, 17.8527f, 21.2451f, 17.9544f, 21.2365f, 18.0548f)
                close()
                moveTo(5.9451f, 2.7631f)
                lineTo(7.9319f, 4.75f)
                horizontalLineTo(10.2498f)
                curveTo(10.8021f, 4.75f, 11.2498f, 4.3023f, 11.2498f, 3.75f)
                curveTo(11.2498f, 3.1977f, 10.8021f, 2.75f, 10.2498f, 2.75f)
                horizontalLineTo(6.2499f)
                curveTo(6.1472f, 2.75f, 6.0455f, 2.7544f, 5.9451f, 2.7631f)
                close()
            }
        }
        .build()
        return _openOff!!
    }

private var _openOff: ImageVector? = null
