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

public val SimpleIcons.Lemmy: ImageVector
    get() {
        if (_lemmy != null) {
            return _lemmy!!
        }
        _lemmy = Builder(name = "Lemmy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.9595f, 4.2228f)
                arcToRelative(3.9132f, 3.9132f, 0.0f, false, false, -0.332f, 0.019f)
                curveToRelative(-0.8781f, 0.1012f, -1.67f, 0.5699f, -2.155f, 1.3862f)
                curveToRelative(-0.475f, 0.8f, -0.5922f, 1.6809f, -0.35f, 2.4971f)
                curveToRelative(0.2421f, 0.8162f, 0.8297f, 1.5575f, 1.6982f, 2.1449f)
                curveToRelative(0.0053f, 0.0035f, 0.0106f, 0.0076f, 0.0163f, 0.0114f)
                curveToRelative(0.746f, 0.4498f, 1.492f, 0.7431f, 2.2877f, 0.8994f)
                curveToRelative(-0.02f, 0.3318f, -0.0272f, 0.6689f, -0.006f, 1.0181f)
                curveToRelative(0.0634f, 1.0432f, 0.4368f, 2.0006f, 0.996f, 2.8492f)
                lineToRelative(-2.0061f, 0.8189f)
                arcToRelative(0.4163f, 0.4163f, 0.0f, false, false, -0.2276f, 0.2239f)
                arcToRelative(0.416f, 0.416f, 0.0f, false, false, 0.0879f, 0.455f)
                arcToRelative(0.415f, 0.415f, 0.0f, false, false, 0.2941f, 0.1231f)
                arcToRelative(0.4156f, 0.4156f, 0.0f, false, false, 0.1595f, -0.0312f)
                lineToRelative(2.2093f, -0.9035f)
                curveToRelative(0.408f, 0.4859f, 0.8695f, 0.9315f, 1.3723f, 1.318f)
                curveToRelative(0.0196f, 0.0151f, 0.0407f, 0.0264f, 0.0603f, 0.0423f)
                lineToRelative(-1.2918f, 1.7103f)
                arcToRelative(0.416f, 0.416f, 0.0f, false, false, 0.664f, 0.501f)
                lineToRelative(1.314f, -1.7385f)
                curveToRelative(0.7185f, 0.4548f, 1.4782f, 0.7927f, 2.2294f, 1.0242f)
                curveToRelative(0.3833f, 0.7209f, 1.1379f, 1.1871f, 2.0202f, 1.1871f)
                curveToRelative(0.8907f, 0.0f, 1.6442f, -0.501f, 2.0242f, -1.2072f)
                curveToRelative(0.744f, -0.2347f, 1.4959f, -0.5729f, 2.2073f, -1.0262f)
                lineToRelative(1.332f, 1.7606f)
                arcToRelative(0.4157f, 0.4157f, 0.0f, false, false, 0.7439f, -0.1936f)
                arcToRelative(0.4165f, 0.4165f, 0.0f, false, false, -0.0799f, -0.3074f)
                lineToRelative(-1.3099f, -1.7345f)
                curveToRelative(0.0083f, -0.0075f, 0.0178f, -0.0113f, 0.0261f, -0.0188f)
                curveToRelative(0.4968f, -0.3803f, 0.9549f, -0.8175f, 1.3622f, -1.2939f)
                lineToRelative(2.155f, 0.8794f)
                arcToRelative(0.4156f, 0.4156f, 0.0f, false, false, 0.5412f, -0.2276f)
                arcToRelative(0.4151f, 0.4151f, 0.0f, false, false, -0.2273f, -0.5432f)
                lineToRelative(-1.9438f, -0.7928f)
                curveToRelative(0.577f, -0.8538f, 0.9697f, -1.8183f, 1.0504f, -2.8693f)
                curveToRelative(0.0268f, -0.3507f, 0.0242f, -0.6914f, 0.0079f, -1.0262f)
                curveToRelative(0.7905f, -0.1572f, 1.5321f, -0.4502f, 2.2737f, -0.8974f)
                curveToRelative(0.0053f, -0.0033f, 0.011f, -0.0076f, 0.0163f, -0.0113f)
                curveToRelative(0.8684f, -0.5874f, 1.456f, -1.3287f, 1.6982f, -2.145f)
                curveToRelative(0.2421f, -0.8161f, 0.125f, -1.697f, -0.3501f, -2.497f)
                curveToRelative(-0.4849f, -0.8163f, -1.2768f, -1.2852f, -2.155f, -1.3863f)
                arcToRelative(3.2175f, 3.2175f, 0.0f, false, false, -0.332f, -0.0189f)
                curveToRelative(-0.7852f, -0.0151f, -1.6231f, 0.229f, -2.4286f, 0.6942f)
                curveToRelative(-0.5926f, 0.342f, -1.1252f, 0.867f, -1.5433f, 1.4387f)
                curveToRelative(-1.1699f, -0.6703f, -2.6923f, -1.0476f, -4.5635f, -1.0785f)
                arcToRelative(15.5768f, 15.5768f, 0.0f, false, false, -0.5111f, 0.0f)
                curveToRelative(-2.085f, 0.034f, -3.7537f, 0.43f, -5.0142f, 1.1449f)
                curveToRelative(-0.0033f, -0.0038f, -0.0045f, -0.0114f, -0.008f, -0.0152f)
                curveToRelative(-0.4233f, -0.5916f, -0.973f, -1.1365f, -1.5835f, -1.489f)
                curveToRelative(-0.8055f, -0.465f, -1.6434f, -0.7083f, -2.4286f, -0.6941f)
                close()
                moveTo(3.2453f, 4.9593f)
                curveToRelative(0.5568f, 0.042f, 1.1696f, 0.2358f, 1.7787f, 0.5875f)
                curveToRelative(0.485f, 0.28f, 0.9757f, 0.7554f, 1.346f, 1.2696f)
                arcToRelative(5.6875f, 5.6875f, 0.0f, false, false, -0.4969f, 0.4085f)
                curveToRelative(-0.9201f, 0.8516f, -1.4615f, 1.9597f, -1.668f, 3.2335f)
                curveToRelative(-0.6809f, -0.1402f, -1.3183f, -0.3945f, -1.984f, -0.7948f)
                curveToRelative(-0.7553f, -0.5128f, -1.2159f, -1.1225f, -1.4004f, -1.7445f)
                curveToRelative(-0.1851f, -0.624f, -0.1074f, -1.2712f, 0.2776f, -1.9196f)
                curveToRelative(0.3743f, -0.63f, 0.9275f, -0.9534f, 1.6118f, -1.0322f)
                arcToRelative(2.796f, 2.796f, 0.0f, false, true, 0.5352f, -0.0076f)
                close()
                moveTo(20.7547f, 4.9593f)
                arcToRelative(2.797f, 2.797f, 0.0f, false, true, 0.5353f, 0.0075f)
                curveToRelative(0.6842f, 0.0786f, 1.2374f, 0.4021f, 1.6117f, 1.0322f)
                curveToRelative(0.385f, 0.6484f, 0.4627f, 1.2957f, 0.2776f, 1.9196f)
                curveToRelative(-0.1845f, 0.622f, -0.645f, 1.2317f, -1.4004f, 1.7445f)
                curveToRelative(-0.6578f, 0.3955f, -1.2881f, 0.6472f, -1.9598f, 0.7888f)
                curveToRelative(-0.1942f, -1.2968f, -0.7375f, -2.4338f, -1.666f, -3.302f)
                arcToRelative(5.5639f, 5.5639f, 0.0f, false, false, -0.4709f, -0.3923f)
                curveToRelative(0.3645f, -0.49f, 0.8287f, -0.9428f, 1.2938f, -1.2113f)
                curveToRelative(0.6091f, -0.3515f, 1.2219f, -0.5454f, 1.7787f, -0.5875f)
                close()
                moveTo(12.006f, 6.0036f)
                arcToRelative(14.832f, 14.832f, 0.0f, false, true, 0.487f, 0.0f)
                curveToRelative(2.3901f, 0.0393f, 4.0848f, 0.67f, 5.1631f, 1.678f)
                curveToRelative(1.1501f, 1.0754f, 1.6423f, 2.6006f, 1.499f, 4.467f)
                curveToRelative(-0.1311f, 1.7079f, -1.2203f, 3.2281f, -2.652f, 4.324f)
                curveToRelative(-0.694f, 0.5313f, -1.4626f, 0.9354f, -2.2254f, 1.2294f)
                curveToRelative(0.0031f, -0.0453f, 0.014f, -0.0888f, 0.014f, -0.1349f)
                curveToRelative(0.0029f, -1.1964f, -0.9313f, -2.2133f, -2.2918f, -2.2133f)
                curveToRelative(-1.3606f, 0.0f, -2.3222f, 1.0154f, -2.2918f, 2.2213f)
                curveToRelative(0.0013f, 0.0507f, 0.014f, 0.0972f, 0.0181f, 0.1471f)
                curveToRelative(-0.781f, -0.2933f, -1.5696f, -0.7013f, -2.2777f, -1.2456f)
                curveToRelative(-1.4239f, -1.0945f, -2.4997f, -2.6129f, -2.6037f, -4.322f)
                curveToRelative(-0.1129f, -1.8567f, 0.3778f, -3.3382f, 1.5212f, -4.3965f)
                curveTo(7.5094f, 6.7f, 9.352f, 6.047f, 12.006f, 6.0036f)
                close()
                moveTo(8.3641f, 12.8327f)
                curveToRelative(-0.6053f, 0.0f, -1.0966f, 0.4903f, -1.0966f, 1.0966f)
                curveToRelative(0.0f, 0.6063f, 0.4913f, 1.0986f, 1.0966f, 1.0986f)
                reflectiveCurveToRelative(1.0966f, -0.4923f, 1.0966f, -1.0986f)
                curveToRelative(0.0f, -0.6063f, -0.4913f, -1.0966f, -1.0966f, -1.0966f)
                close()
                moveTo(15.646f, 12.844f)
                curveToRelative(-0.5998f, 0.0f, -1.0866f, 0.4859f, -1.0866f, 1.0866f)
                reflectiveCurveToRelative(0.4868f, 1.0885f, 1.0866f, 1.0885f)
                curveToRelative(0.5997f, 0.0f, 1.0865f, -0.4878f, 1.0865f, -1.0885f)
                reflectiveCurveToRelative(-0.4868f, -1.0866f, -1.0865f, -1.0866f)
                close()
                moveTo(12.0f, 16.0835f)
                curveToRelative(1.0237f, 0.0f, 1.5654f, 0.638f, 1.5634f, 1.4829f)
                curveToRelative(-0.0018f, 0.7849f, -0.6723f, 1.485f, -1.5634f, 1.485f)
                curveToRelative(-0.9167f, 0.0f, -1.54f, -0.5629f, -1.5634f, -1.493f)
                curveToRelative(-0.0212f, -0.8347f, 0.5397f, -1.4749f, 1.5634f, -1.4749f)
                close()
            }
        }
        .build()
        return _lemmy!!
    }

private var _lemmy: ImageVector? = null
