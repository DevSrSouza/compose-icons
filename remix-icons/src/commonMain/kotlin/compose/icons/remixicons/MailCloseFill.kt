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

public val RemixIcons.MailCloseFill: ImageVector
    get() {
        if (_mailCloseFill != null) {
            return _mailCloseFill!!
        }
        _mailCloseFill = Builder(name = "MailCloseFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.341f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 14.341f, 21.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(9.341f)
                close()
                moveTo(12.06f, 11.683f)
                lineTo(5.648f, 6.238f)
                lineTo(4.353f, 7.762f)
                lineToRelative(7.72f, 6.555f)
                lineToRelative(7.581f, -6.56f)
                lineToRelative(-1.308f, -1.513f)
                lineToRelative(-6.285f, 5.439f)
                close()
                moveTo(21.415f, 19.0f)
                lineToRelative(2.122f, 2.121f)
                lineToRelative(-1.415f, 1.415f)
                lineTo(20.0f, 20.414f)
                lineToRelative(-2.121f, 2.122f)
                lineToRelative(-1.415f, -1.415f)
                lineTo(18.586f, 19.0f)
                lineToRelative(-2.122f, -2.121f)
                lineToRelative(1.415f, -1.415f)
                lineTo(20.0f, 17.586f)
                lineToRelative(2.121f, -2.122f)
                lineToRelative(1.415f, 1.415f)
                lineTo(21.414f, 19.0f)
                close()
            }
        }
        .build()
        return _mailCloseFill!!
    }

private var _mailCloseFill: ImageVector? = null