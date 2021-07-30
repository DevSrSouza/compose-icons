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

public val SimpleIcons.Numpy: ImageVector
    get() {
        if (_numpy != null) {
            return _numpy!!
        }
        _numpy = Builder(name = "Numpy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.315f, 4.876f)
                lineTo(6.3048f, 2.8517f)
                lineToRelative(-4.401f, 2.1965f)
                lineToRelative(4.1186f, 2.0683f)
                close()
                moveTo(12.1531f, 5.8037f)
                lineToRelative(4.2045f, 2.1223f)
                lineToRelative(-4.3622f, 2.1906f)
                lineToRelative(-4.125f, -2.0718f)
                close()
                moveTo(17.7684f, 2.8824f)
                lineToRelative(4.3193f, 2.1658f)
                lineToRelative(-3.863f, 1.9402f)
                lineToRelative(-4.2131f, -2.1252f)
                close()
                moveTo(15.9094f, 1.9495f)
                lineTo(12.021f, 0.0f)
                lineTo(8.1742f, 1.9193f)
                lineToRelative(4.0068f, 2.0208f)
                close()
                moveTo(12.8693f, 18.6938f)
                lineTo(12.8693f, 24.0f)
                lineToRelative(4.7107f, -2.3507f)
                lineToRelative(-0.0053f, -5.3085f)
                close()
                moveTo(17.573f, 14.4881f)
                lineToRelative(-0.0052f, -5.2528f)
                lineToRelative(-4.6985f, 2.3356f)
                verticalLineToRelative(5.2546f)
                close()
                moveTo(23.2283f, 13.5036f)
                verticalLineToRelative(5.327f)
                lineToRelative(-4.0178f, 2.0052f)
                lineToRelative(-0.0029f, -5.3028f)
                close()
                moveTo(23.2283f, 11.641f)
                lineTo(23.2283f, 6.4214f)
                lineToRelative(-4.0253f, 2.001f)
                lineToRelative(0.0034f, 5.2633f)
                close()
                moveTo(11.2062f, 11.571f)
                lineTo(8.0333f, 9.9756f)
                verticalLineToRelative(6.895f)
                reflectiveCurveToRelative(-3.8804f, -8.2564f, -4.2399f, -8.998f)
                curveToRelative(-0.0463f, -0.0957f, -0.2371f, -0.2007f, -0.2858f, -0.2262f)
                curveTo(2.8118f, 7.2812f, 0.773f, 6.2485f, 0.773f, 6.2485f)
                lineTo(0.773f, 18.43f)
                lineToRelative(2.8204f, 1.5076f)
                verticalLineToRelative(-6.3674f)
                reflectiveCurveToRelative(3.8392f, 7.3775f, 3.878f, 7.458f)
                curveToRelative(0.0389f, 0.0807f, 0.4245f, 0.8582f, 0.8362f, 1.1314f)
                curveToRelative(0.5485f, 0.363f, 2.8992f, 1.7766f, 2.8992f, 1.7766f)
                close()
            }
        }
        .build()
        return _numpy!!
    }

private var _numpy: ImageVector? = null
