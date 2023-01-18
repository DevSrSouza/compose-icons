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

public val FilledGroup.ArrowForwardDownPerson: ImageVector
    get() {
        if (_arrowForwardDownPerson != null) {
            return _arrowForwardDownPerson!!
        }
        _arrowForwardDownPerson = Builder(name = "ArrowForwardDownPerson", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2958f, 5.7055f)
                curveTo(15.9055f, 5.3147f, 15.906f, 4.6816f, 16.2968f, 4.2913f)
                curveTo(16.6876f, 3.9011f, 17.3207f, 3.9015f, 17.711f, 4.2923f)
                lineTo(22.7076f, 9.2957f)
                curveTo(23.0976f, 9.6863f, 23.0974f, 10.319f, 22.7072f, 10.7094f)
                lineTo(17.7106f, 15.707f)
                curveTo(17.3201f, 16.0976f, 16.6869f, 16.0977f, 16.2964f, 15.7072f)
                curveTo(15.9058f, 15.3167f, 15.9057f, 14.6835f, 16.2962f, 14.293f)
                lineTo(19.589f, 11.0f)
                lineTo(13.0f, 11.0f)
                curveTo(8.6651f, 11.0f, 5.1355f, 7.5522f, 5.0038f, 3.2492f)
                lineTo(5.0f, 3.0f)
                curveTo(5.0f, 2.4477f, 5.4477f, 2.0f, 6.0f, 2.0f)
                curveTo(6.5523f, 2.0f, 7.0f, 2.4477f, 7.0f, 3.0f)
                curveTo(7.0f, 6.2384f, 9.5656f, 8.8776f, 12.7751f, 8.9959f)
                lineTo(13.0f, 9.0f)
                lineTo(19.586f, 9.0f)
                lineTo(16.2958f, 5.7055f)
                close()
                moveTo(9.0f, 13.5f)
                curveTo(9.0f, 14.8807f, 7.8807f, 16.0f, 6.5f, 16.0f)
                curveTo(5.1193f, 16.0f, 4.0f, 14.8807f, 4.0f, 13.5f)
                curveTo(4.0f, 12.1193f, 5.1193f, 11.0f, 6.5f, 11.0f)
                curveTo(7.8807f, 11.0f, 9.0f, 12.1193f, 9.0f, 13.5f)
                close()
                moveTo(11.0f, 18.875f)
                curveTo(11.0f, 20.4315f, 9.7143f, 22.0f, 6.5f, 22.0f)
                curveTo(3.2857f, 22.0f, 2.0f, 20.4374f, 2.0f, 18.875f)
                verticalLineTo(18.772f)
                curveTo(2.0f, 17.7929f, 2.7937f, 17.0f, 3.7727f, 17.0f)
                horizontalLineTo(9.2273f)
                curveTo(10.2063f, 17.0f, 11.0f, 17.793f, 11.0f, 18.772f)
                verticalLineTo(18.875f)
                close()
            }
        }
        .build()
        return _arrowForwardDownPerson!!
    }

private var _arrowForwardDownPerson: ImageVector? = null
