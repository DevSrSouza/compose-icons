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

public val SimpleIcons.Arcgis: ImageVector
    get() {
        if (_arcgis != null) {
            return _arcgis!!
        }
        _arcgis = Builder(name = "Arcgis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcToRelative(0.8492f, 0.8492f, 0.0f, false, false, -0.3377f, 0.0703f)
                lineToRelative(-8.5183f, 3.6944f)
                curveTo(2.1458f, 4.1978f, 1.4997f, 5.1816f, 1.4997f, 6.2697f)
                verticalLineToRelative(13.2521f)
                lineToRelative(10.1626f, 4.4078f)
                curveToRelative(0.2152f, 0.0933f, 0.4602f, 0.0941f, 0.6753f, 7.0E-4f)
                lineToRelative(8.5183f, -3.6959f)
                curveToRelative(0.9982f, -0.433f, 1.6443f, -1.4168f, 1.6443f, -2.505f)
                lineTo(22.5003f, 4.4781f)
                lineTo(12.3377f, 0.0696f)
                curveTo(12.2301f, 0.0229f, 12.1152f, -0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 4.837f)
                curveToRelative(4.1629f, 0.0f, 7.5376f, 3.3746f, 7.5376f, 7.5376f)
                reflectiveCurveTo(16.163f, 19.9122f, 12.0f, 19.9122f)
                curveToRelative(-4.163f, 0.0f, -7.5376f, -3.3746f, -7.5376f, -7.5376f)
                reflectiveCurveTo(7.837f, 4.837f, 12.0f, 4.837f)
                close()
                moveTo(11.6499f, 6.2258f)
                curveToRelative(-0.8968f, -0.0227f, -2.3274f, 0.2409f, -3.7464f, 1.6143f)
                curveToRelative(0.3496f, 0.5545f, 0.6454f, 0.9778f, 0.49f, 1.418f)
                curveToRelative(-0.2313f, 0.655f, -0.5139f, 0.5138f, -1.0708f, 0.9947f)
                curveToRelative(-0.3957f, 0.3417f, 0.2067f, 1.0129f, -0.3128f, 1.306f)
                curveToRelative(-0.5195f, 0.2931f, -1.2132f, 0.6636f, -0.9492f, 1.1756f)
                curveToRelative(0.2639f, 0.512f, 1.4691f, 0.8301f, 1.9593f, 1.0752f)
                curveToRelative(0.4902f, 0.2451f, 0.9281f, 0.706f, 0.6072f, 1.2371f)
                curveToRelative(-0.314f, 0.5195f, -0.5371f, 1.1308f, -0.6013f, 1.6092f)
                curveToRelative(1.0549f, 0.9442f, 2.4471f, 1.5191f, 3.9742f, 1.5191f)
                curveToRelative(3.2928f, 0.0f, 5.8177f, -2.7105f, 5.9621f, -6.0002f)
                curveToRelative(0.0406f, -0.9253f, -0.9392f, -0.9397f, -1.5345f, -0.9397f)
                curveToRelative(0.0f, 0.0f, 0.3406f, 0.9236f, 0.0183f, 1.4363f)
                curveToRelative(-0.3223f, 0.5128f, -0.8497f, 0.7617f, -0.835f, 1.377f)
                curveToRelative(0.0146f, 0.6153f, -0.9374f, 1.5967f, -1.2598f, 1.9483f)
                curveToRelative(-0.3222f, 0.3516f, -0.9228f, 0.7472f, -1.128f, -0.0586f)
                curveToRelative(-0.2051f, -0.8058f, -0.126f, -1.478f, 0.1084f, -2.0494f)
                curveToRelative(0.2344f, -0.5714f, -0.2174f, -0.7471f, -0.9207f, -0.7617f)
                curveToRelative(-0.7032f, -0.0146f, -1.0798f, -0.108f, -1.1866f, -1.1932f)
                curveToRelative(-0.0879f, -0.8937f, 1.2429f, -1.8436f, 1.8143f, -1.8436f)
                curveToRelative(0.3341f, 0.0f, 1.4548f, 0.2196f, 1.5074f, -0.3406f)
                curveToRelative(0.0806f, -0.8593f, -0.8204f, -1.0416f, -1.0393f, -1.6019f)
                curveTo(13.2877f, 7.5875f, 14.986f, 6.6071f, 12.0f, 6.2499f)
                curveToRelative(-0.1047f, -0.0125f, -0.222f, -0.0209f, -0.3501f, -0.0242f)
                close()
            }
        }
        .build()
        return _arcgis!!
    }

private var _arcgis: ImageVector? = null
