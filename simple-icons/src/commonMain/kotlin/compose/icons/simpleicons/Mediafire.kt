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

public val SimpleIcons.Mediafire: ImageVector
    get() {
        if (_mediafire != null) {
            return _mediafire!!
        }
        _mediafire = Builder(name = "Mediafire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.13f, 7.171f)
                curveToRelative(-0.496f, 0.42f, 2.943f, -0.458f, 2.6f, 1.239f)
                curveToRelative(-0.332f, 1.633f, -3.62f, -0.343f, -7.223f, -0.176f)
                curveToRelative(-1.594f, 0.073f, -3.054f, 0.53f, -3.985f, 1.668f)
                curveToRelative(0.973f, -1.108f, 2.901f, -0.844f, 2.398f, -0.081f)
                curveToRelative(-1.172f, 1.776f, -3.376f, 0.497f, -4.92f, 3.975f)
                curveToRelative(0.185f, -0.4f, 0.685f, -1.196f, 2.843f, -1.526f)
                curveToRelative(1.586f, -0.242f, 4.214f, -0.016f, 5.054f, 1.297f)
                curveToRelative(0.924f, 1.444f, -3.759f, 1.28f, -1.167f, 1.573f)
                curveToRelative(3.593f, 0.406f, 6.299f, 3.31f, 9.813f, 3.311f)
                curveToRelative(4.55f, 0.0f, 7.422f, -2.324f, 7.457f, -6.146f)
                curveToRelative(0.063f, -6.923f, -9.101f, -8.318f, -12.87f, -5.134f)
                close()
                moveTo(17.898f, 14.725f)
                curveToRelative(-1.195f, -0.033f, -2.404f, -0.512f, -3.364f, -0.98f)
                curveToRelative(-2.365f, -1.155f, -3.338f, -1.553f, -3.338f, -1.608f)
                curveToRelative(0.0f, -0.067f, 1.42f, 0.484f, 3.813f, -0.789f)
                curveToRelative(1.383f, -0.735f, 1.432f, -1.377f, 2.89f, -1.505f)
                curveToRelative(1.73f, -0.152f, 2.962f, 1.13f, 2.962f, 2.478f)
                curveToRelative(0.0f, 1.349f, -1.222f, 2.453f, -2.963f, 2.404f)
                close()
            }
        }
        .build()
        return _mediafire!!
    }

private var _mediafire: ImageVector? = null
