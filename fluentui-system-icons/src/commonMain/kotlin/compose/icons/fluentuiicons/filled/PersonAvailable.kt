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

public val FilledGroup.PersonAvailable: ImageVector
    get() {
        if (_personAvailable != null) {
            return _personAvailable!!
        }
        _personAvailable = Builder(name = "PersonAvailable", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.4999f, 12.0003f)
                curveTo(20.5374f, 12.0003f, 22.9999f, 14.4627f, 22.9999f, 17.5003f)
                curveTo(22.9999f, 20.5378f, 20.5374f, 23.0003f, 17.4999f, 23.0003f)
                curveTo(14.4623f, 23.0003f, 11.9999f, 20.5378f, 11.9999f, 17.5003f)
                curveTo(11.9999f, 14.4627f, 14.4623f, 12.0003f, 17.4999f, 12.0003f)
                close()
                moveTo(12.0221f, 13.9996f)
                curveTo(11.375f, 15.01f, 10.9999f, 16.2113f, 10.9999f, 17.5003f)
                curveTo(10.9999f, 19.1306f, 11.6001f, 20.6207f, 12.5916f, 21.7618f)
                curveTo(11.7961f, 21.9219f, 10.9312f, 22.0013f, 9.9999f, 22.0013f)
                curveTo(6.5789f, 22.0013f, 4.056f, 20.9292f, 2.5138f, 18.7648f)
                curveTo(2.1818f, 18.2989f, 2.0034f, 17.7411f, 2.0034f, 17.169f)
                verticalLineTo(16.2491f)
                curveTo(2.0034f, 15.007f, 3.0103f, 14.0002f, 4.2523f, 14.0002f)
                lineTo(12.0221f, 13.9996f)
                close()
                moveTo(14.8534f, 17.1467f)
                curveTo(14.6582f, 16.9514f, 14.3416f, 16.9514f, 14.1463f, 17.1467f)
                curveTo(13.9511f, 17.342f, 13.9511f, 17.6586f, 14.1463f, 17.8538f)
                lineTo(16.1463f, 19.8538f)
                curveTo(16.3416f, 20.0491f, 16.6582f, 20.0491f, 16.8534f, 19.8538f)
                lineTo(20.8534f, 15.8538f)
                curveTo(21.0487f, 15.6586f, 21.0487f, 15.342f, 20.8534f, 15.1467f)
                curveTo(20.6582f, 14.9514f, 20.3416f, 14.9514f, 20.1463f, 15.1467f)
                lineTo(16.4999f, 18.7931f)
                lineTo(14.8534f, 17.1467f)
                close()
                moveTo(9.9999f, 2.0049f)
                curveTo(12.7613f, 2.0049f, 14.9999f, 4.2435f, 14.9999f, 7.0049f)
                curveTo(14.9999f, 9.7663f, 12.7613f, 12.0049f, 9.9999f, 12.0049f)
                curveTo(7.2385f, 12.0049f, 4.9999f, 9.7663f, 4.9999f, 7.0049f)
                curveTo(4.9999f, 4.2435f, 7.2385f, 2.0049f, 9.9999f, 2.0049f)
                close()
            }
        }
        .build()
        return _personAvailable!!
    }

private var _personAvailable: ImageVector? = null
