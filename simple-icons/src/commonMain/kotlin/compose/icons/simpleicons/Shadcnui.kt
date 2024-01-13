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

public val SimpleIcons.Shadcnui: ImageVector
    get() {
        if (_shadcnui != null) {
            return _shadcnui!!
        }
        _shadcnui = Builder(name = "Shadcnui", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.219f, 11.784f)
                lineTo(11.784f, 22.219f)
                curveToRelative(-0.407f, 0.407f, -0.407f, 1.068f, 0.0f, 1.476f)
                curveToRelative(0.407f, 0.407f, 1.068f, 0.407f, 1.476f, 0.0f)
                lineTo(23.695f, 13.26f)
                curveToRelative(0.407f, -0.408f, 0.407f, -1.069f, 0.0f, -1.476f)
                curveToRelative(-0.408f, -0.407f, -1.069f, -0.407f, -1.476f, 0.0f)
                close()
                moveTo(20.132f, 0.305f)
                lineTo(0.305f, 20.132f)
                curveToRelative(-0.407f, 0.407f, -0.407f, 1.068f, 0.0f, 1.476f)
                curveToRelative(0.408f, 0.407f, 1.069f, 0.407f, 1.476f, 0.0f)
                lineTo(21.608f, 1.781f)
                curveToRelative(0.407f, -0.407f, 0.407f, -1.068f, 0.0f, -1.476f)
                curveToRelative(-0.408f, -0.407f, -1.069f, -0.407f, -1.476f, 0.0f)
                close()
            }
        }
        .build()
        return _shadcnui!!
    }

private var _shadcnui: ImageVector? = null
