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

public val RegularGroup.PortMicroUsb: ImageVector
    get() {
        if (_portMicroUsb != null) {
            return _portMicroUsb!!
        }
        _portMicroUsb = Builder(name = "PortMicroUsb", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.1716f, 10.5f)
                curveTo(15.2373f, 10.4998f, 15.3023f, 10.5127f, 15.363f, 10.5378f)
                curveTo(15.4237f, 10.563f, 15.4788f, 10.5999f, 15.5252f, 10.6465f)
                lineTo(17.3535f, 12.4748f)
                curveTo(17.4001f, 12.5212f, 17.437f, 12.5763f, 17.4622f, 12.637f)
                curveTo(17.4873f, 12.6977f, 17.5002f, 12.7627f, 17.5f, 12.8284f)
                verticalLineTo(13.0f)
                curveTo(17.4998f, 13.1326f, 17.4471f, 13.2597f, 17.3534f, 13.3534f)
                curveTo(17.2597f, 13.4471f, 17.1326f, 13.4998f, 17.0f, 13.5f)
                horizontalLineTo(7.0f)
                curveTo(6.8674f, 13.4998f, 6.7403f, 13.4471f, 6.6466f, 13.3534f)
                curveTo(6.5529f, 13.2597f, 6.5002f, 13.1326f, 6.5f, 13.0f)
                verticalLineTo(12.8284f)
                curveTo(6.4998f, 12.7627f, 6.5127f, 12.6977f, 6.5378f, 12.637f)
                curveTo(6.563f, 12.5763f, 6.5999f, 12.5212f, 6.6465f, 12.4748f)
                lineTo(8.4748f, 10.6465f)
                curveTo(8.5212f, 10.5999f, 8.5763f, 10.563f, 8.637f, 10.5378f)
                curveTo(8.6977f, 10.5127f, 8.7627f, 10.4998f, 8.8284f, 10.5f)
                horizontalLineTo(15.1716f)
                close()
                moveTo(15.1716f, 9.0f)
                horizontalLineTo(8.8284f)
                curveTo(8.5658f, 9.0f, 8.3057f, 9.0517f, 8.063f, 9.1522f)
                curveTo(7.8204f, 9.2528f, 7.5999f, 9.4001f, 7.4142f, 9.5858f)
                lineTo(5.5858f, 11.4142f)
                curveTo(5.4001f, 11.5999f, 5.2528f, 11.8204f, 5.1522f, 12.063f)
                curveTo(5.0517f, 12.3057f, 5.0f, 12.5658f, 5.0f, 12.8284f)
                verticalLineTo(13.0f)
                curveTo(5.0f, 13.5304f, 5.2107f, 14.0391f, 5.5858f, 14.4142f)
                curveTo(5.9609f, 14.7893f, 6.4696f, 15.0f, 7.0f, 15.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5304f, 15.0f, 18.0391f, 14.7893f, 18.4142f, 14.4142f)
                curveTo(18.7893f, 14.0391f, 19.0f, 13.5304f, 19.0f, 13.0f)
                verticalLineTo(12.8284f)
                curveTo(19.0f, 12.5658f, 18.9483f, 12.3057f, 18.8478f, 12.063f)
                curveTo(18.7472f, 11.8204f, 18.5999f, 11.5999f, 18.4142f, 11.4142f)
                lineTo(16.5858f, 9.5858f)
                curveTo(16.4001f, 9.4001f, 16.1796f, 9.2528f, 15.937f, 9.1522f)
                curveTo(15.6943f, 9.0517f, 15.4342f, 9.0f, 15.1716f, 9.0f)
                close()
            }
        }
        .build()
        return _portMicroUsb!!
    }

private var _portMicroUsb: ImageVector? = null
