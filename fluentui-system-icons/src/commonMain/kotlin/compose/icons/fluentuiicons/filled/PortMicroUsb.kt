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

public val FilledGroup.PortMicroUsb: ImageVector
    get() {
        if (_portMicroUsb != null) {
            return _portMicroUsb!!
        }
        _portMicroUsb = Builder(name = "PortMicroUsb", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 12.83f)
                verticalLineTo(13.0f)
                curveTo(18.9984f, 13.53f, 18.7872f, 14.0378f, 18.4125f, 14.4125f)
                curveTo(18.0378f, 14.7872f, 17.53f, 14.9984f, 17.0f, 15.0f)
                horizontalLineTo(7.0f)
                curveTo(6.47f, 14.9984f, 5.9622f, 14.7872f, 5.5875f, 14.4125f)
                curveTo(5.2128f, 14.0378f, 5.0016f, 13.53f, 5.0f, 13.0f)
                verticalLineTo(12.83f)
                curveTo(5.0001f, 12.5661f, 5.0523f, 12.3049f, 5.1536f, 12.0612f)
                curveTo(5.2548f, 11.8176f, 5.4031f, 11.5963f, 5.59f, 11.41f)
                lineTo(7.41f, 9.59f)
                curveTo(7.5963f, 9.4031f, 7.8176f, 9.2548f, 8.0612f, 9.1536f)
                curveTo(8.3049f, 9.0523f, 8.5661f, 9.0001f, 8.83f, 9.0f)
                horizontalLineTo(15.17f)
                curveTo(15.4339f, 9.0001f, 15.6951f, 9.0523f, 15.9388f, 9.1536f)
                curveTo(16.1824f, 9.2548f, 16.4037f, 9.4031f, 16.59f, 9.59f)
                lineTo(18.41f, 11.41f)
                curveTo(18.5969f, 11.5963f, 18.7452f, 11.8176f, 18.8465f, 12.0612f)
                curveTo(18.9477f, 12.3049f, 18.9999f, 12.5661f, 19.0f, 12.83f)
                close()
            }
        }
        .build()
        return _portMicroUsb!!
    }

private var _portMicroUsb: ImageVector? = null
