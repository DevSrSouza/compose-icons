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

public val CssGgIcons.CalendarNext: ImageVector
    get() {
        if (_calendarNext != null) {
            return _calendarNext!!
        }
        _calendarNext = Builder(name = "CalendarNext", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.725f, 16.546f)
                lineTo(16.225f, 13.948f)
                lineTo(11.725f, 11.35f)
                verticalLineTo(12.948f)
                horizontalLineTo(7.775f)
                verticalLineTo(14.948f)
                horizontalLineTo(11.725f)
                verticalLineTo(16.546f)
                close()
            }
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
                moveTo(6.0f, 3.0f)
                curveTo(4.343f, 3.0f, 3.0f, 4.343f, 3.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 19.657f, 4.343f, 21.0f, 6.0f, 21.0f)
                horizontalLineTo(18.0f)
                curveTo(19.657f, 21.0f, 21.0f, 19.657f, 21.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 4.343f, 19.657f, 3.0f, 18.0f, 3.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(18.0f, 5.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 5.0f, 5.0f, 5.448f, 5.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(5.0f, 18.552f, 5.448f, 19.0f, 6.0f, 19.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 19.0f, 19.0f, 18.552f, 19.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(19.0f, 5.448f, 18.552f, 5.0f, 18.0f, 5.0f)
                close()
            }
        }
        .build()
        return _calendarNext!!
    }

private var _calendarNext: ImageVector? = null
