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

public val RemixIcons.MailUnreadLine: ImageVector
    get() {
        if (_mailUnreadLine != null) {
            return _mailUnreadLine!!
        }
        _mailUnreadLine = Builder(name = "MailUnreadLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.1f, 3.0f)
                arcToRelative(5.023f, 5.023f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(4.511f)
                lineToRelative(7.55f, 6.662f)
                lineToRelative(5.049f, -4.52f)
                curveToRelative(0.426f, 0.527f, 0.958f, 0.966f, 1.563f, 1.285f)
                lineToRelative(-6.601f, 5.911f)
                lineTo(4.0f, 7.216f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(8.9f)
                arcToRelative(5.023f, 5.023f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(13.1f)
                close()
                moveTo(21.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _mailUnreadLine!!
    }

private var _mailUnreadLine: ImageVector? = null
