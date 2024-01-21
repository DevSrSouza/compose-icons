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

public val SimpleIcons.Platformdotsh: ImageVector
    get() {
        if (_platformdotsh != null) {
            return _platformdotsh!!
        }
        _platformdotsh = Builder(name = "Platformdotsh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(9.541f)
                horizontalLineToRelative(24.0f)
                verticalLineTo(0.0f)
                close()
                moveTo(24.0f, 20.755f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-3.245f)
                close()
                moveTo(0.0f, 12.618f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(4.892f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-4.892f)
                close()
            }
        }
        .build()
        return _platformdotsh!!
    }

private var _platformdotsh: ImageVector? = null
