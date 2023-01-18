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

public val RegularGroup.CalendarError: ImageVector
    get() {
        if (_calendarError != null) {
            return _calendarError!!
        }
        _calendarError = Builder(name = "CalendarError", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 3.0f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(12.0218f)
                curveTo(20.5368f, 11.7253f, 20.0335f, 11.4858f, 19.5f, 11.3135f)
                verticalLineTo(8.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.7165f, 5.2835f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(11.3135f)
                curveTo(11.4858f, 20.0335f, 11.7253f, 20.5368f, 12.0218f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 4.5f, 4.5f, 5.2835f, 4.5f, 6.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.2835f, 18.7165f, 4.5f, 17.75f, 4.5f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                close()
                moveTo(17.5f, 14.0f)
                curveTo(17.2239f, 14.0f, 17.0f, 14.2239f, 17.0f, 14.5f)
                verticalLineTo(18.5f)
                curveTo(17.0f, 18.7761f, 17.2239f, 19.0f, 17.5f, 19.0f)
                curveTo(17.7761f, 19.0f, 18.0f, 18.7761f, 18.0f, 18.5f)
                verticalLineTo(14.5f)
                curveTo(18.0f, 14.2239f, 17.7761f, 14.0f, 17.5f, 14.0f)
                close()
                moveTo(17.5f, 21.125f)
                curveTo(17.8452f, 21.125f, 18.125f, 20.8452f, 18.125f, 20.5f)
                curveTo(18.125f, 20.1548f, 17.8452f, 19.875f, 17.5f, 19.875f)
                curveTo(17.1548f, 19.875f, 16.875f, 20.1548f, 16.875f, 20.5f)
                curveTo(16.875f, 20.8452f, 17.1548f, 21.125f, 17.5f, 21.125f)
                close()
            }
        }
        .build()
        return _calendarError!!
    }

private var _calendarError: ImageVector? = null
