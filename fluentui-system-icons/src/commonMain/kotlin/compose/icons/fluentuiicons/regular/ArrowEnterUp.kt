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

public val RegularGroup.ArrowEnterUp: ImageVector
    get() {
        if (_arrowEnterUp != null) {
            return _arrowEnterUp!!
        }
        _arrowEnterUp = Builder(name = "ArrowEnterUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 21.2506f)
                curveTo(20.0f, 21.6648f, 19.6642f, 22.0006f, 19.25f, 22.0006f)
                lineTo(12.75f, 22.0006f)
                curveTo(10.6789f, 22.0006f, 9.0f, 20.3216f, 9.0f, 18.2506f)
                lineTo(9.0f, 4.5864f)
                lineTo(5.2803f, 8.3057f)
                curveTo(5.0141f, 8.572f, 4.5974f, 8.5962f, 4.3038f, 8.3783f)
                lineTo(4.2197f, 8.3057f)
                curveTo(3.9534f, 8.0394f, 3.9292f, 7.6228f, 4.147f, 7.3292f)
                lineTo(4.2197f, 7.2451f)
                lineTo(9.2197f, 2.2451f)
                curveTo(9.4859f, 1.9788f, 9.9026f, 1.9546f, 10.1962f, 2.1724f)
                lineTo(10.2803f, 2.2451f)
                lineTo(15.2803f, 7.2451f)
                curveTo(15.5732f, 7.538f, 15.5732f, 8.0128f, 15.2803f, 8.3057f)
                curveTo(15.0141f, 8.572f, 14.5974f, 8.5962f, 14.3038f, 8.3783f)
                lineTo(14.2197f, 8.3057f)
                lineTo(10.5f, 4.5864f)
                lineTo(10.5f, 18.2506f)
                curveTo(10.5f, 19.4414f, 11.4252f, 20.4162f, 12.596f, 20.4954f)
                lineTo(12.75f, 20.5006f)
                lineTo(19.25f, 20.5006f)
                curveTo(19.6642f, 20.5006f, 20.0f, 20.8363f, 20.0f, 21.2506f)
                close()
            }
        }
        .build()
        return _arrowEnterUp!!
    }

private var _arrowEnterUp: ImageVector? = null
