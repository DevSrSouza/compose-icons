package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Handshake: ImageVector
    get() {
        if (_handshake != null) {
            return _handshake!!
        }
        _handshake = Builder(name = "Handshake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.284f, 22.158f)
                curveToRelative(0.001f, 0.95f, 0.679f, 1.752f, 1.62f, 1.792f)
                curveToRelative(1.31f, 0.055f, 2.623f, 0.022f, 3.935f, 0.022f)
                curveToRelative(0.954f, 0.0f, 1.786f, -0.865f, 1.76f, -1.954f)
                curveToRelative(-0.029f, -1.221f, 0.018f, -2.445f, 0.029f, -3.667f)
                lineToRelative(0.045f, -4.988f)
                curveToRelative(0.003f, -0.305f, 0.046f, -0.362f, 0.335f, -0.44f)
                arcToRelative(4.242f, 4.242f, 0.0f, false, true, 2.013f, -0.067f)
                curveToRelative(1.23f, 0.262f, 2.129f, 1.21f, 2.261f, 2.46f)
                curveToRelative(0.066f, 0.62f, 0.07f, 1.249f, 0.078f, 1.874f)
                curveToRelative(0.025f, 1.64f, 0.038f, 3.28f, 0.054f, 4.921f)
                curveToRelative(0.01f, 1.087f, 0.796f, 1.877f, 1.883f, 1.882f)
                curveToRelative(1.171f, 0.006f, 2.342f, 0.008f, 3.513f, 0.007f)
                curveToRelative(1.106f, -0.002f, 1.895f, -0.778f, 1.898f, -1.883f)
                curveToRelative(0.007f, -3.371f, 0.007f, -6.742f, 0.01f, -10.113f)
                curveToRelative(0.0f, -0.052f, 0.0f, -0.105f, -0.005f, -0.156f)
                curveToRelative(-0.03f, -0.355f, -0.169f, -0.658f, -0.483f, -0.838f)
                arcToRelative(2.638f, 2.638f, 0.0f, false, false, -0.695f, -0.291f)
                arcToRelative(7.484f, 7.484f, 0.0f, false, false, -2.887f, -0.123f)
                curveToRelative(-0.743f, 0.113f, -1.476f, 0.293f, -2.213f, 0.442f)
                curveToRelative(-0.97f, 0.196f, -1.946f, 0.28f, -2.934f, 0.178f)
                curveToRelative(-1.268f, -0.129f, -2.37f, -0.666f, -3.402f, -1.38f)
                arcToRelative(32.36f, 32.36f, 0.0f, false, false, -1.494f, -0.984f)
                curveToRelative(-0.62f, -0.38f, -1.314f, -0.505f, -2.03f, -0.544f)
                curveToRelative(-0.77f, -0.043f, -1.536f, -0.063f, -2.293f, 0.111f)
                curveToRelative(-0.59f, 0.136f, -0.899f, 0.479f, -0.966f, 1.077f)
                arcToRelative(3.438f, 3.438f, 0.0f, false, false, -0.021f, 0.379f)
                moveToRelative(7.337f, -6.184f)
                arcToRelative(3.675f, 3.675f, 0.0f, true, false, -7.35f, -0.031f)
                arcToRelative(3.675f, 3.675f, 0.0f, false, false, 7.35f, 0.03f)
                close()
                moveTo(17.967f, 1.881f)
                arcToRelative(3.673f, 3.673f, 0.0f, false, false, -3.69f, 3.652f)
                arcToRelative(3.672f, 3.672f, 0.0f, false, false, 3.67f, 3.697f)
                arcToRelative(3.678f, 3.678f, 0.0f, false, false, 3.68f, -3.665f)
                arcToRelative(3.677f, 3.677f, 0.0f, false, false, -3.66f, -3.685f)
                close()
            }
        }
        .build()
        return _handshake!!
    }

private var _handshake: ImageVector? = null
