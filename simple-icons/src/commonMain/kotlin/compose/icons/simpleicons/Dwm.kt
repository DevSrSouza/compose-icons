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

public val SimpleIcons.Dwm: ImageVector
    get() {
        if (_dwm != null) {
            return _dwm!!
        }
        _dwm = Builder(name = "Dwm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _dwm!!
    }

private var _dwm: ImageVector? = null
