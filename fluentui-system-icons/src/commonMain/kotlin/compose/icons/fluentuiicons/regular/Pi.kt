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

public val RegularGroup.Pi: ImageVector
    get() {
        if (_pi != null) {
            return _pi!!
        }
        _pi = Builder(name = "Pi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 6.75f)
                curveTo(2.5f, 5.2312f, 3.7312f, 4.0f, 5.25f, 4.0f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 4.0f, 21.0f, 4.3358f, 21.0f, 4.75f)
                curveTo(21.0f, 5.1642f, 20.6642f, 5.5f, 20.25f, 5.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.9525f)
                curveTo(17.0f, 18.1627f, 18.1989f, 19.0076f, 19.3386f, 18.6005f)
                lineTo(19.4977f, 18.5437f)
                curveTo(19.8878f, 18.4044f, 20.317f, 18.6077f, 20.4563f, 18.9977f)
                curveTo(20.5956f, 19.3878f, 20.3923f, 19.817f, 20.0023f, 19.9563f)
                lineTo(19.8431f, 20.0131f)
                curveTo(17.7266f, 20.7691f, 15.5f, 19.2f, 15.5f, 16.9525f)
                verticalLineTo(5.5f)
                horizontalLineTo(9.494f)
                curveTo(9.4896f, 5.7396f, 9.4818f, 6.0591f, 9.4682f, 6.4444f)
                curveTo(9.4366f, 7.3412f, 9.3735f, 8.5968f, 9.2471f, 10.0344f)
                curveTo(8.9955f, 12.8961f, 8.4893f, 16.5325f, 7.4583f, 19.4964f)
                curveTo(7.3223f, 19.8876f, 6.8948f, 20.0944f, 6.5036f, 19.9584f)
                curveTo(6.1123f, 19.8223f, 5.9055f, 19.3948f, 6.0416f, 19.0036f)
                curveTo(7.0107f, 16.2175f, 7.5044f, 12.7289f, 7.7528f, 9.9031f)
                curveTo(7.8765f, 8.4969f, 7.9383f, 7.2682f, 7.9692f, 6.3916f)
                curveTo(7.9819f, 6.03f, 7.9894f, 5.7288f, 7.9938f, 5.5f)
                horizontalLineTo(5.25f)
                curveTo(4.5596f, 5.5f, 4.0f, 6.0596f, 4.0f, 6.75f)
                verticalLineTo(7.25f)
                curveTo(4.0f, 7.6642f, 3.6642f, 8.0f, 3.25f, 8.0f)
                curveTo(2.8358f, 8.0f, 2.5f, 7.6642f, 2.5f, 7.25f)
                verticalLineTo(6.75f)
                close()
            }
        }
        .build()
        return _pi!!
    }

private var _pi: ImageVector? = null
