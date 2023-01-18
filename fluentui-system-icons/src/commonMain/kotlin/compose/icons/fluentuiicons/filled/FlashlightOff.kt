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

public val FilledGroup.FlashlightOff: ImageVector
    get() {
        if (_flashlightOff != null) {
            return _flashlightOff!!
        }
        _flashlightOff = Builder(name = "FlashlightOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(19.0604f, 15.0f)
                lineTo(20.4694f, 13.591f)
                curveTo(21.3481f, 12.7123f, 21.3481f, 11.2877f, 20.4694f, 10.409f)
                lineTo(13.5908f, 3.5303f)
                curveTo(12.7121f, 2.6516f, 11.2875f, 2.6516f, 10.4088f, 3.5303f)
                lineTo(8.9997f, 4.9394f)
                lineTo(19.0604f, 15.0f)
                close()
                moveTo(12.9997f, 16.0607f)
                lineTo(7.9391f, 11.0f)
                lineTo(3.0301f, 15.909f)
                curveTo(2.1514f, 16.7877f, 2.1514f, 18.2123f, 3.0301f, 19.091f)
                lineTo(4.9088f, 20.9697f)
                curveTo(5.7875f, 21.8484f, 7.2121f, 21.8483f, 8.0908f, 20.9697f)
                lineTo(12.9997f, 16.0607f)
                close()
                moveTo(9.5301f, 15.5304f)
                lineTo(8.0301f, 17.0304f)
                curveTo(7.7372f, 17.3233f, 7.2623f, 17.3233f, 6.9694f, 17.0304f)
                curveTo(6.6765f, 16.7375f, 6.6765f, 16.2626f, 6.9694f, 15.9697f)
                lineTo(8.4694f, 14.4697f)
                curveTo(8.7623f, 14.1768f, 9.2372f, 14.1768f, 9.5301f, 14.4697f)
                curveTo(9.823f, 14.7626f, 9.823f, 15.2375f, 9.5301f, 15.5304f)
                close()
            }
        }
        .build()
        return _flashlightOff!!
    }

private var _flashlightOff: ImageVector? = null
