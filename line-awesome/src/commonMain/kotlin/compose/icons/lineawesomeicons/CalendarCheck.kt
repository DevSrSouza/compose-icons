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

public val LineAwesomeIcons.CalendarCheck: ImageVector
    get() {
        if (_calendarCheck != null) {
            return _calendarCheck!!
        }
        _calendarCheck = Builder(name = "CalendarCheck", defaultWidth = 32.0.dp, defaultHeight =
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
                moveTo(20.281f, 14.281f)
                lineTo(15.0f, 19.563f)
                lineTo(12.719f, 17.281f)
                lineTo(11.281f, 18.719f)
                lineTo(14.281f, 21.719f)
                lineTo(15.0f, 22.406f)
                lineTo(15.719f, 21.719f)
                lineTo(21.719f, 15.719f)
                close()
            }
        }
        .build()
        return _calendarCheck!!
    }

private var _calendarCheck: ImageVector? = null
