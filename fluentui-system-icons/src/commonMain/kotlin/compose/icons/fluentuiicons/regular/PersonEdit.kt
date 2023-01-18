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

public val RegularGroup.PersonEdit: ImageVector
    get() {
        if (_personEdit != null) {
            return _personEdit!!
        }
        _personEdit = Builder(name = "PersonEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8555f, 15.5002f)
                lineTo(16.3555f, 14.0002f)
                horizontalLineTo(6.2528f)
                curveTo(5.0108f, 14.0002f, 4.0039f, 15.007f, 4.0039f, 16.2491f)
                verticalLineTo(16.8267f)
                curveTo(4.0039f, 17.7195f, 4.3224f, 18.583f, 4.9022f, 19.2619f)
                curveTo(6.2979f, 20.8964f, 8.3446f, 21.7932f, 10.9999f, 21.9691f)
                curveTo(10.9958f, 21.7863f, 11.016f, 21.5982f, 11.0636f, 21.4078f)
                lineTo(11.2946f, 20.484f)
                curveTo(8.9212f, 20.3643f, 7.1858f, 19.6262f, 6.0429f, 18.2878f)
                curveTo(5.695f, 17.8805f, 5.5039f, 17.3624f, 5.5039f, 16.8267f)
                verticalLineTo(16.2491f)
                curveTo(5.5039f, 15.8355f, 5.8392f, 15.5002f, 6.2528f, 15.5002f)
                horizontalLineTo(14.8555f)
                close()
                moveTo(12.0004f, 2.0049f)
                curveTo(14.7618f, 2.0049f, 17.0004f, 4.2435f, 17.0004f, 7.0049f)
                curveTo(17.0004f, 9.7663f, 14.7618f, 12.0049f, 12.0004f, 12.0049f)
                curveTo(9.2389f, 12.0049f, 7.0004f, 9.7663f, 7.0004f, 7.0049f)
                curveTo(7.0004f, 4.2435f, 9.2389f, 2.0049f, 12.0004f, 2.0049f)
                close()
                moveTo(12.0004f, 3.5049f)
                curveTo(10.0674f, 3.5049f, 8.5004f, 5.0719f, 8.5004f, 7.0049f)
                curveTo(8.5004f, 8.9379f, 10.0674f, 10.5049f, 12.0004f, 10.5049f)
                curveTo(13.9334f, 10.5049f, 15.5004f, 8.9379f, 15.5004f, 7.0049f)
                curveTo(15.5004f, 5.0719f, 13.9334f, 3.5049f, 12.0004f, 3.5049f)
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
