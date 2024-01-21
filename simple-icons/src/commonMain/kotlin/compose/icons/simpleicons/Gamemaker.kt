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

public val SimpleIcons.Gamemaker: ImageVector
    get() {
        if (_gamemaker != null) {
            return _gamemaker!!
        }
        _gamemaker = Builder(name = "Gamemaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.012f, 11.994f)
                lineTo(12.006f, 0.0f)
                lineToRelative(11.982f, 12.006f)
                horizontalLineToRelative(-6.831f)
                lineToRelative(-5.163f, -5.151f)
                lineToRelative(-5.151f, 5.151f)
                lineToRelative(5.163f, 5.151f)
                verticalLineToRelative(-5.151f)
                horizontalLineToRelative(5.151f)
                verticalLineToRelative(6.903f)
                lineTo(12.006f, 24.0f)
                close()
            }
        }
        .build()
        return _gamemaker!!
    }

private var _gamemaker: ImageVector? = null
