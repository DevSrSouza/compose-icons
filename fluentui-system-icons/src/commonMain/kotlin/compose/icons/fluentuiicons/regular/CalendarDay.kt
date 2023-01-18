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

public val RegularGroup.CalendarDay: ImageVector
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
                moveTo(16.25f, 11.0f)
                curveTo(16.6642f, 11.0f, 17.0f, 11.3358f, 17.0f, 11.75f)
                verticalLineTo(16.25f)
                curveTo(17.0f, 16.6642f, 16.6642f, 17.0f, 16.25f, 17.0f)
                horizontalLineTo(7.75f)
                curveTo(7.3358f, 17.0f, 7.0f, 16.6642f, 7.0f, 16.25f)
                verticalLineTo(11.75f)
                curveTo(7.0f, 11.3358f, 7.3358f, 11.0f, 7.75f, 11.0f)
                horizontalLineTo(16.25f)
                close()
                moveTo(15.5f, 12.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(12.5f)
                close()
                moveTo(7.75f, 7.25f)
                horizontalLineTo(16.25f)
                curveTo(16.6642f, 7.25f, 17.0f, 7.5858f, 17.0f, 8.0f)
                curveTo(17.0f, 8.3797f, 16.7178f, 8.6935f, 16.3518f, 8.7431f)
                lineTo(16.25f, 8.75f)
                horizontalLineTo(7.75f)
                curveTo(7.3358f, 8.75f, 7.0f, 8.4142f, 7.0f, 8.0f)
                curveTo(7.0f, 7.6203f, 7.2821f, 7.3065f, 7.6482f, 7.2568f)
                lineTo(7.75f, 7.25f)
                horizontalLineTo(16.25f)
                horizontalLineTo(7.75f)
                close()
            }
        }
        .build()
        return _calendarDay!!
    }

private var _calendarDay: ImageVector? = null
