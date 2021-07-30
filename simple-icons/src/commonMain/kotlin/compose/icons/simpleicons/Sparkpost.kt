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

public val SimpleIcons.Sparkpost: ImageVector
    get() {
        if (_sparkpost != null) {
            return _sparkpost!!
        }
        _sparkpost = Builder(name = "Sparkpost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2f, 9.0f)
                curveToRelative(-1.351f, 0.9f, -1.8f, 2.7f, -1.65f, 3.9f)
                curveToRelative(-2.25f, -2.25f, 3.45f, -8.55f, -3.0f, -12.9f)
                curveTo(15.15f, 5.4f, 6.0f, 9.75f, 6.0f, 17.4f)
                curveToRelative(0.0f, 3.0f, 1.95f, 5.701f, 6.0f, 6.6f)
                curveToRelative(4.05f, -0.898f, 6.0f, -3.6f, 6.0f, -6.6f)
                curveToRelative(0.0f, -4.5f, -2.7f, -6.0f, -1.8f, -8.4f)
                close()
                moveTo(12.0f, 20.852f)
                curveToRelative(-1.8f, 0.0f, -3.45f, -1.5f, -3.45f, -3.451f)
                curveToRelative(0.0f, -1.801f, 1.5f, -3.45f, 3.45f, -3.45f)
                curveToRelative(1.8f, 0.0f, 3.45f, 1.5f, 3.45f, 3.45f)
                curveToRelative(-0.15f, 1.951f, -1.65f, 3.451f, -3.45f, 3.451f)
                close()
            }
        }
        .build()
        return _sparkpost!!
    }

private var _sparkpost: ImageVector? = null
