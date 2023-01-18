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

public val FilledGroup.Warning: ImageVector
    get() {
        if (_warning != null) {
            return _warning!!
        }
        _warning = Builder(name = "Warning", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0297f, 3.6589f)
                curveTo(10.8859f, 2.1111f, 13.1111f, 2.1111f, 13.9673f, 3.6589f)
                lineTo(21.7131f, 17.6603f)
                curveTo(22.5427f, 19.16f, 21.4581f, 20.9995f, 19.7443f, 20.9995f)
                horizontalLineTo(4.2532f)
                curveTo(2.5394f, 20.9995f, 1.4548f, 19.16f, 2.2844f, 17.6604f)
                lineTo(10.0297f, 3.6589f)
                close()
                moveTo(12.9973f, 17.0009f)
                curveTo(12.9973f, 16.4494f, 12.5502f, 16.0022f, 11.9987f, 16.0022f)
                curveTo(11.4471f, 16.0022f, 11.0f, 16.4494f, 11.0f, 17.0009f)
                curveTo(11.0f, 17.5524f, 11.4471f, 17.9996f, 11.9987f, 17.9996f)
                curveTo(12.5502f, 17.9996f, 12.9973f, 17.5524f, 12.9973f, 17.0009f)
                close()
                moveTo(12.7381f, 9.1476f)
                curveTo(12.6882f, 8.7816f, 12.3742f, 8.4997f, 11.9945f, 8.5f)
                curveTo(11.5802f, 8.5003f, 11.2447f, 8.8364f, 11.2451f, 9.2506f)
                lineTo(11.2487f, 13.7522f)
                lineTo(11.2556f, 13.854f)
                curveTo(11.3055f, 14.22f, 11.6196f, 14.5019f, 11.9993f, 14.5016f)
                curveTo(12.4135f, 14.5013f, 12.749f, 14.1652f, 12.7487f, 13.751f)
                lineTo(12.7451f, 9.2494f)
                lineTo(12.7381f, 9.1476f)
                close()
            }
        }
        .build()
        return _warning!!
    }

private var _warning: ImageVector? = null
