package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.MailForbidFill: ImageVector
    get() {
        if (_mailForbidFill != null) {
            return _mailForbidFill!!
        }
        _mailForbidFill = Builder(name = "MailForbidFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.266f, 11.554f)
                lineToRelative(4.388f, -3.798f)
                lineToRelative(-1.308f, -1.512f)
                lineToRelative(-6.285f, 5.439f)
                lineToRelative(-6.414f, -5.445f)
                lineToRelative(-1.294f, 1.524f)
                lineToRelative(7.702f, 6.54f)
                arcTo(6.967f, 6.967f, 0.0f, false, false, 11.0f, 18.0f)
                curveToRelative(0.0f, 1.074f, 0.242f, 2.09f, 0.674f, 3.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(8.255f)
                arcTo(6.968f, 6.968f, 0.0f, false, false, 18.0f, 11.0f)
                curveToRelative(-0.97f, 0.0f, -1.894f, 0.197f, -2.734f, 0.554f)
                close()
                moveTo(16.706f, 20.708f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.001f, -4.001f)
                lineToRelative(-4.0f, 4.0f)
                close()
                moveTo(15.292f, 19.293f)
                lineToRelative(4.001f, -4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.001f, 4.001f)
                close()
                moveTo(18.0f, 23.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, -10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 10.0f)
                close()
            }
        }
        .build()
        return _mailForbidFill!!
    }

private var _mailForbidFill: ImageVector? = null
