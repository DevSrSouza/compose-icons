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

public val MaterialDesignIcons.CalendarAccount: ImageVector
    get() {
        if (_calendarAccount != null) {
            return _calendarAccount!!
        }
        _calendarAccount = Builder(name = "CalendarAccount", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                curveTo(14.0f, 9.0f, 15.0f, 11.42f, 13.59f, 12.84f)
                curveTo(12.17f, 14.26f, 9.75f, 13.25f, 9.75f, 11.25f)
                curveTo(9.75f, 10.0f, 10.75f, 9.0f, 12.0f, 9.0f)
                moveTo(16.5f, 18.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(16.88f)
                curveTo(7.5f, 15.63f, 9.5f, 14.63f, 12.0f, 14.63f)
                reflectiveCurveTo(16.5f, 15.63f, 16.5f, 16.88f)
                moveTo(19.0f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                moveTo(16.0f, 1.0f)
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
                horizontalLineTo(18.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _calendarAccount!!
    }

private var _calendarAccount: ImageVector? = null
