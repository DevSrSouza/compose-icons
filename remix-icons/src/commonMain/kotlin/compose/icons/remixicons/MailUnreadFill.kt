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

public val RemixIcons.MailUnreadFill: ImageVector
    get() {
        if (_mailUnreadFill != null) {
            return _mailUnreadFill!!
        }
        _mailUnreadFill = Builder(name = "MailUnreadFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.803f, 8.493f)
                arcTo(5.023f, 5.023f, 0.0f, false, false, 22.0f, 8.9f)
                verticalLineTo(20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(13.1f)
                curveToRelative(-0.066f, 0.323f, -0.1f, 0.658f, -0.1f, 1.0f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, false, 1.193f, 3.241f)
                lineToRelative(-5.132f, 4.442f)
                lineToRelative(-6.414f, -5.445f)
                lineToRelative(-1.294f, 1.524f)
                lineToRelative(7.72f, 6.555f)
                lineToRelative(6.73f, -5.824f)
                close()
                moveTo(21.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _mailUnreadFill!!
    }

private var _mailUnreadFill: ImageVector? = null
