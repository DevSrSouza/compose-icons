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

public val RemixIcons.MailOpenLine: ImageVector
    get() {
        if (_mailOpenLine != null) {
            return _mailOpenLine!!
        }
        _mailOpenLine = Builder(name = "MailOpenLine", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(4.0f, 8.133f)
                lineTo(4.0f, 19.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 8.132f)
                lineToRelative(-7.996f, -4.8f)
                lineTo(4.0f, 8.132f)
                close()
                moveTo(12.06f, 13.698f)
                lineToRelative(5.296f, -4.463f)
                lineToRelative(1.288f, 1.53f)
                lineToRelative(-6.57f, 5.537f)
                lineToRelative(-6.71f, -5.53f)
                lineToRelative(1.272f, -1.544f)
                lineToRelative(5.424f, 4.47f)
                close()
            }
        }
        .build()
        return _mailOpenLine!!
    }

private var _mailOpenLine: ImageVector? = null
