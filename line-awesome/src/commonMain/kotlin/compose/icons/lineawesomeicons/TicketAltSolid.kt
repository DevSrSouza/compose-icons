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

public val LineAwesomeIcons.TicketAltSolid: ImageVector
    get() {
        if (_ticketAltSolid != null) {
            return _ticketAltSolid!!
        }
        _ticketAltSolid = Builder(name = "TicketAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                lineTo(2.0f, 14.0f)
                lineTo(3.0f, 14.0f)
                curveTo(4.1914f, 14.0f, 5.0f, 14.8086f, 5.0f, 16.0f)
                curveTo(5.0f, 17.1914f, 4.1914f, 18.0f, 3.0f, 18.0f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 25.0f)
                lineTo(30.0f, 25.0f)
                lineTo(30.0f, 18.0f)
                lineTo(29.0f, 18.0f)
                curveTo(27.8086f, 18.0f, 27.0f, 17.1914f, 27.0f, 16.0f)
                curveTo(27.0f, 14.8086f, 27.8086f, 14.0f, 29.0f, 14.0f)
                lineTo(30.0f, 14.0f)
                lineTo(30.0f, 7.0f)
                close()
                moveTo(4.0f, 9.0f)
                lineTo(28.0f, 9.0f)
                lineTo(28.0f, 12.1875f)
                curveTo(26.2852f, 12.6367f, 25.0f, 14.1445f, 25.0f, 16.0f)
                curveTo(25.0f, 17.8555f, 26.2852f, 19.3633f, 28.0f, 19.8125f)
                lineTo(28.0f, 23.0f)
                lineTo(4.0f, 23.0f)
                lineTo(4.0f, 19.8125f)
                curveTo(5.7148f, 19.3633f, 7.0f, 17.8555f, 7.0f, 16.0f)
                curveTo(7.0f, 14.1445f, 5.7148f, 12.6367f, 4.0f, 12.1875f)
                close()
            }
        }
        .build()
        return _ticketAltSolid!!
    }

private var _ticketAltSolid: ImageVector? = null
