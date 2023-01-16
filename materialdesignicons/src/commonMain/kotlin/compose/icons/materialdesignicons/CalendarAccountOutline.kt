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

public val MaterialDesignIcons.CalendarAccountOutline: ImageVector
    get() {
        if (_calendarAccountOutline != null) {
            return _calendarAccountOutline!!
        }
        _calendarAccountOutline = Builder(name = "CalendarAccountOutline", defaultWidth = 24.0.dp,
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
                curveTo(3.0f, 20.11f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 21.0f, 21.0f, 20.11f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.11f, 3.0f, 19.0f, 3.0f)
                moveTo(19.0f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                moveTo(19.0f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                moveTo(12.0f, 10.0f)
                curveTo(14.0f, 10.0f, 15.0f, 12.42f, 13.59f, 13.84f)
                curveTo(12.17f, 15.26f, 9.75f, 14.25f, 9.75f, 12.25f)
                curveTo(9.75f, 11.0f, 10.75f, 10.0f, 12.0f, 10.0f)
                moveTo(16.5f, 17.88f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(17.88f)
                curveTo(7.5f, 16.63f, 9.5f, 15.63f, 12.0f, 15.63f)
                reflectiveCurveTo(16.5f, 16.63f, 16.5f, 17.88f)
                close()
            }
        }
        .build()
        return _calendarAccountOutline!!
    }

private var _calendarAccountOutline: ImageVector? = null
