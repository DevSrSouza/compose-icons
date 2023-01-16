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

public val MaterialDesignIcons.CalendarClockOutline: ImageVector
    get() {
        if (_calendarClockOutline != null) {
            return _calendarClockOutline!!
        }
        _calendarClockOutline = Builder(name = "CalendarClockOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 1.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.89f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.89f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(11.1f)
                curveTo(12.36f, 22.24f, 14.09f, 23.0f, 16.0f, 23.0f)
                curveTo(19.87f, 23.0f, 23.0f, 19.87f, 23.0f, 16.0f)
                curveTo(23.0f, 14.09f, 22.24f, 12.36f, 21.0f, 11.1f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.11f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(1.0f)
                moveTo(5.0f, 5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                moveTo(5.0f, 9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.67f)
                curveTo(18.09f, 9.24f, 17.07f, 9.0f, 16.0f, 9.0f)
                curveTo(12.13f, 9.0f, 9.0f, 12.13f, 9.0f, 16.0f)
                curveTo(9.0f, 17.07f, 9.24f, 18.09f, 9.67f, 19.0f)
                horizontalLineTo(5.0f)
                moveTo(16.0f, 11.15f)
                curveTo(18.68f, 11.15f, 20.85f, 13.32f, 20.85f, 16.0f)
                curveTo(20.85f, 18.68f, 18.68f, 20.85f, 16.0f, 20.85f)
                curveTo(13.32f, 20.85f, 11.15f, 18.68f, 11.15f, 16.0f)
                curveTo(11.15f, 13.32f, 13.32f, 11.15f, 16.0f, 11.15f)
                moveTo(15.0f, 13.0f)
                verticalLineTo(16.69f)
                lineTo(18.19f, 18.53f)
                lineTo(18.94f, 17.23f)
                lineTo(16.5f, 15.82f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _calendarClockOutline!!
    }

private var _calendarClockOutline: ImageVector? = null
