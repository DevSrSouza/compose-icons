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

public val FilledGroup.GanttChart: ImageVector
    get() {
        if (_ganttChart != null) {
            return _ganttChart!!
        }
        _ganttChart = Builder(name = "GanttChart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.25f)
                curveTo(2.0f, 5.4551f, 3.4551f, 4.0f, 5.25f, 4.0f)
                horizontalLineTo(8.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                curveTo(4.8954f, 7.0f, 4.0f, 7.8954f, 4.0f, 9.0f)
                curveTo(4.0f, 10.1046f, 4.8954f, 11.0f, 6.0f, 11.0f)
                horizontalLineTo(8.25f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 20.0f, 2.0f, 18.5449f, 2.0f, 16.75f)
                verticalLineTo(7.25f)
                close()
                moveTo(9.25f, 20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                curveTo(10.0f, 13.1046f, 10.8954f, 14.0f, 12.0f, 14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                curveTo(13.0f, 16.0199f, 13.7634f, 16.8615f, 14.75f, 16.9845f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.25f)
                close()
                moveTo(12.0f, 10.0f)
                horizontalLineTo(14.75f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                curveTo(11.1046f, 7.0f, 12.0f, 7.8954f, 12.0f, 9.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(18.0f, 17.0f)
                horizontalLineTo(15.75f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 20.0f, 22.0f, 18.5449f, 22.0f, 16.75f)
                verticalLineTo(7.25f)
                curveTo(22.0f, 5.4551f, 20.5449f, 4.0f, 18.75f, 4.0f)
                horizontalLineTo(15.75f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.0f)
                curveTo(17.1046f, 10.0f, 18.0f, 10.8954f, 18.0f, 12.0f)
                verticalLineTo(13.0f)
                curveTo(19.1046f, 13.0f, 20.0f, 13.8954f, 20.0f, 15.0f)
                curveTo(20.0f, 16.1046f, 19.1046f, 17.0f, 18.0f, 17.0f)
                close()
                moveTo(6.0f, 8.0f)
                curveTo(5.4477f, 8.0f, 5.0f, 8.4477f, 5.0f, 9.0f)
                curveTo(5.0f, 9.5523f, 5.4477f, 10.0f, 6.0f, 10.0f)
                horizontalLineTo(10.0f)
                curveTo(10.5523f, 10.0f, 11.0f, 9.5523f, 11.0f, 9.0f)
                curveTo(11.0f, 8.4477f, 10.5523f, 8.0f, 10.0f, 8.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(11.0f, 12.0f)
                curveTo(11.0f, 11.4477f, 11.4477f, 11.0f, 12.0f, 11.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 11.0f, 17.0f, 11.4477f, 17.0f, 12.0f)
                curveTo(17.0f, 12.5523f, 16.5523f, 13.0f, 16.0f, 13.0f)
                horizontalLineTo(12.0f)
                curveTo(11.4477f, 13.0f, 11.0f, 12.5523f, 11.0f, 12.0f)
                close()
                moveTo(15.0f, 14.0f)
                curveTo(14.4477f, 14.0f, 14.0f, 14.4477f, 14.0f, 15.0f)
                curveTo(14.0f, 15.5523f, 14.4477f, 16.0f, 15.0f, 16.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 16.0f, 19.0f, 15.5523f, 19.0f, 15.0f)
                curveTo(19.0f, 14.4477f, 18.5523f, 14.0f, 18.0f, 14.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _ganttChart!!
    }

private var _ganttChart: ImageVector? = null
