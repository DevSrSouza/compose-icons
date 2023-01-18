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

public val RegularGroup.PinOff: ImageVector
    get() {
        if (_pinOff != null) {
            return _pinOff!!
        }
        _pinOff = Builder(name = "PinOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9875f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(8.1246f, 9.1853f)
                lineTo(4.8106f, 10.3301f)
                curveTo(3.9379f, 10.6315f, 3.682f, 11.7426f, 4.3349f, 12.3954f)
                lineTo(7.4394f, 15.4999f)
                lineTo(3.0001f, 19.9392f)
                lineTo(3.0f, 20.9999f)
                horizontalLineTo(4.0608f)
                lineTo(8.5001f, 16.5605f)
                lineTo(11.6046f, 19.665f)
                curveTo(12.2575f, 20.3179f, 13.3686f, 20.062f, 13.67f, 19.1893f)
                lineTo(14.8148f, 15.8755f)
                lineTo(20.7197f, 21.7803f)
                curveTo(21.0125f, 22.0732f, 21.4874f, 22.0732f, 21.7803f, 21.7803f)
                curveTo(22.0732f, 21.4874f, 22.0732f, 21.0126f, 21.7803f, 20.7197f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(13.6353f, 14.696f)
                lineTo(12.3827f, 18.3218f)
                lineTo(5.6782f, 11.6174f)
                lineTo(9.3041f, 10.3648f)
                lineTo(13.6353f, 14.696f)
                close()
                moveTo(19.6829f, 10.8201f)
                lineTo(15.8957f, 12.7137f)
                lineTo(17.0137f, 13.8317f)
                lineTo(20.3537f, 12.1617f)
                curveTo(22.0326f, 11.3223f, 22.3957f, 9.0848f, 21.0684f, 7.7575f)
                lineTo(16.2426f, 2.9318f)
                curveTo(14.9153f, 1.6045f, 12.6778f, 1.9676f, 11.8383f, 3.6465f)
                lineTo(10.1684f, 6.9864f)
                lineTo(11.2864f, 8.1044f)
                lineTo(13.18f, 4.3173f)
                curveTo(13.5616f, 3.5542f, 14.5786f, 3.3891f, 15.1819f, 3.9924f)
                lineTo(20.0078f, 8.8182f)
                curveTo(20.6111f, 9.4215f, 20.446f, 10.4385f, 19.6829f, 10.8201f)
                close()
            }
        }
        .build()
        return _pinOff!!
    }

private var _pinOff: ImageVector? = null
