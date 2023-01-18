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

public val RegularGroup.PersonAvailable: ImageVector
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
                moveTo(12.0221f, 13.9996f)
                curveTo(11.7254f, 14.4629f, 11.4859f, 14.9663f, 11.3135f, 15.4999f)
                lineTo(4.2523f, 15.5002f)
                curveTo(3.8387f, 15.5002f, 3.5034f, 15.8355f, 3.5034f, 16.2491f)
                verticalLineTo(16.8267f)
                curveTo(3.5034f, 17.3624f, 3.6945f, 17.8805f, 4.0424f, 18.2878f)
                curveTo(5.2957f, 19.7555f, 7.2616f, 20.5013f, 9.9999f, 20.5013f)
                curveTo(10.5963f, 20.5013f, 11.1562f, 20.4659f, 11.6801f, 20.3954f)
                curveTo(11.9253f, 20.8903f, 12.2328f, 21.3489f, 12.5916f, 21.7618f)
                curveTo(11.7961f, 21.922f, 10.9312f, 22.0013f, 9.9999f, 22.0013f)
                curveTo(6.854f, 22.0013f, 4.468f, 21.0962f, 2.9017f, 19.2619f)
                curveTo(2.3219f, 18.583f, 2.0034f, 17.7195f, 2.0034f, 16.8267f)
                verticalLineTo(16.2491f)
                curveTo(2.0034f, 15.007f, 3.0103f, 14.0002f, 4.2523f, 14.0002f)
                lineTo(12.0221f, 13.9996f)
                close()
                moveTo(9.9999f, 2.0049f)
                curveTo(12.7613f, 2.0049f, 14.9999f, 4.2435f, 14.9999f, 7.0049f)
                curveTo(14.9999f, 9.7663f, 12.7613f, 12.0049f, 9.9999f, 12.0049f)
                curveTo(7.2385f, 12.0049f, 4.9999f, 9.7663f, 4.9999f, 7.0049f)
                curveTo(4.9999f, 4.2435f, 7.2385f, 2.0049f, 9.9999f, 2.0049f)
                close()
                moveTo(9.9999f, 3.5049f)
                curveTo(8.0669f, 3.5049f, 6.4999f, 5.0719f, 6.4999f, 7.0049f)
                curveTo(6.4999f, 8.9379f, 8.0669f, 10.5049f, 9.9999f, 10.5049f)
                curveTo(11.9329f, 10.5049f, 13.4999f, 8.9379f, 13.4999f, 7.0049f)
                curveTo(13.4999f, 5.0719f, 11.9329f, 3.5049f, 9.9999f, 3.5049f)
                close()
            }
        }
        .build()
        return _personAvailable!!
    }

private var _personAvailable: ImageVector? = null
