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

public val RemixIcons.MailOpenFill: ImageVector
    get() {
        if (_mailOpenFill != null) {
            return _mailOpenFill!!
        }
        _mailOpenFill = Builder(name = "MailOpenFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.243f, 6.854f)
                lineTo(11.49f, 1.31f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.029f, 0.0f)
                lineToRelative(9.238f, 5.545f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.243f, 0.429f)
                lineTo(22.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 7.283f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.243f, -0.429f)
                close()
                moveTo(18.346f, 8.244f)
                lineToRelative(-6.285f, 5.439f)
                lineToRelative(-6.414f, -5.445f)
                lineToRelative(-1.294f, 1.524f)
                lineToRelative(7.72f, 6.555f)
                lineToRelative(7.581f, -6.56f)
                lineToRelative(-1.308f, -1.513f)
                close()
            }
        }
        .build()
        return _mailOpenFill!!
    }

private var _mailOpenFill: ImageVector? = null
