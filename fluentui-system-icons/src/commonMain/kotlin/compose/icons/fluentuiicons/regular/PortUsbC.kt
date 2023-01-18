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

public val RegularGroup.PortUsbC: ImageVector
    get() {
        if (_portUsbC != null) {
            return _portUsbC!!
        }
        _portUsbC = Builder(name = "PortUsbC", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 10.5f)
                curveTo(16.3978f, 10.5f, 16.7794f, 10.658f, 17.0607f, 10.9393f)
                curveTo(17.342f, 11.2206f, 17.5f, 11.6022f, 17.5f, 12.0f)
                curveTo(17.5f, 12.3978f, 17.342f, 12.7794f, 17.0607f, 13.0607f)
                curveTo(16.7794f, 13.342f, 16.3978f, 13.5f, 16.0f, 13.5f)
                horizontalLineTo(8.0f)
                curveTo(7.6022f, 13.5f, 7.2206f, 13.342f, 6.9393f, 13.0607f)
                curveTo(6.658f, 12.7794f, 6.5f, 12.3978f, 6.5f, 12.0f)
                curveTo(6.5f, 11.6022f, 6.658f, 11.2206f, 6.9393f, 10.9393f)
                curveTo(7.2206f, 10.658f, 7.6022f, 10.5f, 8.0f, 10.5f)
                horizontalLineTo(16.0f)
                close()
                moveTo(16.0f, 9.0f)
                horizontalLineTo(8.0f)
                curveTo(7.2043f, 9.0f, 6.4413f, 9.3161f, 5.8787f, 9.8787f)
                curveTo(5.3161f, 10.4413f, 5.0f, 11.2044f, 5.0f, 12.0f)
                curveTo(5.0f, 12.7956f, 5.3161f, 13.5587f, 5.8787f, 14.1213f)
                curveTo(6.4413f, 14.6839f, 7.2043f, 15.0f, 8.0f, 15.0f)
                horizontalLineTo(16.0f)
                curveTo(16.7956f, 15.0f, 17.5587f, 14.6839f, 18.1213f, 14.1213f)
                curveTo(18.6839f, 13.5587f, 19.0f, 12.7956f, 19.0f, 12.0f)
                curveTo(19.0f, 11.2044f, 18.6839f, 10.4413f, 18.1213f, 9.8787f)
                curveTo(17.5587f, 9.3161f, 16.7956f, 9.0f, 16.0f, 9.0f)
                close()
            }
        }
        .build()
        return _portUsbC!!
    }

private var _portUsbC: ImageVector? = null
