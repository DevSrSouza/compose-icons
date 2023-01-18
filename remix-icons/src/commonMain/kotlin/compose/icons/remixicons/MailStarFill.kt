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

public val RemixIcons.MailStarFill: ImageVector
    get() {
        if (_mailStarFill != null) {
            return _mailStarFill!!
        }
        _mailStarFill = Builder(name = "MailStarFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 14.044f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 13.689f, 21.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(10.044f)
                close()
                moveTo(12.06f, 11.683f)
                lineTo(5.648f, 6.238f)
                lineTo(4.353f, 7.762f)
                lineToRelative(7.72f, 6.555f)
                lineToRelative(7.581f, -6.56f)
                lineToRelative(-1.308f, -1.513f)
                lineToRelative(-6.285f, 5.439f)
                close()
                moveTo(19.5f, 21.75f)
                lineToRelative(-2.645f, 1.39f)
                lineToRelative(0.505f, -2.945f)
                lineToRelative(-2.14f, -2.086f)
                lineToRelative(2.957f, -0.43f)
                lineTo(19.5f, 15.0f)
                lineToRelative(1.323f, 2.68f)
                lineToRelative(2.957f, 0.43f)
                lineToRelative(-2.14f, 2.085f)
                lineToRelative(0.505f, 2.946f)
                lineTo(19.5f, 21.75f)
                close()
            }
        }
        .build()
        return _mailStarFill!!
    }

private var _mailStarFill: ImageVector? = null
