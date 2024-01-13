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

public val SimpleIcons.Osu: ImageVector
    get() {
        if (_osu != null) {
            return _osu!!
        }
        _osu = Builder(name = "Osu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.698f, 10.362f)
                curveToRelative(-0.1855f, -0.2184f, -0.4189f, -0.3905f, -0.7002f, -0.5162f)
                curveToRelative(-0.2813f, -0.1257f, -0.6104f, -0.1885f, -0.9874f, -0.1885f)
                reflectiveCurveToRelative(-0.7046f, 0.0628f, -0.9829f, 0.1885f)
                reflectiveCurveToRelative(-0.5088f, 0.2978f, -0.6912f, 0.5162f)
                curveToRelative(-0.1827f, 0.2185f, -0.3203f, 0.4773f, -0.413f, 0.7765f)
                curveToRelative(-0.0928f, 0.2993f, -0.1391f, 0.6194f, -0.1391f, 0.9605f)
                curveToRelative(0.0f, 0.3412f, 0.0463f, 0.6584f, 0.1391f, 0.9516f)
                curveToRelative(0.0927f, 0.2933f, 0.2303f, 0.5491f, 0.413f, 0.7675f)
                curveToRelative(0.1824f, 0.2185f, 0.4129f, 0.3891f, 0.6912f, 0.5116f)
                curveToRelative(0.2783f, 0.1226f, 0.6059f, 0.1841f, 0.9829f, 0.1841f)
                reflectiveCurveToRelative(0.7061f, -0.0615f, 0.9875f, -0.1841f)
                curveToRelative(0.2813f, -0.1226f, 0.5146f, -0.2931f, 0.7002f, -0.5116f)
                curveToRelative(0.1855f, -0.2184f, 0.3231f, -0.4742f, 0.413f, -0.7675f)
                curveToRelative(0.0897f, -0.2931f, 0.1346f, -0.6104f, 0.1346f, -0.9516f)
                curveToRelative(0.0f, -0.3411f, -0.0449f, -0.6612f, -0.1346f, -0.9605f)
                curveToRelative(-0.0899f, -0.2992f, -0.2276f, -0.558f, -0.4131f, -0.7765f)
                close()
                moveTo(6.733f, 13.1716f)
                curveToRelative(-0.1467f, 0.2484f, -0.3875f, 0.3725f, -0.7227f, 0.3725f)
                curveToRelative(-0.3291f, 0.0f, -0.567f, -0.1241f, -0.7136f, -0.3725f)
                curveToRelative(-0.1467f, -0.2483f, -0.2199f, -0.6059f, -0.2199f, -1.0727f)
                reflectiveCurveToRelative(0.0732f, -0.8243f, 0.2199f, -1.0727f)
                curveToRelative(0.1466f, -0.2482f, 0.3844f, -0.3725f, 0.7136f, -0.3725f)
                curveToRelative(0.3352f, 0.0f, 0.5759f, 0.1243f, 0.7227f, 0.3725f)
                curveToRelative(0.1466f, 0.2484f, 0.2199f, 0.6059f, 0.2199f, 1.0727f)
                curveToRelative(1.0E-4f, 0.4668f, -0.0733f, 0.8245f, -0.2199f, 1.0727f)
                close()
                moveTo(18.6224f, 12.3413f)
                lineTo(18.5326f, 7.9517f)
                arcToRelative(4.5409f, 4.5409f, 0.0f, false, true, 0.6912f, -0.0539f)
                curveToRelative(0.2334f, 0.0f, 0.4668f, 0.0179f, 0.7002f, 0.0539f)
                lineToRelative(-0.0898f, 4.3896f)
                curveToRelative(-0.2096f, 0.0359f, -0.41f, 0.0538f, -0.6015f, 0.0538f)
                arcToRelative(3.4957f, 3.4957f, 0.0f, false, true, -0.6103f, -0.0538f)
                close()
                moveTo(19.942f, 13.7416f)
                curveToRelative(0.0f, 0.2215f, -0.0179f, 0.443f, -0.0538f, 0.6643f)
                arcToRelative(4.2055f, 4.2055f, 0.0f, false, true, -0.6553f, 0.0538f)
                arcToRelative(4.1414f, 4.1414f, 0.0f, false, true, -0.6642f, -0.0538f)
                arcToRelative(4.0882f, 4.0882f, 0.0f, false, true, -0.0539f, -0.6553f)
                curveToRelative(0.0f, -0.2154f, 0.018f, -0.4367f, 0.0539f, -0.6643f)
                arcToRelative(4.0876f, 4.0876f, 0.0f, false, true, 0.6552f, -0.0538f)
                curveToRelative(0.2155f, 0.0f, 0.4368f, 0.018f, 0.6643f, 0.0538f)
                curveToRelative(0.0359f, 0.2276f, 0.0538f, 0.446f, 0.0538f, 0.6553f)
                close()
                moveTo(16.7194f, 9.7111f)
                curveToRelative(0.2095f, 0.0f, 0.422f, 0.018f, 0.6373f, 0.0539f)
                verticalLineToRelative(4.4614f)
                curveToRelative(-0.1916f, 0.0659f, -0.4443f, 0.1302f, -0.7585f, 0.193f)
                curveToRelative(-0.3141f, 0.0629f, -0.6418f, 0.0943f, -0.9829f, 0.0943f)
                curveToRelative(-0.3052f, 0.0f, -0.5985f, -0.024f, -0.8798f, -0.0718f)
                curveToRelative(-0.2813f, -0.0479f, -0.5282f, -0.1495f, -0.7405f, -0.3052f)
                curveToRelative(-0.2125f, -0.1555f, -0.3815f, -0.3829f, -0.5072f, -0.6823f)
                curveToRelative(-0.1257f, -0.2991f, -0.1885f, -0.697f, -0.1885f, -1.1938f)
                lineTo(13.2993f, 9.765f)
                arcToRelative(3.8725f, 3.8725f, 0.0f, false, true, 0.6373f, -0.0539f)
                curveToRelative(0.2094f, 0.0f, 0.4219f, 0.018f, 0.6373f, 0.0539f)
                verticalLineToRelative(2.4596f)
                curveToRelative(0.0f, 0.2455f, 0.0194f, 0.4474f, 0.0584f, 0.6059f)
                curveToRelative(0.0388f, 0.1586f, 0.0988f, 0.2843f, 0.1795f, 0.377f)
                arcToRelative(0.6606f, 0.6606f, 0.0f, false, false, 0.3007f, 0.1974f)
                curveToRelative(0.1197f, 0.0391f, 0.2603f, 0.0584f, 0.4219f, 0.0584f)
                curveToRelative(0.2214f, 0.0f, 0.407f, -0.0209f, 0.5566f, -0.0628f)
                lineTo(16.091f, 9.765f)
                arcToRelative(3.8218f, 3.8218f, 0.0f, false, true, 0.6284f, -0.0539f)
                close()
                moveTo(12.3569f, 12.3952f)
                curveToRelative(0.0538f, 0.1497f, 0.0808f, 0.3321f, 0.0808f, 0.5476f)
                curveToRelative(0.0f, 0.2215f, -0.0464f, 0.428f, -0.1392f, 0.6194f)
                curveToRelative(-0.0928f, 0.1916f, -0.2274f, 0.3577f, -0.4039f, 0.4982f)
                curveToRelative(-0.1766f, 0.1407f, -0.3905f, 0.2514f, -0.6418f, 0.3322f)
                curveToRelative(-0.2514f, 0.0808f, -0.5356f, 0.1212f, -0.8528f, 0.1212f)
                arcToRelative(5.2984f, 5.2984f, 0.0f, false, true, -0.395f, -0.0135f)
                arcToRelative(3.1226f, 3.1226f, 0.0f, false, true, -0.3456f, -0.0448f)
                arcToRelative(4.0482f, 4.0482f, 0.0f, false, true, -0.3277f, -0.0763f)
                arcToRelative(3.9336f, 3.9336f, 0.0f, false, true, -0.35f, -0.1166f)
                arcToRelative(2.5768f, 2.5768f, 0.0f, false, true, 0.0852f, -0.4893f)
                arcToRelative(3.0737f, 3.0737f, 0.0f, false, true, 0.1751f, -0.4802f)
                curveToRelative(0.1975f, 0.0779f, 0.3844f, 0.1362f, 0.561f, 0.1751f)
                curveToRelative(0.1765f, 0.039f, 0.3605f, 0.0584f, 0.5521f, 0.0584f)
                curveToRelative(0.0838f, 0.0f, 0.175f, -0.0075f, 0.2738f, -0.0225f)
                arcToRelative(0.9945f, 0.9945f, 0.0f, false, false, 0.2737f, -0.0808f)
                arcToRelative(0.6467f, 0.6467f, 0.0f, false, false, 0.2109f, -0.1526f)
                curveToRelative(0.0569f, -0.0628f, 0.0853f, -0.145f, 0.0853f, -0.2469f)
                curveToRelative(0.0f, -0.1436f, -0.0434f, -0.2469f, -0.1302f, -0.3097f)
                curveToRelative(-0.0868f, -0.0628f, -0.208f, -0.1181f, -0.3636f, -0.1661f)
                lineToRelative(-0.5565f, -0.1616f)
                curveToRelative(-0.3352f, -0.0956f, -0.5969f, -0.2379f, -0.7855f, -0.4263f)
                curveToRelative(-0.1885f, -0.1886f, -0.2827f, -0.4713f, -0.2827f, -0.8484f)
                curveToRelative(0.0f, -0.4547f, 0.163f, -0.8108f, 0.4892f, -1.0682f)
                curveToRelative(0.3261f, -0.2573f, 0.7705f, -0.386f, 1.333f, -0.386f)
                curveToRelative(0.2334f, 0.0f, 0.4638f, 0.0211f, 0.6913f, 0.0629f)
                curveToRelative(0.2273f, 0.0419f, 0.4578f, 0.1048f, 0.6912f, 0.1885f)
                curveToRelative(-0.012f, 0.1557f, -0.0419f, 0.3173f, -0.0897f, 0.4847f)
                curveToRelative(-0.048f, 0.1676f, -0.1048f, 0.3142f, -0.1706f, 0.4398f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, false, -0.4757f, -0.1571f)
                arcToRelative(2.18f, 2.18f, 0.0f, false, false, -0.5477f, -0.0673f)
                curveToRelative(-0.2034f, 0.0f, -0.3621f, 0.0314f, -0.4758f, 0.0943f)
                curveToRelative(-0.1137f, 0.0629f, -0.1705f, 0.1631f, -0.1705f, 0.3007f)
                curveToRelative(0.0f, 0.1317f, 0.0403f, 0.2244f, 0.1211f, 0.2783f)
                curveToRelative(0.0809f, 0.0538f, 0.1959f, 0.1048f, 0.3456f, 0.1526f)
                lineToRelative(0.5117f, 0.1526f)
                curveToRelative(0.1675f, 0.048f, 0.3187f, 0.1063f, 0.4533f, 0.1751f)
                curveToRelative(0.1347f, 0.0688f, 0.2498f, 0.1541f, 0.3456f, 0.2558f)
                curveToRelative(0.0958f, 0.1016f, 0.1707f, 0.2272f, 0.2246f, 0.3768f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.3726f, 0.0f, 0.0f, 5.3726f, 0.0f, 12.0001f)
                curveTo(0.0f, 18.6273f, 5.3726f, 24.0f, 12.0f, 24.0f)
                curveToRelative(6.6275f, 0.0f, 12.0f, -5.3727f, 12.0f, -11.9999f)
                curveTo(24.0f, 5.3726f, 18.6275f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.8f)
                curveToRelative(-5.9647f, 0.0f, -10.8f, -4.8354f, -10.8f, -10.7999f)
                curveTo(1.2f, 6.0353f, 6.0353f, 1.2f, 12.0f, 1.2f)
                reflectiveCurveToRelative(10.8f, 4.8353f, 10.8f, 10.8001f)
                curveTo(22.8f, 17.9646f, 17.9647f, 22.8f, 12.0f, 22.8f)
                close()
            }
        }
        .build()
        return _osu!!
    }

private var _osu: ImageVector? = null
