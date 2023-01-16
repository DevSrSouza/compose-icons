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

public val MaterialDesignIcons.CalendarStart: ImageVector
    get() {
        if (_calendarStart != null) {
            return _calendarStart!!
        }
        _calendarStart = Builder(name = "CalendarStart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                lineTo(13.0f, 18.0f)
                lineTo(9.0f, 22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.0f)
                moveTo(19.0f, 19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(3.0f)
                lineTo(3.0f, 5.0f)
                curveTo(3.0f, 3.89f, 3.89f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(0.998f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(0.998f)
                horizontalLineTo(18.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 3.0f, 21.0f, 3.89f, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 20.1f, 20.1f, 21.0f, 19.0f, 21.0f)
                lineTo(12.83f, 21.0f)
                lineTo(14.83f, 19.0f)
                lineTo(19.0f, 19.0f)
                close()
            }
        }
        .build()
        return _calendarStart!!
    }

private var _calendarStart: ImageVector? = null
