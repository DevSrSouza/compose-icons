package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Tor: VectorAsset
    get() {
        if (_tor != null) {
            return _tor!!
        }
        _tor = VectorAssetBuilder(name = "Tor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.578f, 12.201f)
                curveToRelative(-0.76f, -0.692f, -1.721f, -1.251f, -2.704f, -1.81f)
                curveToRelative(-0.446f, -0.246f, -1.81f, -1.318f, -1.34f, -2.838f)
                lineToRelative(-0.851f, -0.358f)
                curveToRelative(1.342f, -2.078f, 3.085f, -4.134f, 5.229f, -6.056f)
                curveToRelative(-1.721f, 0.581f, -3.24f, 1.476f, -4.379f, 3.062f)
                curveToRelative(0.67f, -1.407f, 1.765f, -2.793f, 2.972f, -4.201f)
                curveToRelative(-1.654f, 1.185f, -3.084f, 2.525f, -3.979f, 4.313f)
                lineToRelative(0.627f, -2.503f)
                curveToRelative(-0.894f, 1.608f, -1.52f, 3.24f, -1.766f, 4.871f)
                lineToRelative(-1.317f, -0.535f)
                lineToRelative(-0.223f, 0.178f)
                curveToRelative(1.162f, 2.078f, 0.559f, 3.174f, -0.022f, 3.553f)
                curveToRelative(-1.162f, 0.783f, -2.838f, 1.788f, -3.688f, 2.659f)
                curveToRelative(-1.609f, 1.654f, -2.078f, 3.218f, -1.921f, 5.296f)
                curveToRelative(0.157f, 2.66f, 2.101f, 4.873f, 4.67f, 5.744f)
                curveToRelative(1.14f, 0.38f, 2.19f, 0.424f, 3.352f, 0.424f)
                curveToRelative(1.877f, 0.0f, 3.799f, -0.491f, 5.207f, -1.676f)
                arcToRelative(6.551f, 6.551f, 0.0f, false, false, 2.369f, -5.027f)
                arcToRelative(6.875f, 6.875f, 0.0f, false, false, -2.236f, -5.096f)
                close()
                moveTo(14.025f, 21.073f)
                curveToRelative(-0.09f, 0.402f, -0.38f, 0.894f, -0.737f, 1.341f)
                curveToRelative(0.134f, -0.246f, 0.246f, -0.492f, 0.313f, -0.76f)
                curveToRelative(0.559f, -1.989f, 0.805f, -2.904f, 0.537f, -5.095f)
                curveToRelative(-0.045f, -0.224f, -0.135f, -0.938f, -0.471f, -1.721f)
                curveToRelative(-0.468f, -1.185f, -1.184f, -2.303f, -1.272f, -2.548f)
                curveToRelative(-0.157f, -0.38f, -0.38f, -1.989f, -0.403f, -3.084f)
                curveToRelative(0.023f, 0.938f, 0.089f, 2.659f, 0.335f, 3.329f)
                curveToRelative(0.067f, 0.225f, 0.715f, 1.229f, 1.185f, 2.459f)
                curveToRelative(0.312f, 0.849f, 0.38f, 1.632f, 0.446f, 1.854f)
                curveToRelative(0.224f, 1.007f, -0.045f, 2.705f, -0.401f, 4.313f)
                curveToRelative(-0.111f, 0.581f, -0.426f, 1.252f, -0.828f, 1.766f)
                curveToRelative(0.225f, -0.313f, 0.402f, -0.715f, 0.537f, -1.185f)
                curveToRelative(0.269f, -0.938f, 0.38f, -2.145f, 0.356f, -2.905f)
                curveToRelative(-0.021f, -0.446f, -0.222f, -1.407f, -0.558f, -2.278f)
                curveToRelative(-0.201f, -0.47f, -0.492f, -0.961f, -0.692f, -1.297f)
                curveToRelative(-0.224f, -0.335f, -0.224f, -1.072f, -0.313f, -1.921f)
                curveToRelative(0.021f, 0.916f, -0.068f, 1.385f, 0.156f, 2.033f)
                curveToRelative(0.134f, 0.379f, 0.625f, 0.916f, 0.759f, 1.43f)
                curveToRelative(0.201f, 0.693f, 0.402f, 1.453f, 0.381f, 1.922f)
                curveToRelative(0.0f, 0.536f, -0.022f, 1.52f, -0.269f, 2.593f)
                curveToRelative(-0.157f, 0.804f, -0.515f, 1.497f, -1.095f, 1.943f)
                curveToRelative(0.246f, -0.312f, 0.38f, -0.625f, 0.447f, -0.938f)
                curveToRelative(0.089f, -0.469f, 0.111f, -0.916f, 0.156f, -1.475f)
                arcToRelative(5.96f, 5.96f, 0.0f, false, false, -0.111f, -1.721f)
                curveToRelative(-0.179f, -0.805f, -0.469f, -1.608f, -0.604f, -2.168f)
                curveToRelative(0.022f, 0.626f, 0.269f, 1.408f, 0.381f, 2.235f)
                curveToRelative(0.089f, 0.604f, 0.044f, 1.206f, 0.021f, 1.742f)
                curveToRelative(-0.021f, 0.627f, -0.223f, 1.722f, -0.492f, 2.258f)
                curveToRelative(-0.268f, -0.112f, -0.357f, -0.269f, -0.537f, -0.491f)
                curveToRelative(-0.223f, -0.291f, -0.357f, -0.604f, -0.491f, -0.962f)
                arcToRelative(5.043f, 5.043f, 0.0f, false, true, -0.291f, -0.915f)
                arcToRelative(3.071f, 3.071f, 0.0f, false, true, 0.559f, -2.213f)
                curveToRelative(0.469f, -0.671f, 0.559f, -0.716f, 0.715f, -1.497f)
                curveToRelative(-0.223f, 0.692f, -0.379f, 0.759f, -0.871f, 1.341f)
                curveToRelative(-0.559f, 0.647f, -0.648f, 1.586f, -0.648f, 2.346f)
                curveToRelative(0.0f, 0.313f, 0.134f, 0.671f, 0.246f, 1.007f)
                curveToRelative(0.134f, 0.356f, 0.268f, 0.714f, 0.447f, 0.982f)
                curveToRelative(0.134f, 0.223f, 0.313f, 0.379f, 0.469f, 0.491f)
                curveToRelative(-0.581f, -0.156f, -1.184f, -0.379f, -1.564f, -0.692f)
                curveToRelative(-0.938f, -0.805f, -1.765f, -2.167f, -1.877f, -3.375f)
                curveToRelative(-0.089f, -0.982f, 0.804f, -2.413f, 2.078f, -3.128f)
                curveToRelative(1.073f, -0.626f, 1.318f, -1.319f, 1.542f, -2.459f)
                curveToRelative(-0.313f, 0.983f, -0.626f, 1.833f, -1.654f, 2.348f)
                curveToRelative(-1.475f, 0.804f, -2.235f, 2.1f, -2.167f, 3.352f)
                curveToRelative(0.112f, 1.586f, 0.737f, 2.682f, 2.011f, 3.554f)
                curveToRelative(0.291f, 0.2f, 0.693f, 0.401f, 1.118f, 0.559f)
                curveToRelative(-1.587f, -0.381f, -1.788f, -0.604f, -2.324f, -1.229f)
                curveToRelative(0.0f, -0.045f, -0.134f, -0.135f, -0.134f, -0.156f)
                curveToRelative(-0.715f, -0.805f, -1.609f, -2.19f, -1.922f, -3.464f)
                curveToRelative(-0.112f, -0.447f, -0.224f, -0.916f, -0.089f, -1.363f)
                curveToRelative(0.581f, -2.101f, 1.854f, -2.905f, 3.128f, -3.775f)
                curveToRelative(0.313f, -0.225f, 0.626f, -0.426f, 0.916f, -0.649f)
                curveToRelative(0.715f, -0.559f, 0.894f, -2.012f, 1.05f, -2.838f)
                curveToRelative(-0.29f, 1.006f, -0.603f, 2.258f, -1.162f, 2.659f)
                curveToRelative(-0.29f, 0.224f, -0.648f, 0.402f, -0.938f, 0.604f)
                curveToRelative(-1.318f, 0.894f, -2.637f, 1.743f, -3.24f, 3.91f)
                curveToRelative(-0.134f, 0.56f, -0.044f, 0.962f, 0.089f, 1.498f)
                curveToRelative(0.335f, 1.317f, 1.229f, 2.748f, 1.989f, 3.597f)
                lineToRelative(0.134f, 0.135f)
                curveToRelative(0.335f, 0.381f, 0.76f, 0.67f, 1.274f, 0.871f)
                arcToRelative(5.945f, 5.945f, 0.0f, false, true, -1.296f, -0.469f)
                curveToRelative(-2.078f, -1.005f, -3.463f, -3.173f, -3.553f, -4.939f)
                curveToRelative(-0.179f, -3.597f, 1.542f, -4.647f, 3.151f, -5.966f)
                curveToRelative(0.894f, -0.737f, 2.145f, -1.095f, 2.86f, -2.413f)
                curveToRelative(0.134f, -0.291f, 0.224f, -0.916f, 0.045f, -1.587f)
                curveToRelative(-0.067f, -0.224f, -0.402f, -1.028f, -0.537f, -1.207f)
                lineToRelative(1.989f, 0.872f)
                curveToRelative(-0.044f, 0.938f, -0.067f, 1.698f, 0.112f, 2.391f)
                curveToRelative(0.2f, 0.76f, 1.184f, 1.854f, 1.586f, 3.129f)
                curveToRelative(0.783f, 2.41f, 0.583f, 5.561f, 0.023f, 8.019f)
                close()
            }
        }
        .build()
        return _tor!!
    }

private var _tor: VectorAsset? = null
