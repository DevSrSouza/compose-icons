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

public val RegularGroup.CalendarWeekStart: ImageVector
    get() {
        if (_calendarWeekStart != null) {
            return _calendarWeekStart!!
        }
        _calendarWeekStart = Builder(name = "CalendarWeekStart", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 4.5f, 4.5f, 5.2835f, 4.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.7165f, 5.2835f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 19.5f, 19.5f, 18.7165f, 19.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.2835f, 18.7165f, 4.5f, 17.75f, 4.5f)
                close()
                moveTo(7.75f, 7.0f)
                curveTo(8.1297f, 7.0f, 8.4435f, 7.2821f, 8.4931f, 7.6482f)
                lineTo(8.5f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(8.5f, 16.6642f, 8.1642f, 17.0f, 7.75f, 17.0f)
                curveTo(7.3703f, 17.0f, 7.0565f, 16.7178f, 7.0068f, 16.3518f)
                lineTo(7.0f, 16.25f)
                verticalLineTo(7.75f)
                curveTo(7.0f, 7.3358f, 7.3358f, 7.0f, 7.75f, 7.0f)
                close()
            }
        }
        .build()
        return _calendarWeekStart!!
    }

private var _calendarWeekStart: ImageVector? = null
