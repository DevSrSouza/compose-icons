package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.CalendarDue: ImageVector
    get() {
        if (_calendarDue != null) {
            return _calendarDue!!
        }
        _calendarDue = Builder(name = "CalendarDue", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 8.0f)
                curveTo(7.0f, 7.4477f, 7.4477f, 7.0f, 8.0f, 7.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 7.0f, 17.0f, 7.4477f, 17.0f, 8.0f)
                curveTo(17.0f, 8.5523f, 16.5523f, 9.0f, 16.0f, 9.0f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 9.0f, 7.0f, 8.5523f, 7.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                curveTo(13.1046f, 16.0f, 14.0f, 15.1046f, 14.0f, 14.0f)
                curveTo(14.0f, 12.8954f, 13.1046f, 12.0f, 12.0f, 12.0f)
                curveTo(10.8954f, 12.0f, 10.0f, 12.8954f, 10.0f, 14.0f)
                curveTo(10.0f, 15.1046f, 10.8954f, 16.0f, 12.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 3.0f)
                curveTo(4.3432f, 3.0f, 3.0f, 4.3432f, 3.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 19.6569f, 4.3432f, 21.0f, 6.0f, 21.0f)
                horizontalLineTo(18.0f)
                curveTo(19.6569f, 21.0f, 21.0f, 19.6569f, 21.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 4.3432f, 19.6569f, 3.0f, 18.0f, 3.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(18.0f, 5.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 5.0f, 5.0f, 5.4477f, 5.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(5.0f, 18.5523f, 5.4477f, 19.0f, 6.0f, 19.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 19.0f, 19.0f, 18.5523f, 19.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(19.0f, 5.4477f, 18.5523f, 5.0f, 18.0f, 5.0f)
                close()
            }
        }
        .build()
        return _calendarDue!!
    }

private var _calendarDue: ImageVector? = null
