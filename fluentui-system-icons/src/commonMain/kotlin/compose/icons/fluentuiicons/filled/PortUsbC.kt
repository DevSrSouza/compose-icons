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

public val FilledGroup.PortUsbC: ImageVector
    get() {
        if (_portUsbC != null) {
            return _portUsbC!!
        }
        _portUsbC = Builder(name = "PortUsbC", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 12.0f)
                curveTo(19.0005f, 12.3941f, 18.9233f, 12.7845f, 18.7727f, 13.1487f)
                curveTo(18.6221f, 13.5129f, 18.4012f, 13.8438f, 18.1225f, 14.1225f)
                curveTo(17.8438f, 14.4012f, 17.5129f, 14.6221f, 17.1487f, 14.7727f)
                curveTo(16.7845f, 14.9233f, 16.3941f, 15.0005f, 16.0f, 15.0f)
                horizontalLineTo(8.0f)
                curveTo(7.2043f, 15.0f, 6.4413f, 14.6839f, 5.8787f, 14.1213f)
                curveTo(5.3161f, 13.5587f, 5.0f, 12.7957f, 5.0f, 12.0f)
                curveTo(5.0f, 11.2044f, 5.3161f, 10.4413f, 5.8787f, 9.8787f)
                curveTo(6.4413f, 9.3161f, 7.2043f, 9.0f, 8.0f, 9.0f)
                horizontalLineTo(16.0f)
                curveTo(16.3941f, 8.9995f, 16.7845f, 9.0767f, 17.1487f, 9.2273f)
                curveTo(17.5129f, 9.3779f, 17.8438f, 9.5988f, 18.1225f, 9.8775f)
                curveTo(18.4012f, 10.1562f, 18.6221f, 10.4871f, 18.7727f, 10.8513f)
                curveTo(18.9233f, 11.2155f, 19.0005f, 11.6059f, 19.0f, 12.0f)
                close()
            }
        }
        .build()
        return _portUsbC!!
    }

private var _portUsbC: ImageVector? = null
