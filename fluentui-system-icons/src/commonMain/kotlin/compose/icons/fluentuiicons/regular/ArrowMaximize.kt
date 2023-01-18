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

public val RegularGroup.ArrowMaximize: ImageVector
    get() {
        if (_arrowMaximize != null) {
            return _arrowMaximize!!
        }
        _arrowMaximize = Builder(name = "ArrowMaximize", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.748f, 3.002f)
                lineTo(20.3018f, 3.0025f)
                lineTo(20.402f, 3.0164f)
                lineTo(20.5009f, 3.044f)
                lineTo(20.562f, 3.0699f)
                curveTo(20.641f, 3.1048f, 20.7149f, 3.1553f, 20.7798f, 3.2203f)
                lineTo(20.8206f, 3.2643f)
                lineTo(20.8811f, 3.3458f)
                lineTo(20.9183f, 3.4108f)
                lineTo(20.957f, 3.5011f)
                lineTo(20.9761f, 3.5652f)
                lineTo(20.9897f, 3.6292f)
                lineTo(20.999f, 3.7224f)
                lineTo(20.9996f, 11.2558f)
                curveTo(20.9996f, 11.6701f, 20.6638f, 12.0058f, 20.2496f, 12.0058f)
                curveTo(19.8699f, 12.0058f, 19.5561f, 11.7237f, 19.5064f, 11.3576f)
                lineTo(19.4996f, 11.2558f)
                lineTo(19.499f, 5.5599f)
                lineTo(5.5591f, 19.505f)
                lineTo(11.2496f, 19.5058f)
                curveTo(11.6293f, 19.5058f, 11.9431f, 19.788f, 11.9927f, 20.1541f)
                lineTo(11.9996f, 20.2558f)
                curveTo(11.9996f, 20.6355f, 11.7174f, 20.9493f, 11.3513f, 20.999f)
                lineTo(11.2496f, 21.0058f)
                lineTo(3.7137f, 21.0051f)
                lineTo(3.6847f, 21.0022f)
                curveTo(3.6187f, 20.9976f, 3.556f, 20.9838f, 3.4967f, 20.9627f)
                lineTo(3.4065f, 20.9238f)
                lineTo(3.3894f, 20.9133f)
                curveTo(3.1852f, 20.8029f, 3.0387f, 20.5998f, 3.0053f, 20.3605f)
                lineTo(2.998f, 20.2558f)
                verticalLineTo(12.752f)
                curveTo(2.998f, 12.3377f, 3.3338f, 12.002f, 3.748f, 12.002f)
                curveTo(4.1277f, 12.002f, 4.4415f, 12.2841f, 4.4912f, 12.6502f)
                lineTo(4.4981f, 12.752f)
                verticalLineTo(18.444f)
                lineTo(18.438f, 4.5009f)
                lineTo(12.748f, 4.5019f)
                curveTo(12.3684f, 4.5019f, 12.0546f, 4.2198f, 12.0049f, 3.8537f)
                lineTo(11.998f, 3.752f)
                curveTo(11.998f, 3.3723f, 12.2802f, 3.0585f, 12.6463f, 3.0088f)
                lineTo(12.748f, 3.002f)
                close()
            }
        }
        .build()
        return _arrowMaximize!!
    }

private var _arrowMaximize: ImageVector? = null
