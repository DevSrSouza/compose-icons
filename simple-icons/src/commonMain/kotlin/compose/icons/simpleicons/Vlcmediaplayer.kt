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

public val SimpleIcons.Vlcmediaplayer: ImageVector
    get() {
        if (_vlcmediaplayer != null) {
            return _vlcmediaplayer!!
        }
        _vlcmediaplayer = Builder(name = "Vlcmediaplayer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.032f, 0.0f)
                curveToRelative(-0.882f, 0.0f, -1.054f, 0.136f, -1.054f, 0.136f)
                curveToRelative(-0.174f, 0.056f, -0.356f, 0.255f, -0.41f, 0.43f)
                lineTo(9.683f, 3.381f)
                curveToRelative(0.473f, 0.173f, 1.322f, 0.427f, 2.234f, 0.427f)
                curveToRelative(1.099f, 0.0f, 2.017f, -0.349f, 2.376f, -0.507f)
                lineTo(13.435f, 0.566f)
                curveToRelative(-0.055f, -0.176f, -0.237f, -0.371f, -0.407f, -0.437f)
                curveToRelative(0.0f, 0.0f, -0.114f, -0.129f, -0.997f, -0.129f)
                close()
                moveTo(15.596f, 7.455f)
                curveToRelative(-0.36f, 0.34f, -1.328f, 0.937f, -3.68f, 0.937f)
                curveToRelative(-2.293f, 0.0f, -3.189f, -0.568f, -3.521f, -0.911f)
                lineToRelative(-1.389f, 4.423f)
                curveToRelative(0.227f, 0.361f, 1.254f, 1.559f, 4.885f, 1.559f)
                curveToRelative(3.757f, 0.0f, 4.854f, -1.347f, 5.065f, -1.674f)
                close()
                moveTo(7.007f, 11.904f)
                lineToRelative(-1.003f, 3.192f)
                lineTo(4.343f, 15.096f)
                curveToRelative(-0.249f, 0.0f, -0.51f, 0.193f, -0.583f, 0.431f)
                lineToRelative(-2.334f, 7.632f)
                arcToRelative(0.396f, 0.396f, 0.0f, false, false, -0.017f, 0.154f)
                curveToRelative(-0.001f, 0.005f, -0.002f, 0.01f, -0.002f, 0.016f)
                curveToRelative(0.0f, 0.084f, 0.023f, 0.226f, 0.023f, 0.226f)
                curveToRelative(0.032f, 0.246f, 0.261f, 0.445f, 0.51f, 0.445f)
                horizontalLineToRelative(20.119f)
                curveToRelative(0.249f, 0.0f, 0.477f, -0.199f, 0.51f, -0.445f)
                curveToRelative(0.0f, 0.0f, 0.023f, -0.142f, 0.023f, -0.226f)
                arcToRelative(0.024f, 0.024f, 0.0f, false, false, -0.002f, -0.01f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, false, 0.002f, -0.031f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.019f, -0.128f)
                lineToRelative(-2.334f, -7.632f)
                curveToRelative(-0.073f, -0.238f, -0.334f, -0.431f, -0.583f, -0.431f)
                horizontalLineToRelative(-1.664f)
                lineToRelative(0.2f, 0.639f)
                curveToRelative(-0.241f, 0.485f, -1.489f, 2.38f, -6.303f, 2.38f)
                curveToRelative(-4.6f, 0.0f, -5.829f, -1.73f, -6.111f, -2.307f)
                close()
            }
        }
        .build()
        return _vlcmediaplayer!!
    }

private var _vlcmediaplayer: ImageVector? = null
