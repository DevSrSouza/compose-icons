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

public val RegularGroup.CalendarAgenda: ImageVector
    get() {
        if (_calendarAgenda != null) {
            return _calendarAgenda!!
        }
        _calendarAgenda = Builder(name = "CalendarAgenda", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                close()
                moveTo(19.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.2835f, 18.7165f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 4.5f, 4.5f, 5.2835f, 4.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.7165f, 5.2835f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 19.5f, 19.5f, 18.7165f, 19.5f, 17.75f)
                close()
                moveTo(17.0f, 7.75f)
                curveTo(17.0f, 8.1297f, 16.7178f, 8.4435f, 16.3518f, 8.4931f)
                lineTo(16.25f, 8.5f)
                horizontalLineTo(7.75f)
                curveTo(7.3358f, 8.5f, 7.0f, 8.1642f, 7.0f, 7.75f)
                curveTo(7.0f, 7.3703f, 7.2821f, 7.0565f, 7.6482f, 7.0068f)
                lineTo(7.75f, 7.0f)
                horizontalLineTo(16.25f)
                curveTo(16.6642f, 7.0f, 17.0f, 7.3358f, 17.0f, 7.75f)
                close()
                moveTo(17.0f, 16.25f)
                curveTo(17.0f, 16.6297f, 16.7178f, 16.9435f, 16.3518f, 16.9932f)
                lineTo(16.25f, 17.0f)
                horizontalLineTo(7.75f)
                curveTo(7.3358f, 17.0f, 7.0f, 16.6642f, 7.0f, 16.25f)
                curveTo(7.0f, 15.8703f, 7.2821f, 15.5565f, 7.6482f, 15.5068f)
                lineTo(7.75f, 15.5f)
                horizontalLineTo(16.25f)
                curveTo(16.6642f, 15.5f, 17.0f, 15.8358f, 17.0f, 16.25f)
                close()
                moveTo(17.0f, 12.0f)
                curveTo(17.0f, 12.3797f, 16.7178f, 12.6935f, 16.3518f, 12.7432f)
                lineTo(16.25f, 12.75f)
                horizontalLineTo(7.75f)
                curveTo(7.3358f, 12.75f, 7.0f, 12.4142f, 7.0f, 12.0f)
                curveTo(7.0f, 11.6203f, 7.2821f, 11.3065f, 7.6482f, 11.2568f)
                lineTo(7.75f, 11.25f)
                horizontalLineTo(16.25f)
                curveTo(16.6642f, 11.25f, 17.0f, 11.5858f, 17.0f, 12.0f)
                close()
            }
        }
        .build()
        return _calendarAgenda!!
    }

private var _calendarAgenda: ImageVector? = null
