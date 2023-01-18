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

public val FilledGroup.CalendarDay: ImageVector
    get() {
        if (_calendarDay != null) {
            return _calendarDay!!
        }
        _calendarDay = Builder(name = "CalendarDay", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 3.0f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(16.25f, 11.0f)
                horizontalLineTo(7.75f)
                curveTo(7.3703f, 11.0f, 7.0565f, 11.2822f, 7.0068f, 11.6482f)
                lineTo(7.0f, 11.75f)
                verticalLineTo(16.25f)
                curveTo(7.0f, 16.6297f, 7.2821f, 16.9435f, 7.6482f, 16.9932f)
                lineTo(7.75f, 17.0f)
                horizontalLineTo(16.25f)
                curveTo(16.6297f, 17.0f, 16.9435f, 16.7178f, 16.9932f, 16.3518f)
                lineTo(17.0f, 16.25f)
                verticalLineTo(11.75f)
                curveTo(17.0f, 11.3703f, 16.7178f, 11.0565f, 16.3518f, 11.0068f)
                lineTo(16.25f, 11.0f)
                close()
                moveTo(15.5f, 12.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(12.5f)
                horizontalLineTo(15.5f)
                close()
                moveTo(16.25f, 7.25f)
                horizontalLineTo(7.75f)
                curveTo(7.3358f, 7.25f, 7.0f, 7.5858f, 7.0f, 8.0f)
                curveTo(7.0f, 8.4142f, 7.3358f, 8.75f, 7.75f, 8.75f)
                horizontalLineTo(16.25f)
                curveTo(16.6642f, 8.75f, 17.0f, 8.4142f, 17.0f, 8.0f)
                curveTo(17.0f, 7.5858f, 16.6642f, 7.25f, 16.25f, 7.25f)
                close()
            }
        }
        .build()
        return _calendarDay!!
    }

private var _calendarDay: ImageVector? = null
