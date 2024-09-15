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

public val SimpleIcons.Sourcegraph: ImageVector
    get() {
        if (_sourcegraph != null) {
            return _sourcegraph!!
        }
        _sourcegraph = Builder(name = "Sourcegraph", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.462f, 0.001f)
                arcToRelative(2.413f, 2.413f, 0.0f, false, false, -0.721f, 0.085f)
                curveTo(7.453f, 0.438f, 6.695f, 1.769f, 7.048f, 3.057f)
                lineToRelative(1.431f, 5.232f)
                lineToRelative(-5.08f, -1.681f)
                curveTo(2.131f, 6.188f, 0.765f, 6.876f, 0.345f, 8.144f)
                curveToRelative(-0.419f, 1.268f, 0.269f, 2.635f, 1.535f, 3.055f)
                horizontalLineToRelative(0.0f)
                lineToRelative(5.878f, 1.945f)
                lineToRelative(-4.131f, 4.665f)
                curveToRelative(-0.886f, 1.0f, -0.793f, 2.528f, 0.206f, 3.414f)
                curveToRelative(0.999f, 0.886f, 2.526f, 0.793f, 3.411f, -0.206f)
                lineToRelative(3.603f, -4.068f)
                lineToRelative(1.442f, 5.273f)
                curveToRelative(0.352f, 1.288f, 1.682f, 2.046f, 2.969f, 1.694f)
                curveToRelative(1.288f, -0.353f, 2.046f, -1.682f, 1.693f, -2.97f)
                lineToRelative(-1.431f, -5.232f)
                lineToRelative(5.081f, 1.681f)
                curveToRelative(1.267f, 0.419f, 2.634f, -0.269f, 3.053f, -1.536f)
                curveToRelative(0.42f, -1.268f, -0.268f, -2.635f, -1.535f, -3.055f)
                lineToRelative(-5.878f, -1.944f)
                lineToRelative(4.131f, -4.664f)
                curveToRelative(0.886f, -1.0f, 0.793f, -2.528f, -0.206f, -3.414f)
                curveToRelative(-0.999f, -0.886f, -2.526f, -0.794f, -3.411f, 0.205f)
                verticalLineToRelative(0.0f)
                lineToRelative(-3.603f, 4.069f)
                lineToRelative(-1.443f, -5.274f)
                curveTo(11.422f, 0.734f, 10.491f, 0.037f, 9.462f, 0.001f)
                close()
            }
        }
        .build()
        return _sourcegraph!!
    }

private var _sourcegraph: ImageVector? = null
