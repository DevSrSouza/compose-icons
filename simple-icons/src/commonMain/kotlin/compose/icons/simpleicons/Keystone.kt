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

public val SimpleIcons.Keystone: ImageVector
    get() {
        if (_keystone != null) {
            return _keystone!!
        }
        _keystone = Builder(name = "Keystone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 0.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 0.0f, 4.5f)
                verticalLineToRelative(15.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 4.5f, 24.0f)
                horizontalLineToRelative(15.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 4.5f, -4.5f)
                verticalLineToRelative(-15.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 19.5f, 0.0f)
                close()
                moveTo(9.97f, 14.789f)
                verticalLineToRelative(3.586f)
                lineTo(6.744f, 18.375f)
                lineTo(6.744f, 5.692f)
                lineTo(9.97f, 5.692f)
                verticalLineToRelative(5.45f)
                horizontalLineToRelative(0.167f)
                lineToRelative(4.218f, -5.45f)
                horizontalLineToRelative(3.463f)
                lineToRelative(-4.385f, 5.599f)
                lineToRelative(4.64f, 7.084f)
                horizontalLineToRelative(-3.788f)
                lineToRelative(-3.2f, -5.001f)
                close()
            }
        }
        .build()
        return _keystone!!
    }

private var _keystone: ImageVector? = null
