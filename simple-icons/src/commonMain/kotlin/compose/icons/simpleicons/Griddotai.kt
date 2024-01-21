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

public val SimpleIcons.Griddotai: ImageVector
    get() {
        if (_griddotai != null) {
            return _griddotai!!
        }
        _griddotai = Builder(name = "Griddotai", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.732f, 9.091f)
                verticalLineToRelative(-3.52f)
                horizontalLineTo(6.506f)
                verticalLineToRelative(12.816f)
                horizontalLineToRelative(5.612f)
                verticalLineToRelative(-5.613f)
                horizontalLineToRelative(11.226f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(-5.613f)
                verticalLineToRelative(-5.613f)
                horizontalLineTo(12.12f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(6.965f, 6.965f, 0.0f, false, true, -6.964f, -6.964f)
                verticalLineTo(6.966f)
                arcTo(6.966f, 6.966f, 0.0f, false, true, 7.619f, 0.0f)
                horizontalLineToRelative(8.762f)
                arcToRelative(6.965f, 6.965f, 0.0f, false, true, 6.964f, 6.964f)
                verticalLineToRelative(2.127f)
                horizontalLineToRelative(-5.613f)
                close()
            }
        }
        .build()
        return _griddotai!!
    }

private var _griddotai: ImageVector? = null
