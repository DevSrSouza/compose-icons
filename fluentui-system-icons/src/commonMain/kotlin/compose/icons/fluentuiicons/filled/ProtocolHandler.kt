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

public val FilledGroup.ProtocolHandler: ImageVector
    get() {
        if (_protocolHandler != null) {
            return _protocolHandler!!
        }
        _protocolHandler = Builder(name = "ProtocolHandler", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4819f, 17.7319f)
                lineTo(12.7067f, 16.9567f)
                lineTo(15.189f, 14.4745f)
                curveTo(16.5558f, 13.1077f, 16.5558f, 10.8916f, 15.189f, 9.5247f)
                lineTo(12.7067f, 7.0425f)
                lineTo(13.4819f, 6.2674f)
                curveTo(14.4582f, 5.2911f, 16.0411f, 5.2911f, 17.0174f, 6.2674f)
                lineTo(20.9819f, 10.2319f)
                curveTo(21.9582f, 11.2082f, 21.9582f, 12.7911f, 20.9819f, 13.7674f)
                lineTo(17.0174f, 17.7319f)
                curveTo(16.0411f, 18.7082f, 14.4582f, 18.7082f, 13.4819f, 17.7319f)
                close()
                moveTo(14.4819f, 13.7674f)
                curveTo(15.4582f, 12.7911f, 15.4582f, 11.2082f, 14.4819f, 10.2319f)
                lineTo(10.5174f, 6.2674f)
                curveTo(9.5411f, 5.2911f, 7.9582f, 5.2911f, 6.9819f, 6.2674f)
                lineTo(3.0174f, 10.2319f)
                curveTo(2.0411f, 11.2082f, 2.0411f, 12.7911f, 3.0174f, 13.7674f)
                lineTo(6.9819f, 17.7319f)
                curveTo(7.9582f, 18.7082f, 9.5411f, 18.7082f, 10.5174f, 17.7319f)
                lineTo(14.4819f, 13.7674f)
                close()
            }
        }
        .build()
        return _protocolHandler!!
    }

private var _protocolHandler: ImageVector? = null
