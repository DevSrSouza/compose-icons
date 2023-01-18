package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.TicketOutline: ImageVector
    get() {
        if (_ticketOutline != null) {
            return _ticketOutline!!
        }
        _ticketOutline = Builder(name = "TicketOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(366.05f, 146.0f)
                arcToRelative(46.7f, 46.7f, 0.0f, false, true, -2.42f, -63.42f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, false, -0.22f, -5.26f)
                lineTo(319.28f, 33.14f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, false, -5.5f, 0.0f)
                lineToRelative(-70.34f, 70.34f)
                arcToRelative(23.62f, 23.62f, 0.0f, false, false, -5.71f, 9.24f)
                horizontalLineToRelative(0.0f)
                arcToRelative(23.66f, 23.66f, 0.0f, false, true, -14.95f, 15.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(23.7f, 23.7f, 0.0f, false, false, -9.25f, 5.71f)
                lineTo(33.14f, 313.78f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, false, 0.0f, 5.5f)
                lineToRelative(44.13f, 44.13f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, false, 5.26f, 0.22f)
                arcToRelative(46.69f, 46.69f, 0.0f, false, true, 65.84f, 65.84f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, false, 0.22f, 5.26f)
                lineToRelative(44.13f, 44.13f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, false, 5.5f, 0.0f)
                lineToRelative(180.4f, -180.39f)
                arcToRelative(23.7f, 23.7f, 0.0f, false, false, 5.71f, -9.25f)
                horizontalLineToRelative(0.0f)
                arcToRelative(23.66f, 23.66f, 0.0f, false, true, 14.95f, -15.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(23.62f, 23.62f, 0.0f, false, false, 9.24f, -5.71f)
                lineToRelative(70.34f, -70.34f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, false, 0.0f, -5.5f)
                lineToRelative(-44.13f, -44.13f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, false, -5.26f, -0.22f)
                arcTo(46.7f, 46.7f, 0.0f, false, true, 366.05f, 146.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(250.5f, 140.44f)
                lineTo(233.99f, 123.93f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(294.52f, 184.46f)
                lineTo(283.51f, 173.46f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(338.54f, 228.49f)
                lineTo(327.54f, 217.48f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(388.07f, 278.01f)
                lineTo(371.56f, 261.5f)
            }
        }
        .build()
        return _ticketOutline!!
    }

private var _ticketOutline: ImageVector? = null
