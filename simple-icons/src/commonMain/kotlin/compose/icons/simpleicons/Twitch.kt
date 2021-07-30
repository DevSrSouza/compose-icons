package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Twitch: ImageVector
    get() {
        if (_twitch != null) {
            return _twitch!!
        }
        _twitch = Builder(name = "Twitch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.571f, 4.714f)
                horizontalLineToRelative(1.715f)
                verticalLineToRelative(5.143f)
                lineTo(11.57f, 9.857f)
                close()
                moveTo(16.286f, 4.714f)
                lineTo(18.0f, 4.714f)
                verticalLineToRelative(5.143f)
                horizontalLineToRelative(-1.714f)
                close()
                moveTo(6.0f, 0.0f)
                lineTo(1.714f, 4.286f)
                verticalLineToRelative(15.428f)
                horizontalLineToRelative(5.143f)
                lineTo(6.857f, 24.0f)
                lineToRelative(4.286f, -4.286f)
                horizontalLineToRelative(3.428f)
                lineTo(22.286f, 12.0f)
                lineTo(22.286f, 0.0f)
                close()
                moveTo(20.571f, 11.143f)
                lineToRelative(-3.428f, 3.428f)
                horizontalLineToRelative(-3.429f)
                lineToRelative(-3.0f, 3.0f)
                verticalLineToRelative(-3.0f)
                lineTo(6.857f, 14.571f)
                lineTo(6.857f, 1.714f)
                horizontalLineToRelative(13.714f)
                close()
            }
        }
        .build()
        return _twitch!!
    }

private var _twitch: ImageVector? = null
