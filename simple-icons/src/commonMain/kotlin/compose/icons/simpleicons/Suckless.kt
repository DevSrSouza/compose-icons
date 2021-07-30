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

public val SimpleIcons.Suckless: ImageVector
    get() {
        if (_suckless != null) {
            return _suckless!!
        }
        _suckless = Builder(name = "Suckless", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 4.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(10.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _suckless!!
    }

private var _suckless: ImageVector? = null
