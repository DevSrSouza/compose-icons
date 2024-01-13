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

public val SimpleIcons.Beatport: ImageVector
    get() {
        if (_beatport != null) {
            return _beatport!!
        }
        _beatport = Builder(name = "Beatport", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.429f, 17.055f)
                arcToRelative(7.114f, 7.114f, 0.0f, false, true, -0.794f, 3.246f)
                arcToRelative(6.917f, 6.917f, 0.0f, false, true, -2.181f, 2.492f)
                arcToRelative(6.698f, 6.698f, 0.0f, false, true, -3.063f, 1.163f)
                arcToRelative(6.653f, 6.653f, 0.0f, false, true, -3.239f, -0.434f)
                arcToRelative(6.796f, 6.796f, 0.0f, false, true, -2.668f, -1.932f)
                arcToRelative(7.03f, 7.03f, 0.0f, false, true, -1.481f, -2.983f)
                arcToRelative(7.124f, 7.124f, 0.0f, false, true, 0.049f, -3.345f)
                arcToRelative(7.015f, 7.015f, 0.0f, false, true, 1.566f, -2.937f)
                lineToRelative(-4.626f, 4.73f)
                lineToRelative(-2.421f, -2.479f)
                lineToRelative(5.201f, -5.265f)
                arcToRelative(3.791f, 3.791f, 0.0f, false, false, 1.066f, -2.675f)
                lineTo(8.838f, 0.0f)
                horizontalLineToRelative(3.41f)
                verticalLineToRelative(6.613f)
                arcToRelative(7.172f, 7.172f, 0.0f, false, true, -0.519f, 2.794f)
                arcToRelative(7.02f, 7.02f, 0.0f, false, true, -1.559f, 2.353f)
                lineToRelative(-0.153f, 0.156f)
                arcToRelative(6.768f, 6.768f, 0.0f, false, true, 3.49f, -1.725f)
                arcToRelative(6.687f, 6.687f, 0.0f, false, true, 3.845f, 0.5f)
                arcToRelative(6.873f, 6.873f, 0.0f, false, true, 2.959f, 2.564f)
                arcToRelative(7.118f, 7.118f, 0.0f, false, true, 1.118f, 3.8f)
                close()
                moveTo(18.34f, 17.055f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, false, -0.611f, -2.133f)
                arcToRelative(3.752f, 3.752f, 0.0f, false, false, -1.666f, -1.424f)
                arcToRelative(3.65f, 3.65f, 0.0f, false, false, -2.158f, -0.233f)
                arcToRelative(3.704f, 3.704f, 0.0f, false, false, -1.92f, 1.037f)
                arcToRelative(3.852f, 3.852f, 0.0f, false, false, -1.031f, 1.955f)
                arcToRelative(3.908f, 3.908f, 0.0f, false, false, 0.205f, 2.213f)
                curveToRelative(0.282f, 0.7f, 0.76f, 1.299f, 1.374f, 1.721f)
                arcToRelative(3.672f, 3.672f, 0.0f, false, false, 2.076f, 0.647f)
                arcToRelative(3.637f, 3.637f, 0.0f, false, false, 2.635f, -1.096f)
                curveToRelative(0.347f, -0.351f, 0.622f, -0.77f, 0.81f, -1.231f)
                curveToRelative(0.188f, -0.461f, 0.285f, -0.956f, 0.286f, -1.456f)
                close()
            }
        }
        .build()
        return _beatport!!
    }

private var _beatport: ImageVector? = null
