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

public val RemixIcons.MailVolumeLine: ImageVector
    get() {
        if (_mailVolumeLine != null) {
            return _mailVolumeLine!!
        }
        _mailVolumeLine = Builder(name = "MailVolumeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 14.5f)
                verticalLineToRelative(9.0f)
                lineTo(16.667f, 21.0f)
                lineTo(14.0f, 21.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.667f)
                lineTo(20.0f, 14.5f)
                close()
                moveTo(21.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(20.0f, 7.237f)
                lineToRelative(-7.928f, 7.101f)
                lineTo(4.0f, 7.215f)
                lineTo(4.0f, 19.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(21.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.15f, 3.995f)
                lineTo(21.0f, 21.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(19.5f, 5.0f)
                lineTo(4.511f, 5.0f)
                lineToRelative(7.55f, 6.662f)
                lineTo(19.5f, 5.0f)
                close()
            }
        }
        .build()
        return _mailVolumeLine!!
    }

private var _mailVolumeLine: ImageVector? = null
