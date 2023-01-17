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

public val SimpleIcons.Simplenote: ImageVector
    get() {
        if (_simplenote != null) {
            return _simplenote!!
        }
        _simplenote = Builder(name = "Simplenote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.466f, 3.62f)
                curveToRelative(-0.004f, 0.052f, -0.014f, 0.104f, -0.018f, 0.158f)
                curveToRelative(-0.406f, 4.626f, 2.747f, 8.548f, 8.03f, 9.994f)
                curveToRelative(2.024f, 0.553f, 5.374f, 2.018f, 5.06f, 5.599f)
                arcToRelative(5.063f, 5.063f, 0.0f, false, true, -1.803f, 3.46f)
                curveToRelative(-1.022f, 0.857f, -2.308f, 1.21f, -3.64f, 1.166f)
                curveTo(5.147f, 23.794f, 0.0f, 18.367f, 0.0f, 12.05f)
                curveToRelative(0.0f, -3.285f, 1.325f, -6.262f, 3.467f, -8.428f)
                close()
                moveTo(9.82f, 1.032f)
                curveToRelative(0.907f, -0.762f, 2.056f, -1.078f, 3.235f, -1.027f)
                curveTo(18.996f, 0.27f, 24.0f, 5.67f, 24.0f, 11.936f)
                curveToRelative(0.0f, 2.855f, -1.001f, 5.478f, -2.667f, 7.536f)
                curveToRelative(0.332f, -4.908f, -2.94f, -8.897f, -8.59f, -10.441f)
                curveToRelative(-2.337f, -0.64f, -4.749f, -2.274f, -4.514f, -4.948f)
                arcTo(4.467f, 4.467f, 0.0f, false, true, 9.82f, 1.03f)
                close()
            }
        }
        .build()
        return _simplenote!!
    }

private var _simplenote: ImageVector? = null
