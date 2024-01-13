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

public val SimpleIcons.Imdb: ImageVector
    get() {
        if (_imdb != null) {
            return _imdb!!
        }
        _imdb = Builder(name = "Imdb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.3781f, 0.0f)
                lineTo(1.6218f, 0.0f)
                curveTo(0.7411f, 0.0583f, 0.0587f, 0.7437f, 0.0018f, 1.5953f)
                lineToRelative(-0.001f, 20.783f)
                curveToRelative(0.0585f, 0.8761f, 0.7125f, 1.543f, 1.5559f, 1.6191f)
                arcTo(0.337f, 0.337f, 0.0f, false, false, 1.6016f, 24.0f)
                horizontalLineToRelative(20.7971f)
                arcToRelative(0.4579f, 0.4579f, 0.0f, false, false, 0.0437f, -0.002f)
                curveToRelative(0.8727f, -0.0768f, 1.5568f, -0.8271f, 1.5568f, -1.7085f)
                lineTo(23.9992f, 1.7098f)
                curveToRelative(0.0f, -0.8914f, -0.696f, -1.6416f, -1.584f, -1.7078f)
                arcTo(0.3294f, 0.3294f, 0.0f, false, false, 22.3781f, 0.0f)
                close()
                moveTo(22.3781f, 0.496f)
                arcToRelative(1.2144f, 1.2144f, 0.0f, false, true, 1.1252f, 1.2139f)
                verticalLineToRelative(20.5797f)
                curveToRelative(0.0f, 0.6377f, -0.4875f, 1.1602f, -1.1045f, 1.2145f)
                lineTo(1.6016f, 23.5041f)
                curveToRelative(-0.5967f, -0.0543f, -1.0645f, -0.5297f, -1.1053f, -1.1258f)
                lineTo(0.4963f, 1.6284f)
                curveTo(0.5371f, 1.0185f, 1.0184f, 0.5364f, 1.6217f, 0.496f)
                horizontalLineToRelative(20.7564f)
                close()
                moveTo(4.7954f, 8.2603f)
                verticalLineToRelative(7.3636f)
                lineTo(2.8899f, 15.6239f)
                lineTo(2.8899f, 8.2603f)
                horizontalLineToRelative(1.9055f)
                close()
                moveTo(11.3321f, 8.2603f)
                verticalLineToRelative(7.3636f)
                lineTo(9.6707f, 15.6239f)
                verticalLineToRelative(-4.9704f)
                lineToRelative(-0.6711f, 4.9704f)
                lineTo(7.813f, 15.6239f)
                lineToRelative(-0.6986f, -4.8618f)
                lineToRelative(-0.0066f, 4.8618f)
                horizontalLineToRelative(-1.668f)
                lineTo(5.4398f, 8.2603f)
                horizontalLineToRelative(2.468f)
                curveToRelative(0.0748f, 0.4476f, 0.1492f, 0.9694f, 0.2307f, 1.5734f)
                lineToRelative(0.2712f, 1.8713f)
                lineToRelative(0.4407f, -3.4447f)
                horizontalLineToRelative(2.4817f)
                close()
                moveTo(14.3093f, 9.5892f)
                curveToRelative(0.0742f, 0.0404f, 0.122f, 0.108f, 0.1417f, 0.2034f)
                curveToRelative(0.0279f, 0.0953f, 0.0345f, 0.3118f, 0.0345f, 0.6442f)
                verticalLineToRelative(2.8548f)
                curveToRelative(0.0f, 0.4881f, -0.0345f, 0.7867f, -0.0955f, 0.8954f)
                curveToRelative(-0.0609f, 0.1152f, -0.2304f, 0.1695f, -0.5018f, 0.1695f)
                lineTo(13.8882f, 9.5211f)
                curveToRelative(0.204f, 0.0f, 0.3457f, 0.0205f, 0.4211f, 0.0681f)
                close()
                moveTo(14.2882f, 15.6239f)
                curveToRelative(0.4543f, 0.0f, 0.8006f, -0.0265f, 1.0245f, -0.0742f)
                curveToRelative(0.2304f, -0.0477f, 0.4204f, -0.1357f, 0.5694f, -0.2648f)
                curveToRelative(0.1556f, -0.1218f, 0.2642f, -0.298f, 0.3251f, -0.5219f)
                curveToRelative(0.0611f, -0.2238f, 0.1021f, -0.6648f, 0.1021f, -1.3224f)
                verticalLineToRelative(-2.5832f)
                curveToRelative(0.0f, -0.6986f, -0.0271f, -1.1668f, -0.0742f, -1.4039f)
                curveToRelative(-0.041f, -0.237f, -0.1431f, -0.4543f, -0.3126f, -0.6437f)
                curveToRelative(-0.1695f, -0.1973f, -0.4198f, -0.3324f, -0.7456f, -0.421f)
                curveToRelative(-0.3191f, -0.0808f, -0.8542f, -0.1285f, -1.7694f, -0.1285f)
                horizontalLineToRelative(-1.4244f)
                verticalLineToRelative(7.3636f)
                horizontalLineToRelative(2.3051f)
                close()
                moveTo(19.4282f, 13.8412f)
                curveToRelative(0.0f, 0.3523f, -0.0199f, 0.5762f, -0.0544f, 0.6708f)
                curveToRelative(-0.033f, 0.0947f, -0.1894f, 0.1424f, -0.3046f, 0.1424f)
                curveToRelative(-0.1086f, 0.0f, -0.19f, -0.0477f, -0.2238f, -0.1351f)
                curveToRelative(-0.041f, -0.0887f, -0.0609f, -0.2986f, -0.0609f, -0.6238f)
                verticalLineToRelative(-1.9469f)
                curveToRelative(0.0f, -0.3324f, 0.0199f, -0.5423f, 0.0543f, -0.6237f)
                curveToRelative(0.0338f, -0.0808f, 0.1086f, -0.122f, 0.2171f, -0.122f)
                curveToRelative(0.1153f, 0.0f, 0.2709f, 0.0412f, 0.3114f, 0.1425f)
                curveToRelative(0.041f, 0.0947f, 0.0609f, 0.2986f, 0.0609f, 0.6032f)
                verticalLineToRelative(1.8926f)
                close()
                moveTo(16.9535f, 8.2603f)
                verticalLineToRelative(7.3636f)
                horizontalLineToRelative(1.7157f)
                lineToRelative(0.1152f, -0.4675f)
                curveToRelative(0.1556f, 0.1894f, 0.3251f, 0.3324f, 0.5152f, 0.4271f)
                curveToRelative(0.1828f, 0.0881f, 0.4608f, 0.1357f, 0.678f, 0.1357f)
                curveToRelative(0.3047f, 0.0f, 0.5629f, -0.0748f, 0.7802f, -0.237f)
                curveToRelative(0.2165f, -0.1562f, 0.3589f, -0.3462f, 0.4198f, -0.5628f)
                curveToRelative(0.0543f, -0.2173f, 0.0887f, -0.543f, 0.0887f, -0.9841f)
                verticalLineToRelative(-2.0675f)
                curveToRelative(0.0f, -0.4409f, -0.0139f, -0.7324f, -0.0344f, -0.8681f)
                curveToRelative(-0.0199f, -0.1357f, -0.0742f, -0.2781f, -0.1695f, -0.4204f)
                curveToRelative(-0.1021f, -0.1425f, -0.2437f, -0.251f, -0.4272f, -0.3325f)
                curveToRelative(-0.1834f, -0.0742f, -0.3999f, -0.1152f, -0.6576f, -0.1152f)
                curveToRelative(-0.2172f, 0.0f, -0.4952f, 0.0477f, -0.6846f, 0.1285f)
                curveToRelative(-0.1835f, 0.0887f, -0.353f, 0.2238f, -0.5086f, 0.4007f)
                lineTo(18.7844f, 8.2603f)
                horizontalLineToRelative(-1.8309f)
                close()
            }
        }
        .build()
        return _imdb!!
    }

private var _imdb: ImageVector? = null
