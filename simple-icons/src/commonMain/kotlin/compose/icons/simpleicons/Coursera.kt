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

public val SimpleIcons.Coursera: ImageVector
    get() {
        if (_coursera != null) {
            return _coursera!!
        }
        _coursera = Builder(name = "Coursera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.374f, 23.977f)
                curveToRelative(-4.183f, -0.21f, -8.006f, -2.626f, -9.959f, -6.347f)
                curveToRelative(-2.097f, -3.858f, -1.871f, -8.864f, 0.732f, -12.454f)
                curveTo(4.748f, 1.338f, 9.497f, -0.698f, 14.281f, 0.23f)
                curveToRelative(4.583f, 0.857f, 8.351f, 4.494f, 9.358f, 8.911f)
                curveToRelative(1.122f, 4.344f, -0.423f, 9.173f, -3.925f, 12.04f)
                curveToRelative(-2.289f, 1.953f, -5.295f, 2.956f, -8.34f, 2.797f)
                close()
                moveTo(19.079f, 15.927f)
                arcToRelative(588.737f, 588.737f, 0.0f, false, false, -3.171f, -1.887f)
                curveToRelative(-0.903f, 1.483f, -2.885f, 2.248f, -4.57f, 1.665f)
                curveToRelative(-2.024f, -0.639f, -3.394f, -2.987f, -2.488f, -5.134f)
                curveToRelative(0.801f, -2.009f, 2.79f, -2.707f, 4.357f, -2.464f)
                arcToRelative(4.19f, 4.19f, 0.0f, false, true, 2.623f, 1.669f)
                curveToRelative(1.077f, -0.631f, 2.128f, -1.218f, 3.173f, -1.855f)
                curveToRelative(-2.03f, -3.118f, -6.151f, -4.294f, -9.656f, -2.754f)
                curveToRelative(-3.13f, 1.423f, -4.89f, 4.68f, -4.388f, 7.919f)
                curveToRelative(0.54f, 3.598f, 3.73f, 6.486f, 7.716f, 6.404f)
                arcToRelative(7.664f, 7.664f, 0.0f, false, false, 6.404f, -3.563f)
                close()
            }
        }
        .build()
        return _coursera!!
    }

private var _coursera: ImageVector? = null
