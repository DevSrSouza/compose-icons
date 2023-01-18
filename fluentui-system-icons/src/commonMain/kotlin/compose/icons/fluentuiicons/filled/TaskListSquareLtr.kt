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

public val FilledGroup.TaskListSquareLtr: ImageVector
    get() {
        if (_taskListSquareLtr != null) {
            return _taskListSquareLtr!!
        }
        _taskListSquareLtr = Builder(name = "TaskListSquareLtr", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(12.5f, 9.25f)
                curveTo(12.5f, 9.6642f, 12.8358f, 10.0f, 13.25f, 10.0f)
                horizontalLineTo(16.75f)
                curveTo(17.1642f, 10.0f, 17.5f, 9.6642f, 17.5f, 9.25f)
                curveTo(17.5f, 8.8358f, 17.1642f, 8.5f, 16.75f, 8.5f)
                horizontalLineTo(13.25f)
                curveTo(12.8358f, 8.5f, 12.5f, 8.8358f, 12.5f, 9.25f)
                close()
                moveTo(13.2501f, 14.0f)
                curveTo(12.8358f, 14.0f, 12.5001f, 14.3358f, 12.5001f, 14.75f)
                curveTo(12.5001f, 15.1642f, 12.8358f, 15.5f, 13.2501f, 15.5f)
                horizontalLineTo(16.7499f)
                curveTo(17.1642f, 15.5f, 17.4999f, 15.1642f, 17.4999f, 14.75f)
                curveTo(17.4999f, 14.3358f, 17.1642f, 14.0f, 16.7499f, 14.0f)
                horizontalLineTo(13.2501f)
                close()
                moveTo(10.7803f, 8.7803f)
                curveTo(11.0732f, 8.4874f, 11.0732f, 8.0126f, 10.7803f, 7.7197f)
                curveTo(10.4874f, 7.4268f, 10.0126f, 7.4268f, 9.7197f, 7.7197f)
                lineTo(8.25f, 9.1893f)
                lineTo(7.7803f, 8.7197f)
                curveTo(7.4874f, 8.4268f, 7.0126f, 8.4268f, 6.7197f, 8.7197f)
                curveTo(6.4268f, 9.0126f, 6.4268f, 9.4874f, 6.7197f, 9.7803f)
                lineTo(7.7197f, 10.7803f)
                curveTo(8.0126f, 11.0732f, 8.4874f, 11.0732f, 8.7803f, 10.7803f)
                lineTo(10.7803f, 8.7803f)
                close()
                moveTo(10.7803f, 13.2197f)
                curveTo(10.4874f, 12.9268f, 10.0126f, 12.9268f, 9.7197f, 13.2197f)
                lineTo(8.25f, 14.6893f)
                lineTo(7.7803f, 14.2197f)
                curveTo(7.4874f, 13.9268f, 7.0126f, 13.9268f, 6.7197f, 14.2197f)
                curveTo(6.4268f, 14.5126f, 6.4268f, 14.9874f, 6.7197f, 15.2803f)
                lineTo(7.7197f, 16.2803f)
                curveTo(8.0126f, 16.5732f, 8.4874f, 16.5732f, 8.7803f, 16.2803f)
                lineTo(10.7803f, 14.2803f)
                curveTo(11.0732f, 13.9874f, 11.0732f, 13.5126f, 10.7803f, 13.2197f)
                close()
            }
        }
        .build()
        return _taskListSquareLtr!!
    }

private var _taskListSquareLtr: ImageVector? = null
