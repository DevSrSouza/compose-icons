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

public val MaterialDesignIcons.CalendarMultiple: ImageVector
    get() {
        if (_calendarMultiple != null) {
            return _calendarMultiple!!
        }
        _calendarMultiple = Builder(name = "CalendarMultiple", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                moveTo(21.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 23.0f, 5.0f)
                verticalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 19.0f)
                horizontalLineTo(7.0f)
                curveTo(5.89f, 19.0f, 5.0f, 18.1f, 5.0f, 17.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0f)
                moveTo(3.0f, 21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(3.0f)
                curveTo(1.89f, 23.0f, 1.0f, 22.1f, 1.0f, 21.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(21.0f)
                moveTo(19.0f, 15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _calendarMultiple!!
    }

private var _calendarMultiple: ImageVector? = null
