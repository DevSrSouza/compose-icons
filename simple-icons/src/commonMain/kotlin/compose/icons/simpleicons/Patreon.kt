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

public val SimpleIcons.Patreon: ImageVector
    get() {
        if (_patreon != null) {
            return _patreon!!
        }
        _patreon = Builder(name = "Patreon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.957f, 7.21f)
                curveToRelative(-0.004f, -3.064f, -2.391f, -5.576f, -5.191f, -6.482f)
                curveToRelative(-3.478f, -1.125f, -8.064f, -0.962f, -11.384f, 0.604f)
                curveTo(2.357f, 3.231f, 1.093f, 7.391f, 1.046f, 11.54f)
                curveToRelative(-0.039f, 3.411f, 0.302f, 12.396f, 5.369f, 12.46f)
                curveToRelative(3.765f, 0.047f, 4.326f, -4.804f, 6.068f, -7.141f)
                curveToRelative(1.24f, -1.662f, 2.836f, -2.132f, 4.801f, -2.618f)
                curveToRelative(3.376f, -0.836f, 5.678f, -3.501f, 5.673f, -7.031f)
                close()
            }
        }
        .build()
        return _patreon!!
    }

private var _patreon: ImageVector? = null
