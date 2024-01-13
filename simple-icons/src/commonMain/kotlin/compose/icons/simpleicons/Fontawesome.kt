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

public val SimpleIcons.Fontawesome: ImageVector
    get() {
        if (_fontawesome != null) {
            return _fontawesome!!
        }
        _fontawesome = Builder(name = "Fontawesome", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.857f)
                verticalLineToRelative(18.0f)
                curveToRelative(-3.375f, 1.232f, -4.393f, 1.714f, -6.375f, 1.714f)
                curveToRelative(-3.375f, 0.0f, -4.66f, -1.714f, -8.036f, -1.714f)
                curveToRelative(-1.071f, 0.0f, -1.928f, 0.214f, -2.732f, 0.429f)
                verticalLineToRelative(-3.429f)
                curveToRelative(0.804f, -0.214f, 1.661f, -0.428f, 2.732f, -0.428f)
                curveToRelative(3.375f, 0.0f, 4.661f, 1.714f, 8.036f, 1.714f)
                curveToRelative(1.071f, 0.0f, 1.875f, -0.16f, 2.946f, -0.482f)
                verticalLineTo(5.518f)
                curveTo(19.5f, 5.839f, 18.696f, 6.0f, 17.625f, 6.0f)
                curveToRelative(-3.375f, 0.0f, -4.66f, -1.714f, -8.036f, -1.714f)
                curveToRelative(-2.732f, 0.0f, -4.017f, 1.125f, -6.16f, 1.553f)
                verticalLineToRelative(16.447f)
                arcTo(1.693f, 1.693f, 0.0f, false, true, 1.714f, 24.0f)
                arcTo(1.693f, 1.693f, 0.0f, false, true, 0.0f, 22.286f)
                verticalLineTo(1.714f)
                arcTo(1.693f, 1.693f, 0.0f, false, true, 1.714f, 0.0f)
                arcTo(1.693f, 1.693f, 0.0f, false, true, 3.43f, 1.714f)
                verticalLineToRelative(0.697f)
                curveTo(5.572f, 1.982f, 6.857f, 0.857f, 9.589f, 0.857f)
                curveToRelative(3.375f, 0.0f, 4.661f, 1.715f, 8.036f, 1.715f)
                curveToRelative(1.982f, 0.0f, 3.0f, -0.483f, 6.375f, -1.715f)
                close()
            }
        }
        .build()
        return _fontawesome!!
    }

private var _fontawesome: ImageVector? = null
