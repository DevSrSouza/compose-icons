package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.CalendarTimes: ImageVector
    get() {
        if (_calendarTimes != null) {
            return _calendarTimes!!
        }
        _calendarTimes = Builder(name = "CalendarTimes", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.0f)
                lineTo(9.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                lineTo(5.0f, 28.0f)
                lineTo(27.0f, 28.0f)
                lineTo(27.0f, 6.0f)
                lineTo(23.0f, 6.0f)
                lineTo(23.0f, 5.0f)
                lineTo(21.0f, 5.0f)
                lineTo(21.0f, 6.0f)
                lineTo(11.0f, 6.0f)
                lineTo(11.0f, 5.0f)
                close()
                moveTo(7.0f, 8.0f)
                lineTo(9.0f, 8.0f)
                lineTo(9.0f, 9.0f)
                lineTo(11.0f, 9.0f)
                lineTo(11.0f, 8.0f)
                lineTo(21.0f, 8.0f)
                lineTo(21.0f, 9.0f)
                lineTo(23.0f, 9.0f)
                lineTo(23.0f, 8.0f)
                lineTo(25.0f, 8.0f)
                lineTo(25.0f, 10.0f)
                lineTo(7.0f, 10.0f)
                close()
                moveTo(7.0f, 12.0f)
                lineTo(25.0f, 12.0f)
                lineTo(25.0f, 26.0f)
                lineTo(7.0f, 26.0f)
                close()
                moveTo(13.219f, 14.781f)
                lineTo(11.781f, 16.219f)
                lineTo(14.563f, 19.0f)
                lineTo(11.781f, 21.781f)
                lineTo(13.219f, 23.219f)
                lineTo(16.0f, 20.438f)
                lineTo(18.781f, 23.219f)
                lineTo(20.219f, 21.781f)
                lineTo(17.438f, 19.0f)
                lineTo(20.219f, 16.219f)
                lineTo(18.781f, 14.781f)
                lineTo(16.0f, 17.563f)
                close()
            }
        }
        .build()
        return _calendarTimes!!
    }

private var _calendarTimes: ImageVector? = null
