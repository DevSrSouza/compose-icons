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

public val SimpleIcons.Canvas: ImageVector
    get() {
        if (_canvas != null) {
            return _canvas!!
        }
        _canvas = Builder(name = "Canvas", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.4403f, 15.4142f)
                arcToRelative(13.7061f, 13.7061f, 0.0f, false, true, -0.4362f, -3.4403f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, 0.4362f, -3.4401f)
                curveToRelative(1.7144f, 0.2103f, 3.0438f, 1.6686f, 3.0438f, 3.44f)
                curveToRelative(0.0f, 1.771f, -1.3287f, 3.23f, -3.0438f, 3.4404f)
                close()
                moveTo(4.4131f, 11.9739f)
                curveToRelative(0.0f, 0.6004f, 0.4866f, 1.0873f, 1.0872f, 1.0873f)
                curveToRelative(0.601f, 0.0f, 1.088f, -0.487f, 1.088f, -1.0873f)
                reflectiveCurveToRelative(-0.487f, -1.088f, -1.088f, -1.088f)
                curveToRelative(-0.6006f, 0.0f, -1.0872f, 0.4876f, -1.0872f, 1.088f)
                close()
                moveTo(23.56f, 8.5338f)
                curveToRelative(-1.7151f, 0.2103f, -3.044f, 1.6686f, -3.044f, 3.44f)
                curveToRelative(0.0f, 1.771f, 1.3289f, 3.23f, 3.044f, 3.4404f)
                arcToRelative(13.7313f, 13.7313f, 0.0f, false, false, 0.436f, -3.4403f)
                curveToRelative(0.0f, -1.1883f, -0.1518f, -2.3413f, -0.436f, -3.4401f)
                close()
                moveTo(17.412f, 11.9738f)
                curveToRelative(0.0f, 0.6005f, 0.4865f, 1.0874f, 1.0877f, 1.0874f)
                curveToRelative(0.6002f, 0.0f, 1.088f, -0.487f, 1.088f, -1.0873f)
                reflectiveCurveToRelative(-0.4878f, -1.088f, -1.088f, -1.088f)
                curveToRelative(-0.6012f, 0.0f, -1.0877f, 0.4876f, -1.0877f, 1.088f)
                close()
                moveTo(11.9773f, 20.5203f)
                curveToRelative(-1.7709f, 0.0f, -3.229f, 1.33f, -3.44f, 3.044f)
                arcToRelative(13.7364f, 13.7364f, 0.0f, false, false, 3.441f, 0.4357f)
                curveToRelative(1.1885f, 0.0f, 2.3403f, -0.1515f, 3.44f, -0.4357f)
                curveToRelative(-0.2107f, -1.714f, -1.6687f, -3.044f, -3.441f, -3.044f)
                close()
                moveTo(11.9783f, 17.4157f)
                curveToRelative(-0.6012f, 0.0f, -1.0878f, 0.4876f, -1.0878f, 1.0883f)
                reflectiveCurveToRelative(0.4866f, 1.0882f, 1.0878f, 1.0882f)
                curveToRelative(0.6f, 0.0f, 1.087f, -0.4874f, 1.087f, -1.0882f)
                reflectiveCurveToRelative(-0.487f, -1.0883f, -1.087f, -1.0883f)
                close()
                moveTo(11.9783f, 3.4797f)
                curveToRelative(1.7713f, 0.0f, 3.2295f, -1.3292f, 3.4399f, -3.0438f)
                arcTo(13.7353f, 13.7353f, 0.0f, false, false, 11.9782f, 0.0f)
                curveToRelative(-1.1887f, 0.0f, -2.3412f, 0.1519f, -3.441f, 0.4359f)
                curveToRelative(0.211f, 1.7146f, 1.6691f, 3.0438f, 3.441f, 3.0438f)
                close()
                moveTo(11.9783f, 4.4088f)
                curveToRelative(-0.6012f, 0.0f, -1.0878f, 0.4866f, -1.0878f, 1.0876f)
                curveToRelative(0.0f, 0.6002f, 0.4866f, 1.0876f, 1.0878f, 1.0876f)
                curveToRelative(0.6f, 0.0f, 1.087f, -0.4874f, 1.087f, -1.0876f)
                curveToRelative(0.0f, -0.601f, -0.487f, -1.0876f, -1.087f, -1.0876f)
                close()
                moveTo(18.0103f, 18.0053f)
                curveToRelative(-1.2514f, 1.2523f, -1.344f, 3.2211f, -0.2825f, 4.582f)
                arcToRelative(13.762f, 13.762f, 0.0f, false, false, 4.8636f, -4.8654f)
                curveToRelative(-1.3608f, -1.0597f, -3.3299f, -0.9673f, -4.5812f, 0.2834f)
                close()
                moveTo(17.3535f, 15.8105f)
                curveToRelative(-0.425f, -0.4245f, -1.1135f, -0.4245f, -1.539f, 0.0f)
                curveToRelative(-0.4243f, 0.4252f, -0.4243f, 1.1136f, 0.0f, 1.5383f)
                curveToRelative(0.4255f, 0.4253f, 1.114f, 0.4253f, 1.539f, 0.0f)
                curveToRelative(0.424f, -0.4247f, 0.424f, -1.1131f, 0.0f, -1.5383f)
                close()
                moveTo(5.9648f, 5.9603f)
                curveToRelative(1.2516f, -1.2513f, 1.3437f, -3.2206f, 0.2825f, -4.5813f)
                arcToRelative(13.7677f, 13.7677f, 0.0f, false, false, -4.8644f, 4.8643f)
                curveToRelative(1.3612f, 1.0616f, 3.3306f, 0.9687f, 4.582f, -0.283f)
                close()
                moveTo(6.6215f, 6.6175f)
                curveToRelative(-0.424f, 0.4247f, -0.424f, 1.1139f, 0.0f, 1.5383f)
                curveToRelative(0.4245f, 0.4246f, 1.114f, 0.4246f, 1.5382f, 0.0f)
                curveToRelative(0.4248f, -0.4244f, 0.4248f, -1.1136f, 0.0f, -1.5383f)
                curveToRelative(-0.4243f, -0.4243f, -1.1137f, -0.4243f, -1.5382f, 0.0f)
                close()
                moveTo(22.584f, 6.2318f)
                arcToRelative(13.7597f, 13.7597f, 0.0f, false, false, -4.8637f, -4.8642f)
                curveToRelative(-1.0614f, 1.3609f, -0.969f, 3.33f, 0.2823f, 4.5818f)
                curveToRelative(1.2517f, 1.2507f, 3.2204f, 1.3436f, 4.5814f, 0.2824f)
                close()
                moveTo(17.346f, 8.1443f)
                curveToRelative(0.4237f, -0.4248f, 0.4237f, -1.1135f, 0.0f, -1.5383f)
                curveToRelative(-0.425f, -0.4247f, -1.1145f, -0.4247f, -1.5388f, 0.0f)
                curveToRelative(-0.4241f, 0.4248f, -0.4241f, 1.1135f, 0.0f, 1.5383f)
                curveToRelative(0.4243f, 0.4243f, 1.1137f, 0.4243f, 1.5388f, 0.0f)
                close()
                moveTo(1.3772f, 17.7087f)
                arcToRelative(13.763f, 13.763f, 0.0f, false, false, 4.8647f, 4.8654f)
                curveToRelative(1.0613f, -1.3608f, 0.9685f, -3.3297f, -0.2833f, -4.5818f)
                curveToRelative(-1.2512f, -1.251f, -3.2204f, -1.3436f, -4.5814f, -0.2836f)
                close()
                moveTo(6.6157f, 15.7972f)
                curveToRelative(-0.4238f, 0.4247f, -0.4238f, 1.1136f, 0.0f, 1.5384f)
                curveToRelative(0.425f, 0.4246f, 1.1141f, 0.4246f, 1.5382f, 0.0f)
                curveToRelative(0.425f, -0.4248f, 0.425f, -1.1137f, 0.0f, -1.5384f)
                curveToRelative(-0.4241f, -0.4245f, -1.1131f, -0.4245f, -1.5382f, 0.0f)
                close()
            }
        }
        .build()
        return _canvas!!
    }

private var _canvas: ImageVector? = null
