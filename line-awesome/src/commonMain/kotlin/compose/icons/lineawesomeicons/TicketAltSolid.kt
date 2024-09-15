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
                curveTo(4.191f, 14.0f, 5.0f, 14.809f, 5.0f, 16.0f)
                curveTo(5.0f, 17.191f, 4.191f, 18.0f, 3.0f, 18.0f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 25.0f)
                lineTo(30.0f, 25.0f)
                lineTo(30.0f, 18.0f)
                lineTo(29.0f, 18.0f)
                curveTo(27.809f, 18.0f, 27.0f, 17.191f, 27.0f, 16.0f)
                curveTo(27.0f, 14.809f, 27.809f, 14.0f, 29.0f, 14.0f)
                lineTo(30.0f, 14.0f)
                lineTo(30.0f, 7.0f)
                close()
                moveTo(4.0f, 9.0f)
                lineTo(28.0f, 9.0f)
                lineTo(28.0f, 12.188f)
                curveTo(26.285f, 12.637f, 25.0f, 14.145f, 25.0f, 16.0f)
                curveTo(25.0f, 17.855f, 26.285f, 19.363f, 28.0f, 19.813f)
                lineTo(28.0f, 23.0f)
                lineTo(4.0f, 23.0f)
                lineTo(4.0f, 19.813f)
                curveTo(5.715f, 19.363f, 7.0f, 17.855f, 7.0f, 16.0f)
                curveTo(7.0f, 14.145f, 5.715f, 12.637f, 4.0f, 12.188f)
                close()
            }
        }
        .build()
        return _ticketAltSolid!!
    }

private var _ticketAltSolid: ImageVector? = null
