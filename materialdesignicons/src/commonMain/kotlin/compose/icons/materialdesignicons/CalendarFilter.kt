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

public val MaterialDesignIcons.CalendarFilter: ImageVector
    get() {
        if (_calendarFilter != null) {
            return _calendarFilter!!
        }
        _calendarFilter = Builder(name = "CalendarFilter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 1.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 3.0f, 21.0f, 3.9f, 21.0f, 5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.11f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.9f, 3.9f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(1.0f)
                moveTo(17.0f, 21.0f)
                lineTo(18.8f, 22.77f)
                curveTo(19.3f, 23.27f, 20.0f, 22.87f, 20.0f, 22.28f)
                verticalLineTo(18.0f)
                lineTo(22.8f, 14.6f)
                curveTo(23.3f, 13.9f, 22.8f, 13.0f, 22.0f, 13.0f)
                horizontalLineTo(15.0f)
                curveTo(14.2f, 13.0f, 13.7f, 14.0f, 14.2f, 14.6f)
                lineTo(17.0f, 18.0f)
                verticalLineTo(21.0f)
            }
        }
        .build()
        return _calendarFilter!!
    }

private var _calendarFilter: ImageVector? = null
