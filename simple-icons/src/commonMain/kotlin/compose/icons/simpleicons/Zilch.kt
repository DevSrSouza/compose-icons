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

public val SimpleIcons.Zilch: ImageVector
    get() {
        if (_zilch != null) {
            return _zilch!!
        }
        _zilch = Builder(name = "Zilch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.421f, 6.149f)
                curveToRelative(3.292f, -2.011f, 6.584f, -4.036f, 9.862f, -6.046f)
                arcToRelative(0.702f, 0.702f, 0.0f, false, true, 0.83f, 0.073f)
                curveToRelative(1.312f, 1.18f, 2.637f, 2.36f, 3.948f, 3.54f)
                arcToRelative(0.694f, 0.694f, 0.0f, false, true, 0.175f, 0.815f)
                arcToRelative(1737.248f, 1737.248f, 0.0f, false, true, -4.341f, 9.338f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, 0.408f, 0.845f)
                curveToRelative(1.427f, 0.335f, 2.855f, 0.656f, 4.283f, 0.991f)
                arcToRelative(0.546f, 0.546f, 0.0f, false, true, 0.204f, 0.976f)
                curveToRelative(-3.234f, 2.375f, -6.483f, 4.749f, -9.717f, 7.124f)
                arcToRelative(0.986f, 0.986f, 0.0f, false, true, -1.136f, 0.029f)
                lineToRelative(-4.633f, -3.016f)
                arcToRelative(0.691f, 0.691f, 0.0f, false, true, -0.248f, -0.888f)
                curveToRelative(1.326f, -2.812f, 2.666f, -5.623f, 3.992f, -8.421f)
                arcToRelative(0.78f, 0.78f, 0.0f, false, false, -0.146f, -0.859f)
                arcToRelative(802.196f, 802.196f, 0.0f, false, false, -3.583f, -3.569f)
                curveToRelative(-0.277f, -0.262f, -0.219f, -0.729f, 0.102f, -0.932f)
                close()
            }
        }
        .build()
        return _zilch!!
    }

private var _zilch: ImageVector? = null
