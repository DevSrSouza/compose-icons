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

public val FilledGroup.PlugDisconnected: ImageVector
    get() {
        if (_plugDisconnected != null) {
            return _plugDisconnected!!
        }
        _plugDisconnected = Builder(name = "PlugDisconnected", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7071f, 3.7071f)
                curveTo(22.0976f, 3.3166f, 22.0976f, 2.6834f, 21.7071f, 2.2929f)
                curveTo(21.3166f, 1.9024f, 20.6834f, 1.9024f, 20.2929f, 2.2929f)
                lineTo(18.4955f, 4.0903f)
                curveTo(16.8554f, 3.0679f, 14.6699f, 3.2693f, 13.2448f, 4.6945f)
                lineTo(12.1767f, 5.7625f)
                curveTo(11.4933f, 6.4459f, 11.4933f, 7.554f, 12.1767f, 8.2374f)
                lineTo(15.7625f, 11.8232f)
                curveTo(16.446f, 12.5066f, 17.554f, 12.5066f, 18.2374f, 11.8232f)
                lineTo(19.3054f, 10.7552f)
                curveTo(20.7306f, 9.33f, 20.932f, 7.1446f, 19.9097f, 5.5045f)
                lineTo(21.7071f, 3.7071f)
                close()
                moveTo(10.7071f, 11.7071f)
                curveTo(11.0976f, 11.3166f, 11.0976f, 10.6834f, 10.7071f, 10.2929f)
                curveTo(10.3166f, 9.9024f, 9.6834f, 9.9024f, 9.2929f, 10.2929f)
                lineTo(7.8232f, 11.7626f)
                lineTo(7.5304f, 11.4697f)
                curveTo(7.2375f, 11.1768f, 6.7626f, 11.1768f, 6.4697f, 11.4697f)
                lineTo(4.6946f, 13.2448f)
                curveTo(3.2694f, 14.6699f, 3.068f, 16.8554f, 4.0903f, 18.4955f)
                lineTo(2.2929f, 20.2929f)
                curveTo(1.9024f, 20.6834f, 1.9024f, 21.3166f, 2.2929f, 21.7071f)
                curveTo(2.6834f, 22.0976f, 3.3166f, 22.0976f, 3.7071f, 21.7071f)
                lineTo(5.5045f, 19.9097f)
                curveTo(7.1446f, 20.932f, 9.3301f, 20.7306f, 10.7552f, 19.3055f)
                lineTo(12.5303f, 17.5303f)
                curveTo(12.8232f, 17.2374f, 12.8232f, 16.7626f, 12.5303f, 16.4697f)
                lineTo(12.2374f, 16.1768f)
                lineTo(13.7071f, 14.7071f)
                curveTo(14.0976f, 14.3166f, 14.0976f, 13.6834f, 13.7071f, 13.2929f)
                curveTo(13.3166f, 12.9024f, 12.6834f, 12.9024f, 12.2929f, 13.2929f)
                lineTo(10.8232f, 14.7626f)
                lineTo(9.2374f, 13.1768f)
                lineTo(10.7071f, 11.7071f)
                close()
            }
        }
        .build()
        return _plugDisconnected!!
    }

private var _plugDisconnected: ImageVector? = null
