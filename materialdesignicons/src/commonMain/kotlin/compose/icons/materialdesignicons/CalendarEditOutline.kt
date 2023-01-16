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

public val MaterialDesignIcons.CalendarEditOutline: ImageVector
    get() {
        if (_calendarEditOutline != null) {
            return _calendarEditOutline!!
        }
        _calendarEditOutline = Builder(name = "CalendarEditOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7f, 13.35f)
                lineTo(20.7f, 14.35f)
                lineTo(18.65f, 12.35f)
                lineTo(19.65f, 11.35f)
                curveTo(19.85f, 11.14f, 20.19f, 11.13f, 20.42f, 11.35f)
                lineTo(21.7f, 12.63f)
                curveTo(21.89f, 12.83f, 21.89f, 13.15f, 21.7f, 13.35f)
                moveTo(12.0f, 18.94f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.06f)
                lineTo(20.12f, 14.88f)
                lineTo(18.07f, 12.88f)
                lineTo(12.0f, 18.94f)
                moveTo(5.0f, 19.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.11f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.9f, 3.9f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 3.0f, 21.0f, 3.9f, 21.0f, 5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                moveTo(5.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _calendarEditOutline!!
    }

private var _calendarEditOutline: ImageVector? = null
