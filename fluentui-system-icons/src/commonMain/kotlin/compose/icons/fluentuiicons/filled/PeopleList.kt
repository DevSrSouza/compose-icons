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

public val FilledGroup.PeopleList: ImageVector
    get() {
        if (_peopleList != null) {
            return _peopleList!!
        }
        _peopleList = Builder(name = "PeopleList", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                curveTo(10.2091f, 12.0f, 12.0f, 10.2091f, 12.0f, 8.0f)
                curveTo(12.0f, 5.7909f, 10.2091f, 4.0f, 8.0f, 4.0f)
                curveTo(5.7909f, 4.0f, 4.0f, 5.7909f, 4.0f, 8.0f)
                curveTo(4.0f, 10.2091f, 5.7909f, 12.0f, 8.0f, 12.0f)
                close()
                moveTo(17.0f, 12.0f)
                curveTo(18.6569f, 12.0f, 20.0f, 10.6569f, 20.0f, 9.0f)
                curveTo(20.0f, 7.3432f, 18.6569f, 6.0f, 17.0f, 6.0f)
                curveTo(15.3431f, 6.0f, 14.0f, 7.3432f, 14.0f, 9.0f)
                curveTo(14.0f, 10.6569f, 15.3431f, 12.0f, 17.0f, 12.0f)
                close()
                moveTo(4.25f, 14.0f)
                curveTo(3.0074f, 14.0f, 2.0f, 15.0074f, 2.0f, 16.25f)
                verticalLineTo(16.5f)
                curveTo(2.0f, 16.5f, 2.0f, 21.0f, 8.0f, 21.0f)
                curveTo(9.8547f, 21.0f, 11.1361f, 20.57f, 12.0213f, 19.9759f)
                curveTo(12.0811f, 19.5962f, 12.2628f, 19.2571f, 12.5253f, 19.0f)
                curveTo(12.2011f, 18.6824f, 12.0f, 18.2397f, 12.0f, 17.75f)
                curveTo(12.0f, 17.2603f, 12.2011f, 16.8176f, 12.5253f, 16.5f)
                curveTo(12.2011f, 16.1824f, 12.0f, 15.7397f, 12.0f, 15.25f)
                curveTo(12.0f, 14.8116f, 12.1612f, 14.4109f, 12.4276f, 14.1038f)
                curveTo(12.2137f, 14.0364f, 11.9861f, 14.0f, 11.75f, 14.0f)
                horizontalLineTo(4.25f)
                close()
                moveTo(13.75f, 14.5f)
                curveTo(13.3358f, 14.5f, 13.0f, 14.8358f, 13.0f, 15.25f)
                curveTo(13.0f, 15.6642f, 13.3358f, 16.0f, 13.75f, 16.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 16.0f, 22.0f, 15.6642f, 22.0f, 15.25f)
                curveTo(22.0f, 14.8358f, 21.6642f, 14.5f, 21.25f, 14.5f)
                horizontalLineTo(13.75f)
                close()
                moveTo(13.75f, 17.0f)
                curveTo(13.3358f, 17.0f, 13.0f, 17.3358f, 13.0f, 17.75f)
                curveTo(13.0f, 18.1642f, 13.3358f, 18.5f, 13.75f, 18.5f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 18.5f, 22.0f, 18.1642f, 22.0f, 17.75f)
                curveTo(22.0f, 17.3358f, 21.6642f, 17.0f, 21.25f, 17.0f)
                horizontalLineTo(13.75f)
                close()
                moveTo(13.75f, 19.5f)
                curveTo(13.3358f, 19.5f, 13.0f, 19.8358f, 13.0f, 20.25f)
                curveTo(13.0f, 20.6642f, 13.3358f, 21.0f, 13.75f, 21.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 21.0f, 22.0f, 20.6642f, 22.0f, 20.25f)
                curveTo(22.0f, 19.8358f, 21.6642f, 19.5f, 21.25f, 19.5f)
                horizontalLineTo(13.75f)
                close()
            }
        }
        .build()
        return _peopleList!!
    }

private var _peopleList: ImageVector? = null
