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

public val RegularGroup.FlashlightOff: ImageVector
    get() {
        if (_flashlightOff != null) {
            return _flashlightOff!!
        }
        _flashlightOff = Builder(name = "FlashlightOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5303f, 14.4697f)
                curveTo(9.8232f, 14.7626f, 9.8232f, 15.2374f, 9.5303f, 15.5303f)
                lineTo(8.0303f, 17.0303f)
                curveTo(7.7374f, 17.3232f, 7.2626f, 17.3232f, 6.9697f, 17.0303f)
                curveTo(6.6768f, 16.7374f, 6.6768f, 16.2626f, 6.9697f, 15.9697f)
                lineTo(8.4697f, 14.4697f)
                curveTo(8.7626f, 14.1768f, 9.2374f, 14.1768f, 9.5303f, 14.4697f)
                close()
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(8.2498f, 9.3105f)
                verticalLineTo(10.6893f)
                lineTo(3.0301f, 15.909f)
                curveTo(2.1514f, 16.7877f, 2.1514f, 18.2123f, 3.0301f, 19.091f)
                lineTo(4.9088f, 20.9697f)
                curveTo(5.7875f, 21.8483f, 7.2121f, 21.8483f, 8.0908f, 20.9697f)
                lineTo(13.3104f, 15.75f)
                horizontalLineTo(14.6891f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(8.9998f, 12.0606f)
                lineTo(11.9391f, 15.0f)
                lineTo(7.0301f, 19.909f)
                curveTo(6.7372f, 20.2019f, 6.2623f, 20.2019f, 5.9694f, 19.909f)
                lineTo(4.0908f, 18.0303f)
                curveTo(3.7979f, 17.7374f, 3.7979f, 17.2626f, 4.0908f, 16.9697f)
                lineTo(8.9998f, 12.0606f)
                close()
                moveTo(17.8443f, 14.0948f)
                lineTo(19.4088f, 12.5303f)
                curveTo(19.7017f, 12.2374f, 19.7017f, 11.7626f, 19.4088f, 11.4697f)
                lineTo(12.5301f, 4.591f)
                curveTo(12.2372f, 4.2981f, 11.7623f, 4.2981f, 11.4694f, 4.591f)
                lineTo(9.905f, 6.1554f)
                lineTo(8.8444f, 5.0947f)
                lineTo(10.4088f, 3.5303f)
                curveTo(11.2875f, 2.6516f, 12.7121f, 2.6516f, 13.5908f, 3.5303f)
                lineTo(20.4694f, 10.409f)
                curveTo(21.3481f, 11.2877f, 21.3481f, 12.7123f, 20.4694f, 13.591f)
                lineTo(18.9049f, 15.1555f)
                lineTo(17.8443f, 14.0948f)
                close()
            }
        }
        .build()
        return _flashlightOff!!
    }

private var _flashlightOff: ImageVector? = null
