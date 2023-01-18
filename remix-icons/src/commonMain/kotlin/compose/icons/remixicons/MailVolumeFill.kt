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

public val RemixIcons.MailVolumeFill: ImageVector
    get() {
        if (_mailVolumeFill != null) {
            return _mailVolumeFill!!
        }
        _mailVolumeFill = Builder(name = "MailVolumeFill", defaultWidth = 24.0.dp, defaultHeight =
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
                verticalLineToRelative(10.529f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.34f, 21.0f)
                lineTo(3.002f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.002f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(21.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.15f, 3.995f)
                lineTo(21.0f, 21.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(5.647f, 6.238f)
                lineTo(4.353f, 7.762f)
                lineToRelative(7.72f, 6.555f)
                lineToRelative(7.581f, -6.56f)
                lineToRelative(-1.308f, -1.513f)
                lineToRelative(-6.286f, 5.438f)
                lineToRelative(-6.413f, -5.444f)
                close()
            }
        }
        .build()
        return _mailVolumeFill!!
    }

private var _mailVolumeFill: ImageVector? = null
