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

public val SimpleIcons.Awesomewm: ImageVector
    get() {
        if (_awesomewm != null) {
            return _awesomewm!!
        }
        _awesomewm = Builder(name = "Awesomewm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 24.0f)
                verticalLineTo(8.25f)
                horizontalLineToRelative(16.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(0.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-8.25f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(8.25f)
                verticalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _awesomewm!!
    }

private var _awesomewm: ImageVector? = null
