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

public val FilledGroup.PeopleAdd: ImageVector
    get() {
        if (_peopleAdd != null) {
            return _peopleAdd!!
        }
        _peopleAdd = Builder(name = "PeopleAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                curveTo(10.2091f, 11.0f, 12.0f, 9.2091f, 12.0f, 7.0f)
                curveTo(12.0f, 4.7909f, 10.2091f, 3.0f, 8.0f, 3.0f)
                curveTo(5.7909f, 3.0f, 4.0f, 4.7909f, 4.0f, 7.0f)
                curveTo(4.0f, 9.2091f, 5.7909f, 11.0f, 8.0f, 11.0f)
                close()
                moveTo(17.0f, 11.0f)
                curveTo(18.6569f, 11.0f, 20.0f, 9.6568f, 20.0f, 8.0f)
                curveTo(20.0f, 6.3432f, 18.6569f, 5.0f, 17.0f, 5.0f)
                curveTo(15.3431f, 5.0f, 14.0f, 6.3432f, 14.0f, 8.0f)
                curveTo(14.0f, 9.6568f, 15.3431f, 11.0f, 17.0f, 11.0f)
                close()
                moveTo(4.25f, 13.0f)
                curveTo(3.0074f, 13.0f, 2.0f, 14.0074f, 2.0f, 15.25f)
                verticalLineTo(15.5f)
                curveTo(2.0f, 15.5f, 2.0f, 20.0f, 8.0f, 20.0f)
                curveTo(9.3898f, 20.0f, 10.4578f, 19.7585f, 11.2783f, 19.3875f)
                curveTo(11.0973f, 18.7901f, 11.0f, 18.1564f, 11.0f, 17.5f)
                curveTo(11.0f, 15.8431f, 11.6199f, 14.3311f, 12.6405f, 13.1831f)
                curveTo(12.3674f, 13.0653f, 12.0663f, 13.0f, 11.75f, 13.0f)
                horizontalLineTo(4.25f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 14.4624f, 20.5376f, 12.0f, 17.5f, 12.0f)
                curveTo(14.4624f, 12.0f, 12.0f, 14.4624f, 12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 14.4624f, 23.0f, 17.5f, 23.0f)
                curveTo(20.5376f, 23.0f, 23.0f, 20.5376f, 23.0f, 17.5f)
                close()
                moveTo(18.0006f, 18.0f)
                lineTo(18.0011f, 20.5035f)
                curveTo(18.0011f, 20.7797f, 17.7773f, 21.0035f, 17.5011f, 21.0035f)
                curveTo(17.225f, 21.0035f, 17.0011f, 20.7797f, 17.0011f, 20.5035f)
                lineTo(17.0006f, 18.0f)
                horizontalLineTo(14.4956f)
                curveTo(14.2197f, 18.0f, 13.9961f, 17.7762f, 13.9961f, 17.5f)
                curveTo(13.9961f, 17.2239f, 14.2197f, 17.0f, 14.4956f, 17.0f)
                horizontalLineTo(17.0005f)
                lineTo(17.0f, 14.4993f)
                curveTo(17.0f, 14.2231f, 17.2239f, 13.9993f, 17.5f, 13.9993f)
                curveTo(17.7761f, 13.9993f, 18.0f, 14.2231f, 18.0f, 14.4993f)
                lineTo(18.0005f, 17.0f)
                horizontalLineTo(20.4966f)
                curveTo(20.7725f, 17.0f, 20.9961f, 17.2239f, 20.9961f, 17.5f)
                curveTo(20.9961f, 17.7762f, 20.7725f, 18.0f, 20.4966f, 18.0f)
                horizontalLineTo(18.0006f)
                close()
            }
        }
        .build()
        return _peopleAdd!!
    }

private var _peopleAdd: ImageVector? = null
