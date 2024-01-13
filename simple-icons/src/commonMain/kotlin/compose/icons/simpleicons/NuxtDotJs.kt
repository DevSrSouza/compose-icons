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

public val SimpleIcons.Nuxtdotjs: ImageVector
    get() {
        if (_nuxtdotjs != null) {
            return _nuxtdotjs!!
        }
        _nuxtdotjs = Builder(name = "Nuxtdotjs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4642f, 19.8295f)
                horizontalLineToRelative(8.9218f)
                curveToRelative(0.2834f, 0.0f, 0.5618f, -0.0723f, 0.8072f, -0.2098f)
                arcToRelative(1.5899f, 1.5899f, 0.0f, false, false, 0.5908f, -0.5732f)
                arcToRelative(1.5293f, 1.5293f, 0.0f, false, false, 0.216f, -0.783f)
                arcToRelative(1.529f, 1.529f, 0.0f, false, false, -0.2167f, -0.7828f)
                lineTo(17.7916f, 7.4142f)
                arcToRelative(1.5904f, 1.5904f, 0.0f, false, false, -0.5907f, -0.573f)
                arcToRelative(1.6524f, 1.6524f, 0.0f, false, false, -0.807f, -0.2099f)
                curveToRelative(-0.2833f, 0.0f, -0.5616f, 0.0724f, -0.807f, 0.2098f)
                arcToRelative(1.5904f, 1.5904f, 0.0f, false, false, -0.5907f, 0.5731f)
                lineTo(13.4642f, 9.99f)
                lineToRelative(-2.9954f, -5.0366f)
                arcToRelative(1.5913f, 1.5913f, 0.0f, false, false, -0.591f, -0.573f)
                arcToRelative(1.6533f, 1.6533f, 0.0f, false, false, -0.8071f, -0.2098f)
                curveToRelative(-0.2834f, 0.0f, -0.5617f, 0.0723f, -0.8072f, 0.2097f)
                arcToRelative(1.5913f, 1.5913f, 0.0f, false, false, -0.591f, 0.573f)
                lineTo(0.2168f, 17.4808f)
                arcTo(1.5292f, 1.5292f, 0.0f, false, false, 0.0f, 18.2635f)
                curveToRelative(-1.0E-4f, 0.2749f, 0.0744f, 0.545f, 0.216f, 0.783f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, 0.5908f, 0.5732f)
                curveToRelative(0.2454f, 0.1375f, 0.5238f, 0.2098f, 0.8072f, 0.2098f)
                horizontalLineToRelative(5.6003f)
                curveToRelative(2.219f, 0.0f, 3.8554f, -0.9454f, 4.9813f, -2.7899f)
                lineToRelative(2.7337f, -4.5922f)
                lineTo(16.3935f, 9.99f)
                lineToRelative(4.3944f, 7.382f)
                horizontalLineToRelative(-5.8586f)
                close()
                moveTo(7.123f, 17.3694f)
                lineToRelative(-3.9083f, -9.0E-4f)
                lineToRelative(5.8586f, -9.8421f)
                lineToRelative(2.9232f, 4.921f)
                lineToRelative(-1.9572f, 3.2892f)
                curveToRelative(-0.7478f, 1.1967f, -1.5972f, 1.6328f, -2.9163f, 1.6328f)
                close()
            }
        }
        .build()
        return _nuxtdotjs!!
    }

private var _nuxtdotjs: ImageVector? = null
