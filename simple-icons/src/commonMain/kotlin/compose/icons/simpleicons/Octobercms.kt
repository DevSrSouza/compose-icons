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

public val SimpleIcons.Octobercms: ImageVector
    get() {
        if (_octobercms != null) {
            return _octobercms!!
        }
        _octobercms = Builder(name = "Octobercms", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.949f, 11.496f)
                curveTo(20.573f, 5.365f, 13.894f, 0.06f, 11.143f, 0.0f)
                curveTo(8.391f, -0.059f, 3.247f, 6.435f, 3.04f, 13.033f)
                curveTo(2.844f, 19.219f, 8.124f, 23.462f, 10.397f, 24.0f)
                curveToRelative(0.063f, -2.91f, 0.296f, -13.627f, 0.335f, -14.877f)
                curveToRelative(0.082f, -2.553f, 0.207f, -6.527f, 0.634f, -6.659f)
                curveToRelative(0.244f, -0.076f, 0.578f, 2.158f, 0.537f, 3.478f)
                curveToRelative(-0.008f, 0.252f, -0.011f, 1.068f, -0.011f, 2.226f)
                curveToRelative(0.46f, -0.469f, 0.94f, -0.955f, 1.233f, -1.242f)
                curveToRelative(0.8f, -0.787f, 1.155f, -0.693f, 0.77f, 0.009f)
                curveToRelative(-0.236f, 0.432f, -1.253f, 1.868f, -2.001f, 2.909f)
                curveToRelative(0.004f, 2.099f, 0.013f, 4.74f, 0.023f, 7.202f)
                curveToRelative(1.057f, -1.237f, 2.35f, -2.72f, 3.03f, -3.378f)
                curveToRelative(1.425f, -1.382f, 1.576f, -1.207f, 0.903f, 0.243f)
                curveToRelative(-0.413f, 0.888f, -2.434f, 3.258f, -3.925f, 5.127f)
                curveToRelative(0.009f, 2.185f, 0.016f, 4.021f, 0.018f, 4.898f)
                curveToRelative(4.0f, -0.88f, 9.373f, -6.42f, 9.006f, -12.44f)
            }
        }
        .build()
        return _octobercms!!
    }

private var _octobercms: ImageVector? = null
