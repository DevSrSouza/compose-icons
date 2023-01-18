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

public val FilledGroup.PeopleSwap: ImageVector
    get() {
        if (_peopleSwap != null) {
            return _peopleSwap!!
        }
        _peopleSwap = Builder(name = "PeopleSwap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                curveTo(12.0f, 10.2091f, 10.2091f, 12.0f, 8.0f, 12.0f)
                curveTo(5.7909f, 12.0f, 4.0f, 10.2091f, 4.0f, 8.0f)
                curveTo(4.0f, 5.7909f, 5.7909f, 4.0f, 8.0f, 4.0f)
                curveTo(10.2091f, 4.0f, 12.0f, 5.7909f, 12.0f, 8.0f)
                close()
                moveTo(20.0f, 9.0f)
                curveTo(20.0f, 10.6569f, 18.6569f, 12.0f, 17.0f, 12.0f)
                curveTo(15.3431f, 12.0f, 14.0f, 10.6569f, 14.0f, 9.0f)
                curveTo(14.0f, 7.3432f, 15.3431f, 6.0f, 17.0f, 6.0f)
                curveTo(18.6569f, 6.0f, 20.0f, 7.3432f, 20.0f, 9.0f)
                close()
                moveTo(2.0f, 16.25f)
                curveTo(2.0f, 15.0074f, 3.0074f, 14.0f, 4.25f, 14.0f)
                horizontalLineTo(11.75f)
                curveTo(12.1201f, 14.0f, 12.4694f, 14.0894f, 12.7774f, 14.2477f)
                lineTo(10.5126f, 16.5125f)
                curveTo(9.8292f, 17.196f, 9.8292f, 18.304f, 10.5126f, 18.9874f)
                lineTo(11.6994f, 20.1742f)
                curveTo(10.8333f, 20.6634f, 9.6411f, 21.0f, 8.0f, 21.0f)
                curveTo(2.0f, 21.0f, 2.0f, 16.5f, 2.0f, 16.5f)
                verticalLineTo(16.25f)
                close()
                moveTo(20.2809f, 14.7202f)
                curveTo(19.988f, 14.4273f, 19.5131f, 14.4273f, 19.2202f, 14.7202f)
                curveTo(18.9273f, 15.013f, 18.9273f, 15.4879f, 19.2202f, 15.7808f)
                lineTo(20.4394f, 17.0f)
                horizontalLineTo(13.5607f)
                lineTo(14.7798f, 15.7809f)
                curveTo(15.0727f, 15.488f, 15.0727f, 15.0131f, 14.7798f, 14.7202f)
                curveTo(14.4869f, 14.4273f, 14.012f, 14.4273f, 13.7191f, 14.7202f)
                lineTo(11.2197f, 17.2197f)
                curveTo(10.9268f, 17.5125f, 10.9268f, 17.9874f, 11.2197f, 18.2803f)
                lineTo(13.7191f, 20.7798f)
                curveTo(14.012f, 21.0726f, 14.4869f, 21.0726f, 14.7798f, 20.7798f)
                curveTo(15.0727f, 20.4869f, 15.0727f, 20.012f, 14.7798f, 19.7191f)
                lineTo(13.5607f, 18.5f)
                horizontalLineTo(20.4393f)
                lineTo(19.2202f, 19.7191f)
                curveTo(18.9273f, 20.012f, 18.9273f, 20.4869f, 19.2202f, 20.7798f)
                curveTo(19.5131f, 21.0726f, 19.988f, 21.0726f, 20.2809f, 20.7798f)
                lineTo(22.7803f, 18.2803f)
                curveTo(23.0732f, 17.9874f, 23.0732f, 17.5126f, 22.7803f, 17.2197f)
                lineTo(20.2809f, 14.7202f)
                close()
            }
        }
        .build()
        return _peopleSwap!!
    }

private var _peopleSwap: ImageVector? = null
