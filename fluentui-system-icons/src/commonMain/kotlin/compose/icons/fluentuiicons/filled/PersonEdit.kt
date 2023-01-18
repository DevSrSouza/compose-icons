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

public val FilledGroup.PersonEdit: ImageVector
    get() {
        if (_personEdit != null) {
            return _personEdit!!
        }
        _personEdit = Builder(name = "PersonEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.4906f, 17.865f)
                lineTo(16.3555f, 14.0002f)
                horizontalLineTo(6.2528f)
                curveTo(5.0108f, 14.0002f, 4.0039f, 15.007f, 4.0039f, 16.2491f)
                verticalLineTo(17.169f)
                curveTo(4.0039f, 17.7411f, 4.1823f, 18.2989f, 4.5143f, 18.7648f)
                curveTo(5.902f, 20.7125f, 8.084f, 21.7757f, 10.9999f, 21.9691f)
                curveTo(10.9958f, 21.7863f, 11.016f, 21.5982f, 11.0636f, 21.4078f)
                lineTo(11.5213f, 19.5771f)
                curveTo(11.6833f, 18.9291f, 12.0183f, 18.3373f, 12.4906f, 17.865f)
                close()
                moveTo(12.0004f, 2.0049f)
                curveTo(14.7618f, 2.0049f, 17.0004f, 4.2435f, 17.0004f, 7.0049f)
                curveTo(17.0004f, 9.7663f, 14.7618f, 12.0049f, 12.0004f, 12.0049f)
                curveTo(9.2389f, 12.0049f, 7.0004f, 9.7663f, 7.0004f, 7.0049f)
                curveTo(7.0004f, 4.2435f, 9.2389f, 2.0049f, 12.0004f, 2.0049f)
                close()
                moveTo(19.0999f, 12.6695f)
                lineTo(13.1974f, 18.5719f)
                curveTo(12.8533f, 18.916f, 12.6092f, 19.3472f, 12.4911f, 19.8194f)
                lineTo(12.0334f, 21.6501f)
                curveTo(11.8344f, 22.4462f, 12.5556f, 23.1674f, 13.3517f, 22.9683f)
                lineTo(15.1824f, 22.5106f)
                curveTo(15.6545f, 22.3926f, 16.0857f, 22.1485f, 16.4299f, 21.8043f)
                lineTo(22.3323f, 15.9019f)
                curveTo(23.2249f, 15.0093f, 23.2249f, 13.5621f, 22.3323f, 12.6695f)
                curveTo(21.4397f, 11.7768f, 19.9925f, 11.7768f, 19.0999f, 12.6695f)
                close()
            }
        }
        .build()
        return _personEdit!!
    }

private var _personEdit: ImageVector? = null
