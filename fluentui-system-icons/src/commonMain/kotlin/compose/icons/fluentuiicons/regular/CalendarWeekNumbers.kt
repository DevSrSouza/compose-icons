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

public val RegularGroup.CalendarWeekNumbers: ImageVector
    get() {
        if (_calendarWeekNumbers != null) {
            return _calendarWeekNumbers!!
        }
        _calendarWeekNumbers = Builder(name = "CalendarWeekNumbers", defaultWidth = 24.0.dp,
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
                verticalLineTo(8.75f)
                curveTo(8.5f, 9.1642f, 8.1642f, 9.5f, 7.75f, 9.5f)
                curveTo(7.3703f, 9.5f, 7.0565f, 9.2178f, 7.0068f, 8.8518f)
                lineTo(7.0f, 8.75f)
                verticalLineTo(7.75f)
                curveTo(7.0f, 7.3358f, 7.3358f, 7.0f, 7.75f, 7.0f)
                close()
                moveTo(8.4931f, 15.1482f)
                curveTo(8.4435f, 14.7822f, 8.1297f, 14.5f, 7.75f, 14.5f)
                curveTo(7.3358f, 14.5f, 7.0f, 14.8358f, 7.0f, 15.25f)
                verticalLineTo(16.25f)
                lineTo(7.0068f, 16.3518f)
                curveTo(7.0565f, 16.7178f, 7.3703f, 17.0f, 7.75f, 17.0f)
                curveTo(8.1642f, 17.0f, 8.5f, 16.6642f, 8.5f, 16.25f)
                verticalLineTo(15.25f)
                lineTo(8.4931f, 15.1482f)
                close()
                moveTo(8.5f, 11.3212f)
                curveTo(8.4503f, 10.9551f, 8.1365f, 10.6729f, 7.7568f, 10.6729f)
                curveTo(7.3426f, 10.6729f, 7.0068f, 11.0087f, 7.0068f, 11.4229f)
                lineTo(7.0f, 12.5712f)
                lineTo(7.0068f, 12.6729f)
                curveTo(7.0565f, 13.039f, 7.3703f, 13.3212f, 7.75f, 13.3212f)
                curveTo(8.1642f, 13.3212f, 8.5f, 12.9854f, 8.5f, 12.5712f)
                lineTo(8.5069f, 11.4229f)
                lineTo(8.5f, 11.3212f)
                close()
            }
        }
        .build()
        return _calendarWeekNumbers!!
    }

private var _calendarWeekNumbers: ImageVector? = null
