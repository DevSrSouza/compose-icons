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

public val RegularGroup.CalendarClock: ImageVector
    get() {
        if (_calendarClock != null) {
            return _calendarClock!!
        }
        _calendarClock = Builder(name = "CalendarClock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(12.0218f)
                curveTo(11.7253f, 20.5368f, 11.4858f, 20.0335f, 11.3135f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 19.5f, 4.5f, 18.7165f, 4.5f, 17.75f)
                verticalLineTo(8.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(11.3135f)
                curveTo(20.0335f, 11.4858f, 20.5368f, 11.7253f, 21.0f, 12.0218f)
                verticalLineTo(6.25f)
                close()
                moveTo(6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 4.5f, 19.5f, 5.2835f, 19.5f, 6.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.2835f, 5.2835f, 4.5f, 6.25f, 4.5f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 14.4624f, 20.5376f, 12.0f, 17.5f, 12.0f)
                curveTo(14.4624f, 12.0f, 12.0f, 14.4624f, 12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 14.4624f, 23.0f, 17.5f, 23.0f)
                curveTo(20.5376f, 23.0f, 23.0f, 20.5376f, 23.0f, 17.5f)
                close()
                moveTo(17.5f, 17.5f)
                horizontalLineTo(19.5f)
                curveTo(19.7761f, 17.5f, 20.0f, 17.7239f, 20.0f, 18.0f)
                curveTo(20.0f, 18.2762f, 19.7761f, 18.5f, 19.5f, 18.5f)
                horizontalLineTo(17.0f)
                curveTo(16.7268f, 18.5f, 16.5048f, 18.2809f, 16.5001f, 18.0089f)
                lineTo(16.5f, 17.9999f)
                verticalLineTo(14.9999f)
                curveTo(16.5f, 14.7238f, 16.7239f, 14.4999f, 17.0f, 14.4999f)
                curveTo(17.2761f, 14.4999f, 17.5f, 14.7238f, 17.5f, 14.9999f)
                lineTo(17.5f, 17.5f)
                close()
            }
        }
        .build()
        return _calendarClock!!
    }

private var _calendarClock: ImageVector? = null
