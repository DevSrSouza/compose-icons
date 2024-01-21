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

public val SimpleIcons.Boardgamegeek: ImageVector
    get() {
        if (_boardgamegeek != null) {
            return _boardgamegeek!!
        }
        _boardgamegeek = Builder(name = "Boardgamegeek", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.7f, 4.44f)
                lineToRelative(-2.38f, 0.64f)
                lineTo(19.65f, 0.0f)
                lineTo(4.53f, 5.56f)
                lineToRelative(0.83f, 6.67f)
                lineToRelative(-1.4f, 1.34f)
                lineTo(8.12f, 24.0f)
                lineToRelative(8.85f, -3.26f)
                lineToRelative(3.07f, -7.22f)
                lineToRelative(-1.32f, -1.27f)
                lineToRelative(0.98f, -7.81f)
                close()
            }
        }
        .build()
        return _boardgamegeek!!
    }

private var _boardgamegeek: ImageVector? = null
