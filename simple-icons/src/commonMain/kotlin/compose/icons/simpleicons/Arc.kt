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

public val SimpleIcons.Arc: ImageVector
    get() {
        if (_arc != null) {
            return _arc!!
        }
        _arc = Builder(name = "Arc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.9371f, 8.5089f)
                curveToRelative(0.1471f, -0.7147f, 0.0367f, -1.4661f, -0.3364f, -2.0967f)
                curveToRelative(-0.4203f, -0.7094f, -1.1035f, -1.1876f, -1.9075f, -1.3506f)
                arcToRelative(2.9178f, 2.9178f, 0.0f, false, false, -0.5623f, -0.0578f)
                horizontalLineToRelative(-0.0105f)
                curveToRelative(-1.3768f, 0.0f, -2.5329f, 0.988f, -2.8061f, 2.3385f)
                curveToRelative(-0.1629f, 0.7935f, -0.4782f, 1.5607f, -0.9196f, 2.2701f)
                arcToRelative(0.263f, 0.263f, 0.0f, false, true, -0.2363f, 0.1205f)
                arcToRelative(0.2627f, 0.2627f, 0.0f, false, true, -0.2209f, -0.1468f)
                lineToRelative(-2.8587f, -5.9906f)
                curveToRelative(-0.3626f, -0.762f, -1.0142f, -1.361f, -1.8235f, -1.5975f)
                curveToRelative(-1.3873f, -0.4099f, -2.8166f, 0.2838f, -3.4052f, 1.524f)
                lineTo(5.897f, 9.7333f)
                curveToRelative(-0.0788f, 0.1629f, -0.31f, 0.1576f, -0.3784f, -0.0053f)
                verticalLineToRelative(-0.0052f)
                arcToRelative(2.8597f, 2.8597f, 0.0f, false, false, -2.6642f, -1.7972f)
                curveToRelative(-0.3784f, 0.0f, -0.7515f, 0.0736f, -1.1088f, 0.2207f)
                curveToRelative(-1.4714f, 0.6148f, -2.1283f, 2.349f, -1.5187f, 3.8203f)
                curveToRelative(0.557f, 1.3295f, 1.4714f, 2.5855f, 2.659f, 3.668f)
                curveToRelative(0.084f, 0.0788f, 0.1103f, 0.1997f, 0.063f, 0.3048f)
                lineToRelative(-0.9563f, 2.0074f)
                curveToRelative(-0.6727f, 1.4188f, -0.1314f, 3.1477f, 1.2664f, 3.8571f)
                curveToRelative(0.4099f, 0.2049f, 0.846f, 0.31f, 1.298f, 0.31f)
                curveToRelative(1.1035f, 0.0f, 2.123f, -0.6411f, 2.5959f, -1.6395f)
                lineToRelative(0.825f, -1.7289f)
                arcToRelative(0.254f, 0.254f, 0.0f, false, true, 0.3048f, -0.1366f)
                curveToRelative(1.0037f, 0.2732f, 2.0127f, 0.4204f, 3.0058f, 0.4204f)
                curveToRelative(1.1193f, 0.0f, 2.2229f, -0.1682f, 3.2896f, -0.4782f)
                arcToRelative(0.2626f, 0.2626f, 0.0f, false, true, 0.3101f, 0.1366f)
                lineToRelative(0.8145f, 1.7131f)
                curveToRelative(0.4834f, 1.0195f, 1.4924f, 1.7131f, 2.6169f, 1.7184f)
                curveToRelative(0.4572f, 0.0f, 0.8986f, -0.0999f, 1.3138f, -0.3101f)
                curveToRelative(1.403f, -0.7094f, 1.939f, -2.4435f, 1.2664f, -3.8676f)
                lineTo(19.875f, 15.787f)
                curveToRelative(-0.0473f, -0.1051f, -0.0263f, -0.226f, 0.0578f, -0.3048f)
                curveToRelative(1.9864f, -1.8497f, 3.4525f, -4.2723f, 4.0043f, -6.9733f)
                close()
                moveTo(6.2121f, 20.0172f)
                arcToRelative(1.835f, 1.835f, 0.0f, false, true, -0.6764f, 0.7622f)
                arcToRelative(1.8352f, 1.8352f, 0.0f, false, true, -0.9788f, 0.2835f)
                curveToRelative(-0.2733f, 0.0f, -0.5518f, -0.063f, -0.8093f, -0.1891f)
                curveToRelative(-0.9038f, -0.4467f, -1.2454f, -1.5713f, -0.8093f, -2.4804f)
                lineToRelative(0.7935f, -1.6658f)
                curveToRelative(0.0684f, -0.1471f, 0.2575f, -0.1997f, 0.3837f, -0.1051f)
                curveToRelative(0.1681f, 0.1209f, 0.3415f, 0.2365f, 0.5202f, 0.3521f)
                curveToRelative(0.6989f, 0.4467f, 1.4293f, 0.825f, 2.1808f, 1.1351f)
                curveToRelative(0.1419f, 0.0578f, 0.205f, 0.2154f, 0.1419f, 0.352f)
                lineToRelative(-0.7462f, 1.5555f)
                close()
                moveTo(11.2884f, 17.973f)
                curveToRelative(-4.2092f, 0.0f, -8.6548f, -2.8534f, -10.1262f, -6.4951f)
                arcToRelative(1.8286f, 1.8286f, 0.0f, false, true, 1.009f, -2.3805f)
                curveToRelative(0.2259f, -0.0893f, 0.4571f, -0.1366f, 0.683f, -0.1366f)
                curveToRelative(0.7252f, 0.0f, 1.4084f, 0.431f, 1.6974f, 1.1456f)
                curveToRelative(0.9196f, 2.2806f, 4.0043f, 4.2092f, 6.7368f, 4.2092f)
                curveToRelative(0.4204f, 0.0f, 0.8408f, -0.042f, 1.256f, -0.1156f)
                arcToRelative(0.2643f, 0.2643f, 0.0f, false, true, 0.2837f, 0.1419f)
                lineToRelative(1.3768f, 2.9007f)
                curveToRelative(0.0683f, 0.1471f, -0.0105f, 0.3205f, -0.1629f, 0.3626f)
                curveToRelative(-0.8986f, 0.2365f, -1.8182f, 0.3678f, -2.7536f, 0.3678f)
                close()
                moveTo(10.6894f, 13.0439f)
                lineTo(11.3252f, 11.7091f)
                curveToRelative(0.0526f, -0.1051f, 0.205f, -0.1051f, 0.2575f, 0.0f)
                lineToRelative(0.6201f, 1.3033f)
                curveToRelative(0.042f, 0.0841f, -0.0158f, 0.1891f, -0.1051f, 0.2049f)
                curveToRelative(-0.268f, 0.0368f, -0.536f, 0.0578f, -0.7988f, 0.0578f)
                arcToRelative(5.0634f, 5.0634f, 0.0f, false, true, -0.4887f, -0.0263f)
                curveToRelative(-0.1103f, -0.0157f, -0.1629f, -0.1208f, -0.1208f, -0.2049f)
                close()
                moveTo(19.1498f, 20.8685f)
                arcToRelative(1.831f, 1.831f, 0.0f, false, true, -2.0329f, -0.2788f)
                arcToRelative(1.8292f, 1.8292f, 0.0f, false, true, -0.4316f, -0.5778f)
                lineToRelative(-4.987f, -10.4836f)
                curveToRelative(-0.0998f, -0.2102f, -0.3994f, -0.2102f, -0.4939f, 0.0f)
                lineToRelative(-1.545f, 3.2529f)
                arcToRelative(0.2623f, 0.2623f, 0.0f, false, true, -0.3205f, 0.1366f)
                curveToRelative(-1.051f, -0.3626f, -2.0495f, -0.9774f, -2.7904f, -1.7184f)
                arcToRelative(0.2552f, 0.2552f, 0.0f, false, true, -0.0473f, -0.2943f)
                lineToRelative(3.3421f, -7.031f)
                curveToRelative(0.1156f, -0.247f, 0.2943f, -0.4677f, 0.5203f, -0.6201f)
                curveToRelative(1.051f, -0.6884f, 2.2806f, -0.2575f, 2.7378f, 0.7041f)
                lineToRelative(6.8577f, 14.4248f)
                curveToRelative(0.4309f, 0.9144f, 0.0946f, 2.0389f, -0.8093f, 2.4856f)
                close()
                moveTo(17.7047f, 11.2204f)
                arcToRelative(0.258f, 0.258f, 0.0f, false, true, 0.0315f, -0.2732f)
                curveToRelative(0.783f, -1.0037f, 1.3558f, -2.1756f, 1.6028f, -3.421f)
                curveToRelative(0.1734f, -0.867f, 0.9354f, -1.4714f, 1.7919f, -1.4714f)
                curveToRelative(0.1472f, 0.0f, 0.2943f, 0.0158f, 0.4467f, 0.0526f)
                curveToRelative(0.9722f, 0.2417f, 1.5344f, 1.2507f, 1.3295f, 2.2333f)
                curveToRelative(-0.4835f, 2.3017f, -1.6816f, 4.3879f, -3.3159f, 6.0222f)
                curveToRelative(-0.1313f, 0.1314f, -0.3468f, 0.0946f, -0.4256f, -0.0683f)
                lineToRelative(-1.4609f, -3.0742f)
                close()
            }
        }
        .build()
        return _arc!!
    }

private var _arc: ImageVector? = null
