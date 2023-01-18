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

public val RemixIcons.TwitchLine: ImageVector
    get() {
        if (_twitchLine != null) {
            return _twitchLine!!
        }
        _twitchLine = Builder(name = "TwitchLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.3f, 3.0f)
                lineTo(21.0f, 3.0f)
                verticalLineToRelative(11.7f)
                lineToRelative(-4.7f, 4.7f)
                horizontalLineToRelative(-3.9f)
                lineToRelative(-2.5f, 2.4f)
                lineTo(7.0f, 21.8f)
                verticalLineToRelative(-2.4f)
                lineTo(3.0f, 19.4f)
                lineTo(3.0f, 6.2f)
                lineTo(4.3f, 3.0f)
                close()
                moveTo(5.0f, 17.4f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.4f)
                horizontalLineToRelative(0.095f)
                lineToRelative(2.5f, -2.4f)
                horizontalLineToRelative(3.877f)
                lineTo(19.0f, 13.872f)
                lineTo(19.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                verticalLineToRelative(12.4f)
                close()
                moveTo(15.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.7f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 8.0f)
                close()
                moveTo(15.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.7f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 8.0f)
                close()
                moveTo(10.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.7f)
                horizontalLineToRelative(-2.0f)
                lineTo(10.0f, 8.0f)
                close()
            }
        }
        .build()
        return _twitchLine!!
    }

private var _twitchLine: ImageVector? = null
