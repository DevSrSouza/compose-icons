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

public val SimpleIcons.Elgato: ImageVector
    get() {
        if (_elgato != null) {
            return _elgato!!
        }
        _elgato = Builder(name = "Elgato", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.8818f, 8.3964f)
                lineToRelative(0.0261f, 0.0196f)
                lineToRelative(9.9494f, 5.7172f)
                curveToRelative(-0.4884f, 2.729f, -1.9196f, 5.2223f, -4.0384f, 7.0253f)
                arcTo(11.9262f, 11.9262f, 0.0f, false, true, 12.097f, 24.0f)
                curveToRelative(-3.1925f, 0.0f, -6.1939f, -1.2477f, -8.4527f, -3.5144f)
                curveTo(1.3868f, 18.2188f, 0.1427f, 15.2044f, 0.1427f, 12.0f)
                curveToRelative(0.0f, -3.2042f, 1.244f, -6.2187f, 3.5015f, -8.4854f)
                curveTo(5.9019f, 1.248f, 8.9032f, 0.0f, 12.097f, 0.0f)
                curveToRelative(2.4394f, 0.0f, 4.7847f, 0.7333f, 6.783f, 2.1187f)
                curveToRelative(1.9526f, 1.354f, 3.4466f, 3.2357f, 4.3227f, 5.4422f)
                curveToRelative(0.1112f, 0.2829f, 0.2149f, 0.5736f, 0.3051f, 0.8657f)
                lineToRelative(-2.1255f, 1.2359f)
                arcToRelative(9.4924f, 9.4924f, 0.0f, false, false, -0.2619f, -0.8694f)
                curveToRelative(-1.354f, -3.8303f, -4.9813f, -6.4048f, -9.0237f, -6.4048f)
                curveTo(6.8171f, 2.3883f, 2.522f, 6.7005f, 2.522f, 12.0f)
                curveToRelative(0.0f, 5.2995f, 4.295f, 9.6115f, 9.5748f, 9.6115f)
                curveToRelative(2.052f, 0.0f, 4.0084f, -0.6442f, 5.6596f, -1.8647f)
                curveToRelative(1.6172f, -1.1955f, 2.8036f, -2.8337f, 3.4309f, -4.7364f)
                lineToRelative(0.0065f, -0.0419f)
                lineTo(9.5906f, 8.3048f)
                verticalLineToRelative(7.2256f)
                lineToRelative(4.0004f, -2.3138f)
                lineToRelative(2.06f, 1.1811f)
                lineToRelative(-5.9962f, 3.4688f)
                lineToRelative(-2.12f, -1.2126f)
                verticalLineTo(7.1943f)
                lineToRelative(2.1174f, -1.2245f)
                lineToRelative(4.2309f, 2.4279f)
                lineToRelative(-0.0013f, -0.0013f)
            }
        }
        .build()
        return _elgato!!
    }

private var _elgato: ImageVector? = null
