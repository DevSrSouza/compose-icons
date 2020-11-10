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

public val SimpleIcons.Elastic: VectorAsset
    get() {
        if (_elastic != null) {
            return _elastic!!
        }
        _elastic = VectorAssetBuilder(name = "Elastic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.32f, 16.3152f)
                lineToRelative(-3.9463f, -0.923f)
                lineToRelative(-1.048f, -2.0031f)
                lineToRelative(5.1615f, -4.522f)
                curveToRelative(1.5305f, 0.5798f, 2.551f, 2.0476f, 2.551f, 3.6903f)
                curveToRelative(0.0f, 1.6906f, -1.1146f, 3.2278f, -2.7182f, 3.7578f)
                moveToRelative(-2.9667f, 4.666f)
                curveToRelative(-0.6147f, 0.0f, -1.217f, -0.2062f, -1.709f, -0.5845f)
                lineToRelative(0.7801f, -4.0648f)
                lineToRelative(3.5847f, 0.8388f)
                curveToRelative(0.1139f, 0.3094f, 0.1714f, 0.6396f, 0.1714f, 0.9835f)
                curveToRelative(0.0f, 1.559f, -1.268f, 2.827f, -2.8272f, 2.827f)
                moveToRelative(-2.6292f, -0.5844f)
                arcToRelative(5.902f, 5.902f, 0.0f, false, true, -4.8925f, 2.593f)
                curveToRelative(-3.2651f, 0.0f, -5.9215f, -2.6564f, -5.9215f, -5.921f)
                curveToRelative(0.0f, -0.4008f, 0.039f, -0.7966f, 0.1156f, -1.1785f)
                lineToRelative(5.1509f, -4.6553f)
                lineToRelative(5.2557f, 2.3956f)
                lineToRelative(1.1637f, 2.2235f)
                close()
                moveTo(0.9636f, 11.443f)
                curveToRelative(0.0f, -1.69f, 1.1145f, -3.2266f, 2.7175f, -3.7577f)
                lineToRelative(3.9374f, 0.93f)
                lineToRelative(0.9242f, 1.9747f)
                lineToRelative(-5.0336f, 4.5498f)
                curveTo(1.9815f, 14.558f, 0.9636f, 13.0885f, 0.9636f, 11.4429f)
                moveToRelative(5.6847f, -8.424f)
                arcToRelative(2.8325f, 2.8325f, 0.0f, false, true, 1.718f, 0.5798f)
                lineToRelative(-0.7861f, 4.079f)
                lineToRelative(-3.5876f, -0.847f)
                curveToRelative(-0.114f, -0.3095f, -0.1714f, -0.6397f, -0.1714f, -0.984f)
                curveToRelative(0.0f, -1.5592f, 1.268f, -2.8278f, 2.8271f, -2.8278f)
                moveToRelative(2.653f, 0.5875f)
                curveToRelative(1.1044f, -1.6082f, 2.9212f, -2.5674f, 4.8692f, -2.5674f)
                curveToRelative(3.2562f, 0.0f, 5.9049f, 2.6492f, 5.9049f, 5.9055f)
                curveToRelative(0.0f, 0.3983f, -0.0373f, 0.7789f, -0.1139f, 1.1607f)
                lineToRelative(-5.2819f, 4.628f)
                lineToRelative(-5.235f, -2.3865f)
                lineToRelative(-1.022f, -2.1822f)
                close()
                moveTo(23.9633f, 12.5686f)
                curveToRelative(0.0f, -2.0052f, -1.2432f, -3.7582f, -3.114f, -4.4403f)
                arcToRelative(6.6742f, 6.6742f, 0.0f, false, false, 0.125f, -1.2855f)
                curveToRelative(0.0f, -3.7274f, -3.0325f, -6.76f, -6.7605f, -6.76f)
                curveToRelative(-2.1775f, 0.0f, -4.2033f, 1.0443f, -5.4761f, 2.804f)
                arcToRelative(3.575f, 3.575f, 0.0f, false, false, -2.1963f, -0.7516f)
                curveToRelative(-1.9786f, 0.0f, -3.5883f, 1.6097f, -3.5883f, 3.5882f)
                curveToRelative(0.0f, 0.4373f, 0.078f, 0.8557f, 0.2244f, 1.2505f)
                curveToRelative(-1.86f, 0.6712f, -3.139f, 2.4653f, -3.139f, 4.4579f)
                curveToRelative(0.0f, 2.0155f, 1.2493f, 3.7763f, 3.1287f, 4.4536f)
                arcToRelative(6.8545f, 6.8545f, 0.0f, false, false, -0.1233f, 1.285f)
                curveToRelative(0.0f, 3.7189f, 3.0252f, 6.7441f, 6.7441f, 6.7441f)
                curveToRelative(2.183f, 0.0f, 4.2075f, -1.0485f, 5.4732f, -2.8155f)
                curveToRelative(0.63f, 0.4947f, 1.4004f, 0.7662f, 2.1994f, 0.7662f)
                curveToRelative(1.9784f, 0.0f, 3.5881f, -1.609f, 3.5881f, -3.5876f)
                curveToRelative(0.0f, -0.4373f, -0.078f, -0.8562f, -0.2243f, -1.2512f)
                curveToRelative(1.86f, -0.6706f, 3.139f, -2.4652f, 3.139f, -4.4578f)
            }
        }
        .build()
        return _elastic!!
    }

private var _elastic: VectorAsset? = null
