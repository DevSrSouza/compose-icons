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

public val SimpleIcons.Cloudflare: ImageVector
    get() {
        if (_cloudflare != null) {
            return _cloudflare!!
        }
        _cloudflare = Builder(name = "Cloudflare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5088f, 16.8447f)
                curveToRelative(0.1475f, -0.5068f, 0.0908f, -0.9707f, -0.1553f, -1.3154f)
                curveToRelative(-0.2246f, -0.3164f, -0.6045f, -0.499f, -1.0615f, -0.5205f)
                lineToRelative(-8.6592f, -0.1123f)
                arcToRelative(0.1559f, 0.1559f, 0.0f, false, true, -0.1333f, -0.0713f)
                curveToRelative(-0.0283f, -0.042f, -0.0351f, -0.0986f, -0.021f, -0.1553f)
                curveToRelative(0.0278f, -0.084f, 0.1123f, -0.1484f, 0.2036f, -0.1562f)
                lineToRelative(8.7359f, -0.1123f)
                curveToRelative(1.0351f, -0.0489f, 2.1601f, -0.8868f, 2.5537f, -1.9136f)
                lineToRelative(0.499f, -1.3013f)
                curveToRelative(0.0215f, -0.0561f, 0.0293f, -0.1128f, 0.0147f, -0.168f)
                curveToRelative(-0.5625f, -2.5463f, -2.835f, -4.4453f, -5.5499f, -4.4453f)
                curveToRelative(-2.5039f, 0.0f, -4.6284f, 1.6177f, -5.3876f, 3.8614f)
                curveToRelative(-0.4927f, -0.3658f, -1.1187f, -0.5625f, -1.794f, -0.499f)
                curveToRelative(-1.2026f, 0.119f, -2.1665f, 1.083f, -2.2861f, 2.2856f)
                curveToRelative(-0.0283f, 0.31f, -0.0069f, 0.6128f, 0.0635f, 0.894f)
                curveTo(1.5683f, 13.171f, 0.0f, 14.7754f, 0.0f, 16.752f)
                curveToRelative(0.0f, 0.1748f, 0.0142f, 0.3515f, 0.0352f, 0.5273f)
                curveToRelative(0.0141f, 0.083f, 0.0844f, 0.1475f, 0.1689f, 0.1475f)
                horizontalLineToRelative(15.9814f)
                curveToRelative(0.0909f, 0.0f, 0.1758f, -0.0645f, 0.2032f, -0.1553f)
                lineToRelative(0.12f, -0.4268f)
                close()
                moveTo(19.2656f, 11.2813f)
                curveToRelative(-0.0771f, 0.0f, -0.1611f, 0.0f, -0.2383f, 0.0112f)
                curveToRelative(-0.0566f, 0.0f, -0.1054f, 0.0415f, -0.127f, 0.0976f)
                lineToRelative(-0.3378f, 1.1744f)
                curveToRelative(-0.1475f, 0.5068f, -0.0918f, 0.9707f, 0.1543f, 1.3164f)
                curveToRelative(0.2256f, 0.3164f, 0.6055f, 0.498f, 1.0625f, 0.5195f)
                lineToRelative(1.8437f, 0.1133f)
                curveToRelative(0.0557f, 0.0f, 0.1055f, 0.0263f, 0.1329f, 0.0703f)
                curveToRelative(0.0283f, 0.043f, 0.0351f, 0.1074f, 0.0214f, 0.1562f)
                curveToRelative(-0.0283f, 0.084f, -0.1132f, 0.1485f, -0.204f, 0.1553f)
                lineToRelative(-1.921f, 0.1123f)
                curveToRelative(-1.041f, 0.0488f, -2.1582f, 0.8867f, -2.5527f, 1.914f)
                lineToRelative(-0.1406f, 0.3585f)
                curveToRelative(-0.0283f, 0.0713f, 0.0215f, 0.1416f, 0.0986f, 0.1416f)
                horizontalLineToRelative(6.5977f)
                curveToRelative(0.0771f, 0.0f, 0.1474f, -0.0489f, 0.169f, -0.126f)
                curveToRelative(0.1122f, -0.4082f, 0.1757f, -0.837f, 0.1757f, -1.2803f)
                curveToRelative(0.0f, -2.6025f, -2.125f, -4.727f, -4.7344f, -4.727f)
            }
        }
        .build()
        return _cloudflare!!
    }

private var _cloudflare: ImageVector? = null
