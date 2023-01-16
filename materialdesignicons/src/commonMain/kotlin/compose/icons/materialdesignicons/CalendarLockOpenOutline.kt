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

public val MaterialDesignIcons.CalendarLockOpenOutline: ImageVector
    get() {
        if (_calendarLockOpenOutline != null) {
            return _calendarLockOpenOutline!!
        }
        _calendarLockOpenOutline = Builder(name = "CalendarLockOpenOutline", defaultWidth = 24.0.dp,
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
                horizontalLineTo(12.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.1f)
                curveTo(19.7f, 10.3f, 20.4f, 10.6f, 21.0f, 11.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                moveTo(19.0f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                moveTo(22.0f, 21.8f)
                curveTo(22.0f, 22.4f, 21.4f, 23.0f, 20.7f, 23.0f)
                horizontalLineTo(15.2f)
                curveTo(14.6f, 23.0f, 14.0f, 22.4f, 14.0f, 21.7f)
                verticalLineTo(18.2f)
                curveTo(14.0f, 17.6f, 14.6f, 17.0f, 15.2f, 17.0f)
                verticalLineTo(14.5f)
                curveTo(15.2f, 13.1f, 16.6f, 12.0f, 18.0f, 12.0f)
                reflectiveCurveTo(20.8f, 13.1f, 20.8f, 14.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(14.5f)
                curveTo(19.5f, 13.7f, 18.8f, 13.2f, 18.0f, 13.2f)
                reflectiveCurveTo(16.5f, 13.7f, 16.5f, 14.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.8f)
                curveTo(21.4f, 17.0f, 22.0f, 17.6f, 22.0f, 18.3f)
                verticalLineTo(21.8f)
                close()
            }
        }
        .build()
        return _calendarLockOpenOutline!!
    }

private var _calendarLockOpenOutline: ImageVector? = null
