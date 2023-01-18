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

public val RegularGroup.GanttChart: ImageVector
    get() {
        if (_ganttChart != null) {
            return _ganttChart!!
        }
        _ganttChart = Builder(name = "GanttChart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(5.25f, 4.0f)
                curveTo(3.4551f, 4.0f, 2.0f, 5.4551f, 2.0f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(2.0f, 18.5449f, 3.4551f, 20.0f, 5.25f, 20.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 20.0f, 22.0f, 18.5449f, 22.0f, 16.75f)
                verticalLineTo(7.25f)
                curveTo(22.0f, 5.4551f, 20.5449f, 4.0f, 18.75f, 4.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(8.0f, 5.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(5.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.5f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 5.5f, 20.5f, 6.2835f, 20.5f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(20.5f, 17.7165f, 19.7165f, 18.5f, 18.75f, 18.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                curveTo(14.8274f, 17.0f, 14.6598f, 16.9781f, 14.5f, 16.937f)
                verticalLineTo(18.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.5f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 18.5f, 3.5f, 17.7165f, 3.5f, 16.75f)
                verticalLineTo(7.25f)
                curveTo(3.5f, 6.2835f, 4.2835f, 5.5f, 5.25f, 5.5f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _ganttChart!!
    }

private var _ganttChart: ImageVector? = null
