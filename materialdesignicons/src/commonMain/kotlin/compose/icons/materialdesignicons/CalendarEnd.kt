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

public val MaterialDesignIcons.CalendarEnd: ImageVector
    get() {
        if (_calendarEnd != null) {
            return _calendarEnd!!
        }
        _calendarEnd = Builder(name = "CalendarEnd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                lineTo(16.0f, 22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                lineTo(20.0f, 18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(22.0f)
                moveTo(5.0f, 19.0f)
                lineTo(9.0f, 19.0f)
                verticalLineTo(21.0f)
                lineTo(5.0f, 21.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.1f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.89f, 3.9f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(0.998f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(0.998f)
                horizontalLineTo(18.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 3.0f, 21.0f, 3.89f, 21.0f, 5.0f)
                lineTo(21.0f, 12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _calendarEnd!!
    }

private var _calendarEnd: ImageVector? = null
