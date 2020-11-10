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

public val SimpleIcons.AirplayAudio: VectorAsset
    get() {
        if (_airplayAudio != null) {
            return _airplayAudio!!
        }
        _airplayAudio = VectorAssetBuilder(name = "AirplayAudio", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9082f, 0.1836f)
                curveToRelative(-2.8774f, 0.0227f, -5.7566f, 1.0743f, -8.045f, 3.1719f)
                curveToRelative(-4.8816f, 4.4748f, -5.1662f, 12.0812f, -0.6913f, 16.9629f)
                curveToRelative(0.2034f, 0.244f, 0.4473f, 0.4473f, 0.6914f, 0.6914f)
                curveToRelative(0.122f, 0.0813f, 0.2861f, 0.083f, 0.4082f, -0.0391f)
                lineToRelative(0.5293f, -0.6113f)
                curveToRelative(0.122f, -0.122f, 0.122f, -0.3252f, 0.0f, -0.4473f)
                curveTo(0.5293f, 15.9661f, 0.2438f, 9.254f, 4.2305f, 4.9824f)
                curveTo(8.2172f, 0.711f, 14.8887f, 0.4274f, 19.1602f, 4.4141f)
                curveToRelative(4.2714f, 3.9867f, 4.555f, 10.6562f, 0.5683f, 14.9277f)
                curveToRelative(-0.2034f, 0.2034f, -0.365f, 0.4076f, -0.5683f, 0.5703f)
                curveToRelative(-0.122f, 0.122f, -0.122f, 0.3252f, 0.0f, 0.4473f)
                lineToRelative(0.5293f, 0.6113f)
                curveToRelative(0.122f, 0.122f, 0.3252f, 0.1204f, 0.4472f, 0.039f)
                curveToRelative(4.8817f, -4.5155f, 5.1663f, -12.0811f, 0.6914f, -16.9628f)
                curveToRelative(-2.3989f, -2.5934f, -5.6588f, -3.889f, -8.9199f, -3.8633f)
                close()
                moveTo(12.2949f, 3.7012f)
                curveTo(10.0982f, 3.63f, 7.8715f, 4.3932f, 6.1426f, 6.0f)
                curveToRelative(-3.4579f, 3.2138f, -3.661f, 8.6242f, -0.4473f, 12.082f)
                curveToRelative(0.122f, 0.122f, 0.2435f, 0.2842f, 0.4063f, 0.4063f)
                curveToRelative(0.122f, 0.122f, 0.3252f, 0.122f, 0.4472f, 0.0f)
                lineToRelative(0.5293f, -0.6094f)
                curveToRelative(0.122f, -0.122f, 0.122f, -0.3252f, 0.0f, -0.4473f)
                curveToRelative(-1.4238f, -1.3424f, -2.2773f, -3.2547f, -2.2773f, -5.248f)
                curveToRelative(0.0f, -3.946f, 3.2122f, -7.1602f, 7.1582f, -7.1602f)
                curveToRelative(3.946f, 0.0f, 7.1601f, 3.2532f, 7.1601f, 7.1993f)
                curveToRelative(0.0f, 1.9526f, -0.8144f, 3.8665f, -2.2382f, 5.209f)
                curveToRelative(-0.122f, 0.122f, -0.122f, 0.3252f, 0.0f, 0.4472f)
                lineToRelative(0.5293f, 0.6094f)
                curveToRelative(0.122f, 0.122f, 0.3252f, 0.163f, 0.4472f, 0.041f)
                curveToRelative(3.4579f, -3.2545f, 3.622f, -8.6652f, 0.4082f, -12.123f)
                curveToRelative(-1.6069f, -1.729f, -3.774f, -2.634f, -5.9707f, -2.7051f)
                close()
                moveTo(12.0293f, 7.0176f)
                curveToRelative(-1.3221f, -0.0204f, -2.654f, 0.4662f, -3.6914f, 1.4629f)
                curveToRelative(-2.0747f, 1.9933f, -2.1145f, 5.2475f, -0.1211f, 7.3222f)
                lineToRelative(0.121f, 0.123f)
                curveToRelative(0.1221f, 0.1221f, 0.3253f, 0.1221f, 0.4474f, 0.0f)
                lineToRelative(0.5293f, -0.6112f)
                curveToRelative(0.122f, -0.122f, 0.122f, -0.3253f, 0.0f, -0.4473f)
                curveToRelative(-0.6916f, -0.6916f, -1.0977f, -1.6666f, -1.0977f, -2.6836f)
                arcToRelative(3.732f, 3.732f, 0.0f, false, true, 3.7422f, -3.7422f)
                arcToRelative(3.732f, 3.732f, 0.0f, false, true, 3.7422f, 3.7422f)
                curveToRelative(0.0f, 1.017f, -0.4064f, 1.9513f, -1.1387f, 2.6836f)
                curveToRelative(-0.122f, 0.122f, -0.122f, 0.3252f, 0.0f, 0.4473f)
                lineToRelative(0.5293f, 0.6113f)
                curveToRelative(0.122f, 0.122f, 0.3252f, 0.122f, 0.4473f, 0.0f)
                curveToRelative(2.034f, -1.9934f, 2.1164f, -5.2476f, 0.123f, -7.3223f)
                curveToRelative(-0.9967f, -1.0373f, -2.3107f, -1.5656f, -3.6328f, -1.586f)
                close()
                moveTo(12.0352f, 14.7617f)
                curveToRelative(-0.1373f, -0.005f, -0.2803f, 0.0448f, -0.4024f, 0.1465f)
                lineToRelative(-0.039f, 0.041f)
                lineToRelative(-7.1602f, 8.0547f)
                curveToRelative(-0.1627f, 0.2034f, -0.1624f, 0.488f, 0.041f, 0.6914f)
                curveToRelative(0.0814f, 0.0814f, 0.2019f, 0.123f, 0.2832f, 0.123f)
                horizontalLineToRelative(14.3613f)
                curveToRelative(0.2441f, 0.0f, 0.4883f, -0.2035f, 0.4883f, -0.4882f)
                curveToRelative(0.0f, -0.122f, -0.0397f, -0.2448f, -0.121f, -0.3262f)
                lineToRelative(-7.0801f, -8.0547f)
                curveToRelative(-0.1018f, -0.122f, -0.2338f, -0.1824f, -0.3711f, -0.1875f)
                close()
            }
        }
        .build()
        return _airplayAudio!!
    }

private var _airplayAudio: VectorAsset? = null
