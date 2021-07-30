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

public val SimpleIcons.Basecamp: ImageVector
    get() {
        if (_basecamp != null) {
            return _basecamp!!
        }
        _basecamp = Builder(name = "Basecamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6516f, 22.453f)
                curveToRelative(-4.0328f, 0.0f, -7.575f, -1.5542f, -10.244f, -4.4946f)
                arcToRelative(1.11f, 1.11f, 0.0f, false, true, -0.219f, -1.1338f)
                curveToRelative(0.7008f, -1.8884f, 2.5935f, -6.2808f, 5.0205f, -6.2948f)
                horizontalLineToRelative(0.0125f)
                curveToRelative(1.219f, 0.0f, 2.1312f, 0.9655f, 2.8648f, 1.7412f)
                curveToRelative(0.2192f, 0.2324f, 0.555f, 0.5875f, 0.7818f, 0.7611f)
                curveToRelative(0.5656f, -0.5587f, 1.6775f, -2.4158f, 2.5422f, -4.2779f)
                curveToRelative(0.259f, -0.5567f, 0.9203f, -0.7985f, 1.4765f, -0.5402f)
                curveToRelative(0.557f, 0.2584f, 0.7988f, 0.919f, 0.5404f, 1.4762f)
                curveToRelative(-2.6217f, 5.6503f, -4.019f, 5.6503f, -4.478f, 5.6503f)
                curveToRelative(-1.022f, 0.0f, -1.7628f, -0.7843f, -2.4791f, -1.5422f)
                curveToRelative(-0.3208f, -0.339f, -0.9878f, -1.045f, -1.2482f, -1.045f)
                horizontalLineToRelative(-4.0E-4f)
                curveToRelative(-0.5665f, 0.095f, -1.8085f, 2.0531f, -2.6966f, 4.2034f)
                curveToRelative(2.1925f, 2.1722f, 4.9232f, 3.2726f, 8.1266f, 3.2726f)
                curveToRelative(4.3955f, 0.0f, 7.683f, -1.1964f, 9.0996f, -3.2953f)
                curveToRelative(-0.4888f, -5.585f, -3.5642f, -13.1634f, -9.0996f, -13.1634f)
                curveToRelative(-4.6855f, 0.0f, -8.2152f, 3.264f, -10.4915f, 9.7007f)
                curveToRelative(-0.205f, 0.579f, -0.8416f, 0.8828f, -1.4187f, 0.6776f)
                curveToRelative(-0.5789f, -0.2047f, -0.882f, -0.8398f, -0.6776f, -1.4185f)
                curveToRelative(2.624f, -7.421f, 6.859f, -11.1833f, 12.5878f, -11.1833f)
                curveToRelative(7.4826f, 0.0f, 10.9304f, 9.5613f, 11.3458f, 15.588f)
                arcToRelative(1.1154f, 1.1154f, 0.0f, false, true, -0.1456f, 0.6314f)
                curveToRelative(-1.7407f, 3.0221f, -5.7182f, 4.6864f, -11.2002f, 4.6864f)
                close()
            }
        }
        .build()
        return _basecamp!!
    }

private var _basecamp: ImageVector? = null
