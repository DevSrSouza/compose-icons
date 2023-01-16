package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.CalendarClock: ImageVector
    get() {
        if (_calendarClock != null) {
            return _calendarClock!!
        }
        _calendarClock = Builder(name = "CalendarClock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.82f)
                lineTo(18.94f, 17.23f)
                lineTo(18.19f, 18.53f)
                lineTo(15.0f, 16.69f)
                verticalLineTo(13.0f)
                moveTo(19.0f, 8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.67f)
                curveTo(9.24f, 18.09f, 9.0f, 17.07f, 9.0f, 16.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 16.0f, 9.0f)
                curveTo(17.07f, 9.0f, 18.09f, 9.24f, 19.0f, 9.67f)
                verticalLineTo(8.0f)
                moveTo(5.0f, 21.0f)
                curveTo(3.89f, 21.0f, 3.0f, 20.1f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.89f, 3.89f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(11.1f)
                curveTo(22.24f, 12.36f, 23.0f, 14.09f, 23.0f, 16.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 16.0f, 23.0f)
                curveTo(14.09f, 23.0f, 12.36f, 22.24f, 11.1f, 21.0f)
                horizontalLineTo(5.0f)
                moveTo(16.0f, 11.15f)
                arcTo(4.85f, 4.85f, 0.0f, false, false, 11.15f, 16.0f)
                curveTo(11.15f, 18.68f, 13.32f, 20.85f, 16.0f, 20.85f)
                arcTo(4.85f, 4.85f, 0.0f, false, false, 20.85f, 16.0f)
                curveTo(20.85f, 13.32f, 18.68f, 11.15f, 16.0f, 11.15f)
                close()
            }
        }
        .build()
        return _calendarClock!!
    }

private var _calendarClock: ImageVector? = null
