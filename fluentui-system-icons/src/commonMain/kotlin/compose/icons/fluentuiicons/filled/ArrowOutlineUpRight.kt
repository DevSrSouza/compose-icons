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

public val FilledGroup.ArrowOutlineUpRight: ImageVector
    get() {
        if (_arrowOutlineUpRight != null) {
            return _arrowOutlineUpRight!!
        }
        _arrowOutlineUpRight = Builder(name = "ArrowOutlineUpRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
