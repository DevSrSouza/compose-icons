package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
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

public val CssGgIcons.CalendarTwo: ImageVector
    get() {
        if (_calendarTwo != null) {
            return _calendarTwo!!
        }
        _calendarTwo = Builder(name = "CalendarTwo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 7.0f)
                curveTo(7.448f, 7.0f, 7.0f, 7.448f, 7.0f, 8.0f)
                curveTo(7.0f, 8.552f, 7.448f, 9.0f, 8.0f, 9.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 9.0f, 17.0f, 8.552f, 17.0f, 8.0f)
                curveTo(17.0f, 7.448f, 16.552f, 7.0f, 16.0f, 7.0f)
                horizontalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 6.0f)
                curveTo(3.0f, 4.343f, 4.343f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(18.0f)
                curveTo(19.657f, 3.0f, 21.0f, 4.343f, 21.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 19.657f, 19.657f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 21.0f, 3.0f, 19.657f, 3.0f, 18.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(6.0f, 5.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 5.0f, 19.0f, 5.448f, 19.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(19.0f, 18.552f, 18.552f, 19.0f, 18.0f, 19.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 19.0f, 5.0f, 18.552f, 5.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(5.0f, 5.448f, 5.448f, 5.0f, 6.0f, 5.0f)
                close()
            }
        }
        .build()
        return _calendarTwo!!
    }

private var _calendarTwo: ImageVector? = null
