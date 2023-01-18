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

public val RegularGroup.CloudCheckmark: ImageVector
    get() {
        if (_cloudCheckmark != null) {
            return _cloudCheckmark!!
        }
        _cloudCheckmark = Builder(name = "CloudCheckmark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0866f, 7.75f)
                curveTo(6.561f, 5.0428f, 8.9246f, 3.0f, 11.75f, 3.0f)
                curveTo(14.5754f, 3.0f, 16.939f, 5.0428f, 17.4134f, 7.75f)
                lineTo(17.5f, 7.75f)
                curveTo(19.7091f, 7.75f, 21.5f, 9.5409f, 21.5f, 11.75f)
                curveTo(21.5f, 11.9371f, 21.4872f, 12.1212f, 21.4623f, 12.3015f)
                curveTo(21.0082f, 11.7654f, 20.4688f, 11.3038f, 19.8651f, 10.9378f)
                curveTo(19.5279f, 9.9558f, 18.5964f, 9.25f, 17.5f, 9.25f)
                lineTo(16.7439f, 9.25f)
                curveTo(16.344f, 9.25f, 16.0144f, 8.9363f, 15.9948f, 8.5369f)
                curveTo(15.8837f, 6.2813f, 14.018f, 4.5f, 11.75f, 4.5f)
                curveTo(9.482f, 4.5f, 7.6163f, 6.2813f, 7.5052f, 8.5369f)
                curveTo(7.4856f, 8.9363f, 7.156f, 9.25f, 6.7561f, 9.25f)
                lineTo(6.0f, 9.25f)
                curveTo(4.6193f, 9.25f, 3.5f, 10.3693f, 3.5f, 11.75f)
                curveTo(3.5f, 13.1307f, 4.6193f, 14.25f, 6.0f, 14.25f)
                horizontalLineTo(10.4f)
                curveTo(10.2242f, 14.7263f, 10.1027f, 15.2288f, 10.0428f, 15.75f)
                horizontalLineTo(6.0f)
                curveTo(3.7909f, 15.75f, 2.0f, 13.9591f, 2.0f, 11.75f)
                curveTo(2.0f, 9.5409f, 3.7909f, 7.75f, 6.0f, 7.75f)
                lineTo(6.0866f, 7.75f)
                close()
                moveTo(22.0f, 16.5f)
                curveTo(22.0f, 19.5376f, 19.5376f, 22.0f, 16.5f, 22.0f)
                curveTo(13.4624f, 22.0f, 11.0f, 19.5376f, 11.0f, 16.5f)
                curveTo(11.0f, 13.4624f, 13.4624f, 11.0f, 16.5f, 11.0f)
                curveTo(19.5376f, 11.0f, 22.0f, 13.4624f, 22.0f, 16.5f)
                close()
                moveTo(19.8536f, 14.1464f)
                curveTo(19.6583f, 13.9512f, 19.3417f, 13.9512f, 19.1464f, 14.1464f)
                lineTo(15.5f, 17.7929f)
                lineTo(13.8536f, 16.1464f)
                curveTo(13.6583f, 15.9512f, 13.3417f, 15.9512f, 13.1464f, 16.1464f)
                curveTo(12.9512f, 16.3417f, 12.9512f, 16.6583f, 13.1464f, 16.8536f)
                lineTo(15.1464f, 18.8536f)
                curveTo(15.3417f, 19.0488f, 15.6583f, 19.0488f, 15.8536f, 18.8536f)
                lineTo(19.8536f, 14.8536f)
                curveTo(20.0488f, 14.6583f, 20.0488f, 14.3417f, 19.8536f, 14.1464f)
                close()
            }
        }
        .build()
        return _cloudCheckmark!!
    }

private var _cloudCheckmark: ImageVector? = null
