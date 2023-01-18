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

public val FilledGroup.FlashCheckmark: ImageVector
    get() {
        if (_flashCheckmark != null) {
            return _flashCheckmark!!
        }
        _flashCheckmark = Builder(name = "FlashCheckmark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.4241f, 2.8305f)
                curveTo(7.6015f, 2.3325f, 8.073f, 2.0f, 8.6016f, 2.0f)
                horizontalLineTo(15.0552f)
                curveTo(15.9084f, 2.0f, 16.5109f, 2.8359f, 16.2411f, 3.6453f)
                lineTo(14.7895f, 8.0f)
                horizontalLineTo(18.7483f)
                curveTo(19.8524f, 8.0f, 20.4143f, 9.3268f, 19.646f, 10.1198f)
                lineTo(18.6882f, 11.1084f)
                curveTo(18.303f, 11.0372f, 17.9058f, 11.0f, 17.5f, 11.0f)
                curveTo(13.9101f, 11.0f, 11.0f, 13.9101f, 11.0f, 17.5f)
                curveTo(11.0f, 17.977f, 11.0514f, 18.442f, 11.1489f, 18.8898f)
                lineTo(8.585f, 21.536f)
                curveTo(7.5313f, 22.6236f, 5.7131f, 21.6422f, 6.044f, 20.1645f)
                lineTo(7.3132f, 14.4964f)
                lineTo(5.7448f, 14.4904f)
                curveTo(4.538f, 14.4858f, 3.698f, 13.2899f, 4.1029f, 12.1532f)
                lineTo(7.4241f, 2.8305f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 14.4624f, 20.5376f, 12.0f, 17.5f, 12.0f)
                curveTo(14.4624f, 12.0f, 12.0f, 14.4624f, 12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 14.4624f, 23.0f, 17.5f, 23.0f)
                curveTo(20.5376f, 23.0f, 23.0f, 20.5376f, 23.0f, 17.5f)
                close()
                moveTo(20.8536f, 15.1464f)
                curveTo(21.0488f, 15.3417f, 21.0488f, 15.6583f, 20.8536f, 15.8536f)
                lineTo(16.8536f, 19.8536f)
                curveTo(16.6583f, 20.0488f, 16.3417f, 20.0488f, 16.1464f, 19.8536f)
                lineTo(14.1464f, 17.8536f)
                curveTo(13.9512f, 17.6583f, 13.9512f, 17.3417f, 14.1464f, 17.1464f)
                curveTo(14.3417f, 16.9512f, 14.6583f, 16.9512f, 14.8536f, 17.1464f)
                lineTo(16.5f, 18.7929f)
                lineTo(20.1464f, 15.1464f)
                curveTo(20.3417f, 14.9512f, 20.6583f, 14.9512f, 20.8536f, 15.1464f)
                close()
            }
        }
        .build()
        return _flashCheckmark!!
    }

private var _flashCheckmark: ImageVector? = null
