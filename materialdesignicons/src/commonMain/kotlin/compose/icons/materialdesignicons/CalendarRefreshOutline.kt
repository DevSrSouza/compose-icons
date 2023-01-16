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

public val MaterialDesignIcons.CalendarRefreshOutline: ImageVector
    get() {
        if (_calendarRefreshOutline != null) {
            return _calendarRefreshOutline!!
        }
        _calendarRefreshOutline = Builder(name = "CalendarRefreshOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(14.0f)
                curveTo(13.4f, 20.5f, 12.9f, 19.8f, 12.5f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.6f)
                curveTo(19.7f, 10.7f, 20.4f, 10.9f, 21.0f, 11.3f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                moveTo(19.0f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                moveTo(18.0f, 12.5f)
                curveTo(19.1f, 12.5f, 20.1f, 12.9f, 20.8f, 13.7f)
                lineTo(22.0f, 12.5f)
                verticalLineTo(16.5f)
                horizontalLineTo(18.0f)
                lineTo(19.8f, 14.7f)
                curveTo(19.3f, 14.3f, 18.7f, 14.0f, 18.0f, 14.0f)
                curveTo(16.6f, 14.0f, 15.5f, 15.1f, 15.5f, 16.5f)
                reflectiveCurveTo(16.6f, 19.0f, 18.0f, 19.0f)
                curveTo(18.8f, 19.0f, 19.5f, 18.6f, 20.0f, 18.0f)
                horizontalLineTo(21.7f)
                curveTo(21.1f, 19.5f, 19.7f, 20.5f, 18.0f, 20.5f)
                curveTo(15.8f, 20.5f, 14.0f, 18.7f, 14.0f, 16.5f)
                reflectiveCurveTo(15.8f, 12.5f, 18.0f, 12.5f)
                close()
            }
        }
        .build()
        return _calendarRefreshOutline!!
    }

private var _calendarRefreshOutline: ImageVector? = null
