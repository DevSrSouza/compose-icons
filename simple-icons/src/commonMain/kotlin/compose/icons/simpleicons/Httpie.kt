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

public val SimpleIcons.Httpie: ImageVector
    get() {
        if (_httpie != null) {
            return _httpie!!
        }
        _httpie = Builder(name = "Httpie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.28f, 0.0f)
                curveTo(4.4f, 0.0f, 1.992f, 2.279f, 1.933f, 5.155f)
                arcToRelative(5.263f, 5.263f, 0.0f, false, false, 5.26f, 5.358f)
                horizontalLineToRelative(4.223f)
                arcToRelative(0.306f, 0.306f, 0.0f, false, true, 0.122f, 0.584f)
                lineToRelative(-6.47f, 2.835f)
                arcToRelative(5.263f, 5.263f, 0.0f, false, false, -3.135f, 4.85f)
                curveTo(1.953f, 21.683f, 4.368f, 24.0f, 7.273f, 24.0f)
                horizontalLineToRelative(2.212f)
                curveToRelative(2.922f, 0.0f, 5.357f, -2.345f, 5.35f, -5.267f)
                arcToRelative(5.263f, 5.263f, 0.0f, false, false, -3.29f, -4.867f)
                arcToRelative(0.303f, 0.303f, 0.0f, false, true, -0.007f, -0.556f)
                lineToRelative(7.402f, -3.246f)
                arcToRelative(5.263f, 5.263f, 0.0f, false, false, 3.128f, -4.846f)
                curveTo(22.047f, 2.317f, 19.626f, 0.003f, 16.724f, 0.003f)
                close()
            }
        }
        .build()
        return _httpie!!
    }

private var _httpie: ImageVector? = null
