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

public val FilledGroup.PeopleAudience: ImageVector
    get() {
        if (_peopleAudience != null) {
            return _peopleAudience!!
        }
        _peopleAudience = Builder(name = "PeopleAudience", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.754f, 10.0f)
                curveTo(15.7205f, 10.0f, 16.504f, 10.7835f, 16.504f, 11.75f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.5019f)
                verticalLineTo(11.75f)
                curveTo(7.5019f, 10.7835f, 8.2854f, 10.0f, 9.2519f, 10.0f)
                horizontalLineTo(14.754f)
                close()
                moveTo(22.0f, 11.75f)
                curveTo(22.0f, 10.7835f, 21.2165f, 10.0f, 20.25f, 10.0f)
                lineTo(16.8747f, 9.9991f)
                curveTo(17.2678f, 10.4747f, 17.504f, 11.0847f, 17.504f, 11.75f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 16.0f, 22.0f, 15.6642f, 22.0f, 15.25f)
                verticalLineTo(11.75f)
                close()
                moveTo(6.5f, 15.0f)
                horizontalLineTo(6.5019f)
                verticalLineTo(11.75f)
                lineTo(6.5106f, 11.5304f)
                curveTo(6.5564f, 10.9508f, 6.7818f, 10.4218f, 7.1313f, 9.9991f)
                lineTo(3.75f, 10.0f)
                lineTo(3.6065f, 10.0058f)
                curveTo(2.7071f, 10.0788f, 2.0f, 10.8318f, 2.0f, 11.75f)
                verticalLineTo(15.25f)
                curveTo(2.0f, 15.6642f, 2.3358f, 16.0f, 2.75f, 16.0f)
                horizontalLineTo(6.5f)
                verticalLineTo(15.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(13.6569f, 3.0f, 15.0f, 4.3432f, 15.0f, 6.0f)
                curveTo(15.0f, 7.6568f, 13.6569f, 9.0f, 12.0f, 9.0f)
                curveTo(10.3431f, 9.0f, 9.0f, 7.6568f, 9.0f, 6.0f)
                curveTo(9.0f, 4.3432f, 10.3431f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(18.5f, 4.0f)
                curveTo(19.8807f, 4.0f, 21.0f, 5.1193f, 21.0f, 6.5f)
                curveTo(21.0f, 7.8807f, 19.8807f, 9.0f, 18.5f, 9.0f)
                curveTo(17.1193f, 9.0f, 16.0f, 7.8807f, 16.0f, 6.5f)
                curveTo(16.0f, 5.1193f, 17.1193f, 4.0f, 18.5f, 4.0f)
                close()
                moveTo(5.5f, 4.0f)
                curveTo(6.8807f, 4.0f, 8.0f, 5.1193f, 8.0f, 6.5f)
                curveTo(8.0f, 7.8807f, 6.8807f, 9.0f, 5.5f, 9.0f)
                curveTo(4.1193f, 9.0f, 3.0f, 7.8807f, 3.0f, 6.5f)
                curveTo(3.0f, 5.1193f, 4.1193f, 4.0f, 5.5f, 4.0f)
                close()
                moveTo(2.0f, 17.75f)
                curveTo(2.0f, 17.3358f, 2.3358f, 17.0f, 2.75f, 17.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 17.0f, 22.0f, 17.3358f, 22.0f, 17.75f)
                verticalLineTo(18.25f)
                curveTo(22.0f, 20.3211f, 20.3211f, 22.0f, 18.25f, 22.0f)
                horizontalLineTo(5.75f)
                curveTo(3.6789f, 22.0f, 2.0f, 20.3211f, 2.0f, 18.25f)
                verticalLineTo(17.75f)
                close()
            }
        }
        .build()
        return _peopleAudience!!
    }

private var _peopleAudience: ImageVector? = null
