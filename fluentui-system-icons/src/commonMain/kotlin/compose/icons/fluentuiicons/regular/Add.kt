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

public val RegularGroup.Add: ImageVector
    get() {
        if (_add != null) {
            return _add!!
        }
        _add = Builder(name = "Add", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.7498f, 3.0f)
                curveTo(12.1295f, 3.0f, 12.4434f, 3.282f, 12.4931f, 3.6481f)
                lineTo(12.5f, 3.7499f)
                lineTo(12.5012f, 11.0f)
                horizontalLineTo(19.7543f)
                curveTo(20.1685f, 11.0f, 20.5043f, 11.3358f, 20.5043f, 11.75f)
                curveTo(20.5043f, 12.1297f, 20.2221f, 12.4435f, 19.8561f, 12.4932f)
                lineTo(19.7543f, 12.5f)
                horizontalLineTo(12.5012f)
                lineTo(12.5032f, 19.7491f)
                curveTo(12.5033f, 20.1633f, 12.1676f, 20.4993f, 11.7534f, 20.4993f)
                curveTo(11.3737f, 20.4993f, 11.0598f, 20.2173f, 11.0101f, 19.8512f)
                lineTo(11.0032f, 19.7494f)
                lineTo(11.0012f, 12.5f)
                horizontalLineTo(3.7522f)
                curveTo(3.338f, 12.5f, 3.0022f, 12.1642f, 3.0022f, 11.75f)
                curveTo(3.0022f, 11.3703f, 3.2843f, 11.0565f, 3.6504f, 11.0068f)
                lineTo(3.7522f, 11.0f)
                horizontalLineTo(11.0012f)
                lineTo(11.0f, 3.7501f)
                curveTo(10.9999f, 3.3359f, 11.3356f, 3.0f, 11.7498f, 3.0f)
                close()
            }
        }
        .build()
        return _add!!
    }

private var _add: ImageVector? = null
