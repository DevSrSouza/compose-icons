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

public val RemixIcons.TwitchFill: ImageVector
    get() {
        if (_twitchFill != null) {
            return _twitchFill!!
        }
        _twitchFill = Builder(name = "TwitchFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                verticalLineToRelative(11.74f)
                lineToRelative(-4.696f, 4.695f)
                horizontalLineToRelative(-3.913f)
                lineToRelative(-2.437f, 2.348f)
                lineTo(6.913f, 21.783f)
                verticalLineToRelative(-2.348f)
                lineTo(3.0f, 19.435f)
                lineTo(3.0f, 6.13f)
                lineTo(4.227f, 3.0f)
                lineTo(21.0f, 3.0f)
                close()
                moveTo(19.435f, 4.565f)
                lineTo(6.13f, 4.565f)
                verticalLineToRelative(11.74f)
                horizontalLineToRelative(3.13f)
                verticalLineToRelative(2.347f)
                lineToRelative(2.349f, -2.348f)
                horizontalLineToRelative(4.695f)
                lineToRelative(3.13f, -3.13f)
                lineTo(19.434f, 4.565f)
                close()
                moveTo(16.305f, 7.695f)
                verticalLineToRelative(4.696f)
                horizontalLineToRelative(-1.566f)
                lineTo(14.739f, 7.696f)
                horizontalLineToRelative(1.565f)
                close()
                moveTo(12.391f, 7.695f)
                verticalLineToRelative(4.696f)
                horizontalLineToRelative(-1.565f)
                lineTo(10.826f, 7.696f)
                horizontalLineToRelative(1.565f)
                close()
            }
        }
        .build()
        return _twitchFill!!
    }

private var _twitchFill: ImageVector? = null
