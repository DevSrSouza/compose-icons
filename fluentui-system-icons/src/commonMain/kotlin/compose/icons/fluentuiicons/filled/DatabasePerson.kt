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

public val FilledGroup.DatabasePerson: ImageVector
    get() {
        if (_databasePerson != null) {
            return _databasePerson!!
        }
        _databasePerson = Builder(name = "DatabasePerson", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                curveTo(20.0f, 8.2091f, 16.4183f, 10.0f, 12.0f, 10.0f)
                curveTo(7.5817f, 10.0f, 4.0f, 8.2091f, 4.0f, 6.0f)
                curveTo(4.0f, 3.7909f, 7.5817f, 2.0f, 12.0f, 2.0f)
                curveTo(16.4183f, 2.0f, 20.0f, 3.7909f, 20.0f, 6.0f)
                close()
                moveTo(17.7679f, 10.4284f)
                curveTo(16.1524f, 11.1156f, 14.137f, 11.5f, 12.0f, 11.5f)
                curveTo(9.6085f, 11.5f, 7.3692f, 11.0185f, 5.6723f, 10.1701f)
                curveTo(5.0844f, 9.8761f, 4.5021f, 9.504f, 4.0f, 9.0534f)
                verticalLineTo(18.0f)
                curveTo(4.0f, 20.2091f, 7.5817f, 22.0f, 12.0f, 22.0f)
                curveTo(12.5515f, 22.0f, 13.09f, 21.9721f, 13.6101f, 21.919f)
                curveTo(13.1964f, 21.293f, 13.0f, 20.5836f, 13.0f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(13.0f, 18.2401f, 14.2419f, 17.0f, 15.7727f, 17.0f)
                horizontalLineTo(16.0505f)
                curveTo(15.4022f, 16.3647f, 15.0f, 15.4793f, 15.0f, 14.5f)
                curveTo(15.0f, 13.1307f, 15.7863f, 11.9451f, 16.9321f, 11.37f)
                curveTo(17.3241f, 11.1732f, 17.6615f, 10.8539f, 17.7679f, 10.4284f)
                close()
                moveTo(21.0f, 14.5f)
                curveTo(21.0f, 15.8807f, 19.8807f, 17.0f, 18.5f, 17.0f)
                curveTo(17.1193f, 17.0f, 16.0f, 15.8807f, 16.0f, 14.5f)
                curveTo(16.0f, 13.1193f, 17.1193f, 12.0f, 18.5f, 12.0f)
                curveTo(19.8807f, 12.0f, 21.0f, 13.1193f, 21.0f, 14.5f)
                close()
                moveTo(23.0f, 19.875f)
                curveTo(23.0f, 21.4315f, 21.7143f, 23.0f, 18.5f, 23.0f)
                curveTo(15.2857f, 23.0f, 14.0f, 21.4374f, 14.0f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(14.0f, 18.7929f, 14.7937f, 18.0f, 15.7727f, 18.0f)
                horizontalLineTo(21.2273f)
                curveTo(22.2063f, 18.0f, 23.0f, 18.793f, 23.0f, 19.772f)
                verticalLineTo(19.875f)
                close()
            }
        }
        .build()
        return _databasePerson!!
    }

private var _databasePerson: ImageVector? = null
