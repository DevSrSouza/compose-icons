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

public val SimpleIcons.SocketDotIo: ImageVector
    get() {
        if (_socketDotIo != null) {
            return _socketDotIo!!
        }
        _socketDotIo = Builder(name = "SocketDotIo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.936f, 0.014f)
                arcToRelative(12.169f, 12.169f, 0.0f, false, false, -2.975f, 0.378f)
                curveTo(4.282f, 1.555f, 0.568f, 5.794f, 0.092f, 10.601f)
                curveToRelative(-0.59f, 4.549f, 1.708f, 9.286f, 5.644f, 11.634f)
                curveToRelative(3.861f, 2.418f, 9.093f, 2.32f, 12.873f, -0.223f)
                curveToRelative(3.397f, -2.206f, 5.512f, -6.228f, 5.386f, -10.285f)
                curveToRelative(-0.058f, -4.016f, -2.31f, -7.917f, -5.759f, -9.98f)
                curveTo(16.354f, 0.588f, 14.143f, 0.005f, 11.936f, 0.014f)
                close()
                moveTo(11.873f, 1.71f)
                curveToRelative(4.945f, -0.007f, 9.789f, 3.814f, 10.281f, 8.925f)
                curveToRelative(0.945f, 5.66f, -3.753f, 11.413f, -9.488f, 11.58f)
                curveToRelative(-5.454f, 0.544f, -10.724f, -4.08f, -10.88f, -9.557f)
                curveToRelative(-0.407f, -4.434f, 2.516f, -8.835f, 6.698f, -10.3f)
                arcToRelative(9.113f, 9.113f, 0.0f, false, true, 3.388f, -0.647f)
                close()
                moveTo(16.964f, 4.935f)
                curveToRelative(-2.687f, 2.085f, -5.26f, 4.308f, -7.889f, 6.457f)
                curveToRelative(1.203f, 0.017f, 2.412f, 0.016f, 3.621f, 0.01f)
                curveToRelative(1.41f, -2.165f, 2.859f, -4.301f, 4.268f, -6.467f)
                close()
                moveTo(11.299f, 12.588f)
                curveToRelative(-1.41f, 2.166f, -2.86f, 4.309f, -4.27f, 6.474f)
                curveToRelative(2.693f, -2.08f, 5.255f, -4.32f, 7.902f, -6.456f)
                arcToRelative(255.413f, 255.413f, 0.0f, false, false, -3.632f, -0.018f)
                close()
            }
        }
        .build()
        return _socketDotIo!!
    }

private var _socketDotIo: ImageVector? = null
