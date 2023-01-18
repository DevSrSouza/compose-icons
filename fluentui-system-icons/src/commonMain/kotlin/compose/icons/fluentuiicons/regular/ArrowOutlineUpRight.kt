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

public val RegularGroup.ArrowOutlineUpRight: ImageVector
    get() {
        if (_arrowOutlineUpRight != null) {
            return _arrowOutlineUpRight!!
        }
        _arrowOutlineUpRight = Builder(name = "ArrowOutlineUpRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4951f, 4.0f)
                curveTo(20.5269f, 3.7134f, 20.2848f, 3.4712f, 19.9982f, 3.5031f)
                lineTo(7.9365f, 4.8432f)
                curveTo(7.5615f, 4.8849f, 7.4012f, 5.3419f, 7.668f, 5.6087f)
                lineTo(9.4658f, 7.4064f)
                curveTo(9.7587f, 7.6993f, 9.7587f, 8.1742f, 9.4658f, 8.4671f)
                lineTo(3.6318f, 14.3011f)
                curveTo(3.4561f, 14.4768f, 3.4561f, 14.7618f, 3.6318f, 14.9375f)
                lineTo(9.0609f, 20.3666f)
                curveTo(9.2367f, 20.5424f, 9.5216f, 20.5424f, 9.6973f, 20.3666f)
                lineTo(15.5313f, 14.5326f)
                curveTo(15.8242f, 14.2397f, 16.2991f, 14.2397f, 16.592f, 14.5326f)
                lineTo(18.3895f, 16.3301f)
                curveTo(18.6563f, 16.5969f, 19.1133f, 16.4366f, 19.1549f, 16.0616f)
                lineTo(20.4951f, 4.0f)
                close()
                moveTo(19.8325f, 2.0122f)
                curveTo(21.0745f, 1.8742f, 22.1239f, 2.9237f, 21.9859f, 4.1656f)
                lineTo(20.6457f, 16.2273f)
                curveTo(20.4652f, 17.8524f, 18.485f, 18.547f, 17.3288f, 17.3908f)
                lineTo(16.0617f, 16.1236f)
                lineTo(10.758f, 21.4273f)
                curveTo(9.9965f, 22.1888f, 8.7618f, 22.1888f, 8.0003f, 21.4273f)
                lineTo(2.5711f, 15.9982f)
                curveTo(1.8096f, 15.2366f, 1.8096f, 14.002f, 2.5711f, 13.2404f)
                lineTo(7.8748f, 7.9368f)
                lineTo(6.6074f, 6.6693f)
                curveTo(5.4512f, 5.5132f, 6.1458f, 3.533f, 7.7709f, 3.3524f)
                lineTo(19.8325f, 2.0122f)
                close()
            }
        }
        .build()
        return _arrowOutlineUpRight!!
    }

private var _arrowOutlineUpRight: ImageVector? = null
