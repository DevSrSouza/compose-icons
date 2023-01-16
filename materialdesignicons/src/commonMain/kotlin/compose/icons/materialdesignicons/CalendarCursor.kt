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

public val MaterialDesignIcons.CalendarCursor: ImageVector
    get() {
        if (_calendarCursor != null) {
            return _calendarCursor!!
        }
        _calendarCursor = Builder(name = "CalendarCursor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.86f, 17.74f)
                curveTo(22.77f, 17.85f, 22.65f, 17.91f, 22.53f, 17.94f)
                lineTo(20.66f, 18.3f)
                lineTo(21.95f, 21.14f)
                curveTo(22.11f, 21.43f, 21.97f, 21.79f, 21.67f, 21.93f)
                lineTo(19.53f, 22.94f)
                curveTo(19.44f, 23.0f, 19.36f, 23.0f, 19.27f, 23.0f)
                curveTo(19.05f, 23.0f, 18.84f, 22.88f, 18.74f, 22.66f)
                lineTo(17.45f, 19.83f)
                lineTo(15.96f, 21.04f)
                curveTo(15.86f, 21.12f, 15.74f, 21.17f, 15.59f, 21.17f)
                curveTo(15.26f, 21.17f, 15.0f, 20.9f, 15.0f, 20.57f)
                verticalLineTo(11.6f)
                curveTo(15.0f, 11.27f, 15.26f, 11.0f, 15.59f, 11.0f)
                curveTo(15.74f, 11.0f, 15.88f, 11.05f, 16.0f, 11.13f)
                lineTo(22.77f, 16.89f)
                curveTo(23.04f, 17.12f, 23.07f, 17.5f, 22.86f, 17.74f)
                moveTo(12.0f, 15.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.0f)
                moveTo(19.0f, 3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.89f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.06f)
                lineTo(21.0f, 12.76f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                close()
            }
        }
        .build()
        return _calendarCursor!!
    }

private var _calendarCursor: ImageVector? = null
