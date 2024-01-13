package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Megaphone24: ImageVector
    get() {
        if (_megaphone24 != null) {
            return _megaphone24!!
        }
        _megaphone24 = Builder(name = "Megaphone24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 1.75f)
                verticalLineToRelative(14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.399f, 0.662f)
                curveToRelative(-0.384f, 0.204f, -0.783f, -0.035f, -1.139f, -0.248f)
                lineToRelative(-0.003f, -0.002f)
                curveToRelative(-0.09f, -0.054f, -0.177f, -0.107f, -0.261f, -0.15f)
                arcToRelative(15.53f, 15.53f, 0.0f, false, false, -2.0f, -0.849f)
                curveToRelative(-1.738f, -0.607f, -4.321f, -1.223f, -7.703f, -1.251f)
                arcToRelative(0.833f, 0.833f, 0.0f, false, true, 0.005f, 0.088f)
                curveToRelative(0.0f, 2.279f, 0.494f, 4.279f, 0.906f, 5.547f)
                curveToRelative(0.368f, 1.131f, -0.438f, 2.453f, -1.732f, 2.453f)
                lineTo(7.661f, 22.5f)
                curveToRelative(-0.696f, 0.0f, -1.36f, -0.42f, -1.6f, -1.129f)
                curveTo(5.684f, 20.255f, 5.0f, 17.811f, 5.0f, 14.75f)
                verticalLineToRelative(-0.457f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 6.5f, 3.5f)
                horizontalLineToRelative(3.75f)
                curveToRelative(3.505f, 0.0f, 6.175f, -0.61f, 7.955f, -1.21f)
                arcToRelative(15.88f, 15.88f, 0.0f, false, false, 2.002f, -0.82f)
                arcToRelative(9.21f, 9.21f, 0.0f, false, false, 0.49f, -0.262f)
                curveToRelative(0.048f, -0.028f, 0.095f, -0.055f, 0.142f, -0.085f)
                arcTo(0.751f, 0.751f, 0.0f, false, true, 22.0f, 1.75f)
                close()
                moveTo(10.5f, 12.912f)
                curveToRelative(3.564f, 0.029f, 6.313f, 0.678f, 8.193f, 1.335f)
                curveToRelative(0.737f, 0.258f, 1.34f, 0.517f, 1.807f, 0.74f)
                lineTo(20.5f, 2.993f)
                curveToRelative(-0.467f, 0.216f, -1.073f, 0.467f, -1.815f, 0.718f)
                curveToRelative(-1.878f, 0.634f, -4.624f, 1.26f, -8.185f, 1.288f)
                close()
                moveTo(6.5f, 5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(9.0f, 13.0f)
                lineTo(9.0f, 5.0f)
                close()
                moveTo(6.5f, 14.75f)
                curveToRelative(0.0f, 2.847f, 0.638f, 5.123f, 0.982f, 6.141f)
                curveToRelative(0.018f, 0.051f, 0.074f, 0.109f, 0.179f, 0.109f)
                horizontalLineToRelative(2.013f)
                curveToRelative(0.087f, 0.0f, 0.179f, -0.043f, 0.249f, -0.147f)
                arcToRelative(0.396f, 0.396f, 0.0f, false, false, 0.057f, -0.343f)
                curveTo(9.537f, 19.148f, 9.0f, 16.986f, 9.0f, 14.5f)
                lineTo(6.5f, 14.5f)
                close()
            }
        }
        .build()
        return _megaphone24!!
    }

private var _megaphone24: ImageVector? = null
