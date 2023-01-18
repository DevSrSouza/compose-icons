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

public val RemixIcons.MailCheckLine: ImageVector
    get() {
        if (_mailCheckLine != null) {
            return _mailCheckLine!!
        }
        _mailCheckLine = Builder(name = "MailCheckLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(7.238f)
                lineToRelative(-7.928f, 7.1f)
                lineTo(4.0f, 7.216f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(4.511f, 5.0f)
                lineToRelative(7.55f, 6.662f)
                lineTo(19.502f, 5.0f)
                horizontalLineTo(4.511f)
                close()
                moveTo(19.0f, 22.0f)
                lineToRelative(-3.536f, -3.536f)
                lineToRelative(1.415f, -1.414f)
                lineTo(19.0f, 19.172f)
                lineToRelative(3.536f, -3.536f)
                lineToRelative(1.414f, 1.414f)
                lineTo(19.0f, 22.0f)
                close()
            }
        }
        .build()
        return _mailCheckLine!!
    }

private var _mailCheckLine: ImageVector? = null
