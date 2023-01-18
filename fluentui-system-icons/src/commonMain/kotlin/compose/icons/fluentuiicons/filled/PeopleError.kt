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

public val FilledGroup.PeopleError: ImageVector
    get() {
        if (_peopleError != null) {
            return _peopleError!!
        }
        _peopleError = Builder(name = "PeopleError", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                close()
                moveTo(17.5f, 14.0f)
                curveTo(17.2239f, 14.0f, 17.0f, 14.2239f, 17.0f, 14.5f)
                verticalLineTo(18.5f)
                curveTo(17.0f, 18.7761f, 17.2239f, 19.0f, 17.5f, 19.0f)
                curveTo(17.7761f, 19.0f, 18.0f, 18.7761f, 18.0f, 18.5f)
                verticalLineTo(14.5f)
                curveTo(18.0f, 14.2239f, 17.7761f, 14.0f, 17.5f, 14.0f)
                close()
                moveTo(17.5f, 21.125f)
                curveTo(17.8452f, 21.125f, 18.125f, 20.8452f, 18.125f, 20.5f)
                curveTo(18.125f, 20.1548f, 17.8452f, 19.875f, 17.5f, 19.875f)
                curveTo(17.1548f, 19.875f, 16.875f, 20.1548f, 16.875f, 20.5f)
                curveTo(16.875f, 20.8452f, 17.1548f, 21.125f, 17.5f, 21.125f)
                close()
            }
        }
        .build()
        return _peopleError!!
    }

private var _peopleError: ImageVector? = null
