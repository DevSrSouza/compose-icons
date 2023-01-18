package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.TicketSharp: ImageVector
    get() {
        if (_ticketSharp != null) {
            return _ticketSharp!!
        }
        _ticketSharp = Builder(name = "TicketSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(426.24f, 127.72f)
                lineTo(415.3f, 138.66f)
                arcToRelative(29.67f, 29.67f, 0.0f, false, true, -42.0f, -42.0f)
                lineToRelative(10.94f, -10.94f)
                lineTo(314.52f, 16.0f)
                lineToRelative(-88.0f, 88.0f)
                lineToRelative(-4.0f, 12.09f)
                lineToRelative(-12.09f, 4.0f)
                lineTo(16.0f, 314.52f)
                lineToRelative(69.76f, 69.76f)
                lineTo(96.7f, 373.34f)
                arcToRelative(29.67f, 29.67f, 0.0f, false, true, 42.0f, 42.0f)
                lineToRelative(-10.94f, 10.94f)
                lineTo(197.48f, 496.0f)
                lineToRelative(194.4f, -194.4f)
                lineToRelative(4.0f, -12.09f)
                lineToRelative(12.09f, -4.0f)
                lineToRelative(88.0f, -88.0f)
                close()
                moveTo(217.68f, 133.15f)
                lineTo(239.55f, 111.28f)
                lineTo(272.55f, 144.28f)
                lineTo(250.67f, 166.15f)
                close()
                moveTo(260.68f, 176.15f)
                lineTo(282.56f, 154.27f)
                lineTo(315.08f, 186.79f)
                lineTo(293.2f, 208.67f)
                close()
                moveTo(303.24f, 218.71f)
                lineTo(325.12f, 196.83f)
                lineTo(357.64f, 229.35f)
                lineTo(335.8f, 251.28f)
                close()
                moveTo(378.81f, 294.27f)
                lineTo(345.81f, 261.27f)
                lineTo(367.68f, 239.39f)
                lineTo(400.68f, 272.39f)
                close()
            }
        }
        .build()
        return _ticketSharp!!
    }

private var _ticketSharp: ImageVector? = null
