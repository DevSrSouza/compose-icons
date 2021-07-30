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

public val LineAwesomeIcons.CalendarTimesSolid: ImageVector
    get() {
        if (_calendarTimesSolid != null) {
            return _calendarTimesSolid!!
        }
        _calendarTimesSolid = Builder(name = "CalendarTimesSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(13.2188f, 14.7813f)
                lineTo(11.7813f, 16.2188f)
                lineTo(14.5625f, 19.0f)
                lineTo(11.7813f, 21.7813f)
                lineTo(13.2188f, 23.2188f)
                lineTo(16.0f, 20.4375f)
                lineTo(18.7813f, 23.2188f)
                lineTo(20.2188f, 21.7813f)
                lineTo(17.4375f, 19.0f)
                lineTo(20.2188f, 16.2188f)
                lineTo(18.7813f, 14.7813f)
                lineTo(16.0f, 17.5625f)
                close()
            }
        }
        .build()
        return _calendarTimesSolid!!
    }

private var _calendarTimesSolid: ImageVector? = null
