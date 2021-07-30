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
                moveTo(12.0319f, 0.0f)
                curveToRelative(-0.8823f, 0.0f, -1.0545f, 0.136f, -1.0545f, 0.136f)
                curveToRelative(-0.1738f, 0.056f, -0.3556f, 0.255f, -0.4105f, 0.43f)
                lineTo(9.683f, 3.3808f)
                curveToRelative(0.4729f, 0.1729f, 1.3222f, 0.4266f, 2.2337f, 0.4266f)
                curveToRelative(1.0987f, 0.0f, 2.017f, -0.3494f, 2.3763f, -0.5075f)
                lineTo(13.4352f, 0.566f)
                curveToRelative(-0.055f, -0.1755f, -0.237f, -0.3707f, -0.4067f, -0.4374f)
                curveToRelative(0.0f, 0.0f, -0.1142f, -0.1286f, -0.9966f, -0.1286f)
                close()
                moveTo(15.5964f, 7.455f)
                curveToRelative(-0.3601f, 0.34f, -1.3276f, 0.9373f, -3.6797f, 0.9373f)
                curveToRelative(-2.2929f, 0.0f, -3.189f, -0.5678f, -3.5213f, -0.9113f)
                lineToRelative(-1.3887f, 4.4227f)
                curveToRelative(0.2272f, 0.3614f, 1.2539f, 1.5594f, 4.8847f, 1.5594f)
                curveToRelative(3.7569f, 0.0f, 4.8539f, -1.3467f, 5.0649f, -1.6737f)
                close()
                moveTo(7.0067f, 11.9037f)
                lineToRelative(-1.0025f, 3.1922f)
                lineTo(4.3428f, 15.0959f)
                curveToRelative(-0.2486f, 0.0f, -0.5097f, 0.1932f, -0.5826f, 0.4315f)
                lineToRelative(-2.334f, 7.6317f)
                arcToRelative(0.3962f, 0.3962f, 0.0f, false, false, -0.0169f, 0.1537f)
                curveToRelative(-8.0E-4f, 0.0053f, -0.002f, 0.0099f, -0.002f, 0.016f)
                curveToRelative(0.0f, 0.0839f, 0.0233f, 0.226f, 0.0233f, 0.226f)
                curveToRelative(0.0322f, 0.2456f, 0.2612f, 0.4452f, 0.5098f, 0.4452f)
                horizontalLineToRelative(20.1192f)
                curveToRelative(0.2487f, 0.0f, 0.4768f, -0.1994f, 0.5098f, -0.4453f)
                curveToRelative(0.0f, 0.0f, 0.0234f, -0.142f, 0.0234f, -0.226f)
                arcToRelative(0.0245f, 0.0245f, 0.0f, false, false, -0.0025f, -0.01f)
                arcToRelative(0.3201f, 0.3201f, 0.0f, false, false, 0.0024f, -0.0313f)
                arcToRelative(0.4096f, 0.4096f, 0.0f, false, false, -0.019f, -0.1282f)
                lineToRelative(-2.3339f, -7.6318f)
                curveToRelative(-0.0729f, -0.2383f, -0.334f, -0.4314f, -0.5826f, -0.4314f)
                horizontalLineToRelative(-1.6636f)
                lineToRelative(0.2005f, 0.6391f)
                curveToRelative(-0.2407f, 0.4854f, -1.4886f, 2.38f, -6.3027f, 2.38f)
                curveToRelative(-4.6003f, 0.0f, -5.8288f, -1.73f, -6.1107f, -2.3072f)
                close()
            }
        }
        .build()
        return _vlcmediaplayer!!
    }

private var _vlcmediaplayer: ImageVector? = null
