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

public val MaterialDesignIcons.CalendarCursorOutline: ImageVector
    get() {
        if (_calendarCursorOutline != null) {
            return _calendarCursorOutline!!
        }
        _calendarCursorOutline = Builder(name = "CalendarCursorOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.1f)
                lineTo(21.0f, 12.8f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                moveTo(19.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                moveTo(7.0f, 16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                moveTo(22.9f, 17.7f)
                curveTo(22.8f, 17.8f, 22.7f, 17.9f, 22.6f, 17.9f)
                lineTo(20.7f, 18.3f)
                lineTo(22.0f, 21.1f)
                curveTo(22.2f, 21.4f, 22.0f, 21.7f, 21.7f, 21.9f)
                lineTo(19.6f, 22.9f)
                curveTo(19.4f, 23.0f, 19.4f, 23.0f, 19.3f, 23.0f)
                curveTo(19.1f, 23.0f, 18.9f, 22.9f, 18.8f, 22.7f)
                lineTo(17.5f, 19.9f)
                lineTo(16.0f, 21.0f)
                curveTo(15.9f, 21.1f, 15.8f, 21.1f, 15.6f, 21.1f)
                curveTo(15.3f, 21.1f, 15.0f, 20.8f, 15.0f, 20.5f)
                verticalLineTo(11.5f)
                curveTo(15.0f, 11.2f, 15.3f, 10.9f, 15.6f, 10.9f)
                curveTo(15.7f, 10.9f, 15.9f, 11.0f, 16.0f, 11.0f)
                lineTo(22.8f, 16.8f)
                curveTo(23.0f, 17.1f, 23.1f, 17.5f, 22.9f, 17.7f)
                close()
            }
        }
        .build()
        return _calendarCursorOutline!!
    }

private var _calendarCursorOutline: ImageVector? = null
