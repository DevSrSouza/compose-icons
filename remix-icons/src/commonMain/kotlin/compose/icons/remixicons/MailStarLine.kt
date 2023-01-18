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

public val RemixIcons.MailStarLine: ImageVector
    get() {
        if (_mailStarLine != null) {
            return _mailStarLine!!
        }
        _mailStarLine = Builder(name = "MailStarLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.0f)
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
                verticalLineToRelative(9.0f)
                close()
                moveTo(4.511f, 5.0f)
                lineToRelative(7.55f, 6.662f)
                lineTo(19.502f, 5.0f)
                horizontalLineTo(4.511f)
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
        return _mailStarLine!!
    }

private var _mailStarLine: ImageVector? = null
